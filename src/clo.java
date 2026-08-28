import javax.annotation.Nullable;

public class clo extends cea {
   private final cln a;

   public clo(cln $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dV().a(this.a.dA(), this.a.dC(), this.a.dG(), 10.0);
   }

   @Override
   public void a() {
      arq $$0 = (arq)this.a.dV();
      bub $$1 = $$0.d_(this.a.dv());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bxd $$2 = bwo.aw.a($$0, bwn.k);
      if ($$2 != null) {
         $$2.d(this.a.dA(), this.a.dC(), this.a.dG());
         $$2.a(true);
         $$0.b($$2);
         col $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               clh $$5 = this.a($$1);
               if ($$5 != null) {
                  col $$6 = this.a($$1, $$5);
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
   private clh a(bub $$0) {
      cln $$1 = bwo.bg.a(this.a.dV(), bwn.k);
      if ($$1 != null) {
         $$1.a((arq)this.a.dV(), $$0, bwn.k, null);
         $$1.a_(this.a.dA(), this.a.dC(), this.a.dG());
         $$1.aj = 60;
         $$1.fZ();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private col a(bub $$0, clh $$1) {
      col $$2 = bwo.bf.a($$1.dV(), bwn.k);
      if ($$2 != null) {
         $$2.a((arq)$$1.dV(), $$0, bwn.k, null);
         $$2.a_($$1.dA(), $$1.dC(), $$1.dG());
         $$2.aj = 60;
         $$2.fZ();
         if ($$2.a(bwp.f).f()) {
            $$2.a(bwp.f, new czd(czh.qu));
         }

         this.a($$2, bwp.a, $$0);
         this.a($$2, bwp.f, $$0);
      }

      return $$2;
   }

   private void a(col $$0, bwp $$1, bub $$2) {
      czd $$3 = $$0.a($$1);
      $$3.b(kj.l, dfw.a);
      dfs.a($$3, $$0.dV().F_(), dhe.a, $$2, $$0.dY());
      $$0.a($$1, $$3);
   }
}
