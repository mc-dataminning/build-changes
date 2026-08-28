import java.util.List;

public class crv extends crs {
   public static final float d = 4.0F;

   public crv(bwr<? extends crv> $$0, djh $$1) {
      super($$0, $$1);
   }

   public crv(djh $$0, bxj $$1, fex $$2) {
      super(bwr.J, $$1, $$2, $$0);
   }

   @Override
   protected void a(fev $$0) {
      super.a($$0);
      if ($$0.d() != fev.a.c || !this.e(((feu)$$0).a())) {
         if (!this.dU().C) {
            List<bxj> $$1 = this.dU().a(bxj.class, this.cQ().c(4.0, 2.0, 4.0));
            bwa $$2 = new bwa(this.dU(), this.dz(), this.dB(), this.dF());
            bwi $$3 = this.q();
            if ($$3 instanceof bxj) {
               $$2.a((bxj)$$3);
            }

            $$2.a(ly.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.d((7.0F - $$2.e()) / (float)$$2.i());
            $$2.b(0.25F);
            $$2.a(new bvm(bvo.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bxj $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dz(), $$4.dB(), $$4.dF());
                     break;
                  }
               }
            }

            this.dU().c(2006, this.du(), this.aZ() ? -1 : 1);
            this.dU().b($$2);
            this.aq();
         }
      }
   }

   @Override
   protected lw j() {
      return ly.h;
   }

   @Override
   protected boolean g() {
      return false;
   }
}
