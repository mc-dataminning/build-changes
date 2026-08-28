public class cin extends cid {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final cef f = cef.a().a(150.0);
   private final cef g;
   private int h;

   public cin(cia $$0) {
      super($$0);
      this.g = cef.a().a(20.0).a($$1 -> Math.abs($$1.dv() - $$0.dv()) <= 10.0);
   }

   @Override
   public void c() {
      this.h++;
      btn $$0 = this.a.dO().a(this.g, this.a, this.a.dt(), this.a.dv(), this.a.dz());
      if ($$0 != null) {
         if (this.h > 25) {
            this.a.gh().a(ciq.h);
         } else {
            exc $$1 = new exc($$0.dt() - this.a.dt(), 0.0, $$0.dz() - this.a.dz()).d();
            exc $$2 = new exc((double)ayo.a(this.a.dE() * (float) (Math.PI / 180.0)), 0.0, (double)(-ayo.b(this.a.dE() * (float) (Math.PI / 180.0)))).d();
            float $$3 = (float)$$2.b($$1);
            float $$4 = (float)(Math.acos((double)$$3) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$4 < 0.0F || $$4 > 10.0F) {
               double $$5 = $$0.dt() - this.a.e.dt();
               double $$6 = $$0.dz() - this.a.e.dz();
               double $$7 = ayo.a(ayo.d(180.0 - ayo.d($$5, $$6) * 180.0F / (float)Math.PI - (double)this.a.dE()), -100.0, 100.0);
               this.a.cf *= 0.8F;
               float $$8 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6) + 1.0F;
               float $$9 = $$8;
               if ($$8 > 40.0F) {
                  $$8 = 40.0F;
               }

               this.a.cf += (float)$$7 * (0.7F / $$8 / $$9);
               this.a.t(this.a.dE() + this.a.cf);
            }
         }
      } else if (this.h >= 100) {
         $$0 = this.a.dO().a(f, this.a, this.a.dt(), this.a.dv(), this.a.dz());
         this.a.gh().a(ciq.e);
         if ($$0 != null) {
            this.a.gh().a(ciq.i);
            this.a.gh().b(ciq.i).a(new exc($$0.dt(), $$0.dv(), $$0.dz()));
         }
      }
   }

   @Override
   public void d() {
      this.h = 0;
   }

   @Override
   public ciq<cin> i() {
      return ciq.g;
   }
}
