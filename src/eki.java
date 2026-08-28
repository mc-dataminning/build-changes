import com.mojang.serialization.Codec;

public class eki extends ekm<emy> {
   public eki(Codec<emy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eko<emy> $$0) {
      dky $$1 = $$0.b();
      azz $$2 = $$0.d();
      iw $$3 = $$0.e();
      float $$4 = (float)$$2.a(3) + 4.0F;

      for (int $$5 = 0; $$4 > 0.5F; $$5--) {
         for (int $$6 = azq.d(-$$4); $$6 <= azq.f($$4); $$6++) {
            for (int $$7 = azq.d(-$$4); $$7 <= azq.f($$4); $$7++) {
               if ((float)($$6 * $$6 + $$7 * $$7) <= ($$4 + 1.0F) * ($$4 + 1.0F)) {
                  this.a($$1, $$3.b($$6, $$5, $$7), dng.fY.m());
               }
            }
         }

         $$4 -= (float)$$2.a(2) + 0.5F;
      }

      return true;
   }
}
