import com.mojang.serialization.Codec;

public class eft extends efw<eih> {
   public eft(Codec<eih> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efy<eih> $$0) {
      dhe $$1 = $$0.b();
      azg $$2 = $$0.d();
      ji $$3 = $$0.e();
      float $$4 = (float)$$2.a(3) + 4.0F;

      for (int $$5 = 0; $$4 > 0.5F; $$5--) {
         for (int $$6 = ayy.d(-$$4); $$6 <= ayy.f($$4); $$6++) {
            for (int $$7 = ayy.d(-$$4); $$7 <= ayy.f($$4); $$7++) {
               if ((float)($$6 * $$6 + $$7 * $$7) <= ($$4 + 1.0F) * ($$4 + 1.0F)) {
                  this.a($$1, $$3.b($$6, $$5, $$7), djm.fU.m());
               }
            }
         }

         $$4 -= (float)$$2.a(2) + 0.5F;
      }

      return true;
   }
}
