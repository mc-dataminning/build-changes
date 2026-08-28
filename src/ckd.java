import javax.annotation.Nullable;

public class ckd extends ccz {
   private final ckc a;

   public ckd(ckc $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dV().a(this.a.dA(), this.a.dC(), this.a.dG(), 10.0);
   }

   @Override
   public void a() {
      ash $$0 = (ash)this.a.dV();
      btc $$1 = $$0.d_(this.a.dv());
      this.a.x(false);
      this.a.y(true);
      this.a.c_(0);
      bwa $$2 = bvm.ax.a($$0, bvl.k);
      if ($$2 != null) {
         $$2.e(this.a.dA(), this.a.dC(), this.a.dG());
         $$2.a(true);
         $$0.b($$2);
         cna $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cjw $$5 = this.a($$1);
               if ($$5 != null) {
                  cna $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.dY().a(0.0, 1.1485), 0.0, this.a.dY().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private cjw a(btc $$0) {
      ckc $$1 = bvm.bg.a(this.a.dV(), bvl.k);
      if ($$1 != null) {
         $$1.a((ash)this.a.dV(), $$0, bvl.k, null);
         $$1.a_(this.a.dA(), this.a.dC(), this.a.dG());
         $$1.aj = 60;
         $$1.ai();
         $$1.y(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cna a(btc $$0, cjw $$1) {
      cna $$2 = bvm.bf.a($$1.dV(), bvl.k);
      if ($$2 != null) {
         $$2.a((ash)$$1.dV(), $$0, bvl.k, null);
         $$2.a_($$1.dA(), $$1.dC(), $$1.dG());
         $$2.aj = 60;
         $$2.ai();
         if ($$2.a(bvn.f).f()) {
            $$2.a(bvn.f, new cxk(cxo.qc));
         }

         this.a($$2, bvn.a, $$0);
         this.a($$2, bvn.f, $$0);
      }

      return $$2;
   }

   private void a(cna $$0, bvn $$1, btc $$2) {
      cxk $$3 = $$0.a($$1);
      $$3.b(ku.l, ddx.a);
      ddt.a($$3, $$0.dV().K_(), dff.a, $$2, $$0.dY());
      $$0.a($$1, $$3);
   }
}
