import javax.annotation.Nullable;

public class cml extends cfb {
   private final cmk a;

   public cml(cmk $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dV().a(this.a.dA(), this.a.dC(), this.a.dG(), 10.0);
   }

   @Override
   public void a() {
      asb $$0 = (asb)this.a.dV();
      bva $$1 = $$0.d_(this.a.dv());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bye $$2 = bxn.ax.a($$0, bxm.k);
      if ($$2 != null) {
         $$2.d(this.a.dA(), this.a.dC(), this.a.dG());
         $$2.a(true);
         $$0.b($$2);
         cps $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cme $$5 = this.a($$1);
               if ($$5 != null) {
                  cps $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.i(this.a.dY().a(0.0, 1.1485), 0.0, this.a.dY().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private cme a(bva $$0) {
      cmk $$1 = bxn.bh.a(this.a.dV(), bxm.k);
      if ($$1 != null) {
         $$1.a((asb)this.a.dV(), $$0, bxm.k, null);
         $$1.a_(this.a.dA(), this.a.dC(), this.a.dG());
         $$1.aj = 60;
         $$1.gc();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cps a(bva $$0, cme $$1) {
      cps $$2 = bxn.bg.a($$1.dV(), bxm.k);
      if ($$2 != null) {
         $$2.a((asb)$$1.dV(), $$0, bxm.k, null);
         $$2.a_($$1.dA(), $$1.dC(), $$1.dG());
         $$2.aj = 60;
         $$2.gc();
         if ($$2.a(bxo.f).f()) {
            $$2.a(bxo.f, new dak(dao.qu));
         }

         this.a($$2, bxo.a, $$0);
         this.a($$2, bxo.f, $$0);
      }

      return $$2;
   }

   private void a(cps $$0, bxo $$1, bva $$2) {
      dak $$3 = $$0.a($$1);
      $$3.b(kl.l, dhd.a);
      dgz.a($$3, $$0.dV().J_(), dil.a, $$2, $$0.dY());
      $$0.a($$1, $$3);
   }
}
