public class cjp extends cjy {
   private static final int b = 2400;
   private int c;

   public cjp(bsv<? extends cjp> $$0, dbt $$1) {
      super($$0, $$1);
      this.bN = 3;
   }

   @Override
   protected void z() {
      this.bS.a(1, new cac(this));
      this.bS.a(1, new bzx(this, this.dP()));
      this.bS.a(2, new cas(this, 1.0, false));
      this.bS.a(3, new cbv(this, 1.0));
      this.bS.a(7, new caq(this, cms.class, 8.0F));
      this.bS.a(8, new cbd(this));
      this.bT.a(1, new cca(this).a());
      this.bT.a(2, new ccb<>(this, cms.class, true));
   }

   public static bur.a s() {
      return cjy.gw().a(bus.q, 8.0).a(bus.r, 0.25).a(bus.c, 2.0);
   }

   @Override
   protected bsp.b bb() {
      return bsp.b.c;
   }

   @Override
   protected avv v() {
      return avw.ip;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.ir;
   }

   @Override
   protected avv o_() {
      return avw.iq;
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.is, 0.15F, 1.0F);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aY = this.dF();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.dP().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dP().a(lj.ac, this.d(0.5), this.dx(), this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fW()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.ao();
         }
      }
   }

   public static boolean b(bsv<cjp> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cms $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }
}
