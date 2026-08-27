import com.mojang.serialization.Codec;

public class dyn extends dyo {
   public static final Codec<dyn> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dyn::new, $$0 -> $$0.b).codec();
   private final float b;

   @Override
   protected dyp<?> a() {
      return dyp.b;
   }

   public dyn(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(dyo.a $$0) {
      awo $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            hz $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, dhi.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            hz $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, dhi.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            hz $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, dhi.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            hz $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, dhi.c, $$0);
            }
         }
      });
   }

   private static void a(hz $$0, dlw $$1, dyo.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (hz var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
