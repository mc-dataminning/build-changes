import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgr extends cgd {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double ca = 1.33;
   private static final akh<Boolean> cc = akl.a(cgr.class, akj.k);
   @Nullable
   private cgr.a<cnx> cd;
   @Nullable
   private cgr.b ce;

   public cgr(bty<? extends cgr> $$0, dej $$1) {
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
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("Trusting", this.y());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.x($$0.q("Trusting"));
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   protected void D() {
      this.ce = new cgr.b(this, 0.6, $$0 -> $$0.a(axe.ap), true);
      this.bS.a(1, new cbe(this));
      this.bS.a(3, this.ce);
      this.bS.a(7, new cbq(this, 0.3F));
      this.bS.a(8, new cca(this));
      this.bS.a(9, new caw(this, 0.8));
      this.bS.a(10, new ccx(this, 0.8, 1.0000001E-5F));
      this.bS.a(11, new cbs(this, cnx.class, 10.0F));
      this.bT.a(1, new cdd<>(this, cgi.class, false));
      this.bT.a(1, new cdd<>(this, che.class, 10, false, false, che.bY));
   }

   @Override
   public void ac() {
      if (this.M().b()) {
         double $$0 = this.M().c();
         if ($$0 == 0.6) {
            this.b(buz.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(buz.a);
            this.h(true);
         } else {
            this.b(buz.a);
            this.h(false);
         }
      } else {
         this.b(buz.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ag > 2400;
   }

   public static bvt.a q() {
      return cgd.gt().a(bvu.s, 10.0).a(bvu.v, 0.3F).a(bvu.c, 3.0);
   }

   @Nullable
   @Override
   protected awf w() {
      return awg.sq;
   }

   @Override
   public int T() {
      return 900;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.sp;
   }

   @Override
   protected awf o_() {
      return awg.sr;
   }

   @Override
   public brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      if ((this.ce == null || this.ce.i()) && !this.y() && this.n($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dS().B) {
            if (this.af.a(3) == 0) {
               this.x(true);
               this.y(true);
               this.dS().a(this, (byte)41);
            } else {
               this.y(false);
               this.dS().a(this, (byte)40);
            }
         }

         return brs.a;
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
      lm $$1 = lo.Q;
      if (!$$0) {
         $$1 = lo.ae;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         double $$5 = this.af.k() * 0.02;
         this.dS().a($$1, this.d(1.0), this.dA() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void t() {
      if (this.cd == null) {
         this.cd = new cgr.a<>(this, cnx.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cd);
      if (!this.y()) {
         this.bS.a(4, this.cd);
      }
   }

   @Nullable
   public cgr b(arj $$0, btk $$1) {
      return bty.au.a($$0, btx.e);
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.ap);
   }

   public static boolean c(bty<cgr> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dem $$0) {
      if ($$0.f(this) && !$$0.d(this.cO())) {
         jf $$1 = this.ds();
         if ($$1.v() < $$0.N()) {
            return false;
         }

         dus $$2 = $$0.a_($$1.e());
         if ($$2.a(dho.i) || $$2.a(awv.P)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      if ($$3 == null) {
         $$3 = new btk.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public eyw cQ() {
      return new eyw(0.0, (double)(0.5F * this.cP()), (double)(this.dn() * 0.4F));
   }

   @Override
   public boolean cb() {
      return this.cf() || super.cb();
   }

   static class a<T extends bun> extends car<T> {
      private final cgr i;

      public a(cgr $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, btw.e::test);
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

   static class b extends ccs {
      private final cgr c;

      public b(cgr $$0, double $$1, Predicate<cvs> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
