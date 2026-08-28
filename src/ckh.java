import javax.annotation.Nullable;

public class ckh extends cdd {
   private final ckg a;

   public ckh(ckg $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dW().a(this.a.dB(), this.a.dD(), this.a.dH(), 10.0);
   }

   @Override
   public void a() {
      ash $$0 = (ash)this.a.dW();
      btg $$1 = $$0.d_(this.a.dw());
      this.a.x(false);
      this.a.y(true);
      this.a.c_(0);
      bwe $$2 = bvq.ax.a($$0, bvp.k);
      if ($$2 != null) {
         $$2.e(this.a.dB(), this.a.dD(), this.a.dH());
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
                     $$5.j(this.a.dZ().a(0.0, 1.1485), 0.0, this.a.dZ().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private cka a(btg $$0) {
      ckg $$1 = bvq.bg.a(this.a.dW(), bvp.k);
      if ($$1 != null) {
         $$1.a((ash)this.a.dW(), $$0, bvp.k, null);
         $$1.a_(this.a.dB(), this.a.dD(), this.a.dH());
         $$1.aj = 60;
         $$1.ai();
         $$1.y(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cne a(btg $$0, cka $$1) {
      cne $$2 = bvq.bf.a($$1.dW(), bvp.k);
      if ($$2 != null) {
         $$2.a((ash)$$1.dW(), $$0, bvp.k, null);
         $$2.a_($$1.dB(), $$1.dD(), $$1.dH());
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
      dea.a($$3, $$0.dW().K_(), dfm.a, $$2, $$0.dZ());
      $$0.a($$1, $$3);
   }
}
