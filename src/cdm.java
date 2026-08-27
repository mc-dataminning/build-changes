import javax.annotation.Nullable;

public class cdm extends bwl {
   private final cdl a;

   public cdm(cdl $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dM().a(this.a.dr(), this.a.dt(), this.a.dx(), 10.0);
   }

   @Override
   public void e() {
      apf $$0 = (apf)this.a.dM();
      bna $$1 = $$0.d_(this.a.dm());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bpn $$2 = bpc.al.a((cwz)$$0);
      if ($$2 != null) {
         $$2.e(this.a.dr(), this.a.dt(), this.a.dx());
         $$2.a(true);
         $$0.b($$2);
         cgg $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cdf $$5 = this.a($$1);
               if ($$5 != null) {
                  cgg $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.ei().a(0.0, 1.1485), 0.0, this.a.ei().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private cdf a(bna $$0) {
      cdl $$1 = bpc.aN.a(this.a.dM());
      if ($$1 != null) {
         $$1.a((apf)this.a.dM(), $$0, bps.k, null);
         $$1.a_(this.a.dr(), this.a.dt(), this.a.dx());
         $$1.al = 60;
         $$1.fS();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cgg a(bna $$0, cdf $$1) {
      cgg $$2 = bpc.aM.a($$1.dM());
      if ($$2 != null) {
         $$2.a((apf)$$1.dM(), $$0, bps.k, null);
         $$2.a_($$1.dr(), $$1.dt(), $$1.dx());
         $$2.al = 60;
         $$2.fS();
         if ($$2.d(bpd.f).b()) {
            $$2.a(bpd.f, new cqk(cqn.pF));
         }

         $$2.a(bpd.a, cuv.a($$2.ei(), this.a($$2.eU()), (int)(5.0F + $$0.d() * (float)$$2.ei().a(18)), false));
         $$2.a(bpd.f, cuv.a($$2.ei(), this.a($$2.d(bpd.f)), (int)(5.0F + $$0.d() * (float)$$2.ei().a(18)), false));
      }

      return $$2;
   }

   private cqk a(cqk $$0) {
      $$0.d("Enchantments");
      return $$0;
   }
}
