import javax.annotation.Nullable;

public class clq extends ckr {
   private static final ajk<Byte> h = ajo.a(clq.class, ajm.a);
   private static final ajk<Boolean> i = ajo.a(clq.class, ajm.k);
   private boolean j;
   public int g;

   public clq(bqr<? extends clq> $$0, czu $$1) {
      super($$0, $$1);
   }

   public clq(czu $$0, bre $$1, csd $$2) {
      super(bqr.be, $$1, $$0, $$2);
      this.ao.a(h, (byte)cxo.i($$2));
      this.ao.a(i, $$2.x());
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(h, (byte)0);
      $$0.a(i, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.j = true;
      }

      bql $$0 = this.u();
      int $$1 = this.ao.a(h);
      if ($$1 > 0 && (this.j || this.G()) && $$0 != null) {
         if (!this.M()) {
            if (!this.dN().B && this.d == ckr.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.am();
         } else {
            this.b(true);
            etf $$2 = $$0.bv().d(this.dl());
            this.p(this.ds(), this.du() + $$2.d * 0.015 * (double)$$1, this.dy());
            if (this.dN().B) {
               this.ae = this.du();
            }

            double $$3 = 0.05 * (double)$$1;
            this.g(this.dq().a(0.95).e($$2.d().a($$3)));
            if (this.g == 0) {
               this.a(auz.zn, 10.0F, 1.0F);
            }

            this.g++;
         }
      }

      super.l();
   }

   private boolean M() {
      bql $$0 = this.u();
      return $$0 == null || !$$0.bB() ? false : !($$0 instanceof aqf) || !$$0.N_();
   }

   @Override
   public boolean H() {
      return this.ao.a(i);
   }

   @Nullable
   @Override
   protected etc a(etf $$0, etf $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(etc $$0) {
      bql $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bre $$3) {
         $$2 += cxo.a(this.y(), $$3.ai());
      }

      bql $$4 = this.u();
      bpj $$5 = this.dO().a(this, (bql)($$4 == null ? this : $$4));
      this.j = true;
      auy $$6 = auz.zl;
      if ($$1.a($$5, $$2)) {
         if ($$1.ai() == bqr.H) {
            return;
         }

         if ($$1 instanceof bre $$7) {
            if ($$4 instanceof bre) {
               cxo.a($$7, $$4);
               cxo.b((bre)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.g(this.dq().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dN() instanceof aqe && this.dN().ab() && this.K()) {
         im $$9 = $$1.dn();
         if (this.dN().h($$9)) {
            brd $$10 = bqr.al.a(this.dN());
            if ($$10 != null) {
               $$10.e(etf.c($$9));
               $$10.b($$4 instanceof aqf ? (aqf)$$4 : null);
               this.dN().b($$10);
               $$6 = auz.zs;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean K() {
      return cxo.k(this.y());
   }

   @Override
   protected boolean a(ckl $$0) {
      return super.a($$0) || this.G() && this.e($$0) && $$0.ga().e(this.w());
   }

   @Override
   protected csd x() {
      return new csd(csg.vP);
   }

   @Override
   protected auy r() {
      return auz.zm;
   }

   @Override
   public void b_(ckl $$0) {
      if (this.e($$0) || this.u() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.j = $$0.q("DealtDamage");
      this.ao.a(h, (byte)cxo.i(this.y()));
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void p() {
      int $$0 = this.ao.a(h);
      if (this.d != ckr.a.b || $$0 <= 0) {
         super.p();
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
