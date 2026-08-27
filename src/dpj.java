import com.mojang.serialization.Codec;

public class dpj extends dpk {
   public static final Codec<dpj> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dpj::new, $$0 -> $$0.b).codec();
   private final float b;

   @Override
   protected dpl<?> a() {
      return dpl.b;
   }

   public dpj(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(dpk.a $$0) {
      apf $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            gu $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, cyh.c, $$0);
            }
         }

         if ($$1.i() < this.b) {
            gu $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, cyh.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            gu $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, cyh.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            gu $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, cyh.b, $$0);
            }
         }
      });
   }

   private static void a(gu $$0, dcs $$1, dpk.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (gu var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
