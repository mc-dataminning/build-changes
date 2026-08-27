import com.mojang.serialization.Codec;

public class drr extends drt<due> {
   public drr(Codec<due> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drv<due> $$0) {
      cuj $$1 = $$0.b();
      auu $$2 = $$0.d();
      hx $$3 = $$0.e();
      float $$4 = (float)$$2.a(3) + 4.0F;

      for (int $$5 = 0; $$4 > 0.5F; $$5--) {
         for (int $$6 = aun.d(-$$4); $$6 <= aun.f($$4); $$6++) {
            for (int $$7 = aun.d(-$$4); $$7 <= aun.f($$4); $$7++) {
               if ((float)($$6 * $$6 + $$7 * $$7) <= ($$4 + 1.0F) * ($$4 + 1.0F)) {
                  this.a($$1, $$3.b($$6, $$5, $$7), cwr.fz.o());
               }
            }
         }

         $$4 -= (float)$$2.a(2) + 0.5F;
      }

      return true;
   }
}
