public class cld extends clm {
   private static final int b = 2400;
   private int c;

   public cld(bug<? extends cld> $$0, dev $$1) {
      super($$0, $$1);
      this.bN = 3;
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbn(this));
      this.bS.a(1, new cbi(this, this.dX()));
      this.bS.a(2, new ccd(this, 1.0, false));
      this.bS.a(3, new cdg(this, 1.0));
      this.bS.a(7, new ccb(this, coh.class, 8.0F));
      this.bS.a(8, new cco(this));
      this.bT.a(1, new cdl(this).a());
      this.bT.a(2, new cdm<>(this, coh.class, true));
   }

   public static bwc.a q() {
      return clm.gB().a(bwd.s, 8.0).a(bwd.v, 0.25).a(bwd.c, 2.0);
   }

   @Override
   protected btz.b bh() {
      return btz.b.c;
   }

   @Override
   protected awj w() {
      return awk.iq;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.is;
   }

   @Override
   protected awj o_() {
      return awk.ir;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.it, 0.15F, 1.0F);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aU = this.dN();
      super.l();
   }

   @Override
   public void r(float $$0) {
      this.v($$0);
      super.r($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.dX().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dX().a(lq.ac, this.d(0.5), this.dF(), this.g(0.5), (this.af.j() - 0.5) * 2.0, -this.af.j(), (this.af.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.gc()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.au();
         }
      }
   }

   public static boolean b(bug<cld> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (buf.a($$2)) {
         return true;
      } else {
         coh $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}
