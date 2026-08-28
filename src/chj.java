import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chj extends cgv {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double ca = 1.33;
   private static final ako<Boolean> cc = aks.a(chj.class, akq.k);
   @Nullable
   private chj.a<cor> cd;
   @Nullable
   private chj.b ce;

   public chj(bup<? extends chj> $$0, dff $$1) {
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
   public void b(un $$0) {
      super.b($$0);
      $$0.a("Trusting", this.y());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.x($$0.q("Trusting"));
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   protected void D() {
      this.ce = new chj.b(this, 0.6, $$0 -> $$0.a(axm.at), true);
      this.bS.a(1, new cbw(this));
      this.bS.a(3, this.ce);
      this.bS.a(7, new cci(this, 0.3F));
      this.bS.a(8, new ccs(this));
      this.bS.a(9, new cbo(this, 0.8));
      this.bS.a(10, new cdp(this, 0.8, 1.0000001E-5F));
      this.bS.a(11, new cck(this, cor.class, 10.0F));
      this.bT.a(1, new cdv<>(this, cha.class, false));
      this.bT.a(1, new cdv<>(this, chw.class, 10, false, false, chw.bY));
   }

   @Override
   public void ac() {
      if (this.M().b()) {
         double $$0 = this.M().c();
         if ($$0 == 0.6) {
            this.b(bvq.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(bvq.a);
            this.h(true);
         } else {
            this.b(bvq.a);
            this.h(false);
         }
      } else {
         this.b(bvq.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ag > 2400;
   }

   public static bwl.a q() {
      return cgv.gA().a(bwm.s, 10.0).a(bwm.v, 0.3F).a(bwm.c, 3.0);
   }

   @Nullable
   @Override
   protected awn w() {
      return awo.so;
   }

   @Override
   public int T() {
      return 900;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.sn;
   }

   @Override
   protected awn o_() {
      return awo.sp;
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      if ((this.ce == null || this.ce.i()) && !this.y() && this.l($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dY().C) {
            if (this.af.a(3) == 0) {
               this.x(true);
               this.y(true);
               this.dY().a(this, (byte)41);
            } else {
               this.y(false);
               this.dY().a(this, (byte)40);
            }
         }

         return bsh.a;
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
         $$1 = ls.ae;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         double $$5 = this.af.k() * 0.02;
         this.dY().a($$1, this.d(1.0), this.dG() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void t() {
      if (this.cd == null) {
         this.cd = new chj.a<>(this, cor.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cd);
      if (!this.y()) {
         this.bS.a(4, this.cd);
      }
   }

   @Nullable
   public chj b(arq $$0, btz $$1) {
      return bup.au.a($$0, buo.e);
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.at);
   }

   public static boolean c(bup<chj> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dfi $$0) {
      if ($$0.f(this) && !$$0.d(this.cT())) {
         jh $$1 = this.dy();
         if ($$1.v() < $$0.N()) {
            return false;
         }

         dvo $$2 = $$0.a_($$1.e());
         if ($$2.a(dil.i) || $$2.a(axd.P)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      if ($$3 == null) {
         $$3 = new btz.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public ezr cV() {
      return new ezr(0.0, (double)(0.5F * this.cU()), (double)(this.dt() * 0.4F));
   }

   @Override
   public boolean cg() {
      return this.ck() || super.cg();
   }

   static class a<T extends bve> extends cbj<T> {
      private final chj i;

      public a(chj $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bun.e::test);
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

   static class b extends cdk {
      private final chj c;

      public b(chj $$0, double $$1, Predicate<cwf> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
