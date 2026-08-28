import com.mojang.serialization.Codec;

public class egm extends egp<eja> {
   public egm(Codec<eja> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egr<eja> $$0) {
      dhx $$1 = $$0.b();
      bac $$2 = $$0.d();
      jh $$3 = $$0.e();
      float $$4 = (float)$$2.a(3) + 4.0F;

      for (int $$5 = 0; $$4 > 0.5F; $$5--) {
         for (int $$6 = azu.d(-$$4); $$6 <= azu.f($$4); $$6++) {
            for (int $$7 = azu.d(-$$4); $$7 <= azu.f($$4); $$7++) {
               if ((float)($$6 * $$6 + $$7 * $$7) <= ($$4 + 1.0F) * ($$4 + 1.0F)) {
                  this.a($$1, $$3.b($$6, $$5, $$7), dkf.fU.m());
               }
            }
         }

         $$4 -= (float)$$2.a(2) + 0.5F;
      }

      return true;
   }
}
