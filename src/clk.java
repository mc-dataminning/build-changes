import javax.annotation.Nullable;

public class clk extends cdy {
   private final clj a;

   public clk(clj $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dV().a(this.a.dA(), this.a.dC(), this.a.dG(), 10.0);
   }

   @Override
   public void a() {
      arq $$0 = (arq)this.a.dV();
      btz $$1 = $$0.d_(this.a.dv());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bxb $$2 = bwm.aw.a($$0, bwl.k);
      if ($$2 != null) {
         $$2.e(this.a.dA(), this.a.dC(), this.a.dG());
         $$2.a(true);
         $$0.b($$2);
         coh $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cld $$5 = this.a($$1);
               if ($$5 != null) {
                  coh $$6 = this.a($$1, $$5);
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
   private cld a(btz $$0) {
      clj $$1 = bwm.bg.a(this.a.dV(), bwl.k);
      if ($$1 != null) {
         $$1.a((arq)this.a.dV(), $$0, bwl.k, null);
         $$1.a_(this.a.dA(), this.a.dC(), this.a.dG());
         $$1.aj = 60;
         $$1.fY();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private coh a(btz $$0, cld $$1) {
      coh $$2 = bwm.bf.a($$1.dV(), bwl.k);
      if ($$2 != null) {
         $$2.a((arq)$$1.dV(), $$0, bwl.k, null);
         $$2.a_($$1.dA(), $$1.dC(), $$1.dG());
         $$2.aj = 60;
         $$2.fY();
         if ($$2.a(bwn.f).f()) {
            $$2.a(bwn.f, new cyy(czc.qr));
         }

         this.a($$2, bwn.a, $$0);
         this.a($$2, bwn.f, $$0);
      }

      return $$2;
   }

   private void a(coh $$0, bwn $$1, btz $$2) {
      cyy $$3 = $$0.a($$1);
      $$3.b(kj.l, dfr.a);
      dfn.a($$3, $$0.dV().F_(), dgz.a, $$2, $$0.dY());
      $$0.a($$1, $$3);
   }
}
