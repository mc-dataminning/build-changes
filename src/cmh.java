import java.util.List;

public class cmh extends cmf {
   public static final float f = 4.0F;

   public cmh(bsc<? extends cmh> $$0, daz $$1) {
      super($$0, $$1);
   }

   public cmh(daz $$0, bsq $$1, double $$2, double $$3, double $$4) {
      super(bsc.A, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(euk $$0) {
      super.a($$0);
      if ($$0.c() != euk.a.c || !this.e(((euj)$$0).a())) {
         if (!this.dP().B) {
            List<bsq> $$1 = this.dP().a(bsq.class, this.cK().c(4.0, 2.0, 4.0));
            brs $$2 = new brs(this.dP(), this.du(), this.dw(), this.dA());
            brw $$3 = this.s();
            if ($$3 instanceof bsq) {
               $$2.a((bsq)$$3);
            }

            $$2.a(ky.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.j());
            $$2.a(new bre(brg.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bsq $$4 : $$1) {
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
   public boolean bz() {
      return false;
   }

   @Override
   public boolean a(bqp $$0, float $$1) {
      return false;
   }

   @Override
   protected kw v() {
      return ky.h;
   }

   @Override
   protected boolean u() {
      return false;
   }
}
