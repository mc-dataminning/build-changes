public class cjb extends cjn {
   public cjb(bsb<? extends cjb> $$0, dca $$1) {
      super($$0, $$1);
   }

   public static btu.a r() {
      return cjd.gG().a(btv.r, 0.2F);
   }

   public static boolean b(bsb<cjb> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      return $$1.al() != bpx.a;
   }

   @Override
   public boolean a(dcd $$0) {
      return $$0.f(this) && !$$0.d(this.cP());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.f(btv.a).a((double)($$0 * 3));
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Override
   protected kz t() {
      return lb.E;
   }

   @Override
   public boolean bV() {
      return false;
   }

   @Override
   protected int x() {
      return super.x() * 4;
   }

   @Override
   protected void gu() {
      this.d *= 0.9F;
   }

   @Override
   protected void fs() {
      ewu $$0 = this.dx();
      float $$1 = (float)this.gz() * 0.1F;
      this.o($$0.c, (double)(this.fq() + $$1), $$0.e);
      this.az = true;
   }

   @Override
   protected void c(awt<epd> $$0) {
      if ($$0 == awj.b) {
         ewu $$1 = this.dx();
         this.o($$1.c, (double)(0.22F + (float)this.gz() * 0.05F), $$1.e);
         this.az = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gv() {
      return this.dg();
   }

   @Override
   protected float gw() {
      return super.gw() + 2.0F;
   }

   @Override
   protected avn d(bqt $$0) {
      return this.gA() ? avo.oJ : avo.oI;
   }

   @Override
   protected avn n_() {
      return this.gA() ? avo.ox : avo.oH;
   }

   @Override
   protected avn gx() {
      return this.gA() ? avo.oM : avo.oL;
   }

   @Override
   protected avn gy() {
      return avo.oK;
   }
}
