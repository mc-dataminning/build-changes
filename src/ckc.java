import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckc extends cjk {
   public static final double bI = 0.6;
   public static final double bJ = 0.8;
   public static final double bK = 1.33;
   private static final akl<Boolean> bM = akp.a(ckc.class, akn.k);
   private static final boolean bN = false;
   @Nullable
   private ckc.a<crx> bO;
   @Nullable
   private ckc.b bP;

   public ckc(bxc<? extends ckc> $$0, djx $$1) {
      super($$0, $$1);
      this.t();
   }

   boolean x() {
      return this.al.a(bM);
   }

   private void w(boolean $$0) {
      this.al.a(bM, $$0);
      this.t();
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Trusting", this.x());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.b("Trusting", false));
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bM, false);
   }

   @Override
   protected void D() {
      this.bP = new ckc.b(this, 0.6, $$0 -> $$0.a(axm.at), true);
      this.bF.a(1, new cek(this));
      this.bF.a(3, this.bP);
      this.bF.a(7, new cew(this, 0.3F));
      this.bF.a(8, new cfg(this));
      this.bF.a(9, new cec(this, 0.8));
      this.bF.a(10, new cgd(this, 0.8, 1.0000001E-5F));
      this.bF.a(11, new cey(this, crx.class, 10.0F));
      this.bG.a(1, new cgj<>(this, cjq.class, false));
      this.bG.a(1, new cgj<>(this, ckr.class, 10, false, false, ckr.bI));
   }

   @Override
   public void a(ars $$0) {
      if (this.L().b()) {
         double $$1 = this.L().c();
         if ($$1 == 0.6) {
            this.b(byg.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(byg.a);
            this.h(true);
         } else {
            this.b(byg.a);
            this.h(false);
         }
      } else {
         this.b(byg.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.x() && this.af > 2400;
   }

   public static byz.a q() {
      return cjk.gz().a(bza.s, 10.0).a(bza.v, 0.3F).a(bza.c, 3.0);
   }

   @Nullable
   @Override
   protected awo u() {
      return awp.tb;
   }

   @Override
   public int S() {
      return 900;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.ta;
   }

   @Override
   protected awo l_() {
      return awp.tc;
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      if ((this.bP == null || this.bP.i()) && !this.x() && this.i($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dV().C) {
            if (this.ae.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dV().a(this, (byte)41);
            } else {
               this.x(false);
               this.dV().a(this, (byte)40);
            }
         }

         return bur.a;
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
      lw $$1 = ly.S;
      if (!$$0) {
         $$1 = ly.ah;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         double $$5 = this.ae.k() * 0.02;
         this.dV().a($$1, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void t() {
      if (this.bO == null) {
         this.bO = new ckc.a<>(this, crx.class, 16.0F, 0.8, 1.33);
      }

      this.bF.a(this.bO);
      if (!this.x()) {
         this.bF.a(4, this.bO);
      }
   }

   @Nullable
   public ckc b(ars $$0, bwj $$1) {
      return bxc.aJ.a($$0, bxb.e);
   }

   @Override
   public boolean i(czy $$0) {
      return $$0.a(axm.at);
   }

   public static boolean c(bxc<ckc> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dka $$0) {
      if ($$0.f(this) && !$$0.d(this.cR())) {
         iv $$1 = this.dv();
         if ($$1.v() < $$0.P()) {
            return false;
         }

         ebe $$2 = $$0.a_($$1.e());
         if ($$2.a(dne.i) || $$2.a(axe.Q)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      if ($$3 == null) {
         $$3 = new bwj.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public ffq cT() {
      return new ffq(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   @Override
   public boolean cd() {
      return this.ch() || super.cd();
   }

   static class a<T extends bxu> extends cdx<T> {
      private final ckc i;

      public a(ckc $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bxa.e::test);
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

   static class b extends cfy {
      private final ckc c;

      public b(ckc $$0, double $$1, Predicate<czy> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.x();
      }
   }
}
