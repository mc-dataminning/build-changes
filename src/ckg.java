public class ckg extends cjw {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final cfw f = cfw.a().a(150.0);
   private final cfw g;
   private int h;

   public ckg(cjt $$0) {
      super($$0);
      this.g = cfw.a().a(20.0).a(($$1, $$2) -> Math.abs($$1.dD() - $$0.dD()) <= 10.0);
   }

   @Override
   public void a(arc $$0) {
      this.h++;
      bvf $$1 = $$0.a(this.g, this.a, this.a.dB(), this.a.dD(), this.a.dH());
      if ($$1 != null) {
         if (this.h > 25) {
            this.a.gl().a(ckj.h);
         } else {
            fay $$2 = new fay($$1.dB() - this.a.dB(), 0.0, $$1.dH() - this.a.dH()).d();
            fay $$3 = new fay((double)ayy.a(this.a.dM() * (float) (Math.PI / 180.0)), 0.0, (double)(-ayy.b(this.a.dM() * (float) (Math.PI / 180.0)))).d();
            float $$4 = (float)$$3.b($$2);
            float $$5 = (float)(Math.acos((double)$$4) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$5 < 0.0F || $$5 > 10.0F) {
               double $$6 = $$1.dB() - this.a.c.dB();
               double $$7 = $$1.dH() - this.a.c.dH();
               double $$8 = ayy.a(ayy.d(180.0 - ayy.d($$6, $$7) * 180.0F / (float)Math.PI - (double)this.a.dM()), -100.0, 100.0);
               this.a.ca *= 0.8F;
               float $$9 = (float)Math.sqrt($$6 * $$6 + $$7 * $$7) + 1.0F;
               float $$10 = $$9;
               if ($$9 > 40.0F) {
                  $$9 = 40.0F;
               }

               this.a.ca += (float)$$8 * (0.7F / $$9 / $$10);
               this.a.v(this.a.dM() + this.a.ca);
            }
         }
      } else if (this.h >= 100) {
         $$1 = $$0.a(f, this.a, this.a.dB(), this.a.dD(), this.a.dH());
         this.a.gl().a(ckj.e);
         if ($$1 != null) {
            this.a.gl().a(ckj.i);
            this.a.gl().b(ckj.i).a(new fay($$1.dB(), $$1.dD(), $$1.dH()));
         }
      }
   }

   @Override
   public void c() {
      this.h = 0;
   }

   @Override
   public ckj<ckg> h() {
      return ckj.g;
   }
}
