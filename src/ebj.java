import com.mojang.serialization.Codec;

public class ebj extends ebl<edw> {
   public ebj(Codec<edw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebn<edw> $$0) {
      ddc $$1 = $$0.b();
      ayo $$2 = $$0.d();
      ja $$3 = $$0.e();
      float $$4 = (float)$$2.a(3) + 4.0F;

      for (int $$5 = 0; $$4 > 0.5F; $$5--) {
         for (int $$6 = ayg.d(-$$4); $$6 <= ayg.f($$4); $$6++) {
            for (int $$7 = ayg.d(-$$4); $$7 <= ayg.f($$4); $$7++) {
               if ((float)($$6 * $$6 + $$7 * $$7) <= ($$4 + 1.0F) * ($$4 + 1.0F)) {
                  this.a($$1, $$3.b($$6, $$5, $$7), dfk.fz.o());
               }
            }
         }

         $$4 -= (float)$$2.a(2) + 0.5F;
      }

      return true;
   }
}
