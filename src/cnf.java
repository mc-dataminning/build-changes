import java.util.List;

public class cnf extends cnd {
   public static final float g = 4.0F;

   public cnf(bsz<? extends cnf> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public cnf(dbx $$0, bto $$1, double $$2, double $$3, double $$4) {
      super(bsz.A, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(evo $$0) {
      super.a($$0);
      if ($$0.c() != evo.a.c || !this.e(((evn)$$0).a())) {
         if (!this.dP().B) {
            List<bto> $$1 = this.dP().a(bto.class, this.cK().c(4.0, 2.0, 4.0));
            bsp $$2 = new bsp(this.dP(), this.du(), this.dw(), this.dA());
            bst $$3 = this.s();
            if ($$3 instanceof bto) {
               $$2.a((bto)$$3);
            }

            $$2.a(li.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.j());
            $$2.a(new bsb(bsd.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bto $$4 : $$1) {
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
   public boolean a(brm $$0, float $$1) {
      return false;
   }

   @Override
   protected lg v() {
      return li.h;
   }

   @Override
   protected boolean u() {
      return false;
   }
}
