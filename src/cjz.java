import javax.annotation.Nullable;

public class cjz extends cja {
   private static final aim<Byte> h = aiq.a(cjz.class, aio.a);
   private static final aim<Boolean> i = aiq.a(cjz.class, aio.k);
   private static final cqm j = new cqm(cqp.vN);
   private boolean k;
   public int g;

   public cjz(bpd<? extends cjz> $$0, cxb $$1) {
      super($$0, $$1, j);
   }

   public cjz(cxb $$0, bpp $$1, cqm $$2) {
      super(bpd.bf, $$1, $$0, $$2);
      this.an.a(h, (byte)cux.g($$2));
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

      box $$0 = this.af_();
      int $$1 = this.an.a(h);
      if ($$1 > 0 && (this.k || this.E()) && $$0 != null) {
         if (!this.K()) {
            if (!this.dM().B && this.d == cja.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.am();
         } else {
            this.p(true);
            ept $$2 = $$0.bu().d(this.dk());
            this.p(this.dr(), this.dt() + $$2.d * 0.015 * (double)$$1, this.dx());
            if (this.dM().B) {
               this.ad = this.dt();
            }

            double $$3 = 0.05 * (double)$$1;
            this.g(this.dp().a(0.95).e($$2.d().a($$3)));
            if (this.g == 0) {
               this.a(aty.zd, 10.0F, 1.0F);
            }

            this.g++;
         }
      }

      super.l();
   }

   private boolean K() {
      box $$0 = this.af_();
      return $$0 == null || !$$0.bA() ? false : !($$0 instanceof apg) || !$$0.N_();
   }

   @Override
   public boolean G() {
      return this.an.a(i);
   }

   @Nullable
   @Override
   protected epq a(ept $$0, ept $$1) {
      return this.k ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(epq $$0) {
      box $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bpp $$3) {
         $$2 += cux.a(this.x(), $$3.ai());
      }

      box $$4 = this.af_();
      bnw $$5 = this.dN().a(this, (box)($$4 == null ? this : $$4));
      this.k = true;
      atx $$6 = aty.zb;
      if ($$1.a($$5, $$2)) {
         if ($$1.ai() == bpd.I) {
            return;
         }

         if ($$1 instanceof bpp $$7) {
            if ($$4 instanceof bpp) {
               cux.a($$7, $$4);
               cux.b((bpp)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.g(this.dp().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dM() instanceof apf && this.dM().aa() && this.J()) {
         ib $$9 = $$1.dm();
         if (this.dM().h($$9)) {
            bpo $$10 = bpd.am.a(this.dM());
            if ($$10 != null) {
               $$10.e(ept.c($$9));
               $$10.b($$4 instanceof apg ? (apg)$$4 : null);
               this.dM().b($$10);
               $$6 = aty.zi;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean J() {
      return cux.i(this.x());
   }

   @Override
   protected boolean a(ciu $$0) {
      return super.a($$0) || this.E() && this.e($$0) && $$0.fZ().e(this.w());
   }

   @Override
   protected atx r() {
      return aty.zc;
   }

   @Override
   public void b_(ciu $$0) {
      if (this.e($$0) || this.af_() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.k = $$0.q("DealtDamage");
      this.an.a(h, (byte)cux.g(this.x()));
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.k);
   }

   @Override
   public void p() {
      int $$0 = this.an.a(h);
      if (this.d != cja.a.b || $$0 <= 0) {
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
