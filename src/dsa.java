import com.mojang.serialization.Codec;

public class dsa extends dsc<dun> {
   public dsa(Codec<dun> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dse<dun> $$0) {
      cus $$1 = $$0.b();
      auw $$2 = $$0.d();
      hx $$3 = $$0.e();
      float $$4 = (float)$$2.a(3) + 4.0F;

      for (int $$5 = 0; $$4 > 0.5F; $$5--) {
         for (int $$6 = aup.d(-$$4); $$6 <= aup.f($$4); $$6++) {
            for (int $$7 = aup.d(-$$4); $$7 <= aup.f($$4); $$7++) {
               if ((float)($$6 * $$6 + $$7 * $$7) <= ($$4 + 1.0F) * ($$4 + 1.0F)) {
                  this.a($$1, $$3.b($$6, $$5, $$7), cxa.fz.o());
               }
            }
         }

         $$4 -= (float)$$2.a(2) + 0.5F;
      }

      return true;
   }
}
