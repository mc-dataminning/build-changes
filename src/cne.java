import java.util.List;

public class cne extends cnc {
   public static final float f = 4.0F;

   public cne(bsy<? extends cne> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public cne(dbw $$0, btn $$1, double $$2, double $$3, double $$4) {
      super(bsy.A, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(evn $$0) {
      super.a($$0);
      if ($$0.c() != evn.a.c || !this.A(((evm)$$0).a())) {
         if (!this.dP().B) {
            List<btn> $$1 = this.dP().a(btn.class, this.cK().c(4.0, 2.0, 4.0));
            bso $$2 = new bso(this.dP(), this.du(), this.dw(), this.dA());
            bss $$3 = this.s();
            if ($$3 instanceof btn) {
               $$2.a((btn)$$3);
            }

            $$2.a(li.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.j());
            $$2.a(new bsa(bsc.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (btn $$4 : $$1) {
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
   public boolean a(brl $$0, float $$1) {
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
