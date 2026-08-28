import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cig extends chs {
   public static final double bZ = 0.6;
   public static final double ca = 0.8;
   public static final double cb = 1.33;
   private static final alc<Boolean> cd = alg.a(cig.class, ale.k);
   @Nullable
   private cig.a<cps> ce;
   @Nullable
   private cig.b cf;

   public cig(bvm<? extends cig> $$0, dha $$1) {
      super($$0, $$1);
      this.t();
   }

   boolean x() {
      return this.al.a(cd);
   }

   private void x(boolean $$0) {
      this.al.a(cd, $$0);
      this.t();
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Trusting", this.x());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.x($$0.q("Trusting"));
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cd, false);
   }

   @Override
   protected void B() {
      this.cf = new cig.b(this, 0.6, $$0 -> $$0.a(ayd.au), true);
      this.bT.a(1, new cct(this));
      this.bT.a(3, this.cf);
      this.bT.a(7, new cdf(this, 0.3F));
      this.bT.a(8, new cdp(this));
      this.bT.a(9, new ccl(this, 0.8));
      this.bT.a(10, new cem(this, 0.8, 1.0000001E-5F));
      this.bT.a(11, new cdh(this, cps.class, 10.0F));
      this.bU.a(1, new ces<>(this, chx.class, false));
      this.bU.a(1, new ces<>(this, cit.class, 10, false, false, cit.bZ));
   }

   @Override
   public void a(ash $$0) {
      if (this.I().b()) {
         double $$1 = this.I().c();
         if ($$1 == 0.6) {
            this.b(bwn.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bwn.a);
            this.h(true);
         } else {
            this.b(bwn.a);
            this.h(false);
         }
      } else {
         this.b(bwn.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.x() && this.af > 2400;
   }

   public static bxi.a p() {
      return chs.gr().a(bxj.s, 10.0).a(bxj.v, 0.3F).a(bxj.c, 3.0);
   }

   @Nullable
   @Override
   protected axe u() {
      return axf.sG;
   }

   @Override
   public int Q() {
      return 900;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.sF;
   }

   @Override
   protected axe o_() {
      return axf.sH;
   }

   @Override
   public bte b(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      if ((this.cf == null || this.cf.i()) && !this.x() && this.j($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dV().C) {
            if (this.ae.a(3) == 0) {
               this.x(true);
               this.y(true);
               this.dV().a(this, (byte)41);
            } else {
               this.y(false);
               this.dV().a(this, (byte)40);
            }
         }

         return bte.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 41) {
         this.y(true);
      } else if ($$0 == 40) {
         this.y(false);
      } else {
         super.b($$0);
      }
   }

   private void y(boolean $$0) {
      lq $$1 = ls.Q;
      if (!$$0) {
         $$1 = ls.af;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         double $$5 = this.ae.k() * 0.02;
         this.dV().a($$1, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void t() {
      if (this.ce == null) {
         this.ce = new cig.a<>(this, cps.class, 16.0F, 0.8, 1.33);
      }

      this.bT.a(this.ce);
      if (!this.x()) {
         this.bT.a(4, this.ce);
      }
   }

   @Nullable
   public cig b(ash $$0, buw $$1) {
      return bvm.aJ.a($$0, bvl.e);
   }

   @Override
   public boolean j(cxk $$0) {
      return $$0.a(ayd.au);
   }

   public static boolean c(bvm<cig> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dhd $$0) {
      if ($$0.f(this) && !$$0.d(this.cR())) {
         jh $$1 = this.dv();
         if ($$1.v() < $$0.O()) {
            return false;
         }

         dxn $$2 = $$0.a_($$1.e());
         if ($$2.a(dkg.i) || $$2.a(axu.Q)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      if ($$3 == null) {
         $$3 = new buw.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public fbs cT() {
      return new fbs(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   @Override
   public boolean ce() {
      return this.ci() || super.ce();
   }

   static class a<T extends bwb> extends ccg<T> {
      private final cig i;

      public a(cig $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bvk.e::test);
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

   static class b extends ceh {
      private final cig c;

      public b(cig $$0, double $$1, Predicate<cxk> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.x();
      }
   }
}
