import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgo extends cga {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double ca = 1.33;
   private static final akg<Boolean> cc = akk.a(cgo.class, aki.k);
   @Nullable
   private cgo.a<cnu> cd;
   @Nullable
   private cgo.b ce;

   public cgo(btv<? extends cgo> $$0, deg $$1) {
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
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Trusting", this.y());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.x($$0.q("Trusting"));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   protected void D() {
      this.ce = new cgo.b(this, 0.6, $$0 -> $$0.a(axc.ap), true);
      this.bS.a(1, new cbb(this));
      this.bS.a(3, this.ce);
      this.bS.a(7, new cbn(this, 0.3F));
      this.bS.a(8, new cbx(this));
      this.bS.a(9, new cat(this, 0.8));
      this.bS.a(10, new ccu(this, 0.8, 1.0000001E-5F));
      this.bS.a(11, new cbp(this, cnu.class, 10.0F));
      this.bT.a(1, new cda<>(this, cgf.class, false));
      this.bT.a(1, new cda<>(this, chb.class, 10, false, false, chb.bY));
   }

   @Override
   public void ad() {
      if (this.M().b()) {
         double $$0 = this.M().c();
         if ($$0 == 0.6) {
            this.b(buw.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(buw.a);
            this.h(true);
         } else {
            this.b(buw.a);
            this.h(false);
         }
      } else {
         this.b(buw.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ag > 2400;
   }

   public static bvq.a q() {
      return cga.gu().a(bvr.s, 10.0).a(bvr.v, 0.3F).a(bvr.c, 3.0);
   }

   @Nullable
   @Override
   protected awd w() {
      return awe.sq;
   }

   @Override
   public int T() {
      return 900;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.sp;
   }

   @Override
   protected awd n_() {
      return awe.sr;
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
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

         return brp.a;
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
      ll $$1 = ln.Q;
      if (!$$0) {
         $$1 = ln.ae;
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
         this.cd = new cgo.a<>(this, cnu.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cd);
      if (!this.y()) {
         this.bS.a(4, this.cd);
      }
   }

   @Nullable
   public cgo b(arh $$0, bth $$1) {
      return btv.au.a($$0, btu.e);
   }

   @Override
   public boolean n(cvp $$0) {
      return $$0.a(axc.ap);
   }

   public static boolean c(btv<cgo> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dej $$0) {
      if ($$0.f(this) && !$$0.d(this.cO())) {
         je $$1 = this.ds();
         if ($$1.v() < $$0.N()) {
            return false;
         }

         duo $$2 = $$0.a_($$1.e());
         if ($$2.a(dhl.i) || $$2.a(awt.P)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      if ($$3 == null) {
         $$3 = new bth.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public eys cQ() {
      return new eys(0.0, (double)(0.5F * this.cP()), (double)(this.dn() * 0.4F));
   }

   @Override
   public boolean cb() {
      return this.cf() || super.cb();
   }

   static class a<T extends buk> extends cao<T> {
      private final cgo i;

      public a(cgo $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, btt.e::test);
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

   static class b extends ccp {
      private final cgo c;

      public b(cgo $$0, double $$1, Predicate<cvp> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
