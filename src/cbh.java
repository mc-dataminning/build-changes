public class cbh extends cbr {
   public cbh(bku<? extends cbh> $$0, csa $$1) {
      super($$0, $$1);
   }

   public static bml.a u() {
      return cbi.gl().a(bmm.m, 0.2F);
   }

   public static boolean b(bku<cbh> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      return $$1.aj() != biu.a;
   }

   @Override
   public boolean a(csd $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.a(bmm.a).a((double)($$0 * 3));
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Override
   protected jq w() {
      return js.C;
   }

   @Override
   public boolean bN() {
      return false;
   }

   @Override
   protected int A() {
      return super.A() * 4;
   }

   @Override
   protected void gb() {
      this.d *= 0.9F;
   }

   @Override
   protected void fc() {
      eju $$0 = this.dq();
      float $$1 = (float)this.gg() * 0.1F;
      this.o($$0.c, (double)(this.fa() + $$1), $$0.e);
      this.au = true;
   }

   @Override
   protected void c(arv<ecr> $$0) {
      if ($$0 == arl.b) {
         eju $$1 = this.dq();
         this.o($$1.c, (double)(0.22F + (float)this.gg() * 0.05F), $$1.e);
         this.au = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gc() {
      return this.cZ();
   }

   @Override
   protected float gd() {
      return super.gd() + 2.0F;
   }

   @Override
   protected aqq d(bjo $$0) {
      return this.gh() ? aqr.ni : aqr.nh;
   }

   @Override
   protected aqq m_() {
      return this.gh() ? aqr.mZ : aqr.ng;
   }

   @Override
   protected aqq ge() {
      return this.gh() ? aqr.nl : aqr.nk;
   }

   @Override
   protected aqq gf() {
      return aqr.nj;
   }
}
