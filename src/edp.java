import com.mojang.serialization.Codec;

public class edp extends edq {
   public static final Codec<edp> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(edp::new, $$0 -> $$0.b).codec();
   private final float b;

   @Override
   protected edr<?> a() {
      return edr.b;
   }

   public edp(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(edq.a $$0) {
      ayd $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            im $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, dlr.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            im $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, dlr.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            im $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, dlr.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            im $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, dlr.c, $$0);
            }
         }
      });
   }

   private static void a(im $$0, dqp $$1, edq.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (im var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
