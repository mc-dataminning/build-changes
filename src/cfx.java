public class cfx extends cgh {
   public cfx(bpc<? extends cfx> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public static bqu.a r() {
      return cfy.gt().a(bqv.r, 0.2F);
   }

   public static boolean b(bpc<cfx> $$0, cxa $$1, bps $$2, ib $$3, axd $$4) {
      return $$1.aj() != bmz.a;
   }

   @Override
   public boolean a(cxc $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.f(bqv.a).a((double)($$0 * 3));
   }

   @Override
   public float br() {
      return 1.0F;
   }

   @Override
   protected ka s() {
      return kc.F;
   }

   @Override
   public boolean bN() {
      return false;
   }

   @Override
   protected int y() {
      return super.y() * 4;
   }

   @Override
   protected void gj() {
      this.d *= 0.9F;
   }

   @Override
   protected void fg() {
      epr $$0 = this.dp();
      float $$1 = (float)this.go() * 0.1F;
      this.o($$0.c, (double)(this.fe() + $$1), $$0.e);
      this.au = true;
   }

   @Override
   protected void c(avd<eim> $$0) {
      if ($$0 == aus.b) {
         epr $$1 = this.dp();
         this.o($$1.c, (double)(0.22F + (float)this.go() * 0.05F), $$1.e);
         this.au = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gk() {
      return this.cY();
   }

   @Override
   protected float gl() {
      return super.gl() + 2.0F;
   }

   @Override
   protected atx d(bnv $$0) {
      return this.gp() ? aty.nV : aty.nU;
   }

   @Override
   protected atx n_() {
      return this.gp() ? aty.nM : aty.nT;
   }

   @Override
   protected atx gm() {
      return this.gp() ? aty.nY : aty.nX;
   }

   @Override
   protected atx gn() {
      return aty.nW;
   }
}
