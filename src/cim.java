public class cim extends ciw {
   public cim(brn<? extends cim> $$0, dad $$1) {
      super($$0, $$1);
   }

   public static btg.a r() {
      return cin.gv().a(bth.r, 0.2F);
   }

   public static boolean b(brn<cim> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      return $$1.ak() != bpj.a;
   }

   @Override
   public boolean a(dag $$0) {
      return $$0.f(this) && !$$0.d(this.cI());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.f(bth.a).a((double)($$0 * 3));
   }

   @Override
   public float br() {
      return 1.0F;
   }

   @Override
   protected kv u() {
      return kx.E;
   }

   @Override
   public boolean bO() {
      return false;
   }

   @Override
   protected int y() {
      return super.y() * 4;
   }

   @Override
   protected void gl() {
      this.d *= 0.9F;
   }

   @Override
   protected void fh() {
      etp $$0 = this.dq();
      float $$1 = (float)this.gq() * 0.1F;
      this.o($$0.c, (double)(this.ff() + $$1), $$0.e);
      this.av = true;
   }

   @Override
   protected void c(awg<elz> $$0) {
      if ($$0 == avw.b) {
         etp $$1 = this.dq();
         this.o($$1.c, (double)(0.22F + (float)this.gq() * 0.05F), $$1.e);
         this.av = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gm() {
      return this.cZ();
   }

   @Override
   protected float gn() {
      return super.gn() + 2.0F;
   }

   @Override
   protected avb d(bqf $$0) {
      return this.gr() ? avc.oj : avc.oi;
   }

   @Override
   protected avb o_() {
      return this.gr() ? avc.nX : avc.oh;
   }

   @Override
   protected avb go() {
      return this.gr() ? avc.om : avc.ol;
   }

   @Override
   protected avb gp() {
      return avc.ok;
   }
}
