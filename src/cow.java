import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cow implements cod {
   final String a;
   final coc b;
   final clj c;
   final il<cok> d;

   public cow(String $$0, coc $$1, clj $$2, il<cok> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cos<?> aq_() {
      return cos.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public coc d() {
      return this.b;
   }

   @Override
   public clj a(ip $$0) {
      return this.c;
   }

   @Override
   public il<cok> a() {
      return this.d;
   }

   public boolean a(chc $$0, csa $$1) {
      cdy $$2 = new cdy();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public clj a(chc $$0, ip $$1) {
      return this.c.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cos<cow> {
      private static final Codec<cow> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  asu.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  coc.e.fieldOf("category").orElse(coc.d).forGetter($$0x -> $$0x.b),
                  coe.a.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cok.c.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cok[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cok[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(il.a(cok.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cow::new)
      );

      @Override
      public Codec<cow> a() {
         return x;
      }

      public cow b(tu $$0) {
         String $$1 = $$0.s();
         coc $$2 = $$0.b(coc.class);
         int $$3 = $$0.n();
         il<cok> $$4 = il.a($$3, cok.a);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, cok.b($$0));
         }

         clj $$6 = $$0.r();
         return new cow($$1, $$2, $$6, $$4);
      }

      public void a(tu $$0, cow $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cok $$2 : $$1.d) {
            $$2.a($$0);
         }

         $$0.a($$1.c);
      }
   }
}
