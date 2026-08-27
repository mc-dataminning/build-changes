import com.mojang.serialization.Codec;

public class dvx extends dvy {
   public static final Codec<dvx> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dvx::new, $$0 -> $$0.b).codec();
   private final float b;

   @Override
   protected dvz<?> a() {
      return dvz.b;
   }

   public dvx(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(dvy.a $$0) {
      auf $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            hv $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, det.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            hv $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, det.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            hv $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, det.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            hv $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, det.c, $$0);
            }
         }
      });
   }

   private static void a(hv $$0, djg $$1, dvy.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (hv var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
