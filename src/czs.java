import javax.annotation.Nullable;

public class czs extends crg {
   protected czs(dey.d $$0) {
      super($$0);
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new ddw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      return a($$0, $$2, dcn.B);
   }

   @Override
   protected void a(cpl $$0, gu $$1, cbm $$2) {
      dcl $$3 = $$0.c_($$1);
      if ($$3 instanceof ddw) {
         $$2.a((bgt)$$3);
         $$2.a(apg.at);
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, aow.wx, aox.e, 1.0F, 1.0F, false);
         }

         $$1.a(iv.Z, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
