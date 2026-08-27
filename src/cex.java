public class cex extends cfg {
   private static final int b = 2400;
   private int c;

   public cex(bol<? extends cex> $$0, cwe $$1) {
      super($$0, $$1);
      this.bK = 3;
   }

   @Override
   protected void B() {
      this.bP.a(1, new bvo(this));
      this.bP.a(1, new bvj(this, this.dJ()));
      this.bP.a(2, new bwe(this, 1.0, false));
      this.bP.a(3, new bxh(this, 1.0));
      this.bP.a(7, new bwc(this, cia.class, 8.0F));
      this.bP.a(8, new bwp(this));
      this.bQ.a(1, new bxm(this).a());
      this.bQ.a(2, new bxn<>(this, cia.class, true));
   }

   public static bqd.a u() {
      return cfg.gr().a(bqe.n, 8.0).a(bqe.o, 0.25).a(bqe.c, 2.0);
   }

   @Override
   protected bof.b aW() {
      return bof.b.c;
   }

   @Override
   protected ato y() {
      return atp.ib;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.id;
   }

   @Override
   protected ato n_() {
      return atp.ic;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.ie, 0.15F, 1.0F);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aV = this.dz();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dJ().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dJ().a(kb.Z, this.d(0.5), this.dr(), this.g(0.5), (this.af.j() - 0.5) * 2.0, -this.af.j(), (this.af.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fS()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.am();
         }
      }
   }

   public static boolean b(bol<cex> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cia $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }
}
