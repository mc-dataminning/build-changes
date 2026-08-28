import java.util.List;

public class cpy extends cpw {
   public static final float d = 4.0F;

   public cpy(bvi<? extends cpy> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cpy(dgz $$0, bvx $$1, fbr $$2) {
      super(bvi.K, $$1, $$2, $$0);
   }

   @Override
   protected void a(fbp $$0) {
      super.a($$0);
      if ($$0.d() != fbp.a.c || !this.e(((fbo)$$0).a())) {
         if (!this.dW().C) {
            List<bvx> $$1 = this.dW().a(bvx.class, this.cR().c(4.0, 2.0, 4.0));
            buu $$2 = new buu(this.dW(), this.dB(), this.dD(), this.dH());
            bvb $$3 = this.p();
            if ($$3 instanceof bvx) {
               $$2.a((bvx)$$3);
            }

            $$2.a(ls.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.c()) / (float)$$2.g());
            $$2.a(new bug(bui.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bvx $$4 : $$1) {
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
