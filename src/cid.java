import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cid extends chp {
   public static final double bF = 0.6;
   public static final double bG = 0.8;
   public static final double bH = 1.33;
   private static final ajx<Boolean> bJ = akb.a(cid.class, ajz.k);
   @Nullable
   private cid.a<cpr> bK;
   @Nullable
   private cid.b bL;

   public cid(bvi<? extends cid> $$0, dgz $$1) {
      super($$0, $$1);
      this.t();
   }

   boolean x() {
      return this.al.a(bJ);
   }

   private void w(boolean $$0) {
      this.al.a(bJ, $$0);
      this.t();
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Trusting", this.x());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bJ, false);
   }

   @Override
   protected void D() {
      this.bL = new cid.b(this, 0.6, $$0 -> $$0.a(awy.as), true);
      this.bC.a(1, new ccq(this));
      this.bC.a(3, this.bL);
      this.bC.a(7, new cdc(this, 0.3F));
      this.bC.a(8, new cdm(this));
      this.bC.a(9, new cci(this, 0.8));
      this.bC.a(10, new cej(this, 0.8, 1.0000001E-5F));
      this.bC.a(11, new cde(this, cpr.class, 10.0F));
      this.bD.a(1, new cep<>(this, chu.class, false));
      this.bD.a(1, new cep<>(this, cit.class, 10, false, false, cit.bF));
   }

   @Override
   public void a(ard $$0) {
      if (this.L().b()) {
         double $$1 = this.L().c();
         if ($$1 == 0.6) {
            this.b(bwk.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bwk.a);
            this.h(true);
         } else {
            this.b(bwk.a);
            this.h(false);
         }
      } else {
         this.b(bwk.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.x() && this.af > 2400;
   }

   public static bxf.a q() {
      return chp.gx().a(bxg.s, 10.0).a(bxg.v, 0.3F).a(bxg.c, 3.0);
   }

   @Nullable
   @Override
   protected avz u() {
      return awa.sX;
   }

   @Override
   public int S() {
      return 900;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.sW;
   }

   @Override
   protected avz l_() {
      return awa.sY;
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if ((this.bL == null || this.bL.i()) && !this.x() && this.j($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dU().C) {
            if (this.ae.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dU().a(this, (byte)41);
            } else {
               this.x(false);
               this.dU().a(this, (byte)40);
            }
         }

         return bsy.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 41) {
         this.x(true);
      } else if ($$0 == 40) {
         this.x(false);
      } else {
         super.b($$0);
      }
   }

   private void x(boolean $$0) {
      lr $$1 = lt.S;
      if (!$$0) {
         $$1 = lt.ah;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         double $$5 = this.ae.k() * 0.02;
         this.dU().a($$1, this.d(1.0), this.dC() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void t() {
      if (this.bK == null) {
         this.bK = new cid.a<>(this, cpr.class, 16.0F, 0.8, 1.33);
      }

      this.bC.a(this.bK);
      if (!this.x()) {
         this.bC.a(4, this.bK);
      }
   }

   @Nullable
   public cid b(ard $$0, buq $$1) {
      return bvi.aI.a($$0, bvh.e);
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.as);
   }

   public static boolean c(bvi<cid> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dhc $$0) {
      if ($$0.f(this) && !$$0.d(this.cQ())) {
         ji $$1 = this.du();
         if ($$1.v() < $$0.P()) {
            return false;
         }

         dxq $$2 = $$0.a_($$1.e());
         if ($$2.a(dkg.i) || $$2.a(awp.Q)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      if ($$3 == null) {
         $$3 = new buq.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public fbx cS() {
      return new fbx(0.0, (double)(0.5F * this.cR()), (double)(this.dp() * 0.4F));
   }

   @Override
   public boolean cd() {
      return this.ch() || super.cd();
   }

   static class a<T extends bvy> extends ccd<T> {
      private final cid i;

      public a(cid $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bvg.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.x() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.x() && super.c();
      }
   }

   static class b extends cee {
      private final cid c;

      public b(cid $$0, double $$1, Predicate<cxh> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.x();
      }
   }
}
