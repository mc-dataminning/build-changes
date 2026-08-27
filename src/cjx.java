import javax.annotation.Nullable;

public class cjx extends ciy {
   private static final aim<Byte> h = aiq.a(cjx.class, aio.a);
   private static final aim<Boolean> i = aiq.a(cjx.class, aio.k);
   private static final cqk j = new cqk(cqn.vM);
   private boolean k;
   public int g;

   public cjx(bpc<? extends cjx> $$0, cwz $$1) {
      super($$0, $$1, j);
   }

   public cjx(cwz $$0, bpo $$1, cqk $$2) {
      super(bpc.be, $$1, $$0, $$2);
      this.an.a(h, (byte)cuv.g($$2));
      this.an.a(i, $$2.C());
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(h, (byte)0);
      $$0.a(i, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.k = true;
      }

      bow $$0 = this.af_();
      int $$1 = this.an.a(h);
      if ($$1 > 0 && (this.k || this.E()) && $$0 != null) {
         if (!this.K()) {
            if (!this.dM().B && this.d == ciy.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.am();
         } else {
            this.p(true);
            epr $$2 = $$0.bu().d(this.dk());
            this.p(this.dr(), this.dt() + $$2.d * 0.015 * (double)$$1, this.dx());
            if (this.dM().B) {
               this.ad = this.dt();
            }

            double $$3 = 0.05 * (double)$$1;
            this.g(this.dp().a(0.95).e($$2.d().a($$3)));
            if (this.g == 0) {
               this.a(aty.yY, 10.0F, 1.0F);
            }

            this.g++;
         }
      }

      super.l();
   }

   private boolean K() {
      bow $$0 = this.af_();
      return $$0 == null || !$$0.bA() ? false : !($$0 instanceof apg) || !$$0.N_();
   }

   @Override
   public boolean G() {
      return this.an.a(i);
   }

   @Nullable
   @Override
   protected epo a(epr $$0, epr $$1) {
      return this.k ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(epo $$0) {
      bow $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bpo $$3) {
         $$2 += cuv.a(this.x(), $$3.ai());
      }

      bow $$4 = this.af_();
      bnv $$5 = this.dN().a(this, (bow)($$4 == null ? this : $$4));
      this.k = true;
      atx $$6 = aty.yW;
      if ($$1.a($$5, $$2)) {
         if ($$1.ai() == bpc.H) {
            return;
         }

         if ($$1 instanceof bpo $$7) {
            if ($$4 instanceof bpo) {
               cuv.a($$7, $$4);
               cuv.b((bpo)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.g(this.dp().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dM() instanceof apf && this.dM().aa() && this.J()) {
         ib $$9 = $$1.dm();
         if (this.dM().h($$9)) {
            bpn $$10 = bpc.al.a(this.dM());
            if ($$10 != null) {
               $$10.e(epr.c($$9));
               $$10.b($$4 instanceof apg ? (apg)$$4 : null);
               this.dM().b($$10);
               $$6 = aty.zd;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean J() {
      return cuv.i(this.x());
   }

   @Override
   protected boolean a(cis $$0) {
      return super.a($$0) || this.E() && this.e($$0) && $$0.fZ().e(this.w());
   }

   @Override
   protected atx r() {
      return aty.yX;
   }

   @Override
   public void b_(cis $$0) {
      if (this.e($$0) || this.af_() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.k = $$0.q("DealtDamage");
      this.an.a(h, (byte)cuv.g(this.x()));
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.k);
   }

   @Override
   public void p() {
      int $$0 = this.an.a(h);
      if (this.d != ciy.a.b || $$0 <= 0) {
         super.p();
      }
   }

   @Override
   protected float D() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
