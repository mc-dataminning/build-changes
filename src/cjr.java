import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjr extends ciz {
   public static final double bG = 0.6;
   public static final double bH = 0.8;
   public static final double bI = 1.33;
   private static final akj<Boolean> bK = akn.a(cjr.class, akl.k);
   @Nullable
   private cjr.a<crj> bL;
   @Nullable
   private cjr.b bM;

   public cjr(bwr<? extends cjr> $$0, djh $$1) {
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
      this.w($$0.o("Trusting"));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bK, false);
   }

   @Override
   protected void D() {
      this.bM = new cjr.b(this, 0.6, $$0 -> $$0.a(axk.at), true);
      this.bD.a(1, new cdz(this));
      this.bD.a(3, this.bM);
      this.bD.a(7, new cel(this, 0.3F));
      this.bD.a(8, new cev(this));
      this.bD.a(9, new cdr(this, 0.8));
      this.bD.a(10, new cfs(this, 0.8, 1.0000001E-5F));
      this.bD.a(11, new cen(this, crj.class, 10.0F));
      this.bE.a(1, new cfy<>(this, cjf.class, false));
      this.bE.a(1, new cfy<>(this, ckg.class, 10, false, false, ckg.bG));
   }

   @Override
   public void a(arq $$0) {
      if (this.L().b()) {
         double $$1 = this.L().c();
         if ($$1 == 0.6) {
            this.b(bxv.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bxv.a);
            this.h(true);
         } else {
            this.b(bxv.a);
            this.h(false);
         }
      } else {
         this.b(bxv.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.x() && this.af > 2400;
   }

   public static byo.a q() {
      return ciz.gy().a(byp.s, 10.0).a(byp.v, 0.3F).a(byp.c, 3.0);
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
   protected awm e(bux $$0) {
      return awn.ta;
   }

   @Override
   protected awm l_() {
      return awn.tc;
   }

   @Override
   public bug b(crj $$0, buf $$1) {
      czk $$2 = $$0.b($$1);
      if ((this.bM == null || this.bM.i()) && !this.x() && this.i($$2) && $$0.g(this) < 9.0) {
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

         return bug.a;
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
      lw $$1 = ly.S;
      if (!$$0) {
         $$1 = ly.ah;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         double $$5 = this.ae.k() * 0.02;
         this.dU().a($$1, this.d(1.0), this.dC() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void t() {
      if (this.bL == null) {
         this.bL = new cjr.a<>(this, crj.class, 16.0F, 0.8, 1.33);
      }

      this.bD.a(this.bL);
      if (!this.x()) {
         this.bD.a(4, this.bL);
      }
   }

   @Nullable
   public cjr b(arq $$0, bvy $$1) {
      return bwr.aI.a($$0, bwq.e);
   }

   @Override
   public boolean i(czk $$0) {
      return $$0.a(axk.at);
   }

   public static boolean c(bwr<cjr> $$0, dji $$1, bwq $$2, iv $$3, azv $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(djk $$0) {
      if ($$0.f(this) && !$$0.d(this.cQ())) {
         iv $$1 = this.du();
         if ($$1.v() < $$0.P()) {
            return false;
         }

         eao $$2 = $$0.a_($$1.e());
         if ($$2.a(dmo.i) || $$2.a(axc.Q)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      if ($$3 == null) {
         $$3 = new bvy.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public fex cS() {
      return new fex(0.0, (double)(0.5F * this.cR()), (double)(this.dp() * 0.4F));
   }

   @Override
   public boolean cc() {
      return this.cg() || super.cc();
   }

   static class a<T extends bxj> extends cdm<T> {
      private final cjr i;

      public a(cjr $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bwp.e::test);
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

   static class b extends cfn {
      private final cjr c;

      public b(cjr $$0, double $$1, Predicate<czk> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.x();
      }
   }
}
