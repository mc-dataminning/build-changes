import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjs extends ckx implements cki {
   public static final float b = 0.03F;
   boolean cb;
   protected final cde c;
   protected final cdb d;

   public cjs(btb<? extends cjs> $$0, dbz $$1) {
      super($$0, $$1);
      this.bP = new cjs.d(this);
      this.a(eon.j, 0.0F);
      this.c = new cde(this, $$1);
      this.d = new cdb(this, $$1);
   }

   public static bux.a s() {
      return ckx.gu().a(buy.v, 1.0);
   }

   @Override
   protected void u() {
      this.bS.a(1, new cjs.c(this, 1.0));
      this.bS.a(2, new cjs.f(this, 1.0, 40, 10.0F));
      this.bS.a(2, new cjs.a(this, 1.0, false));
      this.bS.a(5, new cjs.b(this, 1.0));
      this.bS.a(6, new cjs.e(this, 1.0, this.dP().z_()));
      this.bS.a(7, new cbl(this, 1.0));
      this.bT.a(1, new ccg(this, cjs.class).a(ckz.class));
      this.bT.a(2, new cch<>(this, cmy.class, 10, true, false, this::j));
      this.bT.a(3, new cch<>(this, cmg.class, false));
      this.bT.a(3, new cch<>(this, cfs.class, true));
      this.bT.a(3, new cch<>(this, cgs.class, true, false));
      this.bT.a(5, new cch<>(this, cgh.class, 10, true, false, cgh.bY));
   }

   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(btc.b).e() && $$0.E_().i() < 0.03F) {
         this.a(btc.b, new cuq(cut.vR));
         this.f(btc.b);
      }

      return $$3;
   }

   public static boolean a(btb<cjs> $$0, dco $$1, btu $$2, iz $$3, azh $$4) {
      if (!$$1.b_($$3.d()).a(awv.a) && !btu.a($$2)) {
         return false;
      } else {
         ji<dcy> $$5 = $$1.t($$3);
         boolean $$6 = $$1.al() != bqs.a && (btu.b($$2) || a($$1, $$3, $$4)) && (btu.a($$2) || $$1.b_($$3).a(awv.a));
         if ($$6 && btu.a($$2)) {
            return true;
         } else {
            return $$5.a(awo.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(dca $$0, iz $$1) {
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
   protected avz d(bro $$0) {
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
   protected cuq gr() {
      return cuq.l;
   }

   @Override
   protected void a(azh $$0, bqt $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(btc.a, new cuq(cut.vP));
         } else {
            this.a(btc.a, new cuq(cut.qV));
         }
      }
   }

   @Override
   protected boolean b(cuq $$0, cuq $$1) {
      if ($$1.a(cut.vR)) {
         return false;
      } else if ($$1.a(cut.vP)) {
         return $$0.a(cut.vP) ? $$0.n() < $$1.n() : false;
      } else {
         return $$0.a(cut.vP) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gs() {
      return false;
   }

   @Override
   public boolean a(dcc $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable btq $$0) {
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
         btq $$0 = this.p();
         return $$0 != null && $$0.be();
      }
   }

   @Override
   public void a(evs $$0) {
      if (this.da() && this.be() && this.gA()) {
         this.a(0.01F, $$0);
         this.a(btv.a, this.ds());
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
      eok $$0 = this.K().j();
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
   public void a(btq $$0, float $$1) {
      cod $$2 = new cod(this.dP(), this, new cuq(cut.vP));
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

   static class a extends ccd {
      private final cjs b;

      public a(cjs $$0, double $$1, boolean $$2) {
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

   static class b extends cbb {
      private final cjs g;

      public b(cjs $$0, double $$1) {
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
      protected boolean a(dcc $$0, iz $$1) {
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

   static class c extends cao {
      private final btz a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dbz f;

      public c(btz $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dP();
         this.a(EnumSet.of(cao.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.R()) {
            return false;
         } else if (this.a.be()) {
            return false;
         } else {
            evs $$0 = this.h();
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
      private evs h() {
         azh $$0 = this.a.el();
         iz $$1 = this.a.dp();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            iz $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dfc.G)) {
               return evs.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bzr {
      private final cjs l;

      public d(cjs $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         btq $$0 = this.l.p();
         if (this.l.gA() && this.l.be()) {
            if ($$0 != null && $$0.dw() > this.l.dw() || this.l.cb) {
               this.l.h(this.l.ds().b(0.0, 0.002, 0.0));
            }

            if (this.k != bzr.a.b || this.l.K().l()) {
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
            float $$6 = (float)(this.h * this.l.g(buy.r));
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

   static class e extends cao {
      private final cjs a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cjs $$0, double $$1, int $$2) {
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
            evs $$0 = cel.a(this.a, 4, 8, new evs(this.a.du(), (double)(this.c - 1), this.a.dA()), (float) (Math.PI / 2));
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

   static class f extends cbn {
      private final cjs a;

      public f(cki $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cjs)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eX().a(cut.vP);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bqu.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fB();
         this.a.v(false);
      }
   }
}
