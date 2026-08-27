public class chi extends chr {
   private static final int b = 2400;
   private int c;

   public chi(bqr<? extends chi> $$0, czu $$1) {
      super($$0, $$1);
      this.bN = 3;
   }

   @Override
   protected void z() {
      this.bS.a(1, new bxv(this));
      this.bS.a(1, new bxq(this, this.dN()));
      this.bS.a(2, new byl(this, 1.0, false));
      this.bS.a(3, new bzo(this, 1.0));
      this.bS.a(7, new byj(this, ckl.class, 8.0F));
      this.bS.a(8, new byw(this));
      this.bT.a(1, new bzt(this).a());
      this.bT.a(2, new bzu<>(this, ckl.class, true));
   }

   public static bsk.a r() {
      return chr.gv().a(bsl.q, 8.0).a(bsl.r, 0.25).a(bsl.c, 2.0);
   }

   @Override
   protected bql.b aZ() {
      return bql.b.c;
   }

   @Override
   protected auy v() {
      return auz.ik;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.im;
   }

   @Override
   protected auy o_() {
      return auz.il;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.in, 0.15F, 1.0F);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(ty $$0) {
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
            this.dN().a(kw.Z, this.d(0.5), this.dv(), this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
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

   public static boolean b(bqr<chi> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         ckl $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }
}
