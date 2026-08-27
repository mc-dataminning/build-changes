import javax.annotation.Nullable;

public class cfe extends byb {
   private final cfd a;

   public cfe(cfd $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dN().a(this.a.ds(), this.a.du(), this.a.dy(), 10.0);
   }

   @Override
   public void e() {
      aqe $$0 = (aqe)this.a.dN();
      boo $$1 = $$0.d_(this.a.dn());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      brd $$2 = bqr.al.a((czu)$$0);
      if ($$2 != null) {
         $$2.e(this.a.ds(), this.a.du(), this.a.dy());
         $$2.a(true);
         $$0.b($$2);
         chz $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cex $$5 = this.a($$1);
               if ($$5 != null) {
                  chz $$6 = this.a($$1, $$5);
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
   private cex a(boo $$0) {
      cfd $$1 = bqr.aN.a(this.a.dN());
      if ($$1 != null) {
         $$1.a((aqe)this.a.dN(), $$0, bri.k, null);
         $$1.a_(this.a.ds(), this.a.du(), this.a.dy());
         $$1.am = 60;
         $$1.fT();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private chz a(boo $$0, cex $$1) {
      chz $$2 = bqr.aM.a($$1.dN());
      if ($$2 != null) {
         $$2.a((aqe)$$1.dN(), $$0, bri.k, null);
         $$2.a_($$1.ds(), $$1.du(), $$1.dy());
         $$2.am = 60;
         $$2.fT();
         if ($$2.d(bqs.f).d()) {
            $$2.a(bqs.f, new csd(csg.pG));
         }

         $$2.a(bqs.a, cxo.a($$2.ej(), this.a($$2.eV()), (int)(5.0F + $$0.d() * (float)$$2.ej().a(18)), false));
         $$2.a(bqs.f, cxo.a($$2.ej(), this.a($$2.d(bqs.f)), (int)(5.0F + $$0.d() * (float)$$2.ej().a(18)), false));
      }

      return $$2;
   }

   private csd a(csd $$0) {
      $$0.b(jz.f, cxu.a);
      return $$0;
   }
}
