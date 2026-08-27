import java.util.List;

public class cfa extends cey {
   public static final float e = 4.0F;

   public cfa(blj<? extends cfa> $$0, csy $$1) {
      super($$0, $$1);
   }

   public cfa(csy $$0, blv $$1, double $$2, double $$3, double $$4) {
      super(blj.y, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(ekz $$0) {
      super.a($$0);
      if ($$0.c() != ekz.a.c || !this.d(((eky)$$0).a())) {
         if (!this.dM().B) {
            List<blv> $$1 = this.dM().a(blv.class, this.cH().c(4.0, 2.0, 4.0));
            blc $$2 = new blc(this.dM(), this.dr(), this.dt(), this.dx());
            blf $$3 = this.w();
            if ($$3 instanceof blv) {
               $$2.a((blv)$$3);
            }

            $$2.a(jv.i);
            $$2.a(3.0F);
            $$2.b(600);
            $$2.c((7.0F - $$2.h()) / (float)$$2.m());
            $$2.a(new bks(bku.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (blv $$4 : $$1) {
                  double $$5 = this.f($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dr(), $$4.dt(), $$4.dx());
                     break;
                  }
               }
            }

            this.dM().c(2006, this.dm(), this.aU() ? -1 : 1);
            this.dM().b($$2);
            this.am();
         }
      }
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      return false;
   }

   @Override
   protected jt u() {
      return jv.i;
   }

   @Override
   protected boolean s() {
      return false;
   }
}
