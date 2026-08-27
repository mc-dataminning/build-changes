public class chf extends chp {
   public chf(bqg<? extends chf> $$0, czg $$1) {
      super($$0, $$1);
   }

   public static brz.a r() {
      return chg.gt().a(bsa.r, 0.2F);
   }

   public static boolean b(bqg<chf> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      return $$1.ak() != boc.a;
   }

   @Override
   public boolean a(czj $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.f(bsa.a).a((double)($$0 * 3));
   }

   @Override
   public float br() {
      return 1.0F;
   }

   @Override
   protected kl u() {
      return kn.F;
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
      esj $$0 = this.dp();
      float $$1 = (float)this.go() * 0.1F;
      this.o($$0.c, (double)(this.fe() + $$1), $$0.e);
      this.au = true;
   }

   @Override
   protected void c(avt<ela> $$0) {
      if ($$0 == avj.b) {
         esj $$1 = this.dp();
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
   protected aun d(boy $$0) {
      return this.gp() ? auo.ob : auo.oa;
   }

   @Override
   protected aun o_() {
      return this.gp() ? auo.nS : auo.nZ;
   }

   @Override
   protected aun gm() {
      return this.gp() ? auo.oe : auo.od;
   }

   @Override
   protected aun gn() {
      return auo.oc;
   }
}
