import java.util.EnumSet;
import javax.annotation.Nullable;

public class cfm extends cgr implements cgc {
   public static final float b = 0.03F;
   boolean ca;
   protected final bzb c;
   protected final byy d;

   public cfm(bpc<? extends cfm> $$0, cwz $$1) {
      super($$0, $$1);
      this.bO = new cfm.d(this);
      this.a(eiy.j, 0.0F);
      this.c = new bzb(this, $$1);
      this.d = new byy(this, $$1);
   }

   public static bqu.a r() {
      return cgr.gr().a(bqv.v, 1.0);
   }

   @Override
   protected void s() {
      this.bR.a(1, new cfm.c(this, 1.0));
      this.bR.a(2, new cfm.f(this, 1.0, 40, 10.0F));
      this.bR.a(2, new cfm.a(this, 1.0, false));
      this.bR.a(5, new cfm.b(this, 1.0));
      this.bR.a(6, new cfm.e(this, 1.0, this.dM().z_()));
      this.bR.a(7, new bxi(this, 1.0));
      this.bS.a(1, new byd(this, cfm.class).a(cgt.class));
      this.bS.a(2, new bye<>(this, cis.class, 10, true, false, this::j));
      this.bS.a(3, new bye<>(this, cia.class, false));
      this.bS.a(3, new bye<>(this, cbp.class, true));
      this.bS.a(3, new bye<>(this, ccn.class, true, false));
      this.bS.a(5, new bye<>(this, cce.class, 10, true, false, cce.bY));
   }

   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.d(bpd.b).b() && $$0.E_().i() < 0.03F) {
         this.a(bpd.b, new cqk(cqn.vO));
         this.f(bpd.b);
      }

      return $$3;
   }

   public static boolean a(bpc<cfm> $$0, cxo $$1, bps $$2, ib $$3, axd $$4) {
      if (!$$1.b_($$3.d()).a(aus.a) && !bps.a($$2)) {
         return false;
      } else {
         il<cxy> $$5 = $$1.t($$3);
         boolean $$6 = $$1.aj() != bmz.a && (bps.b($$2) || a($$1, $$3, $$4)) && (bps.a($$2) || $$1.b_($$3).a(aus.a));
         if ($$6 && bps.a($$2)) {
            return true;
         } else {
            return $$5.a(aum.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(cxa $$0, ib $$1) {
      return $$1.v() < $$0.z_() - 5;
   }

   @Override
   protected boolean y() {
      return false;
   }

   @Override
   protected atx v() {
      return this.bc() ? aty.ht : aty.hs;
   }

   @Override
   protected atx d(bnv $$0) {
      return this.bc() ? aty.hx : aty.hw;
   }

   @Override
   protected atx n_() {
      return this.bc() ? aty.hv : aty.hu;
   }

   @Override
   protected atx gn() {
      return aty.hz;
   }

   @Override
   protected atx aN() {
      return aty.hA;
   }

   @Override
   protected cqk go() {
      return cqk.h;
   }

   @Override
   protected void a(axd $$0, bna $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bpd.a, new cqk(cqn.vM));
         } else {
            this.a(bpd.a, new cqk(cqn.qU));
         }
      }
   }

   @Override
   protected boolean b(cqk $$0, cqk $$1) {
      if ($$1.a(cqn.vO)) {
         return false;
      } else if ($$1.a(cqn.vM)) {
         return $$0.a(cqn.vM) ? $$0.l() < $$1.l() : false;
      } else {
         return $$0.a(cqn.vM) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   public boolean a(cxc $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bpo $$0) {
      return $$0 != null ? !this.dM().P() || $$0.bc() : false;
   }

   @Override
   public boolean cz() {
      return !this.bZ();
   }

   boolean gx() {
      if (this.ca) {
         return true;
      } else {
         bpo $$0 = this.p();
         return $$0 != null && $$0.bc();
      }
   }

   @Override
   public void a(epr $$0) {
      if (this.cX() && this.bc() && this.gx()) {
         this.a(0.01F, $$0);
         this.a(bpt.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bi() {
      if (!this.dM().B) {
         if (this.cY() && this.bc() && this.gx()) {
            this.bQ = this.c;
            this.h(true);
         } else {
            this.bQ = this.d;
            this.h(false);
         }
      }
   }

   @Override
   public boolean ca() {
      return this.bZ();
   }

   protected boolean gq() {
      ejc $$0 = this.K().j();
      if ($$0 != null) {
         ib $$1 = $$0.l();
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
   public void a(bpo $$0, float $$1) {
      cjx $$2 = new cjx(this.dM(), this, new cqk(cqn.vM));
      double $$3 = $$0.dr() - this.dr();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dt();
      double $$5 = $$0.dx() - this.dx();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dM().aj().a() * 4));
      this.a(aty.hy, 1.0F, 1.0F / (this.ei().i() * 0.4F + 0.8F));
      this.dM().b($$2);
   }

   public void w(boolean $$0) {
      this.ca = $$0;
   }

   static class a extends bya {
      private final cfm b;

      public a(cfm $$0, double $$1, boolean $$2) {
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

   static class b extends bwy {
      private final cfm g;

      public b(cfm $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dM().P() && this.g.bc() && this.g.dt() >= (double)(this.g.dM().z_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(cxc $$0, ib $$1) {
         ib $$2 = $$1.c();
         return $$0.u($$2) && $$0.u($$2.c()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void c() {
         this.g.w(false);
         this.g.bQ = this.g.d;
         super.c();
      }

      @Override
      public void d() {
         super.d();
      }
   }

   static class c extends bwl {
      private final bpw a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final cwz f;

      public c(bpw $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dM();
         this.a(EnumSet.of(bwl.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.P()) {
            return false;
         } else if (this.a.bc()) {
            return false;
         } else {
            epr $$0 = this.h();
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
      private epr h() {
         axd $$0 = this.a.ei();
         ib $$1 = this.a.dm();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            ib $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dac.G)) {
               return epr.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bvo {
      private final cfm l;

      public d(cfm $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bpo $$0 = this.l.p();
         if (this.l.gx() && this.l.bc()) {
            if ($$0 != null && $$0.dt() > this.l.dt() || this.l.ca) {
               this.l.g(this.l.dp().b(0.0, 0.002, 0.0));
            }

            if (this.k != bvo.a.b || this.l.K().l()) {
               this.l.y(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dr();
            double $$2 = this.f - this.l.dt();
            double $$3 = this.g - this.l.dx();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(aww.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dC(), $$5, 90.0F));
            this.l.aX = this.l.dC();
            float $$6 = (float)(this.h * this.l.g(bqv.r));
            float $$7 = aww.i(0.125F, this.l.fk(), $$6);
            this.l.y($$7);
            this.l.g(this.l.dp().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aC()) {
               this.l.g(this.l.dp().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends bwl {
      private final cfm a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cfm $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dM().P() && this.a.bc() && this.a.dt() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.dt() < (double)(this.c - 1) && (this.a.K().l() || this.a.gq())) {
            epr $$0 = cai.a(this.a, 4, 8, new epr(this.a.dr(), (double)(this.c - 1), this.a.dx()), (float) (Math.PI / 2));
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

   static class f extends bxk {
      private final cfm a;

      public f(cgc $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cfm)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eU().a(cqn.vM);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bnb.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fy();
         this.a.v(false);
      }
   }
}
