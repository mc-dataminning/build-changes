import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfs extends cfe {
   public static final double cc = 0.6;
   public static final double cd = 0.8;
   public static final double ce = 1.33;
   private static final ajw<Boolean> cg = aka.a(cfs.class, ajy.k);
   @Nullable
   private cfs.a<cmx> ch;
   @Nullable
   private cfs.b ci;

   public cfs(bsx<? extends cfs> $$0, dcw $$1) {
      super($$0, $$1);
      this.t();
   }

   boolean x() {
      return this.ao.a(cg);
   }

   private void x(boolean $$0) {
      this.ao.a(cg, $$0);
      this.t();
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("Trusting", this.x());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.x($$0.q("Trusting"));
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cg, false);
   }

   @Override
   protected void B() {
      this.ci = new cfs.b(this, 0.6, $$0 -> $$0.a(awn.ap), true);
      this.bW.a(1, new cag(this));
      this.bW.a(3, this.ci);
      this.bW.a(7, new cas(this, 0.3F));
      this.bW.a(8, new cbc(this));
      this.bW.a(9, new bzy(this, 0.8));
      this.bW.a(10, new cbz(this, 0.8, 1.0000001E-5F));
      this.bW.a(11, new cau(this, cmx.class, 10.0F));
      this.bX.a(1, new ccf<>(this, cfj.class, false));
      this.bX.a(1, new ccf<>(this, cgf.class, 10, false, false, cgf.cc));
   }

   @Override
   public void ab() {
      if (this.J().b()) {
         double $$0 = this.J().c();
         if ($$0 == 0.6) {
            this.b(bua.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(bua.a);
            this.h(true);
         } else {
            this.b(bua.a);
            this.h(false);
         }
      } else {
         this.b(bua.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.x() && this.ai > 2400;
   }

   public static buv.a s() {
      return btp.C().a(buw.s, 10.0).a(buw.v, 0.3F).a(buw.c, 3.0);
   }

   @Nullable
   @Override
   protected avo v() {
      return avp.sp;
   }

   @Override
   public int R() {
      return 900;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.so;
   }

   @Override
   protected avo n_() {
      return avp.sq;
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if ((this.ci == null || this.ci.i()) && !this.x() && this.o($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dO().B) {
            if (this.ah.a(3) == 0) {
               this.x(true);
               this.y(true);
               this.dO().a(this, (byte)41);
            } else {
               this.y(false);
               this.dO().a(this, (byte)40);
            }
         }

         return bqr.a(this.dO().B);
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
      lk $$1 = lm.Q;
      if (!$$0) {
         $$1 = lm.ae;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         double $$5 = this.ah.k() * 0.02;
         this.dO().a($$1, this.d(1.0), this.dw() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void t() {
      if (this.ch == null) {
         this.ch = new cfs.a<>(this, cmx.class, 16.0F, 0.8, 1.33);
      }

      this.bW.a(this.ch);
      if (!this.x()) {
         this.bW.a(4, this.ch);
      }
   }

   @Nullable
   public cfs b(aqu $$0, bsl $$1) {
      return bsx.au.a((dcw)$$0);
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.ap);
   }

   public static boolean c(bsx<cfs> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dcz $$0) {
      if ($$0.f(this) && !$$0.d(this.cK())) {
         jd $$1 = this.do();
         if ($$1.v() < $$0.z_()) {
            return false;
         }

         dtc $$2 = $$0.a_($$1.e());
         if ($$2.a(dga.i) || $$2.a(awe.P)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      if ($$3 == null) {
         $$3 = new bsl.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public exc cM() {
      return new exc(0.0, (double)(0.5F * this.cL()), (double)(this.dj() * 0.4F));
   }

   @Override
   public boolean bX() {
      return this.cb() || super.bX();
   }

   static class a<T extends btn> extends bzt<T> {
      private final cfs i;

      public a(cfs $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsw.e::test);
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

   static class b extends cbu {
      private final cfs c;

      public b(cfs $$0, double $$1, Predicate<cuq> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.x();
      }
   }
}
