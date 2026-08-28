public class cjs extends ckb {
   private static final int b = 2400;
   private int c;

   public cjs(bsy<? extends cjs> $$0, dbw $$1) {
      super($$0, $$1);
      this.bN = 3;
   }

   @Override
   protected void z() {
      this.bS.a(1, new caf(this));
      this.bS.a(1, new caa(this, this.dP()));
      this.bS.a(2, new cav(this, 1.0, false));
      this.bS.a(3, new cby(this, 1.0));
      this.bS.a(7, new cat(this, cmv.class, 8.0F));
      this.bS.a(8, new cbg(this));
      this.bT.a(1, new ccd(this).a());
      this.bT.a(2, new cce<>(this, cmv.class, true));
   }

   public static buu.a s() {
      return ckb.gw().a(buv.q, 8.0).a(buv.r, 0.25).a(buv.c, 2.0);
   }

   @Override
   protected bss.b bb() {
      return bss.b.c;
   }

   @Override
   protected avy v() {
      return avz.ip;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.ir;
   }

   @Override
   protected avy o_() {
      return avz.iq;
   }

   @Override
   protected void b(iz $$0, dsa $$1) {
      this.a(avz.is, 0.15F, 1.0F);
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
            this.dP().a(li.ac, this.d(0.5), this.dx(), this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
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

   public static boolean b(bsy<cjs> $$0, dbx $$1, btr $$2, iz $$3, azf $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cmv $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }
}
