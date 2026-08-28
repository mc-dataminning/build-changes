import java.util.List;

public class cnh extends cnf {
   public static final float g = 4.0F;

   public cnh(btb<? extends cnh> $$0, dbz $$1) {
      super($$0, $$1);
   }

   public cnh(dbz $$0, btq $$1, double $$2, double $$3, double $$4) {
      super(btb.A, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(evq $$0) {
      super.a($$0);
      if ($$0.c() != evq.a.c || !this.e(((evp)$$0).a())) {
         if (!this.dP().B) {
            List<btq> $$1 = this.dP().a(btq.class, this.cK().c(4.0, 2.0, 4.0));
            bsr $$2 = new bsr(this.dP(), this.du(), this.dw(), this.dA());
            bsv $$3 = this.s();
            if ($$3 instanceof btq) {
               $$2.a((btq)$$3);
            }

            $$2.a(li.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.j());
            $$2.a(new bsd(bsf.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (btq $$4 : $$1) {
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
   public boolean a(bro $$0, float $$1) {
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
