import javax.annotation.Nullable;

public class cmc extends ces {
   private final cmb a;

   public cmc(cmb $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dV().a(this.a.dA(), this.a.dC(), this.a.dG(), 10.0);
   }

   @Override
   public void a() {
      aru $$0 = (aru)this.a.dV();
      bur $$1 = $$0.d_(this.a.dv());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bxv $$2 = bxe.ax.a($$0, bxd.k);
      if ($$2 != null) {
         $$2.d(this.a.dA(), this.a.dC(), this.a.dG());
         $$2.a(true);
         $$0.b($$2);
         cpj $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               clv $$5 = this.a($$1);
               if ($$5 != null) {
                  cpj $$6 = this.a($$1, $$5);
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
   private clv a(bur $$0) {
      cmb $$1 = bxe.bh.a(this.a.dV(), bxd.k);
      if ($$1 != null) {
         $$1.a((aru)this.a.dV(), $$0, bxd.k, null);
         $$1.a_(this.a.dA(), this.a.dC(), this.a.dG());
         $$1.aj = 60;
         $$1.gc();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cpj a(bur $$0, clv $$1) {
      cpj $$2 = bxe.bg.a($$1.dV(), bxd.k);
      if ($$2 != null) {
         $$2.a((aru)$$1.dV(), $$0, bxd.k, null);
         $$2.a_($$1.dA(), $$1.dC(), $$1.dG());
         $$2.aj = 60;
         $$2.gc();
         if ($$2.a(bxf.f).f()) {
            $$2.a(bxf.f, new daa(dae.qu));
         }

         this.a($$2, bxf.a, $$0);
         this.a($$2, bxf.f, $$0);
      }

      return $$2;
   }

   private void a(cpj $$0, bxf $$1, bur $$2) {
      daa $$3 = $$0.a($$1);
      $$3.b(kl.l, dgt.a);
      dgp.a($$3, $$0.dV().J_(), dib.a, $$2, $$0.dY());
      $$0.a($$1, $$3);
   }
}
