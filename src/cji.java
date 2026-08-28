public class cji extends cjr {
   private static final int b = 2400;
   private int c;

   public cji(bsn<? extends cji> $$0, dcg $$1) {
      super($$0, $$1);
      this.bP = 3;
   }

   @Override
   protected void z() {
      this.bU.a(1, new bzu(this));
      this.bU.a(1, new bzp(this, this.dR()));
      this.bU.a(2, new cak(this, 1.0, false));
      this.bU.a(3, new cbn(this, 1.0));
      this.bU.a(7, new cai(this, cml.class, 8.0F));
      this.bU.a(8, new cav(this));
      this.bV.a(1, new cbs(this).a());
      this.bV.a(2, new cbt<>(this, cml.class, true));
   }

   public static buj.a s() {
      return cjr.gt().a(buk.s, 8.0).a(buk.v, 0.25).a(buk.c, 2.0);
   }

   @Override
   protected bsh.c bd() {
      return bsh.c.c;
   }

   @Override
   protected avg v() {
      return avh.ip;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.ir;
   }

   @Override
   protected avg n_() {
      return avh.iq;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
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
      this.aZ = this.dH();
      super.l();
   }

   @Override
   public void p(float $$0) {
      this.s($$0);
      super.p($$0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.dR().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dR().a(lj.ac, this.d(0.5), this.dz(), this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fS()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.aq();
         }
      }
   }

   public static boolean b(bsn<cji> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cml $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }
}
