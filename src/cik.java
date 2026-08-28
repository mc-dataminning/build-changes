import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cik extends chw {
   public static final double bZ = 0.6;
   public static final double ca = 0.8;
   public static final double cb = 1.33;
   private static final alc<Boolean> cd = alg.a(cik.class, ale.k);
   @Nullable
   private cik.a<cpw> ce;
   @Nullable
   private cik.b cf;

   public cik(bvq<? extends cik> $$0, dhh $$1) {
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
      this.cf = new cik.b(this, 0.6, $$0 -> $$0.a(ayd.au), true);
      this.bT.a(1, new ccx(this));
      this.bT.a(3, this.cf);
      this.bT.a(7, new cdj(this, 0.3F));
      this.bT.a(8, new cdt(this));
      this.bT.a(9, new ccp(this, 0.8));
      this.bT.a(10, new ceq(this, 0.8, 1.0000001E-5F));
      this.bT.a(11, new cdl(this, cpw.class, 10.0F));
      this.bU.a(1, new cew<>(this, cib.class, false));
      this.bU.a(1, new cew<>(this, cix.class, 10, false, false, cix.bZ));
   }

   @Override
   public void a(ash $$0) {
      if (this.I().b()) {
         double $$1 = this.I().c();
         if ($$1 == 0.6) {
            this.b(bwr.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bwr.a);
            this.h(true);
         } else {
            this.b(bwr.a);
            this.h(false);
         }
      } else {
         this.b(bwr.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.x() && this.af > 2400;
   }

   public static bxm.a p() {
      return chw.gt().a(bxn.s, 10.0).a(bxn.v, 0.3F).a(bxn.c, 3.0);
   }

   @Nullable
   @Override
   protected axe u() {
      return axf.sH;
   }

   @Override
   public int Q() {
      return 900;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.sG;
   }

   @Override
   protected axe o_() {
      return axf.sI;
   }

   @Override
   public bti b(cpw $$0, bth $$1) {
      cxo $$2 = $$0.b($$1);
      if ((this.cf == null || this.cf.i()) && !this.x() && this.j($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dW().C) {
            if (this.ae.a(3) == 0) {
               this.x(true);
               this.y(true);
               this.dW().a(this, (byte)41);
            } else {
               this.y(false);
               this.dW().a(this, (byte)40);
            }
         }

         return bti.a;
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
         this.dW().a($$1, this.d(1.0), this.dE() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void t() {
      if (this.ce == null) {
         this.ce = new cik.a<>(this, cpw.class, 16.0F, 0.8, 1.33);
      }

      this.bT.a(this.ce);
      if (!this.x()) {
         this.bT.a(4, this.ce);
      }
   }

   @Nullable
   public cik b(ash $$0, bva $$1) {
      return bvq.aJ.a($$0, bvp.e);
   }

   @Override
   public boolean j(cxo $$0) {
      return $$0.a(ayd.au);
   }

   public static boolean c(bvq<cik> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dhk $$0) {
      if ($$0.f(this) && !$$0.d(this.cR())) {
         jh $$1 = this.dw();
         if ($$1.v() < $$0.O()) {
            return false;
         }

         dxu $$2 = $$0.a_($$1.e());
         if ($$2.a(dkn.i) || $$2.a(axu.Q)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      if ($$3 == null) {
         $$3 = new bva.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public fbx cT() {
      return new fbx(0.0, (double)(0.5F * this.cS()), (double)(this.dr() * 0.4F));
   }

   @Override
   public boolean ce() {
      return this.ci() || super.ce();
   }

   static class a<T extends bwf> extends cck<T> {
      private final cik i;

      public a(cik $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bvo.e::test);
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

   static class b extends cel {
      private final cik c;

      public b(cik $$0, double $$1, Predicate<cxo> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.x();
      }
   }
}
