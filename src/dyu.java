import com.mojang.serialization.Codec;

public class dyu extends dyv {
   public static final Codec<dyu> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dyu::new, $$0 -> $$0.b).codec();
   private final float b;

   @Override
   protected dyw<?> a() {
      return dyw.b;
   }

   public dyu(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(dyv.a $$0) {
      awp $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            hz $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, dhm.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            hz $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, dhm.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            hz $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, dhm.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            hz $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, dhm.c, $$0);
            }
         }
      });
   }

   private static void a(hz $$0, dma $$1, dyv.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (hz var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
