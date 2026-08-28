import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgj extends cfv {
   public static final double bZ = 0.6;
   public static final double ca = 0.8;
   public static final double cb = 1.33;
   private static final akg<Boolean> cd = akk.a(cgj.class, aki.k);
   @Nullable
   private cgj.a<cnp> ce;
   @Nullable
   private cgj.b cf;

   public cgj(btq<? extends cgj> $$0, dds $$1) {
      super($$0, $$1);
      this.t();
   }

   boolean y() {
      return this.am.a(cd);
   }

   private void x(boolean $$0) {
      this.am.a(cd, $$0);
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
      $$0.a(cd, false);
   }

   @Override
   protected void D() {
      this.cf = new cgj.b(this, 0.6, $$0 -> $$0.a(axb.ap), true);
      this.bT.a(1, new caw(this));
      this.bT.a(3, this.cf);
      this.bT.a(7, new cbi(this, 0.3F));
      this.bT.a(8, new cbs(this));
      this.bT.a(9, new cao(this, 0.8));
      this.bT.a(10, new ccp(this, 0.8, 1.0000001E-5F));
      this.bT.a(11, new cbk(this, cnp.class, 10.0F));
      this.bU.a(1, new ccv<>(this, cga.class, false));
      this.bU.a(1, new ccv<>(this, cgw.class, 10, false, false, cgw.bZ));
   }

   @Override
   public void ad() {
      if (this.M().b()) {
         double $$0 = this.M().c();
         if ($$0 == 0.6) {
            this.b(bur.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(bur.a);
            this.h(true);
         } else {
            this.b(bur.a);
            this.h(false);
         }
      } else {
         this.b(bur.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ag > 2400;
   }

   public static bvl.a q() {
      return cfv.gt().a(bvm.s, 10.0).a(bvm.v, 0.3F).a(bvm.c, 3.0);
   }

   @Nullable
   @Override
   protected awc w() {
      return awd.sq;
   }

   @Override
   public int T() {
      return 900;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.sp;
   }

   @Override
   protected awc n_() {
      return awd.sr;
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      if ((this.cf == null || this.cf.i()) && !this.y() && this.p($$2) && $$0.g(this) < 9.0) {
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

         return brk.a;
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
      if (this.ce == null) {
         this.ce = new cgj.a<>(this, cnp.class, 16.0F, 0.8, 1.33);
      }

      this.bT.a(this.ce);
      if (!this.y()) {
         this.bT.a(4, this.ce);
      }
   }

   @Nullable
   public cgj b(arg $$0, btc $$1) {
      return btq.au.a($$0, btp.e);
   }

   @Override
   public boolean p(cvl $$0) {
      return $$0.a(axb.ap);
   }

   public static boolean c(btq<cgj> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(ddv $$0) {
      if ($$0.f(this) && !$$0.d(this.cO())) {
         je $$1 = this.ds();
         if ($$1.v() < $$0.N()) {
            return false;
         }

         dua $$2 = $$0.a_($$1.e());
         if ($$2.a(dgx.i) || $$2.a(aws.P)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      if ($$3 == null) {
         $$3 = new btc.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public eye cQ() {
      return new eye(0.0, (double)(0.5F * this.cP()), (double)(this.dn() * 0.4F));
   }

   @Override
   public boolean cb() {
      return this.cf() || super.cb();
   }

   static class a<T extends buf> extends caj<T> {
      private final cgj i;

      public a(cgj $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bto.e::test);
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

   static class b extends cck {
      private final cgj c;

      public b(cgj $$0, double $$1, Predicate<cvl> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
