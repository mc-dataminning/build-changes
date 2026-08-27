public class cgx extends chg {
   private static final int b = 2400;
   private int c;

   public cgx(bqg<? extends cgx> $$0, czg $$1) {
      super($$0, $$1);
      this.bM = 3;
   }

   @Override
   protected void z() {
      this.bR.a(1, new bxk(this));
      this.bR.a(1, new bxf(this, this.dM()));
      this.bR.a(2, new bya(this, 1.0, false));
      this.bR.a(3, new bzd(this, 1.0));
      this.bR.a(7, new bxy(this, cka.class, 8.0F));
      this.bR.a(8, new byl(this));
      this.bS.a(1, new bzi(this).a());
      this.bS.a(2, new bzj<>(this, cka.class, true));
   }

   public static brz.a r() {
      return chg.gt().a(bsa.q, 8.0).a(bsa.r, 0.25).a(bsa.c, 2.0);
   }

   @Override
   protected bqa.b aZ() {
      return bqa.b.c;
   }

   @Override
   protected aun v() {
      return auo.ik;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.im;
   }

   @Override
   protected aun o_() {
      return auo.il;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.in, 0.15F, 1.0F);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aX = this.dC();
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
      if (this.dM().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dM().a(kn.aa, this.d(0.5), this.du(), this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fU()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.am();
         }
      }
   }

   public static boolean b(bqg<cgx> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cka $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }
}
