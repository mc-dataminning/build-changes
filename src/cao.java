public class cao extends caf {
   private static final aby<Boolean> e = acb.a(cao.class, aca.k);
   private int f;
   public double c;
   public double d;
   private static final ciz g = ciz.a(cgc.nI, cgc.nJ);

   public cao(bfn<? extends cao> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public cao(cmm $$0, double $$1, double $$2, double $$3) {
      super(bfn.P, $$0, $$1, $$2, $$3);
   }

   @Override
   public caf.a t() {
      return caf.a.c;
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(e, false);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dI().r_()) {
         if (this.f > 0) {
            this.f--;
         }

         if (this.f <= 0) {
            this.c = 0.0;
            this.d = 0.0;
         }

         this.p(this.f > 0);
      }

      if (this.A() && this.af.a(4) == 0) {
         this.dI().a(iv.S, this.dn(), this.dp() + 0.8, this.dt(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double k() {
      return (this.aV() ? 3.0 : 4.0) / 20.0;
   }

   @Override
   protected cfu j() {
      return cgc.nc;
   }

   @Override
   protected void c(gu $$0, dcb $$1) {
      double $$2 = 1.0E-4;
      double $$3 = 0.001;
      super.c($$0, $$1);
      eei $$4 = this.dl();
      double $$5 = $$4.i();
      double $$6 = this.c * this.c + this.d * this.d;
      if ($$6 > 1.0E-4 && $$5 > 0.001) {
         double $$7 = Math.sqrt($$5);
         double $$8 = Math.sqrt($$6);
         this.c = $$4.c / $$7 * $$8;
         this.d = $$4.e / $$7 * $$8;
      }
   }

   @Override
   protected void p() {
      double $$0 = this.c * this.c + this.d * this.d;
      if ($$0 > 1.0E-7) {
         $$0 = Math.sqrt($$0);
         this.c /= $$0;
         this.d /= $$0;
         eei $$1 = this.dl().d(0.8, 0.0, 0.8).b(this.c, 0.0, this.d);
         if (this.aV()) {
            $$1 = $$1.a(0.1);
         }

         this.f($$1);
      } else {
         this.f(this.dl().d(0.98, 0.0, 0.98));
      }

      super.p();
   }

   @Override
   public bdx a(byo $$0, bdw $$1) {
      cfz $$2 = $$0.b($$1);
      if (g.a($$2) && this.f + 3600 <= 32000) {
         if (!$$0.fO().d) {
            $$2.h(1);
         }

         this.f += 3600;
      }

      if (this.f > 0) {
         this.c = this.dn() - $$0.dn();
         this.d = this.dt() - $$0.dt();
      }

      return bdx.a(this.dI().B);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      $$0.a("PushX", this.c);
      $$0.a("PushZ", this.d);
      $$0.a("Fuel", (short)this.f);
   }

   @Override
   protected void a(qr $$0) {
      super.a($$0);
      this.c = $$0.k("PushX");
      this.d = $$0.k("PushZ");
      this.f = $$0.g("Fuel");
   }

   protected boolean A() {
      return this.am.b(e);
   }

   protected void p(boolean $$0) {
      this.am.b(e, $$0);
   }

   @Override
   public dcb w() {
      return cpo.cD.n().a(csq.a, ha.c).a(csq.b, Boolean.valueOf(this.A()));
   }
}
