import com.mojang.serialization.Codec;

public class dnw extends dny<dqj> {
   public dnw(Codec<dqj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doa<dqj> $$0) {
      cqr $$1 = $$0.b();
      ase $$2 = $$0.d();
      gw $$3 = $$0.e();
      float $$4 = (float)$$2.a(3) + 4.0F;

      for (int $$5 = 0; $$4 > 0.5F; $$5--) {
         for (int $$6 = ary.d(-$$4); $$6 <= ary.f($$4); $$6++) {
            for (int $$7 = ary.d(-$$4); $$7 <= ary.f($$4); $$7++) {
               if ((float)($$6 * $$6 + $$7 * $$7) <= ($$4 + 1.0F) * ($$4 + 1.0F)) {
                  this.a($$1, $$3.b($$6, $$5, $$7), csy.fz.n());
               }
            }
         }

         $$4 -= (float)$$2.a(2) + 0.5F;
      }

      return true;
   }
}
