import javax.annotation.Nullable;

public class cma extends ceq {
   private final clz a;

   public cma(clz $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dV().a(this.a.dA(), this.a.dC(), this.a.dG(), 10.0);
   }

   @Override
   public void a() {
      ars $$0 = (ars)this.a.dV();
      bup $$1 = $$0.d_(this.a.dv());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bxt $$2 = bxc.ax.a($$0, bxb.k);
      if ($$2 != null) {
         $$2.d(this.a.dA(), this.a.dC(), this.a.dG());
         $$2.a(true);
         $$0.b($$2);
         cph $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               clt $$5 = this.a($$1);
               if ($$5 != null) {
                  cph $$6 = this.a($$1, $$5);
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
   private clt a(bup $$0) {
      clz $$1 = bxc.bh.a(this.a.dV(), bxb.k);
      if ($$1 != null) {
         $$1.a((ars)this.a.dV(), $$0, bxb.k, null);
         $$1.a_(this.a.dA(), this.a.dC(), this.a.dG());
         $$1.aj = 60;
         $$1.gc();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cph a(bup $$0, clt $$1) {
      cph $$2 = bxc.bg.a($$1.dV(), bxb.k);
      if ($$2 != null) {
         $$2.a((ars)$$1.dV(), $$0, bxb.k, null);
         $$2.a_($$1.dA(), $$1.dC(), $$1.dG());
         $$2.aj = 60;
         $$2.gc();
         if ($$2.a(bxd.f).f()) {
            $$2.a(bxd.f, new czy(dac.qu));
         }

         this.a($$2, bxd.a, $$0);
         this.a($$2, bxd.f, $$0);
      }

      return $$2;
   }

   private void a(cph $$0, bxd $$1, bup $$2) {
      czy $$3 = $$0.a($$1);
      $$3.b(kk.l, dgr.a);
      dgn.a($$3, $$0.dV().J_(), dhz.a, $$2, $$0.dY());
      $$0.a($$1, $$3);
   }
}
