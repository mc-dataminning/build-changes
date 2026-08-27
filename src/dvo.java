import com.mojang.serialization.Codec;

public class dvo extends dvq<dyb> {
   public dvo(Codec<dyb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvs<dyb> $$0) {
      cxu $$1 = $$0.b();
      axd $$2 = $$0.d();
      ib $$3 = $$0.e();
      float $$4 = (float)$$2.a(3) + 4.0F;

      for (int $$5 = 0; $$4 > 0.5F; $$5--) {
         for (int $$6 = aww.d(-$$4); $$6 <= aww.f($$4); $$6++) {
            for (int $$7 = aww.d(-$$4); $$7 <= aww.f($$4); $$7++) {
               if ((float)($$6 * $$6 + $$7 * $$7) <= ($$4 + 1.0F) * ($$4 + 1.0F)) {
                  this.a($$1, $$3.b($$6, $$5, $$7), dac.fz.o());
               }
            }
         }

         $$4 -= (float)$$2.a(2) + 0.5F;
      }

      return true;
   }
}
