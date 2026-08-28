import com.mojang.serialization.Codec;

public class ecz extends edc<efn> {
   public ecz(Codec<efn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ede<efn> $$0) {
      dep $$1 = $$0.b();
      azk $$2 = $$0.d();
      je $$3 = $$0.e();
      float $$4 = (float)$$2.a(3) + 4.0F;

      for (int $$5 = 0; $$4 > 0.5F; $$5--) {
         for (int $$6 = azc.d(-$$4); $$6 <= azc.f($$4); $$6++) {
            for (int $$7 = azc.d(-$$4); $$7 <= azc.f($$4); $$7++) {
               if ((float)($$6 * $$6 + $$7 * $$7) <= ($$4 + 1.0F) * ($$4 + 1.0F)) {
                  this.a($$1, $$3.b($$6, $$5, $$7), dgx.fz.o());
               }
            }
         }

         $$4 -= (float)$$2.a(2) + 0.5F;
      }

      return true;
   }
}
