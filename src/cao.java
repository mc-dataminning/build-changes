import java.util.EnumSet;
import javax.annotation.Nullable;

public class cao extends cbt implements cbe {
   public static final float b = 0.03F;
   boolean bX;
   protected final buj c;
   protected final bug d;

   public cao(bkm<? extends cao> $$0, crs $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bL = new cao.d(this);
      this.a(ecr.j, 0.0F);
      this.c = new buj(this, $$1);
      this.d = new bug(this, $$1);
   }

   @Override
   protected void s() {
      this.bO.a(1, new cao.c(this, 1.0));
      this.bO.a(2, new cao.f(this, 1.0, 40, 10.0F));
      this.bO.a(2, new cao.a(this, 1.0, false));
      this.bO.a(5, new cao.b(this, 1.0));
      this.bO.a(6, new cao.e(this, 1.0, this.dL().z_()));
      this.bO.a(7, new bsq(this, 1.0));
      this.bP.a(1, new btl(this, cao.class).a(cbv.class));
      this.bP.a(2, new btm<>(this, cdm.class, 10, true, false, this::j));
      this.bP.a(3, new btm<>(this, ccu.class, false));
      this.bP.a(3, new btm<>(this, bwv.class, true));
      this.bP.a(3, new btm<>(this, bxq.class, true, false));
      this.bP.a(5, new btm<>(this, bxk.class, 10, true, false, bxk.bU));
   }

   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if (this.c(bkn.b).b() && $$0.E_().i() < 0.03F) {
         this.a(bkn.b, new clb(cle.uY));
         this.e(bkn.b);
      }

