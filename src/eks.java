import com.mojang.serialization.Codec;

public class eks extends ekw<eni> {
   public eks(Codec<eni> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<eni> $$0) {
      dli $$1 = $$0.b();
      bai $$2 = $$0.d();
      iw $$3 = $$0.e();
      float $$4 = (float)$$2.a(3) + 4.0F;

      for (int $$5 = 0; $$4 > 0.5F; $$5--) {
         for (int $$6 = azz.d(-$$4); $$6 <= azz.f($$4); $$6++) {
            for (int $$7 = azz.d(-$$4); $$7 <= azz.f($$4); $$7++) {
               if ((float)($$6 * $$6 + $$7 * $$7) <= ($$4 + 1.0F) * ($$4 + 1.0F)) {
                  this.a($$1, $$3.b($$6, $$5, $$7), dnq.fY.m());
               }
            }
         }

         $$4 -= (float)$$2.a(2) + 0.5F;
      }

      return true;
   }
}
