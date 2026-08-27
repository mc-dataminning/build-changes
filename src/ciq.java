import javax.annotation.Nullable;

public class ciq extends chr {
   private static final aie<Byte> h = aih.a(ciq.class, aig.a);
   private static final aie<Boolean> i = aih.a(ciq.class, aig.k);
   private static final cpd j = new cpd(cpg.vL);
   private boolean k;
   public int g;

   public ciq(bnw<? extends ciq> $$0, cvr $$1) {
      super($$0, $$1, j);
   }

   public ciq(cvr $$0, boi $$1, cpd $$2) {
      super(bnw.bd, $$1, $$0, $$2);
      this.am.b(h, (byte)ctn.g($$2));
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

      bnq $$0 = this.w();
      int $$1 = this.am.b(h);
      if ($$1 > 0 && (this.k || this.G()) && $$0 != null) {
         if (!this.M()) {
            if (!this.dM().B && this.d == chr.a.b) {
               this.a(this.x(), 0.1F);
            }

            this.am();
         } else {
            this.p(true);
            enz $$2 = $$0.br().d(this.dk());
            this.p(this.dr(), this.dt() + $$2.d * 0.015 * (double)$$1, this.dx());
            if (this.dM().B) {
               this.ac = this.dt();
            }

            double $$3 = 0.05 * (double)$$1;
            this.g(this.dp().a(0.95).e($$2.d().a($$3)));
            if (this.g == 0) {
               this.a(atl.yV, 10.0F, 1.0F);
            }

            this.g++;
         }
      }

      super.l();
   }

   private boolean M() {
      bnq $$0 = this.w();
      return $$0 == null || !$$0.bx() ? false : !($$0 instanceof aox) || !$$0.P_();
   }

   @Override
   public boolean H() {
      return this.am.b(i);
   }

   @Nullable
   @Override
   protected enw a(enz $$0, enz $$1) {
      return this.k ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(enw $$0) {
      bnq $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof boi $$3) {
         $$2 += ctn.a(this.y(), $$3.ai());
      }

      bnq $$4 = this.w();
      bmp $$5 = this.dN().a(this, (bnq)($$4 == null ? this : $$4));
      this.k = true;
      atk $$6 = atl.yT;
      if ($$1.a($$5, $$2)) {
         if ($$1.ai() == bnw.G) {
            return;
         }

         if ($$1 instanceof boi $$7) {
            if ($$4 instanceof boi) {
               ctn.a($$7, $$4);
               ctn.b((boi)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.g(this.dp().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dM() instanceof aow && this.dM().aa() && this.K()) {
         hz $$9 = $$1.dm();
         if (this.dM().h($$9)) {
            boh $$10 = bnw.ak.a(this.dM());
            if ($$10 != null) {
               $$10.e(enz.c($$9));
               $$10.b($$4 instanceof aox ? (aox)$$4 : null);
               this.dM().b($$10);
               $$6 = atl.za;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean K() {
      return ctn.i(this.y());
   }

   @Override
   protected boolean a(chl $$0) {
      return super.a($$0) || this.G() && this.d((bnq)$$0) && $$0.fT().e(this.x());
   }

   @Override
   protected atk s() {
      return atl.yU;
   }

   @Override
   public void b_(chl $$0) {
      if (this.d((bnq)$$0) || this.w() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.k = $$0.q("DealtDamage");
      this.am.b(h, (byte)ctn.g(this.y()));
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.k);
   }

   @Override
   public void q() {
      int $$0 = this.am.b(h);
      if (this.d != chr.a.b || $$0 <= 0) {
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
