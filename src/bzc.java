public class bzc extends bzm {
   public bzc(bip<? extends bzc> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public static bkg.a p() {
      return bzd.gg().a(bkh.d, 0.2F);
   }

   public static boolean b(bip<bzc> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      return $$1.ai() != bgq.a;
   }

   @Override
   public boolean a(cpt $$0) {
      return $$0.f(this) && !$$0.d(this.cG());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.a(bkh.i).a((double)($$0 * 3));
   }

   @Override
   public float bm() {
      return 1.0F;
   }

   @Override
   protected iv q() {
      return ix.C;
   }

   @Override
   public boolean bM() {
      return false;
   }

   @Override
   protected int t() {
      return super.t() * 4;
   }

   @Override
   protected void fW() {
      this.d *= 0.9F;
   }

   @Override
   protected void eZ() {
      ehi $$0 = this.dn();
      float $$1 = (float)this.gb() * 0.1F;
      this.o($$0.c, (double)(this.eX() + $$1), $$0.e);
      this.au = true;
   }

   @Override
   protected void c(aqd<eag> $$0) {
      if ($$0 == apt.b) {
         ehi $$1 = this.dn();
         this.o($$1.c, (double)(0.22F + (float)this.gb() * 0.05F), $$1.e);
         this.au = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean fX() {
      return this.cX();
   }

   @Override
   protected float fY() {
      return super.fY() + 2.0F;
   }

   @Override
   protected aoy d(bhj $$0) {
      return this.gc() ? aoz.mO : aoz.mN;
   }

   @Override
   protected aoy h_() {
      return this.gc() ? aoz.mF : aoz.mM;
   }

   @Override
   protected aoy fZ() {
      return this.gc() ? aoz.mR : aoz.mQ;
   }

   @Override
   protected aoy ga() {
      return aoz.mP;
   }
}
