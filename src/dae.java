import javax.annotation.Nullable;

public class dae extends crs {
   protected dae(dfk.d $$0) {
      super($$0);
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new dei($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      return a($$0, $$2, dcz.B);
   }

   @Override
   protected void a(cpx $$0, gw $$1, cbw $$2) {
      dcx $$3 = $$0.c_($$1);
      if ($$3 instanceof dei) {
         $$2.a((bhd)$$3);
         $$2.a(app.at);
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, apf.wx, apg.e, 1.0F, 1.0F, false);
         }

         $$1.a(ix.Z, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
