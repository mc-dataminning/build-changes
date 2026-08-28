import javax.annotation.Nullable;

public class cjz extends ccv {
   private final cjy a;

   public cjz(cjy $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dW().a(this.a.dB(), this.a.dD(), this.a.dH(), 10.0);
   }

   @Override
   public void a() {
      arx $$0 = (arx)this.a.dW();
      bsy $$1 = $$0.d_(this.a.dw());
      this.a.x(false);
      this.a.y(true);
      this.a.c_(0);
      bvw $$2 = bvi.ax.a($$0, bvh.k);
      if ($$2 != null) {
         $$2.e(this.a.dB(), this.a.dD(), this.a.dH());
         $$2.a(true);
         $$0.b($$2);
         cmw $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cjs $$5 = this.a($$1);
               if ($$5 != null) {
                  cmw $$6 = this.a($$1, $$5);
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
   private cjs a(bsy $$0) {
      cjy $$1 = bvi.bg.a(this.a.dW(), bvh.k);
      if ($$1 != null) {
         $$1.a((arx)this.a.dW(), $$0, bvh.k, null);
         $$1.a_(this.a.dB(), this.a.dD(), this.a.dH());
         $$1.aj = 60;
         $$1.ai();
         $$1.y(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cmw a(bsy $$0, cjs $$1) {
      cmw $$2 = bvi.bf.a($$1.dW(), bvh.k);
      if ($$2 != null) {
         $$2.a((arx)$$1.dW(), $$0, bvh.k, null);
         $$2.a_($$1.dB(), $$1.dD(), $$1.dH());
         $$2.aj = 60;
         $$2.ai();
         if ($$2.a(bvj.f).f()) {
            $$2.a(bvj.f, new cxg(cxk.ql));
         }

         this.a($$2, bvj.a, $$0);
         this.a($$2, bvj.f, $$0);
      }

      return $$2;
   }

   private void a(cmw $$0, bvj $$1, bsy $$2) {
      cxg $$3 = $$0.a($$1);
      $$3.b(ku.l, ddw.a);
      dds.a($$3, $$0.dW().K_(), dfe.a, $$2, $$0.dZ());
      $$0.a($$1, $$3);
   }
}
