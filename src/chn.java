public class chn extends chd {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final cde f = cde.a().a(150.0);
   private final cde g;
   private int h;

   public chn(cha $$0) {
      super($$0);
      this.g = cde.a().a(20.0).a($$1 -> Math.abs($$1.dB() - $$0.dB()) <= 10.0);
   }

   @Override
   public void c() {
      this.h++;
      bso $$0 = this.a.dU().a(this.g, this.a, this.a.dz(), this.a.dB(), this.a.dF());
      if ($$0 != null) {
         if (this.h > 25) {
            this.a.gv().a(chq.h);
         } else {
            ewu $$1 = new ewu($$0.dz() - this.a.dz(), 0.0, $$0.dF() - this.a.dF()).d();
            ewu $$2 = new ewu((double)aym.a(this.a.dK() * (float) (Math.PI / 180.0)), 0.0, (double)(-aym.b(this.a.dK() * (float) (Math.PI / 180.0)))).d();
            float $$3 = (float)$$2.b($$1);
            float $$4 = (float)(Math.acos((double)$$3) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$4 < 0.0F || $$4 > 10.0F) {
               double $$5 = $$0.dz() - this.a.e.dz();
               double $$6 = $$0.dF() - this.a.e.dF();
               double $$7 = aym.a(aym.d(180.0 - aym.d($$5, $$6) * 180.0F / (float)Math.PI - (double)this.a.dK()), -100.0, 100.0);
               this.a.ck *= 0.8F;
               float $$8 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6) + 1.0F;
               float $$9 = $$8;
               if ($$8 > 40.0F) {
                  $$8 = 40.0F;
               }

               this.a.ck += (float)$$7 * (0.7F / $$8 / $$9);
               this.a.r(this.a.dK() + this.a.ck);
            }
         }
      } else if (this.h >= 100) {
         $$0 = this.a.dU().a(f, this.a, this.a.dz(), this.a.dB(), this.a.dF());
         this.a.gv().a(chq.e);
         if ($$0 != null) {
            this.a.gv().a(chq.i);
            this.a.gv().b(chq.i).a(new ewu($$0.dz(), $$0.dB(), $$0.dF()));
         }
      }
   }

   @Override
   public void d() {
      this.h = 0;
   }

   @Override
   public chq<chn> i() {
      return chq.g;
   }
}
