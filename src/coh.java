import java.util.List;

public class coh extends cof {
   public static final float e = 4.0F;

   public coh(bty<? extends coh> $$0, dej $$1) {
      super($$0, $$1);
   }

   public coh(dej $$0, bun $$1, eyw $$2) {
      super(bty.A, $$1, $$2, $$0);
   }

   @Override
   protected void a(eyu $$0) {
      super.a($$0);
      if ($$0.d() != eyu.a.c || !this.e(((eyt)$$0).a())) {
         if (!this.dS().B) {
            List<bun> $$1 = this.dS().a(bun.class, this.cO().c(4.0, 2.0, 4.0));
            btm $$2 = new btm(this.dS(), this.dx(), this.dz(), this.dD());
            btr $$3 = this.s();
            if ($$3 instanceof bun) {
               $$2.a((bun)$$3);
            }

            $$2.a(lo.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.j());
            $$2.a(new bsy(bta.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bun $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dx(), $$4.dz(), $$4.dD());
                     break;
                  }
               }
            }

            this.dS().c(2006, this.ds(), this.ba() ? -1 : 1);
            this.dS().b($$2);
            this.as();
         }
      }
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      return false;
   }

   @Override
   protected lm q() {
      return lo.h;
   }

   @Override
   protected boolean o() {
      return false;
   }
}
