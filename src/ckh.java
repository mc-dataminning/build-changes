import javax.annotation.Nullable;

public class ckh extends cdd {
   private final ckg a;

   public ckh(ckg $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dV().a(this.a.dA(), this.a.dC(), this.a.dG(), 10.0);
   }

   @Override
   public void a() {
      ash $$0 = (ash)this.a.dV();
      btg $$1 = $$0.d_(this.a.dv());
      this.a.x(false);
      this.a.y(true);
      this.a.c_(0);
      bwe $$2 = bvq.ax.a($$0, bvp.k);
      if ($$2 != null) {
         $$2.e(this.a.dA(), this.a.dC(), this.a.dG());
         $$2.a(true);
         $$0.b($$2);
         cne $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cka $$5 = this.a($$1);
               if ($$5 != null) {
                  cne $$6 = this.a($$1, $$5);
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
   private cka a(btg $$0) {
      ckg $$1 = bvq.bg.a(this.a.dV(), bvp.k);
      if ($$1 != null) {
         $$1.a((ash)this.a.dV(), $$0, bvp.k, null);
         $$1.a_(this.a.dA(), this.a.dC(), this.a.dG());
         $$1.aj = 60;
         $$1.ai();
         $$1.y(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cne a(btg $$0, cka $$1) {
      cne $$2 = bvq.bf.a($$1.dV(), bvp.k);
      if ($$2 != null) {
         $$2.a((ash)$$1.dV(), $$0, bvp.k, null);
         $$2.a_($$1.dA(), $$1.dC(), $$1.dG());
         $$2.aj = 60;
         $$2.ai();
         if ($$2.a(bvr.f).f()) {
            $$2.a(bvr.f, new cxo(cxs.qc));
         }

         this.a($$2, bvr.a, $$0);
         this.a($$2, bvr.f, $$0);
      }

      return $$2;
   }

   private void a(cne $$0, bvr $$1, btg $$2) {
      cxo $$3 = $$0.a($$1);
      $$3.b(ku.l, dee.a);
      dea.a($$3, $$0.dV().K_(), dfm.a, $$2, $$0.dY());
      $$0.a($$1, $$3);
   }
}
