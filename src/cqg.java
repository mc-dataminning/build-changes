import java.util.List;

public class cqg extends cqe {
   public static final float d = 4.0F;

   public cqg(bvq<? extends cqg> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public cqg(dhh $$0, bwf $$1, fbx $$2) {
      super(bvq.K, $$1, $$2, $$0);
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      if ($$0.d() != fbv.a.c || !this.e(((fbu)$$0).a())) {
         if (!this.dW().C) {
            List<bwf> $$1 = this.dW().a(bwf.class, this.cR().c(4.0, 2.0, 4.0));
            bvc $$2 = new bvc(this.dW(), this.dB(), this.dD(), this.dH());
            bvj $$3 = this.p();
            if ($$3 instanceof bwf) {
               $$2.a((bwf)$$3);
            }

            $$2.a(ls.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.c()) / (float)$$2.g());
            $$2.a(new buo(buq.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bwf $$4 : $$1) {
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
