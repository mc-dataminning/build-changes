import java.util.List;

public class cos extends coq {
   public static final float e = 4.0F;

   public cos(bug<? extends cos> $$0, dev $$1) {
      super($$0, $$1);
   }

   public cos(dev $$0, buv $$1, ezh $$2) {
      super(bug.A, $$1, $$2, $$0);
   }

   @Override
   protected void a(ezf $$0) {
      super.a($$0);
      if ($$0.d() != ezf.a.c || !this.e(((eze)$$0).a())) {
         if (!this.dX().C) {
            List<buv> $$1 = this.dX().a(buv.class, this.cS().c(4.0, 2.0, 4.0));
            bts $$2 = new bts(this.dX(), this.dC(), this.dE(), this.dI());
            btz $$3 = this.s();
            if ($$3 instanceof buv) {
               $$2.a((buv)$$3);
            }

            $$2.a(lq.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.j());
            $$2.a(new bte(btg.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (buv $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dC(), $$4.dE(), $$4.dI());
                     break;
                  }
               }
            }

            this.dX().c(2006, this.dx(), this.bc() ? -1 : 1);
            this.dX().b($$2);
            this.au();
         }
      }
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      return false;
   }

   @Override
   protected lo q() {
      return lq.h;
   }

   @Override
   protected boolean o() {
      return false;
   }
}
