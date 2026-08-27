import com.mojang.serialization.Codec;

public class dnu extends dnw<dqh> {
   public dnu(Codec<dqh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dny<dqh> $$0) {
      cqp $$1 = $$0.b();
      asc $$2 = $$0.d();
      gw $$3 = $$0.e();
      float $$4 = (float)$$2.a(3) + 4.0F;

      for (int $$5 = 0; $$4 > 0.5F; $$5--) {
         for (int $$6 = arx.d(-$$4); $$6 <= arx.f($$4); $$6++) {
            for (int $$7 = arx.d(-$$4); $$7 <= arx.f($$4); $$7++) {
               if ((float)($$6 * $$6 + $$7 * $$7) <= ($$4 + 1.0F) * ($$4 + 1.0F)) {
                  this.a($$1, $$3.b($$6, $$5, $$7), csw.fz.n());
               }
            }
         }

         $$4 -= (float)$$2.a(2) + 0.5F;
      }

      return true;
   }
}
