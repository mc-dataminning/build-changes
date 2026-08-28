import javax.annotation.Nullable;

public class cki extends cde {
   private final ckh a;

   public cki(ckh $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dW().a(this.a.dB(), this.a.dD(), this.a.dH(), 10.0);
   }

   @Override
   public void a() {
      ash $$0 = (ash)this.a.dW();
      bth $$1 = $$0.d_(this.a.dw());
      this.a.x(false);
      this.a.y(true);
      this.a.c_(0);
      bwf $$2 = bvr.ax.a($$0, bvq.k);
      if ($$2 != null) {
         $$2.e(this.a.dB(), this.a.dD(), this.a.dH());
         $$2.a(true);
         $$0.b($$2);
         cnf $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               ckb $$5 = this.a($$1);
               if ($$5 != null) {
                  cnf $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.dZ().a(0.0, 1.1485), 0.0, this.a.dZ().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private ckb a(bth $$0) {
      ckh $$1 = bvr.bg.a(this.a.dW(), bvq.k);
      if ($$1 != null) {
         $$1.a((ash)this.a.dW(), $$0, bvq.k, null);
         $$1.a_(this.a.dB(), this.a.dD(), this.a.dH());
         $$1.aj = 60;
         $$1.ai();
         $$1.y(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cnf a(bth $$0, ckb $$1) {
      cnf $$2 = bvr.bf.a($$1.dW(), bvq.k);
      if ($$2 != null) {
         $$2.a((ash)$$1.dW(), $$0, bvq.k, null);
         $$2.a_($$1.dB(), $$1.dD(), $$1.dH());
         $$2.aj = 60;
         $$2.ai();
         if ($$2.a(bvs.f).f()) {
            $$2.a(bvs.f, new cxp(cxt.qc));
         }

         this.a($$2, bvs.a, $$0);
         this.a($$2, bvs.f, $$0);
      }

      return $$2;
   }

   private void a(cnf $$0, bvs $$1, bth $$2) {
      cxp $$3 = $$0.a($$1);
      $$3.b(ku.l, def.a);
      deb.a($$3, $$0.dW().K_(), dfn.a, $$2, $$0.dZ());
      $$0.a($$1, $$3);
   }
}
