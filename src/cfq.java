import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfq extends cfc {
   public static final double ca = 0.6;
   public static final double cb = 0.8;
   public static final double cc = 1.33;
   private static final ajv<Boolean> ce = ajz.a(cfq.class, ajx.k);
   @Nullable
   private cfq.a<cmv> cf;
   @Nullable
   private cfq.b cg;

   public cfq(bsw<? extends cfq> $$0, dcu $$1) {
      super($$0, $$1);
      this.t();
   }

   boolean x() {
      return this.ao.a(ce);
   }

   private void w(boolean $$0) {
      this.ao.a(ce, $$0);
      this.t();
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Trusting", this.x());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
   }

   @Override
   protected void z() {
      this.cg = new cfq.b(this, 0.6, $$0 -> $$0.a(awm.ap), true);
      this.bU.a(1, new cae(this));
      this.bU.a(3, this.cg);
      this.bU.a(7, new caq(this, 0.3F));
      this.bU.a(8, new cba(this));
      this.bU.a(9, new bzw(this, 0.8));
      this.bU.a(10, new cbx(this, 0.8, 1.0000001E-5F));
      this.bU.a(11, new cas(this, cmv.class, 10.0F));
      this.bV.a(1, new ccd<>(this, cfh.class, false));
      this.bV.a(1, new ccd<>(this, cgd.class, 10, false, false, cgd.ca));
   }

   @Override
   public void Z() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(bty.f);
            this.i(false);
         } else if ($$0 == 1.33) {
            this.b(bty.a);
            this.i(true);
         } else {
            this.b(bty.a);
            this.i(false);
         }
      } else {
         this.b(bty.a);
         this.i(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.x() && this.ai > 2400;
   }

   public static but.a s() {
      return btn.A().a(buu.s, 10.0).a(buu.v, 0.3F).a(buu.c, 3.0);
   }

   @Nullable
   @Override
   protected avn v() {
      return avo.sp;
   }

   @Override
   public int P() {
      return 900;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.so;
   }

   @Override
   protected avn n_() {
      return avo.sq;
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if ((this.cg == null || this.cg.i()) && !this.x() && this.o($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dQ().B) {
            if (this.ah.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dQ().a(this, (byte)41);
            } else {
               this.x(false);
               this.dQ().a(this, (byte)40);
            }
         }

         return bqq.a(this.dQ().B);
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
      lk $$1 = lm.Q;
      if (!$$0) {
         $$1 = lm.ae;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         double $$5 = this.ah.k() * 0.02;
         this.dQ().a($$1, this.d(1.0), this.dy() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void t() {
      if (this.cf == null) {
         this.cf = new cfq.a<>(this, cmv.class, 16.0F, 0.8, 1.33);
      }

      this.bU.a(this.cf);
      if (!this.x()) {
         this.bU.a(4, this.cf);
      }
   }

   @Nullable
   public cfq b(aqt $$0, bsk $$1) {
      return bsw.au.a((dcu)$$0);
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awm.ap);
   }

   public static boolean c(bsw<cfq> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dcx $$0) {
      if ($$0.f(this) && !$$0.d(this.cL())) {
         jd $$1 = this.dq();
         if ($$1.v() < $$0.z_()) {
            return false;
         }

         dta $$2 = $$0.a_($$1.d());
         if ($$2.a(dfy.i) || $$2.a(awd.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      if ($$3 == null) {
         $$3 = new bsk.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public eww cN() {
      return new eww(0.0, (double)(0.5F * this.cM()), (double)(this.dk() * 0.4F));
   }

   @Override
   public boolean bX() {
      return this.cb() || super.bX();
   }

   static class a<T extends btl> extends bzr<T> {
      private final cfq i;

      public a(cfq $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsv.e::test);
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

   static class b extends cbs {
      private final cfq c;

      public b(cfq $$0, double $$1, Predicate<cuo> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.x();
      }
   }
}
