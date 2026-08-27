public class cie extends cin {
   private static final int b = 2400;
   private int c;

   public cie(brn<? extends cie> $$0, dad $$1) {
      super($$0, $$1);
      this.bN = 3;
   }

   @Override
   protected void z() {
      this.bS.a(1, new byr(this));
      this.bS.a(1, new bym(this, this.dN()));
      this.bS.a(2, new bzh(this, 1.0, false));
      this.bS.a(3, new cak(this, 1.0));
      this.bS.a(7, new bzf(this, clh.class, 8.0F));
      this.bS.a(8, new bzs(this));
      this.bT.a(1, new cap(this).a());
      this.bT.a(2, new caq<>(this, clh.class, true));
   }

   public static btg.a r() {
      return cin.gv().a(bth.q, 8.0).a(bth.r, 0.25).a(bth.c, 2.0);
   }

   @Override
   protected brh.b aZ() {
      return brh.b.c;
   }

   @Override
   protected avb v() {
      return avc.ik;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.im;
   }

   @Override
   protected avb o_() {
      return avc.il;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.in, 0.15F, 1.0F);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aZ = this.dD();
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
      if (this.dN().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dN().a(kx.Z, this.d(0.5), this.dv(), this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fV()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.am();
         }
      }
   }

   public static boolean b(brn<cie> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         clh $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }
}
