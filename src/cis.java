import java.util.EnumSet;
import javax.annotation.Nullable;

public class cis extends cjx implements cji {
   public static final float b = 0.03F;
   boolean cb;
   protected final cce c;
   protected final ccb d;

   public cis(bsc<? extends cis> $$0, daz $$1) {
      super($$0, $$1);
      this.bP = new cis.d(this);
      this.a(enn.j, 0.0F);
      this.c = new cce(this, $$1);
      this.d = new ccb(this, $$1);
   }

   public static btx.a s() {
      return cjx.gt().a(bty.v, 1.0);
   }

   @Override
   protected void u() {
      this.bS.a(1, new cis.c(this, 1.0));
      this.bS.a(2, new cis.f(this, 1.0, 40, 10.0F));
      this.bS.a(2, new cis.a(this, 1.0, false));
      this.bS.a(5, new cis.b(this, 1.0));
      this.bS.a(6, new cis.e(this, 1.0, this.dP().z_()));
      this.bS.a(7, new cal(this, 1.0));
      this.bT.a(1, new cbg(this, cis.class).a(cjz.class));
      this.bT.a(2, new cbh<>(this, cly.class, 10, true, false, this::j));
      this.bT.a(3, new cbh<>(this, clg.class, false));
      this.bT.a(3, new cbh<>(this, ces.class, true));
      this.bT.a(3, new cbh<>(this, cfs.class, true, false));
      this.bT.a(5, new cbh<>(this, cfh.class, 10, true, false, cfh.bY));
   }

   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bsd.b).e() && $$0.E_().i() < 0.03F) {
         this.a(bsd.b, new ctq(ctt.vR));
         this.f(bsd.b);
      }

      return $$3;
   }

   public static boolean a(bsc<cis> $$0, dbo $$1, bsu $$2, io $$3, aym $$4) {
      if (!$$1.b_($$3.d()).a(awc.a) && !bsu.a($$2)) {
         return false;
      } else {
         ix<dby> $$5 = $$1.t($$3);
         boolean $$6 = $$1.ak() != bpt.a && (bsu.b($$2) || a($$1, $$3, $$4)) && (bsu.a($$2) || $$1.b_($$3).a(awc.a));
         if ($$6 && bsu.a($$2)) {
            return true;
         } else {
            return $$5.a(avw.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(dba $$0, io $$1) {
      return $$1.v() < $$0.z_() - 5;
   }

   @Override
   protected boolean y() {
      return false;
   }

   @Override
   protected avh v() {
      return this.be() ? avi.hE : avi.hD;
   }

   @Override
   protected avh d(bqp $$0) {
      return this.be() ? avi.hI : avi.hH;
   }

   @Override
   protected avh o_() {
      return this.be() ? avi.hG : avi.hF;
   }

   @Override
   protected avh gp() {
      return avi.hK;
   }

   @Override
   protected avh aP() {
      return avi.hL;
   }

   @Override
   protected ctq gq() {
      return ctq.i;
   }

   @Override
   protected void a(aym $$0, bpu $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bsd.a, new ctq(ctt.vP));
         } else {
            this.a(bsd.a, new ctq(ctt.qV));
         }
      }
   }

   @Override
   protected boolean b(ctq $$0, ctq $$1) {
      if ($$1.a(ctt.vR)) {
         return false;
      } else if ($$1.a(ctt.vP)) {
         return $$0.a(ctt.vP) ? $$0.n() < $$1.n() : false;
      } else {
         return $$0.a(ctt.vP) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gr() {
      return false;
   }

   @Override
   public boolean a(dbc $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bsq $$0) {
      return $$0 != null ? !this.dP().Q() || $$0.be() : false;
   }

   @Override
   public boolean cC() {
      return !this.cc();
   }

   boolean gz() {
      if (this.cb) {
         return true;
      } else {
         bsq $$0 = this.p();
         return $$0 != null && $$0.be();
      }
   }

   @Override
   public void a(eum $$0) {
      if (this.da() && this.be() && this.gz()) {
         this.a(0.01F, $$0);
         this.a(bsv.a, this.ds());
         this.g(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bk() {
      if (!this.dP().B) {
         if (this.db() && this.be() && this.gz()) {
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

   protected boolean gs() {
      enk $$0 = this.K().j();
      if ($$0 != null) {
         io $$1 = $$0.l();
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
   public void a(bsq $$0, float $$1) {
      cnd $$2 = new cnd(this.dP(), this, new ctq(ctt.vP));
      double $$3 = $$0.du() - this.du();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dw();
      double $$5 = $$0.dA() - this.dA();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dP().ak().a() * 4));
      this.a(avi.hJ, 1.0F, 1.0F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$2);
   }

   public void w(boolean $$0) {
      this.cb = $$0;
   }

   static class a extends cbd {
      private final cis b;

      public a(cis $$0, double $$1, boolean $$2) {
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

   static class b extends cab {
      private final cis g;

      public b(cis $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dP().Q() && this.g.be() && this.g.dw() >= (double)(this.g.dP().z_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(dbc $$0, io $$1) {
         io $$2 = $$1.c();
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

   static class c extends bzo {
      private final bsz a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final daz f;

      public c(bsz $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dP();
         this.a(EnumSet.of(bzo.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.Q()) {
            return false;
         } else if (this.a.be()) {
            return false;
         } else {
            eum $$0 = this.h();
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
      private eum h() {
         aym $$0 = this.a.el();
         io $$1 = this.a.dp();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            io $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dec.G)) {
               return eum.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends byr {
      private final cis l;

      public d(cis $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bsq $$0 = this.l.p();
         if (this.l.gz() && this.l.be()) {
            if ($$0 != null && $$0.dw() > this.l.dw() || this.l.cb) {
               this.l.g(this.l.ds().b(0.0, 0.002, 0.0));
            }

            if (this.k != byr.a.b || this.l.K().l()) {
               this.l.y(0.0F);
               return;
            }

            double $$1 = this.e - this.l.du();
            double $$2 = this.f - this.l.dw();
            double $$3 = this.g - this.l.dA();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(ayf.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dF(), $$5, 90.0F));
            this.l.aY = this.l.dF();
            float $$6 = (float)(this.h * this.l.g(bty.r));
            float $$7 = ayf.i(0.125F, this.l.fn(), $$6);
            this.l.y($$7);
            this.l.g(this.l.ds().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aE()) {
               this.l.g(this.l.ds().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends bzo {
      private final cis a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cis $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dP().Q() && this.a.be() && this.a.dw() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.dw() < (double)(this.c - 1) && (this.a.K().l() || this.a.gs())) {
            eum $$0 = cdl.a(this.a, 4, 8, new eum(this.a.du(), (double)(this.c - 1), this.a.dA()), (float) (Math.PI / 2));
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

   static class f extends can {
      private final cis a;

      public f(cji $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cis)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eX().a(ctt.vP);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bpv.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fB();
         this.a.v(false);
      }
   }
}
