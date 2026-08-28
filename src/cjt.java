import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjt extends cky implements ckj {
   public static final float b = 0.03F;
   boolean cb;
   protected final cdf c;
   protected final cdc d;

   public cjt(btc<? extends cjt> $$0, dca $$1) {
      super($$0, $$1);
      this.bP = new cjt.d(this);
      this.a(eoo.j, 0.0F);
      this.c = new cdf(this, $$1);
      this.d = new cdc(this, $$1);
   }

   public static buy.a s() {
      return cky.gu().a(buz.v, 1.0);
   }

   @Override
   protected void u() {
      this.bS.a(1, new cjt.c(this, 1.0));
      this.bS.a(2, new cjt.f(this, 1.0, 40, 10.0F));
      this.bS.a(2, new cjt.a(this, 1.0, false));
      this.bS.a(5, new cjt.b(this, 1.0));
      this.bS.a(6, new cjt.e(this, 1.0, this.dP().z_()));
      this.bS.a(7, new cbm(this, 1.0));
      this.bT.a(1, new cch(this, cjt.class).a(cla.class));
      this.bT.a(2, new cci<>(this, cmz.class, 10, true, false, this::j));
      this.bT.a(3, new cci<>(this, cmh.class, false));
      this.bT.a(3, new cci<>(this, cft.class, true));
      this.bT.a(3, new cci<>(this, cgt.class, true, false));
      this.bT.a(5, new cci<>(this, cgi.class, 10, true, false, cgi.bY));
   }

   @Override
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(btd.b).e() && $$0.E_().i() < 0.03F) {
         this.a(btd.b, new cur(cuu.vR));
         this.f(btd.b);
      }

      return $$3;
   }

   public static boolean a(btc<cjt> $$0, dcp $$1, btv $$2, iz $$3, azh $$4) {
      if (!$$1.b_($$3.d()).a(awv.a) && !btv.a($$2)) {
         return false;
      } else {
         ji<dcz> $$5 = $$1.t($$3);
         boolean $$6 = $$1.al() != bqt.a && (btv.b($$2) || a($$1, $$3, $$4)) && (btv.a($$2) || $$1.b_($$3).a(awv.a));
         if ($$6 && btv.a($$2)) {
            return true;
         } else {
            return $$5.a(awo.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(dcb $$0, iz $$1) {
      return $$1.v() < $$0.z_() - 5;
   }

   @Override
   protected boolean y() {
      return false;
   }

   @Override
   protected avz v() {
      return this.be() ? awa.hE : awa.hD;
   }

   @Override
   protected avz d(brp $$0) {
      return this.be() ? awa.hI : awa.hH;
   }

   @Override
   protected avz o_() {
      return this.be() ? awa.hG : awa.hF;
   }

   @Override
   protected avz gq() {
      return awa.hK;
   }

   @Override
   protected avz aP() {
      return awa.hL;
   }

   @Override
   protected cur gr() {
      return cur.l;
   }

   @Override
   protected void a(azh $$0, bqu $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(btd.a, new cur(cuu.vP));
         } else {
            this.a(btd.a, new cur(cuu.qV));
         }
      }
   }

   @Override
   protected boolean b(cur $$0, cur $$1) {
      if ($$1.a(cuu.vR)) {
         return false;
      } else if ($$1.a(cuu.vP)) {
         return $$0.a(cuu.vP) ? $$0.n() < $$1.n() : false;
      } else {
         return $$0.a(cuu.vP) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gs() {
      return false;
   }

   @Override
   public boolean a(dcd $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable btr $$0) {
      return $$0 != null ? !this.dP().R() || $$0.be() : false;
   }

   @Override
   public boolean cC() {
      return !this.cc();
   }

   boolean gA() {
      if (this.cb) {
         return true;
      } else {
         btr $$0 = this.p();
         return $$0 != null && $$0.be();
      }
   }

   @Override
   public void a(evt $$0) {
      if (this.da() && this.be() && this.gA()) {
         this.a(0.01F, $$0);
         this.a(btw.a, this.ds());
         this.h(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bk() {
      if (!this.dP().B) {
         if (this.db() && this.be() && this.gA()) {
            this.bR = this.c;
            this.i(true);
         } else {
            this.bR = this.d;
            this.i(false);
         }
      }
   }

   @Override
   public boolean cd() {
      return this.cc();
   }

   protected boolean gt() {
      eol $$0 = this.K().j();
      if ($$0 != null) {
         iz $$1 = $$0.l();
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
   public void a(btr $$0, float $$1) {
      coe $$2 = new coe(this.dP(), this, new cur(cuu.vP));
      double $$3 = $$0.du() - this.du();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dw();
      double $$5 = $$0.dA() - this.dA();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dP().al().a() * 4));
      this.a(awa.hJ, 1.0F, 1.0F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$2);
   }

   public void w(boolean $$0) {
      this.cb = $$0;
   }

   static class a extends cce {
      private final cjt b;

      public a(cjt $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b.j(this.b.p());
      }

      @Override
      public boolean b() {
         return super.b() && this.b.j(this.b.p());
      }
   }

   static class b extends cbc {
      private final cjt g;

      public b(cjt $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dP().R() && this.g.be() && this.g.dw() >= (double)(this.g.dP().z_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(dcd $$0, iz $$1) {
         iz $$2 = $$1.c();
         return $$0.u($$2) && $$0.u($$2.c()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void c() {
         this.g.w(false);
         this.g.bR = this.g.d;
         super.c();
      }

      @Override
      public void d() {
         super.d();
      }
   }

   static class c extends cap {
      private final bua a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dca f;

      public c(bua $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dP();
         this.a(EnumSet.of(cap.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.R()) {
            return false;
         } else if (this.a.be()) {
            return false;
         } else {
            evt $$0 = this.h();
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
         return !this.a.K().l();
      }

      @Override
      public void c() {
         this.a.K().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private evt h() {
         azh $$0 = this.a.el();
         iz $$1 = this.a.dp();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            iz $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dfd.G)) {
               return evt.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bzs {
      private final cjt l;

      public d(cjt $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         btr $$0 = this.l.p();
         if (this.l.gA() && this.l.be()) {
            if ($$0 != null && $$0.dw() > this.l.dw() || this.l.cb) {
               this.l.h(this.l.ds().b(0.0, 0.002, 0.0));
            }

            if (this.k != bzs.a.b || this.l.K().l()) {
               this.l.y(0.0F);
               return;
            }

            double $$1 = this.e - this.l.du();
            double $$2 = this.f - this.l.dw();
            double $$3 = this.g - this.l.dA();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(ayz.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dF(), $$5, 90.0F));
            this.l.aY = this.l.dF();
            float $$6 = (float)(this.h * this.l.g(buz.r));
            float $$7 = ayz.i(0.125F, this.l.fn(), $$6);
            this.l.y($$7);
            this.l.h(this.l.ds().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aE()) {
               this.l.h(this.l.ds().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends cap {
      private final cjt a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cjt $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dP().R() && this.a.be() && this.a.dw() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.dw() < (double)(this.c - 1) && (this.a.K().l() || this.a.gt())) {
            evt $$0 = cem.a(this.a, 4, 8, new evt(this.a.du(), (double)(this.c - 1), this.a.dA()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.K().a($$0.c, $$0.d, $$0.e, this.b);
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

   static class f extends cbo {
      private final cjt a;

      public f(ckj $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cjt)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eX().a(cuu.vP);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bqv.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fB();
         this.a.v(false);
      }
   }
}
