import javax.annotation.Nullable;

public class cnf extends cme {
   private static final ajy<Byte> h = akc.a(cnf.class, aka.a);
   private static final ajy<Boolean> i = akc.a(cnf.class, aka.k);
   private boolean j;
   public int g;

   public cnf(bsb<? extends cnf> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cnf(dca $$0, bso $$1, cuh $$2) {
      super(bsb.bj, $$1, $$0, $$2);
      this.as.a(h, (byte)dae.i($$2));
      this.as.a(i, $$2.x());
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(h, (byte)0);
      $$0.a(i, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.j = true;
      }

      brv $$0 = this.t();
      int $$1 = this.as.a(h);
      if ($$1 > 0 && (this.j || this.F()) && $$0 != null) {
         if (!this.L()) {
            if (!this.dU().C && this.d == cme.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.ao();
         } else {
            this.b(true);
            ewu $$2 = $$0.bC().d(this.ds());
            this.p(this.dz(), this.dB() + $$2.d * 0.015 * (double)$$1, this.dF());
            if (this.dU().C) {
               this.af = this.dB();
            }

            double $$3 = 0.05 * (double)$$1;
            this.g(this.dx().a(0.95).e($$2.d().a($$3)));
            if (this.g == 0) {
               this.a(avo.zX, 10.0F, 1.0F);
            }

            this.g++;
         }
      }

      super.l();
   }

   private boolean L() {
      brv $$0 = this.t();
      return $$0 == null || !$$0.bI() ? false : !($$0 instanceof aqu) || !$$0.O_();
   }

   @Override
   public boolean G() {
      return this.as.a(i);
   }

   @Nullable
   @Override
   protected ewr a(ewu $$0, ewu $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(ewr $$0) {
      brv $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bso $$3) {
         $$2 += dae.a(this.y(), $$3.ak());
      }

      brv $$4 = this.t();
      bqt $$5 = this.dX().a(this, (brv)($$4 == null ? this : $$4));
      this.j = true;
      avn $$6 = avo.zV;
      if ($$1.a($$5, $$2)) {
         if ($$1.ak() == bsb.J) {
            return;
         }

         if ($$1 instanceof bso $$7) {
            if ($$4 instanceof bso) {
               dae.a($$7, $$4);
               dae.b((bso)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.g(this.dx().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dU() instanceof aqt && this.dU().ac() && this.K()) {
         ir $$9 = $$1.du();
         if (this.dU().h($$9)) {
            bsn $$10 = bsb.an.a(this.dU());
            if ($$10 != null) {
               $$10.e(ewu.c($$9));
               $$10.b($$4 instanceof aqu ? (aqu)$$4 : null);
               this.dU().b($$10);
               $$6 = avo.Ac;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean K() {
      return dae.k(this.y());
   }

   @Override
   protected boolean a(cly $$0) {
      return super.a($$0) || this.F() && this.e($$0) && $$0.gl().f(this.w());
   }

   @Override
   protected cuh x() {
      return new cuh(cuk.xA);
   }

   @Override
   protected avn r() {
      return avo.zW;
   }

   @Override
   public void b_(cly $$0) {
      if (this.e($$0) || this.t() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.j = $$0.q("DealtDamage");
      this.as.a(h, (byte)dae.i(this.y()));
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void p() {
      int $$0 = this.as.a(h);
      if (this.d != cme.a.b || $$0 <= 0) {
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
