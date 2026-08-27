import javax.annotation.Nullable;

public class cmm extends cln {
   private static final ajm<Byte> h = ajq.a(cmm.class, ajo.a);
   private static final ajm<Boolean> i = ajq.a(cmm.class, ajo.k);
   private boolean j;
   public int g;

   public cmm(brn<? extends cmm> $$0, dad $$1) {
      super($$0, $$1);
   }

   public cmm(dad $$0, bsa $$1, csz $$2) {
      super(brn.be, $$1, $$0, $$2);
      this.ao.a(h, (byte)cyh.i($$2));
      this.ao.a(i, $$2.x());
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(h, (byte)0);
      $$0.a(i, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.j = true;
      }

      brh $$0 = this.u();
      int $$1 = this.ao.a(h);
      if ($$1 > 0 && (this.j || this.G()) && $$0 != null) {
         if (!this.M()) {
            if (!this.dN().B && this.d == cln.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.am();
         } else {
            this.b(true);
            etp $$2 = $$0.bv().d(this.dl());
            this.p(this.ds(), this.du() + $$2.d * 0.015 * (double)$$1, this.dy());
            if (this.dN().B) {
               this.ae = this.du();
            }

            double $$3 = 0.05 * (double)$$1;
            this.g(this.dq().a(0.95).e($$2.d().a($$3)));
            if (this.g == 0) {
               this.a(avc.zo, 10.0F, 1.0F);
            }

            this.g++;
         }
      }

      super.l();
   }

   private boolean M() {
      brh $$0 = this.u();
      return $$0 == null || !$$0.bB() ? false : !($$0 instanceof aqi) || !$$0.N_();
   }

   @Override
   public boolean H() {
      return this.ao.a(i);
   }

   @Nullable
   @Override
   protected etm a(etp $$0, etp $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(etm $$0) {
      brh $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bsa $$3) {
         $$2 += cyh.a(this.y(), $$3.ai());
      }

      brh $$4 = this.u();
      bqf $$5 = this.dO().a(this, (brh)($$4 == null ? this : $$4));
      this.j = true;
      avb $$6 = avc.zm;
      if ($$1.a($$5, $$2)) {
         if ($$1.ai() == brn.H) {
            return;
         }

         if ($$1 instanceof bsa $$7) {
            if ($$4 instanceof bsa) {
               cyh.a($$7, $$4);
               cyh.b((bsa)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.g(this.dq().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dN() instanceof aqh && this.dN().ab() && this.K()) {
         in $$9 = $$1.dn();
         if (this.dN().h($$9)) {
            brz $$10 = brn.al.a(this.dN());
            if ($$10 != null) {
               $$10.e(etp.c($$9));
               $$10.b($$4 instanceof aqi ? (aqi)$$4 : null);
               this.dN().b($$10);
               $$6 = avc.zt;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean K() {
      return cyh.k(this.y());
   }

   @Override
   protected boolean a(clh $$0) {
      return super.a($$0) || this.G() && this.e($$0) && $$0.ga().f(this.w());
   }

   @Override
   protected csz x() {
      return new csz(ctc.vP);
   }

   @Override
   protected avb r() {
      return avc.zn;
   }

   @Override
   public void b_(clh $$0) {
      if (this.e($$0) || this.u() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.j = $$0.q("DealtDamage");
      this.ao.a(h, (byte)cyh.i(this.y()));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void p() {
      int $$0 = this.ao.a(h);
      if (this.d != cln.a.b || $$0 <= 0) {
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
