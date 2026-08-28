public class cia extends chq {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final cds f = cds.a().a(150.0);
   private final cds g;
   private int h;

   public cia(chn $$0) {
      super($$0);
      this.g = cds.a().a(20.0).a($$1 -> Math.abs($$1.dx() - $$0.dx()) <= 10.0);
   }

   @Override
   public void c() {
      this.h++;
      btb $$0 = this.a.dQ().a(this.g, this.a, this.a.dv(), this.a.dx(), this.a.dB());
      if ($$0 != null) {
         if (this.h > 25) {
            this.a.gl().a(cid.h);
         } else {
            ewf $$1 = new ewf($$0.dv() - this.a.dv(), 0.0, $$0.dB() - this.a.dB()).d();
            ewf $$2 = new ewf((double)ayg.a(this.a.dG() * (float) (Math.PI / 180.0)), 0.0, (double)(-ayg.b(this.a.dG() * (float) (Math.PI / 180.0)))).d();
            float $$3 = (float)$$2.b($$1);
            float $$4 = (float)(Math.acos((double)$$3) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$4 < 0.0F || $$4 > 10.0F) {
               double $$5 = $$0.dv() - this.a.e.dv();
               double $$6 = $$0.dB() - this.a.e.dB();
               double $$7 = ayg.a(ayg.d(180.0 - ayg.d($$5, $$6) * 180.0F / (float)Math.PI - (double)this.a.dG()), -100.0, 100.0);
               this.a.cd *= 0.8F;
               float $$8 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6) + 1.0F;
               float $$9 = $$8;
               if ($$8 > 40.0F) {
                  $$8 = 40.0F;
               }

               this.a.cd += (float)$$7 * (0.7F / $$8 / $$9);
               this.a.s(this.a.dG() + this.a.cd);
            }
         }
      } else if (this.h >= 100) {
         $$0 = this.a.dQ().a(f, this.a, this.a.dv(), this.a.dx(), this.a.dB());
         this.a.gl().a(cid.e);
         if ($$0 != null) {
            this.a.gl().a(cid.i);
            this.a.gl().b(cid.i).a(new ewf($$0.dv(), $$0.dx(), $$0.dB()));
         }
      }
   }

   @Override
   public void d() {
      this.h = 0;
   }

   @Override
   public cid<cia> i() {
      return cid.g;
   }
}
