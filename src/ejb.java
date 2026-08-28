import com.mojang.serialization.Codec;

public class ejb extends eje<elp> {
   public ejb(Codec<elp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejg<elp> $$0) {
      dju $$1 = $$0.b();
      azv $$2 = $$0.d();
      iu $$3 = $$0.e();
      float $$4 = (float)$$2.a(3) + 4.0F;

      for (int $$5 = 0; $$4 > 0.5F; $$5--) {
         for (int $$6 = azm.d(-$$4); $$6 <= azm.f($$4); $$6++) {
            for (int $$7 = azm.d(-$$4); $$7 <= azm.f($$4); $$7++) {
               if ((float)($$6 * $$6 + $$7 * $$7) <= ($$4 + 1.0F) * ($$4 + 1.0F)) {
                  this.a($$1, $$3.b($$6, $$5, $$7), dmc.fV.m());
               }
            }
         }

         $$4 -= (float)$$2.a(2) + 0.5F;
      }

      return true;
   }
}
