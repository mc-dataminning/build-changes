public class clh extends ckx {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final cgx f = cgx.a().a(150.0);
   private final cgx g;
   private int h;

   public clh(cku $$0) {
      super($$0);
      this.g = cgx.a().a(20.0).a(($$1, $$2) -> Math.abs($$1.dD() - $$0.dD()) <= 10.0);
   }

   @Override
   public void a(ash $$0) {
      this.h++;
      bwg $$1 = $$0.a(this.g, this.a, this.a.dB(), this.a.dD(), this.a.dH());
      if ($$1 != null) {
         if (this.h > 25) {
            this.a.gk().a(clk.h);
         } else {
            fby $$2 = new fby($$1.dB() - this.a.dB(), 0.0, $$1.dH() - this.a.dH()).d();
            fby $$3 = new fby((double)bae.a(this.a.dM() * (float) (Math.PI / 180.0)), 0.0, (double)(-bae.b(this.a.dM() * (float) (Math.PI / 180.0)))).d();
            float $$4 = (float)$$3.b($$2);
            float $$5 = (float)(Math.acos((double)$$4) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$5 < 0.0F || $$5 > 10.0F) {
               double $$6 = $$1.dB() - this.a.c.dB();
               double $$7 = $$1.dH() - this.a.c.dH();
               double $$8 = bae.a(bae.d(180.0 - bae.d($$6, $$7) * 180.0F / (float)Math.PI - (double)this.a.dM()), -100.0, 100.0);
               this.a.cb *= 0.8F;
               float $$9 = (float)Math.sqrt($$6 * $$6 + $$7 * $$7) + 1.0F;
               float $$10 = $$9;
               if ($$9 > 40.0F) {
                  $$9 = 40.0F;
               }

               this.a.cb += (float)$$8 * (0.7F / $$9 / $$10);
               this.a.v(this.a.dM() + this.a.cb);
            }
         }
      } else if (this.h >= 100) {
         $$1 = $$0.a(f, this.a, this.a.dB(), this.a.dD(), this.a.dH());
         this.a.gk().a(clk.e);
         if ($$1 != null) {
            this.a.gk().a(clk.i);
            this.a.gk().b(clk.i).a(new fby($$1.dB(), $$1.dD(), $$1.dH()));
         }
      }
   }

   @Override
   public void c() {
      this.h = 0;
   }

   @Override
   public clk<clh> h() {
      return clk.g;
   }
}
