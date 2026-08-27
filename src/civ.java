public class civ extends cje {
   private static final int b = 2400;
   private int c;

   public civ(bsc<? extends civ> $$0, daz $$1) {
      super($$0, $$1);
      this.bN = 3;
   }

   @Override
   protected void z() {
      this.bS.a(1, new bzi(this));
      this.bS.a(1, new bzd(this, this.dP()));
      this.bS.a(2, new bzy(this, 1.0, false));
      this.bS.a(3, new cbb(this, 1.0));
      this.bS.a(7, new bzw(this, cly.class, 8.0F));
      this.bS.a(8, new caj(this));
      this.bT.a(1, new cbg(this).a());
      this.bT.a(2, new cbh<>(this, cly.class, true));
   }

   public static btx.a s() {
      return cje.gv().a(bty.q, 8.0).a(bty.r, 0.25).a(bty.c, 2.0);
   }

   @Override
   protected brw.b bb() {
      return brw.b.c;
   }

   @Override
   protected avh v() {
      return avi.ip;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.ir;
   }

   @Override
   protected avh o_() {
      return avi.iq;
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(avi.is, 0.15F, 1.0F);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(ud $$0) {
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
            this.dP().a(ky.ac, this.d(0.5), this.dx(), this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fV()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.ao();
         }
      }
   }

   public static boolean b(bsc<civ> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cly $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }
}
