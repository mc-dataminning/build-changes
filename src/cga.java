import javax.annotation.Nullable;

public class cga extends byx {
   private final cfz a;

   public cga(cfz $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dN().a(this.a.ds(), this.a.du(), this.a.dy(), 10.0);
   }

   @Override
   public void e() {
      aqh $$0 = (aqh)this.a.dN();
      bpk $$1 = $$0.d_(this.a.dn());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      brz $$2 = brn.al.a((dad)$$0);
      if ($$2 != null) {
         $$2.e(this.a.ds(), this.a.du(), this.a.dy());
         $$2.a(true);
         $$0.b($$2);
         civ $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cft $$5 = this.a($$1);
               if ($$5 != null) {
                  civ $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.ej().a(0.0, 1.1485), 0.0, this.a.ej().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private cft a(bpk $$0) {
      cfz $$1 = brn.aN.a(this.a.dN());
      if ($$1 != null) {
         $$1.a((aqh)this.a.dN(), $$0, bse.k, null);
         $$1.a_(this.a.ds(), this.a.du(), this.a.dy());
         $$1.am = 60;
         $$1.fT();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private civ a(bpk $$0, cft $$1) {
      civ $$2 = brn.aM.a($$1.dN());
      if ($$2 != null) {
         $$2.a((aqh)$$1.dN(), $$0, bse.k, null);
         $$2.a_($$1.ds(), $$1.du(), $$1.dy());
         $$2.am = 60;
         $$2.fT();
         if ($$2.d(bro.f).d()) {
            $$2.a(bro.f, new csz(ctc.pG));
         }

         $$2.a(bro.a, cyh.a($$2.ej(), this.a($$2.eV()), (int)(5.0F + $$0.d() * (float)$$2.ej().a(18)), false));
         $$2.a(bro.f, cyh.a($$2.ej(), this.a($$2.d(bro.f)), (int)(5.0F + $$0.d() * (float)$$2.ej().a(18)), false));
      }

      return $$2;
   }

   private csz a(csz $$0) {
      $$0.b(ka.i, cyl.a);
      return $$0;
   }
}
