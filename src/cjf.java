import javax.annotation.Nullable;

public class cjf extends cig {
   private static final aii<Byte> h = ail.a(cjf.class, aik.a);
   private static final aii<Boolean> i = ail.a(cjf.class, aik.k);
   private static final cpq j = new cpq(cpt.vL);
   private boolean k;
   public int g;

   public cjf(bol<? extends cjf> $$0, cwe $$1) {
      super($$0, $$1, j);
   }

   public cjf(cwe $$0, box $$1, cpq $$2) {
      super(bol.bd, $$1, $$0, $$2);
      this.am.b(h, (byte)cua.g($$2));
      this.am.b(i, $$2.C());
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(h, (byte)0);
      this.am.a(i, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.k = true;
      }

      bof $$0 = this.w();
      int $$1 = this.am.b(h);
      if ($$1 > 0 && (this.k || this.G()) && $$0 != null) {
         if (!this.M()) {
            if (!this.dJ().B && this.d == cig.a.b) {
               this.a(this.x(), 0.1F);
            }

            this.am();
         } else {
            this.p(true);
            eov $$2 = $$0.br().d(this.dh());
            this.p(this.do(), this.dq() + $$2.d * 0.015 * (double)$$1, this.du());
            if (this.dJ().B) {
               this.ac = this.dq();
            }

            double $$3 = 0.05 * (double)$$1;
            this.g(this.dm().a(0.95).e($$2.d().a($$3)));
            if (this.g == 0) {
               this.a(atp.yV, 10.0F, 1.0F);
            }

            this.g++;
         }
      }

      super.l();
   }

   private boolean M() {
      bof $$0 = this.w();
      return $$0 == null || !$$0.bx() ? false : !($$0 instanceof apb) || !$$0.P_();
   }

   @Override
   public boolean H() {
      return this.am.b(i);
   }

   @Nullable
   @Override
   protected eos a(eov $$0, eov $$1) {
      return this.k ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(eos $$0) {
      bof $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof box $$3) {
         $$2 += cua.a(this.y(), $$3.ai());
      }

      bof $$4 = this.w();
      bne $$5 = this.dK().a(this, (bof)($$4 == null ? this : $$4));
      this.k = true;
      ato $$6 = atp.yT;
      if ($$1.a($$5, $$2)) {
         if ($$1.ai() == bol.G) {
            return;
         }

         if ($$1 instanceof box $$7) {
            if ($$4 instanceof box) {
               cua.a($$7, $$4);
               cua.b((box)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.g(this.dm().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dJ() instanceof apa && this.dJ().aa() && this.K()) {
         ib $$9 = $$1.dj();
         if (this.dJ().h($$9)) {
            bow $$10 = bol.ak.a(this.dJ());
            if ($$10 != null) {
               $$10.e(eov.c($$9));
               $$10.b($$4 instanceof apb ? (apb)$$4 : null);
               this.dJ().b($$10);
               $$6 = atp.za;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean K() {
      return cua.i(this.y());
   }

   @Override
   protected boolean a(cia $$0) {
      return super.a($$0) || this.G() && this.d((bof)$$0) && $$0.fV().e(this.x());
   }

   @Override
   protected ato s() {
      return atp.yU;
   }

   @Override
   public void b_(cia $$0) {
      if (this.d((bof)$$0) || this.w() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.k = $$0.q("DealtDamage");
      this.am.b(h, (byte)cua.g(this.y()));
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.k);
   }

   @Override
   public void q() {
      int $$0 = this.am.b(h);
      if (this.d != cig.a.b || $$0 <= 0) {
         super.q();
      }
   }

   @Override
   protected float E() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
