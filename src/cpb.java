import javax.annotation.Nullable;

public class cpb extends cob {
   private static final akg<Byte> g = akk.a(cpb.class, aki.a);
   private static final akg<Boolean> h = akk.a(cpb.class, aki.k);
   private boolean i;
   public int f;

   public cpb(btv<? extends cpb> $$0, deg $$1) {
      super($$0, $$1);
   }

   public cpb(deg $$0, buk $$1, cvp $$2) {
      super(btv.bf, $$1, $$0, $$2, null);
      this.am.a(g, this.c($$2));
      this.am.a(h, $$2.z());
   }

   public cpb(deg $$0, double $$1, double $$2, double $$3, cvp $$4) {
      super(btv.bf, $$1, $$2, $$3, $$0, $$4, $$4);
      this.am.a(g, this.c($$4));
      this.am.a(h, $$4.z());
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(g, (byte)0);
      $$0.a(h, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.i = true;
      }

      bto $$0 = this.s();
      int $$1 = this.am.a(g);
      if ($$1 > 0 && (this.i || this.C()) && $$0 != null) {
         if (!this.I()) {
            if (!this.dS().B && this.d == cob.a.b) {
               this.a(this.t(), 0.1F);
            }

            this.as();
         } else {
            this.b(true);
            eys $$2 = $$0.bC().d(this.dq());
            this.o(this.dx(), this.dz() + $$2.e * 0.015 * (double)$$1, this.dD());
            if (this.dS().B) {
               this.ac = this.dz();
            }

            double $$3 = 0.05 * (double)$$1;
            this.h(this.dv().c(0.95).e($$2.d().c($$3)));
            if (this.f == 0) {
               this.a(awe.zI, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean I() {
      bto $$0 = this.s();
      return $$0 == null || !$$0.bI() ? false : !($$0 instanceof ari) || !$$0.P_();
   }

   @Override
   public boolean E() {
      return this.am.a(h);
   }

   @Nullable
   @Override
   protected eyp a(eys $$0, eys $$1) {
      return this.i ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(eyp $$0) {
      bto $$1 = $$0.a();
      float $$2 = 8.0F;
      bto $$3 = this.s();
      bsg $$4 = this.dT().a(this, (bto)($$3 == null ? this : $$3));
      if (this.dS() instanceof arh $$5) {
         $$2 = dbm.a($$5, this.dW(), $$1, $$4, $$2);
      }

      this.i = true;
      if ($$1.a($$4, $$2)) {
         if ($$1.ao() == btv.H) {
            return;
         }

         if (this.dS() instanceof arh $$6) {
            dbm.a($$6, $$1, $$4, this.dW());
         }

         if ($$1 instanceof buk $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.h(this.dv().d(-0.01, -0.1, -0.01));
      this.a(awe.zG, 1.0F, 1.0F);
   }

   @Override
   protected void a(arh $$0, eyo $$1, cvp $$2) {
      eys $$3 = $$1.b().a($$1.g());
      dbm.a($$0, $$2, this.s() instanceof buk $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$0x -> this.ar());
   }

   @Override
   public cvp dW() {
      return this.w();
   }

   @Override
   protected boolean a(cnu $$0) {
      return super.a($$0) || this.C() && this.e($$0) && $$0.gc().f(this.t());
   }

   @Override
   protected cvp v() {
      return new cvp(cvt.vU);
   }

   @Override
   protected awd o() {
      return awe.zH;
   }

   @Override
   public void b_(cnu $$0) {
      if (this.e($$0) || this.s() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.i = $$0.q("DealtDamage");
      this.am.a(g, this.c(this.w()));
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.i);
   }

   private byte c(cvp $$0) {
      return this.dS() instanceof arh $$1 ? (byte)azd.a(dbm.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void m() {
      int $$0 = this.am.a(g);
      if (this.d != cob.a.b || $$0 <= 0) {
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
