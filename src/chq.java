public class chq extends cia {
   public chq(bqr<? extends chq> $$0, czu $$1) {
      super($$0, $$1);
   }

   public static bsk.a r() {
      return chr.gv().a(bsl.r, 0.2F);
   }

   public static boolean b(bqr<chq> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      return $$1.ak() != bon.a;
   }

   @Override
   public boolean a(czx $$0) {
      return $$0.f(this) && !$$0.d(this.cI());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.f(bsl.a).a((double)($$0 * 3));
   }

   @Override
   public float br() {
      return 1.0F;
   }

   @Override
   protected ku u() {
      return kw.E;
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
      etf $$0 = this.dq();
      float $$1 = (float)this.gq() * 0.1F;
      this.o($$0.c, (double)(this.ff() + $$1), $$0.e);
      this.av = true;
   }

   @Override
   protected void c(awd<elq> $$0) {
      if ($$0 == avt.b) {
         etf $$1 = this.dq();
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
   protected auy d(bpj $$0) {
      return this.gr() ? auz.oi : auz.oh;
   }

   @Override
   protected auy o_() {
      return this.gr() ? auz.nX : auz.og;
   }

   @Override
   protected auy go() {
      return this.gr() ? auz.ol : auz.ok;
   }

   @Override
   protected auy gp() {
      return auz.oj;
   }
}
