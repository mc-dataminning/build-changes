public class cjh extends cjq {
   private static final int b = 2400;
   private int c;

   public cjh(bsm<? extends cjh> $$0, dcf $$1) {
      super($$0, $$1);
      this.bP = 3;
   }

   @Override
   protected void z() {
      this.bU.a(1, new bzt(this));
      this.bU.a(1, new bzo(this, this.dQ()));
      this.bU.a(2, new caj(this, 1.0, false));
      this.bU.a(3, new cbm(this, 1.0));
      this.bU.a(7, new cah(this, cmk.class, 8.0F));
      this.bU.a(8, new cau(this));
      this.bV.a(1, new cbr(this).a());
      this.bV.a(2, new cbs<>(this, cmk.class, true));
   }

   public static bui.a s() {
      return cjq.gu().a(buj.s, 8.0).a(buj.v, 0.25).a(buj.c, 2.0);
   }

   @Override
   protected bsg.b bc() {
      return bsg.b.c;
   }

   @Override
   protected avg v() {
      return avh.ip;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.ir;
   }

   @Override
   protected avg o_() {
      return avh.iq;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.is, 0.15F, 1.0F);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aY = this.dG();
      super.l();
   }

   @Override
   public void p(float $$0) {
      this.s($$0);
      super.p($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.dQ().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dQ().a(lj.ac, this.d(0.5), this.dy(), this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fT()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.ap();
         }
      }
   }

   public static boolean b(bsm<cjh> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cmk $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }
}
