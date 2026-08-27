import java.util.List;

public class cmh extends cmf {
   public static final float e = 4.0F;

   public cmh(bsb<? extends cmh> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cmh(dca $$0, bso $$1, double $$2, double $$3, double $$4) {
      super(bsb.C, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(ews $$0) {
      super.a($$0);
      if ($$0.c() != ews.a.c || !this.e(((ewr)$$0).a())) {
         if (!this.dU().C) {
            List<bso> $$1 = this.dU().a(bso.class, this.cP().c(4.0, 2.0, 4.0));
            brr $$2 = new brr(this.dU(), this.dz(), this.dB(), this.dF());
            brv $$3 = this.t();
            if ($$3 instanceof bso) {
               $$2.a((bso)$$3);
            }

            $$2.a(lb.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.k());
            $$2.a(new brh(brj.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bso $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dz(), $$4.dB(), $$4.dF());
                     break;
                  }
               }
            }

            this.dU().c(2006, this.du(), this.ba() ? -1 : 1);
            this.dU().b($$2);
            this.ao();
         }
      }
   }

   @Override
   public boolean bE() {
      return false;
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      return false;
   }

   @Override
   protected kz u() {
      return lb.h;
   }

   @Override
   protected boolean r() {
      return false;
   }
}
