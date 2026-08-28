import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjm extends ciu {
   public static final double bG = 0.6;
   public static final double bH = 0.8;
   public static final double bI = 1.33;
   private static final akj<Boolean> bK = akn.a(cjm.class, akl.k);
   @Nullable
   private cjm.a<crc> bL;
   @Nullable
   private cjm.b bM;

   public cjm(bwo<? extends cjm> $$0, dja $$1) {
      super($$0, $$1);
      this.t();
   }

   boolean x() {
      return this.al.a(bK);
   }

   private void w(boolean $$0) {
      this.al.a(bK, $$0);
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
      $$0.a(bK, false);
   }

   @Override
   protected void D() {
      this.bM = new cjm.b(this, 0.6, $$0 -> $$0.a(axk.at), true);
      this.bD.a(1, new cdu(this));
      this.bD.a(3, this.bM);
      this.bD.a(7, new ceg(this, 0.3F));
      this.bD.a(8, new ceq(this));
      this.bD.a(9, new cdm(this, 0.8));
      this.bD.a(10, new cfn(this, 0.8, 1.0000001E-5F));
      this.bD.a(11, new cei(this, crc.class, 10.0F));
      this.bE.a(1, new cft<>(this, cja.class, false));
      this.bE.a(1, new cft<>(this, ckc.class, 10, false, false, ckc.bG));
   }

   @Override
   public void a(arq $$0) {
      if (this.L().b()) {
         double $$1 = this.L().c();
         if ($$1 == 0.6) {
            this.b(bxq.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bxq.a);
            this.h(true);
         } else {
            this.b(bxq.a);
            this.h(false);
         }
      } else {
         this.b(bxq.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.x() && this.af > 2400;
   }

   public static byj.a q() {
      return ciu.gw().a(byk.s, 10.0).a(byk.v, 0.3F).a(byk.c, 3.0);
   }

   @Nullable
   @Override
   protected awm u() {
      return awn.tb;
   }

   @Override
   public int S() {
      return 900;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.ta;
   }

   @Override
   protected awm l_() {
      return awn.tc;
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      if ((this.bM == null || this.bM.i()) && !this.x() && this.i($$2) && $$0.g(this) < 9.0) {
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

         return bud.a;
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
      if (this.bL == null) {
         this.bL = new cjm.a<>(this, crc.class, 16.0F, 0.8, 1.33);
      }

      this.bD.a(this.bL);
      if (!this.x()) {
         this.bD.a(4, this.bL);
      }
   }

   @Nullable
   public cjm b(arq $$0, bvv $$1) {
      return bwo.aI.a($$0, bwn.e);
   }

   @Override
   public boolean i(czd $$0) {
      return $$0.a(axk.at);
   }

   public static boolean c(bwo<cjm> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(djd $$0) {
      if ($$0.f(this) && !$$0.d(this.cR())) {
         iu $$1 = this.dv();
         if ($$1.v() < $$0.P()) {
            return false;
         }

         eah $$2 = $$0.a_($$1.e());
         if ($$2.a(dmh.i) || $$2.a(axc.Q)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      if ($$3 == null) {
         $$3 = new bvv.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public feq cT() {
      return new feq(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   @Override
   public boolean ce() {
      return this.ci() || super.ce();
   }

   static class a<T extends bxe> extends cdh<T> {
      private final cjm i;

      public a(cjm $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bwm.e::test);
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

   static class b extends cfi {
      private final cjm c;

      public b(cjm $$0, double $$1, Predicate<czd> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.x();
      }
   }
}
