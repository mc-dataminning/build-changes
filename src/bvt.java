public class bvt extends bwc {
   private static final int b = 2400;
   private int c;

   public bvt(bfn<? extends bvt> $$0, cmm $$1) {
      super($$0, $$1);
      this.bJ = 3;
   }

   @Override
   protected void x() {
      this.bO.a(1, new bmp(this));
      this.bO.a(1, new bmk(this, this.dI()));
      this.bO.a(2, new bnf(this, 1.0, false));
      this.bO.a(3, new boi(this, 1.0));
      this.bO.a(7, new bnd(this, byo.class, 8.0F));
      this.bO.a(8, new bnq(this));
      this.bP.a(1, new bon(this).a());
      this.bP.a(2, new boo<>(this, byo.class, true));
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return 0.13F;
   }

   public static bhf.a q() {
      return bwc.ge().a(bhg.a, 8.0).a(bhg.d, 0.25).a(bhg.f, 2.0);
   }

   @Override
   protected bfj.b aS() {
      return bfj.b.c;
   }

   @Override
   protected amg s() {
      return amh.hi;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.hk;
   }

   @Override
   protected amg g_() {
      return amh.hj;
   }

   @Override
   protected void b(gu $$0, dcb $$1) {
      this.a(amh.hl, 0.15F, 1.0F);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aV = this.dy();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.a_($$0);
      super.o($$0);
   }

   @Override
   public double bw() {
      return 0.1;
   }

   @Override
   public void b_() {
      super.b_();
      if (this.dI().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dI().a(iv.X, this.d(0.5), this.dq(), this.g(0.5), (this.af.j() - 0.5) * 2.0, -this.af.j(), (this.af.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fH()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.ai();
         }
      }
   }

   public static boolean b(bfn<bvt> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         byo $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bge eN() {
      return bge.c;
   }
}
