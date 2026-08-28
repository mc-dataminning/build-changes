import java.util.List;

public class cmq extends cmo {
   public static final float g = 4.0F;

   public cmq(bsj<? extends cmq> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public cmq(dcd $$0, bsy $$1, double $$2, double $$3, double $$4) {
      super(bsj.A, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(evx $$0) {
      super.a($$0);
      if ($$0.c() != evx.a.c || !this.e(((evw)$$0).a())) {
         if (!this.dP().B) {
            List<bsy> $$1 = this.dP().a(bsy.class, this.cK().c(4.0, 2.0, 4.0));
            brz $$2 = new brz(this.dP(), this.du(), this.dw(), this.dA());
            bsd $$3 = this.s();
            if ($$3 instanceof bsy) {
               $$2.a((bsy)$$3);
            }

            $$2.a(lj.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.j());
            $$2.a(new brl(brn.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bsy $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.du(), $$4.dw(), $$4.dA());
                     break;
                  }
               }
            }

            this.dP().c(2006, this.dp(), this.aW() ? -1 : 1);
            this.dP().b($$2);
            this.ao();
         }
      }
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
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
