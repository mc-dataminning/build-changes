import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjc extends cio {
   public static final double bF = 0.6;
   public static final double bG = 0.8;
   public static final double bH = 1.33;
   private static final akh<Boolean> bJ = akl.a(cjc.class, akj.k);
   @Nullable
   private cjc.a<cqs> bK;
   @Nullable
   private cjc.b bL;

   public cjc(bwj<? extends cjc> $$0, dip $$1) {
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
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Trusting", this.x());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bJ, false);
   }

   @Override
   protected void D() {
      this.bL = new cjc.b(this, 0.6, $$0 -> $$0.a(axi.as), true);
      this.bC.a(1, new cdp(this));
      this.bC.a(3, this.bL);
      this.bC.a(7, new ceb(this, 0.3F));
      this.bC.a(8, new cel(this));
      this.bC.a(9, new cdh(this, 0.8));
      this.bC.a(10, new cfi(this, 0.8, 1.0000001E-5F));
      this.bC.a(11, new ced(this, cqs.class, 10.0F));
      this.bD.a(1, new cfo<>(this, ciu.class, false));
      this.bD.a(1, new cfo<>(this, cjs.class, 10, false, false, cjs.bF));
   }

   @Override
   public void a(aro $$0) {
      if (this.L().b()) {
         double $$1 = this.L().c();
         if ($$1 == 0.6) {
            this.b(bxl.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bxl.a);
            this.h(true);
         } else {
            this.b(bxl.a);
            this.h(false);
         }
      } else {
         this.b(bxl.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.x() && this.af > 2400;
   }

   public static bye.a q() {
      return cio.gv().a(byf.s, 10.0).a(byf.v, 0.3F).a(byf.c, 3.0);
   }

   @Nullable
   @Override
   protected awk u() {
      return awl.sX;
   }

   @Override
   public int S() {
      return 900;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.sW;
   }

   @Override
   protected awk l_() {
      return awl.sY;
   }

   @Override
   public bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      if ((this.bL == null || this.bL.i()) && !this.x() && this.k($$2) && $$0.g(this) < 9.0) {
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

         return bty.a;
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
         this.bK = new cjc.a<>(this, cqs.class, 16.0F, 0.8, 1.33);
      }

      this.bC.a(this.bK);
      if (!this.x()) {
         this.bC.a(4, this.bK);
      }
   }

   @Nullable
   public cjc b(aro $$0, bvq $$1) {
      return bwj.aI.a($$0, bwi.e);
   }

   @Override
   public boolean k(cys $$0) {
      return $$0.a(axi.as);
   }

   public static boolean c(bwj<cjc> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dis $$0) {
      if ($$0.f(this) && !$$0.d(this.cR())) {
         iu $$1 = this.dv();
         if ($$1.v() < $$0.P()) {
            return false;
         }

         dzo $$2 = $$0.a_($$1.e());
         if ($$2.a(dlw.i) || $$2.a(axa.Q)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      if ($$3 == null) {
         $$3 = new bvq.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public fdw cT() {
      return new fdw(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   @Override
   public boolean ce() {
      return this.ci() || super.ce();
   }

   static class a<T extends bwz> extends cdc<T> {
      private final cjc i;

      public a(cjc $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bwh.e::test);
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

   static class b extends cfd {
      private final cjc c;

      public b(cjc $$0, double $$1, Predicate<cys> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.x();
      }
   }
}
