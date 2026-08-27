import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cml implements clu {
   final String a;
   final clt b;
   final cja c;
   final hp<cmb> d;

   public cml(String $$0, clt $$1, cja $$2, hp<cmb> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cmh<?> ai_() {
      return cmh.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public clt d() {
      return this.b;
   }

   @Override
   public cja a(hu $$0) {
      return this.c;
   }

   @Override
   public hp<cmb> a() {
      return this.d;
   }

   public boolean a(ceu $$0, cpq $$1) {
      cbt $$2 = new cbt();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cja $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cja a(ceu $$0, hu $$1) {
      return this.c.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cmh<cml> {
      private static final Codec<cml> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  arb.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  clt.e.fieldOf("category").orElse(clt.d).forGetter($$0x -> $$0x.b),
                  clv.a.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cmb.c.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cmb[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cmb[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(hp.a(cmb.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cml::new)
      );

      @Override
      public Codec<cml> a() {
         return x;
      }

      public cml b(sl $$0) {
         String $$1 = $$0.r();
         clt $$2 = $$0.b(clt.class);
         int $$3 = $$0.m();
         hp<cmb> $$4 = hp.a($$3, cmb.a);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, cmb.b($$0));
         }

         cja $$6 = $$0.q();
         return new cml($$1, $$2, $$6, $$4);
      }

      public void a(sl $$0, cml $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cmb $$2 : $$1.d) {
            $$2.a($$0);
         }

         $$0.a($$1.c);
      }
   }
}
