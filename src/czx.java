import javax.annotation.Nullable;

public class czx extends crl {
   protected czx(dfd.d $$0) {
      super($$0);
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new deb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return a($$0, $$2, dcs.B);
   }

   @Override
   protected void a(cpq $$0, gw $$1, cbp $$2) {
      dcq $$3 = $$0.c_($$1);
      if ($$3 instanceof deb) {
         $$2.a((bgw)$$3);
         $$2.a(apj.at);
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, aoz.wx, apa.e, 1.0F, 1.0F, false);
         }

         $$1.a(ix.Z, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
