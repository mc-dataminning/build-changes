import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cji extends cis {
   public static final double bF = 0.6;
   public static final double bG = 0.8;
   public static final double bH = 1.33;
   private static final akj<Boolean> bJ = akn.a(cji.class, akl.k);
   @Nullable
   private cji.a<cqy> bK;
   @Nullable
   private cji.b bL;

   public cji(bwm<? extends cji> $$0, div $$1) {
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
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Trusting", this.x());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bJ, false);
   }

   @Override
   protected void D() {
      this.bL = new cji.b(this, 0.6, $$0 -> $$0.a(axk.as), true);
      this.bC.a(1, new cds(this));
      this.bC.a(3, this.bL);
      this.bC.a(7, new cee(this, 0.3F));
      this.bC.a(8, new ceo(this));
      this.bC.a(9, new cdk(this, 0.8));
      this.bC.a(10, new cfl(this, 0.8, 1.0000001E-5F));
      this.bC.a(11, new ceg(this, cqy.class, 10.0F));
      this.bD.a(1, new cfr<>(this, ciy.class, false));
      this.bD.a(1, new cfr<>(this, cjy.class, 10, false, false, cjy.bF));
   }

   @Override
   public void a(arq $$0) {
      if (this.L().b()) {
         double $$1 = this.L().c();
         if ($$1 == 0.6) {
            this.b(bxo.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bxo.a);
            this.h(true);
         } else {
            this.b(bxo.a);
            this.h(false);
         }
      } else {
         this.b(bxo.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.x() && this.af > 2400;
   }

   public static byh.a q() {
      return cis.gv().a(byi.s, 10.0).a(byi.v, 0.3F).a(byi.c, 3.0);
   }

   @Nullable
   @Override
   protected awm u() {
      return awn.sY;
   }

   @Override
   public int S() {
      return 900;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.sX;
   }

   @Override
   protected awm l_() {
      return awn.sZ;
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      if ((this.bL == null || this.bL.i()) && !this.x() && this.j($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dV().C) {
            if (this.ae.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dV().a(this, (byte)41);
            } else {
               this.x(false);
               this.dV().a(this, (byte)40);
            }
         }

         return bub.a;
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
      lv $$1 = lx.S;
      if (!$$0) {
         $$1 = lx.ah;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         double $$5 = this.ae.k() * 0.02;
         this.dV().a($$1, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void t() {
      if (this.bK == null) {
         this.bK = new cji.a<>(this, cqy.class, 16.0F, 0.8, 1.33);
      }

      this.bC.a(this.bK);
      if (!this.x()) {
         this.bC.a(4, this.bK);
      }
   }

   @Nullable
   public cji b(arq $$0, bvt $$1) {
      return bwm.aI.a($$0, bwl.e);
   }

   @Override
   public boolean j(cyy $$0) {
      return $$0.a(axk.as);
   }

   public static boolean c(bwm<cji> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(diy $$0) {
      if ($$0.f(this) && !$$0.d(this.cR())) {
         iu $$1 = this.dv();
         if ($$1.v() < $$0.P()) {
            return false;
         }

         dzz $$2 = $$0.a_($$1.e());
         if ($$2.a(dmc.i) || $$2.a(axc.Q)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      if ($$3 == null) {
         $$3 = new bvt.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public fei cT() {
      return new fei(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   @Override
   public boolean ce() {
      return this.ci() || super.ce();
   }

   static class a<T extends bxc> extends cdf<T> {
      private final cji i;

      public a(cji $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bwk.e::test);
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

   static class b extends cfg {
      private final cji c;

      public b(cji $$0, double $$1, Predicate<cyy> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.x();
      }
   }
}
