import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class coo implements cnv {
   final String a;
   final cnu b;
   final clb c;
   final il<coc> d;

   public coo(String $$0, cnu $$1, clb $$2, il<coc> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public coj<?> aq_() {
      return coj.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cnu d() {
      return this.b;
   }

   @Override
   public clb a(ip $$0) {
      return this.c;
   }

   @Override
   public il<coc> a() {
      return this.d;
   }

   public boolean a(cgu $$0, crs $$1) {
      cdq $$2 = new cdq();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clb $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public clb a(cgu $$0, ip $$1) {
      return this.c.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements coj<coo> {
      private static final Codec<coo> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  asq.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  cnu.e.fieldOf("category").orElse(cnu.d).forGetter($$0x -> $$0x.b),
                  cnw.a.fieldOf("result").forGetter($$0x -> $$0x.c),
                  coc.c.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     coc[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(coc[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(il.a(coc.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, coo::new)
      );

      @Override
      public Codec<coo> a() {
         return x;
      }

      public coo b(tu $$0) {
         String $$1 = $$0.s();
         cnu $$2 = $$0.b(cnu.class);
         int $$3 = $$0.n();
         il<coc> $$4 = il.a($$3, coc.a);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, coc.b($$0));
         }

         clb $$6 = $$0.r();
         return new coo($$1, $$2, $$6, $$4);
      }

      public void a(tu $$0, coo $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (coc $$2 : $$1.d) {
            $$2.a($$0);
         }

         $$0.a($$1.c);
      }
   }
}
