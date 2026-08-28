public class cjf extends civ {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final cev f = cev.a().a(150.0);
   private final cev g;
   private int h;

   public cjf(cis $$0) {
      super($$0);
      this.g = cev.a().a(20.0).a($$1 -> Math.abs($$1.dz() - $$0.dz()) <= 10.0);
   }

   @Override
   public void c() {
      this.h++;
      buf $$0 = this.a.dS().a(this.g, this.a, this.a.dx(), this.a.dz(), this.a.dD());
      if ($$0 != null) {
         if (this.h > 25) {
            this.a.gl().a(cji.h);
         } else {
            eye $$1 = new eye($$0.dx() - this.a.dx(), 0.0, $$0.dD() - this.a.dD()).d();
            eye $$2 = new eye((double)azc.a(this.a.dI() * (float) (Math.PI / 180.0)), 0.0, (double)(-azc.b(this.a.dI() * (float) (Math.PI / 180.0)))).d();
            float $$3 = (float)$$2.b($$1);
            float $$4 = (float)(Math.acos((double)$$3) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$4 < 0.0F || $$4 > 10.0F) {
               double $$5 = $$0.dx() - this.a.d.dx();
               double $$6 = $$0.dD() - this.a.d.dD();
               double $$7 = azc.a(azc.d(180.0 - azc.d($$5, $$6) * 180.0F / (float)Math.PI - (double)this.a.dI()), -100.0, 100.0);
               this.a.cb *= 0.8F;
               float $$8 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6) + 1.0F;
               float $$9 = $$8;
               if ($$8 > 40.0F) {
                  $$8 = 40.0F;
               }

               this.a.cb += (float)$$7 * (0.7F / $$8 / $$9);
               this.a.v(this.a.dI() + this.a.cb);
            }
         }
      } else if (this.h >= 100) {
         $$0 = this.a.dS().a(f, this.a, this.a.dx(), this.a.dz(), this.a.dD());
         this.a.gl().a(cji.e);
         if ($$0 != null) {
            this.a.gl().a(cji.i);
            this.a.gl().b(cji.i).a(new eye($$0.dx(), $$0.dz(), $$0.dD()));
         }
      }
   }

   @Override
   public void d() {
      this.h = 0;
   }

   @Override
   public cji<cjf> i() {
      return cji.g;
   }
}
