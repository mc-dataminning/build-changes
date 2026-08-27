public class cgy extends chi {
   public cgy(bqb<? extends cgy> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public static bru.a r() {
      return cgz.gt().a(brv.r, 0.2F);
   }

   public static boolean b(bqb<cgy> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      return $$1.ak() != bnx.a;
   }

   @Override
   public boolean a(cza $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.f(brv.a).a((double)($$0 * 3));
   }

   @Override
   public float br() {
      return 1.0F;
   }

   @Override
   protected kj u() {
      return kl.F;
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
      esa $$0 = this.dp();
      float $$1 = (float)this.go() * 0.1F;
      this.o($$0.c, (double)(this.fe() + $$1), $$0.e);
      this.au = true;
   }

   @Override
   protected void c(avr<ekr> $$0) {
      if ($$0 == avh.b) {
         esa $$1 = this.dp();
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
   protected aul d(bot $$0) {
      return this.gp() ? aum.ob : aum.oa;
   }

   @Override
   protected aul o_() {
      return this.gp() ? aum.nS : aum.nZ;
   }

   @Override
   protected aul gm() {
      return this.gp() ? aum.oe : aum.od;
   }

   @Override
   protected aul gn() {
      return aum.oc;
   }
}
