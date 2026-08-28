import javax.annotation.Nullable;

public class cqx extends cpy {
   private static final ajx<Byte> e = akb.a(cqx.class, ajz.a);
   private static final ajx<Boolean> f = akb.a(cqx.class, ajz.k);
   private static final float g = 0.99F;
   private boolean h;
   public int d;

   public cqx(bvi<? extends cqx> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqx(dgz $$0, bvy $$1, cxh $$2) {
      super(bvi.by, $$1, $$0, $$2, null);
      this.al.a(e, this.b($$2));
      this.al.a(f, $$2.C());
   }

   public cqx(dgz $$0, double $$1, double $$2, double $$3, cxh $$4) {
      super(bvi.by, $$1, $$2, $$3, $$0, $$4, $$4);
      this.al.a(e, this.b($$4));
      this.al.a(f, $$4.C());
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
      $$0.a(f, false);
   }

   @Override
   public void h() {
      if (this.a > 4) {
         this.h = true;
      }

      bva $$0 = this.q();
      int $$1 = this.al.a(e);
      if ($$1 > 0 && (this.h || this.w()) && $$0 != null) {
         if (!this.B()) {
            if (this.dU() instanceof ard $$2 && this.b == cpy.a.b) {
               this.a($$2, this.n(), 0.1F);
            }

            this.at();
         } else {
            if (!($$0 instanceof cpr) && this.ds().f($$0.bD()) < (double)$$0.dp() + 1.0) {
               this.at();
               return;
            }

            this.q(true);
            fbx $$3 = $$0.bD().d(this.ds());
            this.o(this.dz(), this.dB() + $$3.e * 0.015 * (double)$$1, this.dF());
            double $$4 = 0.05 * (double)$$1;
            this.i(this.dx().c(0.95).e($$3.d().c($$4)));
            if (this.d == 0) {
               this.a(awa.AA, 10.0F, 1.0F);
            }

            this.d++;
         }
      }

      super.h();
   }

   private boolean B() {
      bva $$0 = this.q();
      return $$0 == null || !$$0.bJ() ? false : !($$0 instanceof are) || !$$0.U_();
   }

   @Override
   public boolean y() {
      return this.al.a(f);
   }

   @Nullable
   @Override
   protected fbu c(fbx $$0, fbx $$1) {
      return this.h ? null : super.c($$0, $$1);
   }

   @Override
   protected void a(fbu $$0) {
      bva $$1 = $$0.a();
      float $$2 = 8.0F;
      bva $$3 = this.q();
      btp $$4 = this.dV().a(this, (bva)($$3 == null ? this : $$3));
      if (this.dU() instanceof ard $$5) {
         $$2 = ddt.a($$5, this.dY(), $$1, $$4, $$2);
      }

      this.h = true;
      if ($$1.b($$4, $$2)) {
         if ($$1.aq() == bvi.N) {
            return;
         }

         if (this.dU() instanceof ard $$6) {
            ddt.a($$6, $$1, $$4, this.dY(), $$1x -> this.c($$6));
         }

         if ($$1 instanceof bvy $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.a(cql.b, $$1, this.q(), false);
      this.i(this.dx().d(0.02, 0.2, 0.02));
      this.a(awa.Ay, 1.0F, 1.0F);
   }

   @Override
   protected void a(ard $$0, fbt $$1, cxh $$2) {
      fbx $$3 = $$1.b().a($$1.g());
      ddt.a($$0, $$2, this.q() instanceof bvy $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$1x -> this.c($$0));
   }

   @Override
   public cxh dY() {
      return this.s();
   }

   @Override
   protected boolean a(cpr $$0) {
      return super.a($$0) || this.w() && this.e($$0) && $$0.gl().f(this.n());
   }

   @Override
   protected cxh o() {
      return new cxh(cxl.wU);
   }

   @Override
   protected avz j() {
      return awa.Az;
   }

   @Override
   public void a_(cpr $$0) {
      if (this.e($$0) || this.q() == null) {
         super.a_($$0);
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.h = $$0.q("DealtDamage");
      this.al.a(e, this.b(this.s()));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.h);
   }

   private byte b(cxh $$0) {
      return this.dU() instanceof ard $$1 ? (byte)ayz.a(ddt.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void g() {
      int $$0 = this.al.a(e);
      if (this.b != cpy.a.b || $$0 <= 0) {
         super.g();
      }
   }

   @Override
   protected float v() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
