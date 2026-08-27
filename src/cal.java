public class cal extends cab {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final bwj f = bwj.a().a(150.0);
   private final bwj g;
   private int h;

   public cal(bzy $$0) {
      super($$0);
      this.g = bwj.a().a(20.0).a($$1 -> Math.abs($$1.dt() - $$0.dt()) <= 10.0);
   }

   @Override
   public void c() {
      this.h++;
      blv $$0 = this.a.dM().a(this.g, this.a, this.a.dr(), this.a.dt(), this.a.dx());
      if ($$0 != null) {
         if (this.h > 25) {
            this.a.gb().a(cao.h);
         } else {
            elb $$1 = new elb($$0.dr() - this.a.dr(), 0.0, $$0.dx() - this.a.dx()).d();
            elb $$2 = new elb((double)aty.a(this.a.dC() * (float) (Math.PI / 180.0)), 0.0, (double)(-aty.b(this.a.dC() * (float) (Math.PI / 180.0)))).d();
            float $$3 = (float)$$2.b($$1);
            float $$4 = (float)(Math.acos((double)$$3) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$4 < 0.0F || $$4 > 10.0F) {
               double $$5 = $$0.dr() - this.a.e.dr();
               double $$6 = $$0.dx() - this.a.e.dx();
               double $$7 = aty.a(aty.d(180.0 - aty.d($$5, $$6) * 180.0F / (float)Math.PI - (double)this.a.dC()), -100.0, 100.0);
               this.a.bW *= 0.8F;
               float $$8 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6) + 1.0F;
               float $$9 = $$8;
               if ($$8 > 40.0F) {
                  $$8 = 40.0F;
               }

               this.a.bW += (float)$$7 * (0.7F / $$8 / $$9);
               this.a.r(this.a.dC() + this.a.bW);
            }
         }
      } else if (this.h >= 100) {
         $$0 = this.a.dM().a(f, this.a, this.a.dr(), this.a.dt(), this.a.dx());
         this.a.gb().a(cao.e);
         if ($$0 != null) {
            this.a.gb().a(cao.i);
            this.a.gb().b(cao.i).a(new elb($$0.dr(), $$0.dt(), $$0.dx()));
         }
      }
   }

   @Override
   public void d() {
      this.h = 0;
   }

   @Override
   public cao<cal> i() {
      return cao.g;
   }
}
