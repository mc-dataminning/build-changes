import java.util.List;

public class cmt extends cmr {
   public static final float e = 4.0F;

   public cmt(bsm<? extends cmt> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public cmt(dcf $$0, btb $$1, ewf $$2) {
      super(bsm.A, $$1, $$2, $$0);
   }

   @Override
   protected void a(ewd $$0) {
      super.a($$0);
      if ($$0.c() != ewd.a.c || !this.e(((ewc)$$0).a())) {
         if (!this.dQ().B) {
            List<btb> $$1 = this.dQ().a(btb.class, this.cL().c(4.0, 2.0, 4.0));
            bsc $$2 = new bsc(this.dQ(), this.dv(), this.dx(), this.dB());
            bsg $$3 = this.s();
            if ($$3 instanceof btb) {
               $$2.a((btb)$$3);
            }

            $$2.a(lj.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.j());
            $$2.a(new bro(brq.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (btb $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dv(), $$4.dx(), $$4.dB());
                     break;
                  }
               }
            }

            this.dQ().c(2006, this.dq(), this.aX() ? -1 : 1);
            this.dQ().b($$2);
            this.ap();
         }
      }
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      return false;
   }

   @Override
   protected lh v() {
      return lj.h;
   }

   @Override
   protected boolean u() {
      return false;
   }
}
