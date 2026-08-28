import java.util.List;

public class coe extends coc {
   public static final float e = 4.0F;

   public coe(btv<? extends coe> $$0, deg $$1) {
      super($$0, $$1);
   }

   public coe(deg $$0, buk $$1, eys $$2) {
      super(btv.A, $$1, $$2, $$0);
   }

   @Override
   protected void a(eyq $$0) {
      super.a($$0);
      if ($$0.d() != eyq.a.c || !this.e(((eyp)$$0).a())) {
         if (!this.dS().B) {
            List<buk> $$1 = this.dS().a(buk.class, this.cO().c(4.0, 2.0, 4.0));
            btj $$2 = new btj(this.dS(), this.dx(), this.dz(), this.dD());
            bto $$3 = this.s();
            if ($$3 instanceof buk) {
               $$2.a((buk)$$3);
            }

            $$2.a(ln.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.j());
            $$2.a(new bsv(bsx.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (buk $$4 : $$1) {
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
   public boolean a(bsg $$0, float $$1) {
      return false;
   }

   @Override
   protected ll q() {
      return ln.h;
   }

   @Override
   protected boolean o() {
      return false;
   }
}
