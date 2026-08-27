import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ces extends cee {
   public static final double ch = 0.6;
   public static final double ci = 0.8;
   public static final double ck = 1.33;
   private static final ajy<Boolean> cl = akc.a(ces.class, aka.k);
   @Nullable
   private ces.a<cly> cm;
   @Nullable
   private ces.b cn;

   public ces(bsb<? extends ces> $$0, dca $$1) {
      super($$0, $$1);
      this.t();
   }

   boolean x() {
      return this.as.a(cl);
   }

   private void w(boolean $$0) {
      this.as.a(cl, $$0);
      this.t();
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Trusting", this.x());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cl, false);
   }

   @Override
   protected void y() {
      this.cn = new ces.b(this, 0.6, $$0 -> $$0.a(awm.ap), true);
      this.cb.a(1, new bzf(this));
      this.cb.a(3, this.cn);
      this.cb.a(7, new bzr(this, 0.3F));
      this.cb.a(8, new cab(this));
      this.cb.a(9, new byx(this, 0.8));
      this.cb.a(10, new cay(this, 0.8, 1.0000001E-5F));
      this.cb.a(11, new bzt(this, cly.class, 10.0F));
      this.cc.a(1, new cbe<>(this, cej.class, false));
      this.cc.a(1, new cbe<>(this, cff.class, 10, false, false, cff.ch));
   }

   @Override
   public void Y() {
      if (this.G().b()) {
         double $$0 = this.G().c();
         if ($$0 == 0.6) {
            this.b(bsz.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(bsz.a);
            this.h(true);
         } else {
            this.b(bsz.a);
            this.h(false);
         }
      } else {
         this.b(bsz.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.x() && this.am > 2400;
   }

   public static btu.a r() {
      return bsq.A().a(btv.q, 10.0).a(btv.r, 0.3F).a(btv.c, 3.0);
   }

   @Nullable
   @Override
   protected avn u() {
      return avo.sL;
   }

   @Override
   public int O() {
      return 900;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.sK;
   }

   @Override
   protected avn n_() {
      return avo.sM;
   }

   private float gy() {
      return (float)this.g(btv.c);
   }

   @Override
   public boolean C(brv $$0) {
      return $$0.a(this.dX().b((bso)this), this.gy());
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if ((this.cn == null || this.cn.i()) && !this.x() && this.o($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dU().C) {
            if (this.al.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dU().a(this, (byte)41);
            } else {
               this.x(false);
               this.dU().a(this, (byte)40);
            }
         }

         return bqa.a(this.dU().C);
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
      kz $$1 = lb.O;
      if (!$$0) {
         $$1 = lb.ac;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.al.k() * 0.02;
         double $$4 = this.al.k() * 0.02;
         double $$5 = this.al.k() * 0.02;
         this.dU().a($$1, this.d(1.0), this.dC() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void t() {
      if (this.cm == null) {
         this.cm = new ces.a<>(this, cly.class, 16.0F, 0.8, 1.33);
      }

      this.cb.a(this.cm);
      if (!this.x()) {
         this.cb.a(4, this.cm);
      }
   }

   @Nullable
   public ces b(aqt $$0, brp $$1) {
      return bsb.av.a((dca)$$0);
   }

   @Override
   public boolean o(cuh $$0) {
      return $$0.a(awm.ap);
   }

   public static boolean c(bsb<ces> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dcd $$0) {
      if ($$0.f(this) && !$$0.d(this.cP())) {
         ir $$1 = this.du();
         if ($$1.v() < $$0.A_()) {
            return false;
         }

         dtc $$2 = $$0.a_($$1.d());
         if ($$2.a(awe.bZ) || $$2.a(awe.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      if ($$3 == null) {
         $$3 = new brp.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public ewu cR() {
      return new ewu(0.0, (double)(0.5F * this.cQ()), (double)(this.do() * 0.4F));
   }

   @Override
   public boolean cb() {
      return this.cf() || super.cb();
   }

   static class a<T extends bso> extends bys<T> {
      private final ces i;

      public a(ces $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsa.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.x() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.x() && super.b();
      }
   }

   static class b extends cat {
      private final ces c;

      public b(ces $$0, double $$1, Predicate<cuh> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.x();
      }
   }
}