      return $$3;
   }

   public static boolean a(bkm<cao> $$0, csh $$1, blc $$2, ht $$3, ato $$4) {
      if (!$$1.b_($$3.d()).a(arh.a)) {
         return false;
      } else {
         ib<csq> $$5 = $$1.s($$3);
         boolean $$6 = $$1.ai() != bin.a && a($$1, $$3, $$4) && ($$2 == blc.c || $$1.b_($$3).a(arh.a));
         return $$5.a(arb.ao) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
      }
   }

   private static boolean a(crt $$0, ht $$1) {
      return $$1.v() < $$0.z_() - 5;
   }

   @Override
   protected boolean t() {
      return false;
   }

   @Override
   protected aqm w() {
      return this.aX() ? aqn.gB : aqn.gA;
   }

   @Override
   protected aqm d(bjg $$0) {
      return this.aX() ? aqn.gF : aqn.gE;
   }

   @Override
   protected aqm m_() {
      return this.aX() ? aqn.gD : aqn.gC;
   }

   @Override
   protected aqm y() {
      return aqn.gH;
   }

   @Override
   protected aqm aL() {
      return aqn.gI;
   }

   @Override
   protected clb ge() {
      return clb.b;
   }

   @Override
   protected void a(ato $$0, bio $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bkn.a, new clb(cle.uW));
         } else {
            this.a(bkn.a, new clb(cle.qh));
         }
      }
   }

   @Override
   protected boolean b(clb $$0, clb $$1) {
      if ($$1.a(cle.uY)) {
         return false;
      } else if ($$1.a(cle.uW)) {
         return $$0.a(cle.uW) ? $$0.k() < $$1.k() : false;
      } else {
         return $$0.a(cle.uW) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gf() {
      return false;
   }

   @Override
   public boolean a(crv $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bky $$0) {
      return $$0 != null ? !this.dL().N() || $$0.aX() : false;
   }

   @Override
   public boolean cy() {
      return !this.bY();
   }

   boolean go() {
      if (this.bX) {
         return true;
      } else {
         bky $$0 = this.q();
         return $$0 != null && $$0.aX();
      }
   }

   @Override
   public void h(eji $$0) {
      if (this.cW() && this.aX() && this.go()) {
         this.a(0.01F, $$0);
         this.a(ble.a, this.do());
         this.f(this.do().a(0.9));
      } else {
         super.h($$0);
      }
   }

   @Override
   public void bd() {
      if (!this.dL().B) {
         if (this.cX() && this.aX() && this.go()) {
            this.bN = this.c;
            this.h(true);
         } else {
            this.bN = this.d;
            this.h(false);
         }
      }
   }

   @Override
   public boolean bZ() {
      return this.bY();
   }

   protected boolean gg() {
      ecv $$0 = this.L().j();
      if ($$0 != null) {
         ht $$1 = $$0.l();
         if ($$1 != null) {
            double $$2 = this.i((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            if ($$2 < 4.0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(bky $$0, float $$1) {
      ceq $$2 = new ceq(this.dL(), this, new clb(cle.uW));
      double $$3 = $$0.dq() - this.dq();
      double $$4 = $$0.e(0.3333333333333333) - $$2.ds();
      double $$5 = $$0.dw() - this.dw();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dL().ai().a() * 4));
      this.a(aqn.gG, 1.0F, 1.0F / (this.ef().i() * 0.4F + 0.8F));
      this.dL().b($$2);
   }

   public void w(boolean $$0) {
      this.bX = $$0;
   }

   static class a extends bti {
      private final cao b;

      public a(cao $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b.j(this.b.q());
      }

      @Override
      public boolean b() {
         return super.b() && this.b.j(this.b.q());
      }
   }

   static class b extends bsg {
      private final cao g;

      public b(cao $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dL().N() && this.g.aX() && this.g.ds() >= (double)(this.g.dL().z_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(crv $$0, ht $$1) {
         ht $$2 = $$1.c();
         return $$0.t($$2) && $$0.t($$2.c()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void c() {
         this.g.w(false);
         this.g.bN = this.g.d;
         super.c();
      }

      @Override
      public void d() {
         super.d();
      }
   }

   static class c extends brt {
      private final blh a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final crs f;

      public c(blh $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dL();
         this.a(EnumSet.of(brt.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.N()) {
            return false;
         } else if (this.a.aX()) {
            return false;
         } else {
            eji $$0 = this.h();
            if ($$0 == null) {
               return false;
            } else {
               this.b = $$0.c;
               this.c = $$0.d;
               this.d = $$0.e;
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return !this.a.L().l();
      }

      @Override
      public void c() {
         this.a.L().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private eji h() {
         ato $$0 = this.a.ef();
         ht $$1 = this.a.dl();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            ht $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(cuv.G)) {
               return eji.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bqw {
      private final cao l;

      public d(cao $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bky $$0 = this.l.q();
         if (this.l.go() && this.l.aX()) {
            if ($$0 != null && $$0.ds() > this.l.ds() || this.l.bX) {
               this.l.f(this.l.do().b(0.0, 0.002, 0.0));
            }

            if (this.k != bqw.a.b || this.l.L().l()) {
               this.l.w(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dq();
            double $$2 = this.f - this.l.ds();
            double $$3 = this.g - this.l.dw();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(ati.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dB(), $$5, 90.0F));
            this.l.aU = this.l.dB();
            float $$6 = (float)(this.h * this.l.b(bme.m));
            float $$7 = ati.i(0.125F, this.l.fe(), $$6);
            this.l.w($$7);
            this.l.f(this.l.do().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aA()) {
               this.l.f(this.l.do().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends brt {
      private final cao a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cao $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dL().N() && this.a.aX() && this.a.ds() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.ds() < (double)(this.c - 1) && (this.a.L().l() || this.a.gg())) {
            eji $$0 = bvo.a(this.a, 4, 8, new eji(this.a.dq(), (double)(this.c - 1), this.a.dw()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.L().a($$0.c, $$0.d, $$0.e, this.b);
         }
      }

      @Override
      public void c() {
         this.a.w(true);
         this.d = false;
      }

      @Override
      public void d() {
         this.a.w(false);
      }
   }

   static class f extends bss {
      private final cao a;

      public f(cbe $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cao)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eS().a(cle.uW);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bip.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.ft();
         this.a.v(false);
      }
   }
}
