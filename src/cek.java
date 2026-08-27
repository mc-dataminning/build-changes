public class cek extends cea {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final cae f = cae.a().a(150.0);
   private final cae g;
   private int h;

   public cek(cdx $$0) {
      super($$0);
      this.g = cae.a().a(20.0).a($$1 -> Math.abs($$1.dt() - $$0.dt()) <= 10.0);
   }

   @Override
   public void c() {
      this.h++;
      bpo $$0 = this.a.dM().a(this.g, this.a, this.a.dr(), this.a.dt(), this.a.dx());
      if ($$0 != null) {
         if (this.h > 25) {
            this.a.gk().a(cen.h);
         } else {
            epr $$1 = new epr($$0.dr() - this.a.dr(), 0.0, $$0.dx() - this.a.dx()).d();
            epr $$2 = new epr((double)aww.a(this.a.dC() * (float) (Math.PI / 180.0)), 0.0, (double)(-aww.b(this.a.dC() * (float) (Math.PI / 180.0)))).d();
            float $$3 = (float)$$2.b($$1);
            float $$4 = (float)(Math.acos((double)$$3) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$4 < 0.0F || $$4 > 10.0F) {
               double $$5 = $$0.dr() - this.a.e.dr();
               double $$6 = $$0.dx() - this.a.e.dx();
               double $$7 = aww.a(aww.d(180.0 - aww.d($$5, $$6) * 180.0F / (float)Math.PI - (double)this.a.dC()), -100.0, 100.0);
               this.a.ca *= 0.8F;
               float $$8 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6) + 1.0F;
               float $$9 = $$8;
               if ($$8 > 40.0F) {
                  $$8 = 40.0F;
               }

               this.a.ca += (float)$$7 * (0.7F / $$8 / $$9);
               this.a.r(this.a.dC() + this.a.ca);
            }
         }
      } else if (this.h >= 100) {
         $$0 = this.a.dM().a(f, this.a, this.a.dr(), this.a.dt(), this.a.dx());
         this.a.gk().a(cen.e);
         if ($$0 != null) {
            this.a.gk().a(cen.i);
            this.a.gk().b(cen.i).a(new epr($$0.dr(), $$0.dt(), $$0.dx()));
         }
      }
   }

   @Override
   public void d() {
      this.h = 0;
   }

   @Override
   public cen<cek> i() {
      return cen.g;
   }
}
