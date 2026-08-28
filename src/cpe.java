import javax.annotation.Nullable;

public class cpe extends coe {
   private static final akh<Byte> g = akl.a(cpe.class, akj.a);
   private static final akh<Boolean> h = akl.a(cpe.class, akj.k);
   private boolean i;
   public int f;

   public cpe(bty<? extends cpe> $$0, dej $$1) {
      super($$0, $$1);
   }

   public cpe(dej $$0, bun $$1, cvs $$2) {
      super(bty.bf, $$1, $$0, $$2, null);
      this.am.a(g, this.c($$2));
      this.am.a(h, $$2.A());
   }

   public cpe(dej $$0, double $$1, double $$2, double $$3, cvs $$4) {
      super(bty.bf, $$1, $$2, $$3, $$0, $$4, $$4);
      this.am.a(g, this.c($$4));
      this.am.a(h, $$4.A());
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(g, (byte)0);
      $$0.a(h, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.i = true;
      }

      btr $$0 = this.s();
      int $$1 = this.am.a(g);
      if ($$1 > 0 && (this.i || this.C()) && $$0 != null) {
         if (!this.I()) {
            if (!this.dS().B && this.d == coe.a.b) {
               this.a(this.t(), 0.1F);
            }

            this.as();
         } else {
            this.b(true);
            eyw $$2 = $$0.bC().d(this.dq());
            this.o(this.dx(), this.dz() + $$2.e * 0.015 * (double)$$1, this.dD());
            if (this.dS().B) {
               this.ac = this.dz();
            }

            double $$3 = 0.05 * (double)$$1;
            this.h(this.dv().c(0.95).e($$2.d().c($$3)));
            if (this.f == 0) {
               this.a(awg.zI, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean I() {
      btr $$0 = this.s();
      return $$0 == null || !$$0.bI() ? false : !($$0 instanceof ark) || !$$0.Q_();
   }

   @Override
   public boolean E() {
      return this.am.a(h);
   }

   @Nullable
   @Override
   protected eyt a(eyw $$0, eyw $$1) {
      return this.i ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(eyt $$0) {
      btr $$1 = $$0.a();
      float $$2 = 8.0F;
      btr $$3 = this.s();
      bsj $$4 = this.dT().a(this, (btr)($$3 == null ? this : $$3));
      if (this.dS() instanceof arj $$5) {
         $$2 = dbp.a($$5, this.dW(), $$1, $$4, $$2);
      }

      this.i = true;
      if ($$1.a($$4, $$2)) {
         if ($$1.ao() == bty.H) {
            return;
         }

         if (this.dS() instanceof arj $$6) {
            dbp.a($$6, $$1, $$4, this.dW(), $$0x -> this.ar());
         }

         if ($$1 instanceof bun $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.h(this.dv().d(-0.01, -0.1, -0.01));
      this.a(awg.zG, 1.0F, 1.0F);
   }

   @Override
   protected void a(arj $$0, eys $$1, cvs $$2) {
      eyw $$3 = $$1.b().a($$1.g());
      dbp.a($$0, $$2, this.s() instanceof bun $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$0x -> this.ar());
   }

   @Override
   public cvs dW() {
      return this.w();
   }

   @Override
   protected boolean a(cnx $$0) {
      return super.a($$0) || this.C() && this.e($$0) && $$0.gd().f(this.t());
   }

   @Override
   protected cvs v() {
      return new cvs(cvw.vU);
   }

   @Override
   protected awf o() {
      return awg.zH;
   }

   @Override
   public void b_(cnx $$0) {
      if (this.e($$0) || this.s() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.i = $$0.q("DealtDamage");
      this.am.a(g, this.c(this.w()));
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.i);
   }

   private byte c(cvs $$0) {
      return this.dS() instanceof arj $$1 ? (byte)azf.a(dbp.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void m() {
      int $$0 = this.am.a(g);
      if (this.d != coe.a.b || $$0 <= 0) {
         super.m();
      }
   }

   @Override
   protected float B() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
