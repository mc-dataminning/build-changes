import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chf extends cgr {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double ca = 1.33;
   private static final akl<Boolean> cc = akp.a(chf.class, akn.k);
   @Nullable
   private chf.a<com> cd;
   @Nullable
   private chf.b ce;

   public chf(bul<? extends chf> $$0, dfb $$1) {
      super($$0, $$1);
      this.t();
   }

   boolean y() {
      return this.am.a(cc);
   }

   private void x(boolean $$0) {
      this.am.a(cc, $$0);
      this.t();
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Trusting", this.y());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.x($$0.q("Trusting"));
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   protected void D() {
      this.ce = new chf.b(this, 0.6, $$0 -> $$0.a(axj.as), true);
      this.bS.a(1, new cbs(this));
      this.bS.a(3, this.ce);
      this.bS.a(7, new cce(this, 0.3F));
      this.bS.a(8, new cco(this));
      this.bS.a(9, new cbk(this, 0.8));
      this.bS.a(10, new cdl(this, 0.8, 1.0000001E-5F));
      this.bS.a(11, new ccg(this, com.class, 10.0F));
      this.bT.a(1, new cdr<>(this, cgw.class, false));
      this.bT.a(1, new cdr<>(this, chs.class, 10, false, false, chs.bY));
   }

   @Override
   public void ac() {
      if (this.M().b()) {
         double $$0 = this.M().c();
         if ($$0 == 0.6) {
            this.b(bvm.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(bvm.a);
            this.h(true);
         } else {
            this.b(bvm.a);
            this.h(false);
         }
      } else {
         this.b(bvm.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ag > 2400;
   }

   public static bwh.a q() {
      return cgr.gz().a(bwi.s, 10.0).a(bwi.v, 0.3F).a(bwi.c, 3.0);
   }

   @Nullable
   @Override
   protected awk w() {
      return awl.so;
   }

   @Override
   public int T() {
      return 900;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.sn;
   }

   @Override
   protected awk o_() {
      return awl.sp;
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      if ((this.ce == null || this.ce.i()) && !this.y() && this.l($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dX().C) {
            if (this.af.a(3) == 0) {
               this.x(true);
               this.y(true);
               this.dX().a(this, (byte)41);
            } else {
               this.y(false);
               this.dX().a(this, (byte)40);
            }
         }

         return bsd.a;
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
      lp $$1 = lr.Q;
      if (!$$0) {
         $$1 = lr.ae;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         double $$5 = this.af.k() * 0.02;
         this.dX().a($$1, this.d(1.0), this.dF() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void t() {
      if (this.cd == null) {
         this.cd = new chf.a<>(this, com.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cd);
      if (!this.y()) {
         this.bS.a(4, this.cd);
      }
   }

   @Nullable
   public chf b(arn $$0, btv $$1) {
      return bul.au.a($$0, buk.e);
   }

   @Override
   public boolean l(cwb $$0) {
      return $$0.a(axj.as);
   }

   public static boolean c(bul<chf> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dfe $$0) {
      if ($$0.f(this) && !$$0.d(this.cS())) {
         jh $$1 = this.dx();
         if ($$1.v() < $$0.N()) {
            return false;
         }

         dvj $$2 = $$0.a_($$1.e());
         if ($$2.a(dig.i) || $$2.a(axa.P)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      if ($$3 == null) {
         $$3 = new btv.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public ezn cU() {
      return new ezn(0.0, (double)(0.5F * this.cT()), (double)(this.ds() * 0.4F));
   }

   @Override
   public boolean cf() {
      return this.cj() || super.cf();
   }

   static class a<T extends bva> extends cbf<T> {
      private final chf i;

      public a(chf $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, buj.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.y() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.y() && super.c();
      }
   }

   static class b extends cdg {
      private final chf c;

      public b(chf $$0, double $$1, Predicate<cwb> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
