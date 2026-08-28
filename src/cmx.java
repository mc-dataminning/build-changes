public class cmx extends cmn {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final chy f = chy.a().a(150.0);
   private final chy g;
   private int h;

   public cmx(cmk $$0) {
      super($$0);
      this.g = chy.a().a(20.0).a(($$1, $$2) -> Math.abs($$1.dB() - $$0.dB()) <= 10.0);
   }

   @Override
   public void a(arq $$0) {
      this.h++;
      bxj $$1 = $$0.a(this.g, this.a, this.a.dz(), this.a.dB(), this.a.dF());
      if ($$1 != null) {
         if (this.h > 25) {
            this.a.t().a(cna.h);
         } else {
            ffc $$2 = new ffc($$1.dz() - this.a.dz(), 0.0, $$1.dF() - this.a.dF()).d();
            ffc $$3 = new ffc((double)azm.a(this.a.dK() * (float) (Math.PI / 180.0)), 0.0, (double)(-azm.b(this.a.dK() * (float) (Math.PI / 180.0)))).d();
            float $$4 = (float)$$3.b($$2);
            float $$5 = (float)(Math.acos((double)$$4) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$5 < 0.0F || $$5 > 10.0F) {
               double $$6 = $$1.dz() - this.a.c.dz();
               double $$7 = $$1.dF() - this.a.c.dF();
               double $$8 = azm.a(azm.d(180.0 - azm.d($$6, $$7) * 180.0F / (float)Math.PI - (double)this.a.dK()), -100.0, 100.0);
               this.a.bI *= 0.8F;
               float $$9 = (float)Math.sqrt($$6 * $$6 + $$7 * $$7) + 1.0F;
               float $$10 = $$9;
               if ($$9 > 40.0F) {
                  $$9 = 40.0F;
               }

               this.a.bI += (float)$$8 * (0.7F / $$9 / $$10);
               this.a.w(this.a.dK() + this.a.bI);
            }
         }
      } else if (this.h >= 100) {
         $$1 = $$0.a(f, this.a, this.a.dz(), this.a.dB(), this.a.dF());
         this.a.t().a(cna.e);
         if ($$1 != null) {
            this.a.t().a(cna.i);
            this.a.t().b(cna.i).a(new ffc($$1.dz(), $$1.dB(), $$1.dF()));
         }
      }
   }

   @Override
   public void c() {
      this.h = 0;
   }

   @Override
   public cna<cmx> h() {
      return cna.g;
   }
}
