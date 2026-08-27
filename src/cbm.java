public class cbm extends cbw {
   public cbm(bkz<? extends cbm> $$0, csf $$1) {
      super($$0, $$1);
   }

   public static bmq.a u() {
      return cbn.gl().a(bmr.m, 0.2F);
   }

   public static boolean b(bkz<cbm> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      return $$1.aj() != biy.a;
   }

   @Override
   public boolean a(csi $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.a(bmr.a).a((double)($$0 * 3));
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Override
   protected ju w() {
      return jw.C;
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
      ejz $$0 = this.dq();
      float $$1 = (float)this.gg() * 0.1F;
      this.o($$0.c, (double)(this.fa() + $$1), $$0.e);
      this.au = true;
   }

   @Override
   protected void c(arz<ecw> $$0) {
      if ($$0 == arp.b) {
         ejz $$1 = this.dq();
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
   protected aqu d(bjt $$0) {
      return this.gh() ? aqv.ni : aqv.nh;
   }

   @Override
   protected aqu n_() {
      return this.gh() ? aqv.mZ : aqv.ng;
   }

   @Override
   protected aqu ge() {
      return this.gh() ? aqv.nl : aqv.nk;
   }

   @Override
   protected aqu gf() {
      return aqv.nj;
   }
}
