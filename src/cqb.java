import java.util.List;

public class cqb extends cpz {
   public static final float d = 4.0F;

   public cqb(bvi<? extends cqb> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqb(dgz $$0, bvy $$1, fbx $$2) {
      super(bvi.J, $$1, $$2, $$0);
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      if ($$0.d() != fbv.a.c || !this.e(((fbu)$$0).a())) {
         if (!this.dU().C) {
            List<bvy> $$1 = this.dU().a(bvy.class, this.cQ().c(4.0, 2.0, 4.0));
            bus $$2 = new bus(this.dU(), this.dz(), this.dB(), this.dF());
            bva $$3 = this.q();
            if ($$3 instanceof bvy) {
               $$2.a((bvy)$$3);
            }

            $$2.a(lt.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.d((7.0F - $$2.e()) / (float)$$2.i());
            $$2.b(0.25F);
            $$2.a(new bue(bug.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bvy $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dz(), $$4.dB(), $$4.dF());
                     break;
                  }
               }
            }

            this.dU().c(2006, this.du(), this.bb() ? -1 : 1);
            this.dU().b($$2);
            this.at();
         }
      }
   }

   @Override
   protected lr j() {
      return lt.h;
   }

   @Override
   protected boolean g() {
      return false;
   }
}
