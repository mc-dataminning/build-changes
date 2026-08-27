import javax.annotation.Nullable;

public class dac extends crq {
   protected dac(dfi.d $$0) {
      super($$0);
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new deg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return a($$0, $$2, dcx.B);
   }

   @Override
   protected void a(cpv $$0, gw $$1, cbu $$2) {
      dcv $$3 = $$0.c_($$1);
      if ($$3 instanceof deg) {
         $$2.a((bhb)$$3);
         $$2.a(apn.at);
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, apd.wx, ape.e, 1.0F, 1.0F, false);
         }

         $$1.a(iv.Z, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
