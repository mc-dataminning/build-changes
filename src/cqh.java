import java.util.List;

public class cqh extends cqf {
   public static final float d = 4.0F;

   public cqh(bvr<? extends cqh> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public cqh(dhi $$0, bwg $$1, fby $$2) {
      super(bvr.K, $$1, $$2, $$0);
   }

   @Override
   protected void a(fbw $$0) {
      super.a($$0);
      if ($$0.d() != fbw.a.c || !this.e(((fbv)$$0).a())) {
         if (!this.dW().C) {
            List<bwg> $$1 = this.dW().a(bwg.class, this.cR().c(4.0, 2.0, 4.0));
            bvd $$2 = new bvd(this.dW(), this.dB(), this.dD(), this.dH());
            bvk $$3 = this.p();
            if ($$3 instanceof bwg) {
               $$2.a((bwg)$$3);
            }

            $$2.a(ls.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.c()) / (float)$$2.g());
            $$2.a(new bup(bur.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bwg $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dB(), $$4.dD(), $$4.dH());
                     break;
                  }
               }
            }

            this.dW().c(2006, this.dw(), this.bb() ? -1 : 1);
            this.dW().b($$2);
            this.at();
         }
      }
   }

   @Override
   protected lq s() {
      return ls.h;
   }

   @Override
   protected boolean m() {
      return false;
   }
}
