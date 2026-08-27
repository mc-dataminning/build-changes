public class cit extends cjc {
   private static final int b = 2400;
   private int c;

   public cit(bsa<? extends cit> $$0, dax $$1) {
      super($$0, $$1);
      this.bN = 3;
   }

   @Override
   protected void z() {
      this.bS.a(1, new bzg(this));
      this.bS.a(1, new bzb(this, this.dP()));
      this.bS.a(2, new bzw(this, 1.0, false));
      this.bS.a(3, new caz(this, 1.0));
      this.bS.a(7, new bzu(this, clw.class, 8.0F));
      this.bS.a(8, new cah(this));
      this.bT.a(1, new cbe(this).a());
      this.bT.a(2, new cbf<>(this, clw.class, true));
   }

   public static btv.a s() {
      return cjc.gv().a(btw.q, 8.0).a(btw.r, 0.25).a(btw.c, 2.0);
   }

   @Override
   protected bru.b bb() {
      return bru.b.c;
   }

   @Override
   protected avg v() {
      return avh.ip;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.ir;
   }

   @Override
   protected avg o_() {
      return avh.iq;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.is, 0.15F, 1.0F);
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
      this.aZ = this.dF();
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

   public static boolean b(bsa<cit> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         clw $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }
}
