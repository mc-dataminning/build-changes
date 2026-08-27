import java.util.EnumSet;
import javax.annotation.Nullable;

public class cfo extends cgt implements cge {
   public static final float b = 0.03F;
   boolean ca;
   protected final bzc c;
   protected final byz d;

   public cfo(bpd<? extends cfo> $$0, cxb $$1) {
      super($$0, $$1);
      this.bO = new cfo.d(this);
      this.a(ejg.j, 0.0F);
      this.c = new bzc(this, $$1);
      this.d = new byz(this, $$1);
   }

   public static bqv.a r() {
      return cgt.gr().a(bqw.v, 1.0);
   }

   @Override
   protected void s() {
      this.bR.a(1, new cfo.c(this, 1.0));
      this.bR.a(2, new cfo.f(this, 1.0, 40, 10.0F));
      this.bR.a(2, new cfo.a(this, 1.0, false));
      this.bR.a(5, new cfo.b(this, 1.0));
      this.bR.a(6, new cfo.e(this, 1.0, this.dM().z_()));
      this.bR.a(7, new bxj(this, 1.0));
      this.bS.a(1, new bye(this, cfo.class).a(cgv.class));
      this.bS.a(2, new byf<>(this, ciu.class, 10, true, false, this::j));
      this.bS.a(3, new byf<>(this, cic.class, false));
      this.bS.a(3, new byf<>(this, cbq.class, true));
      this.bS.a(3, new byf<>(this, cco.class, true, false));
      this.bS.a(5, new byf<>(this, ccf.class, 10, true, false, ccf.bY));
   }

   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.d(bpe.b).b() && $$0.E_().i() < 0.03F) {
         this.a(bpe.b, new cqm(cqp.vP));
         this.f(bpe.b);
      }

      return $$3;
   }

   public static boolean a(bpd<cfo> $$0, cxq $$1, bpt $$2, ib $$3, axd $$4) {
      if (!$$1.b_($$3.d()).a(aus.a) && !bpt.a($$2)) {
         return false;
      } else {
         il<cya> $$5 = $$1.t($$3);
         boolean $$6 = $$1.aj() != bna.a && (bpt.b($$2) || a($$1, $$3, $$4)) && (bpt.a($$2) || $$1.b_($$3).a(aus.a));
         if ($$6 && bpt.a($$2)) {
            return true;
         } else {
            return $$5.a(aum.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(cxc $$0, ib $$1) {
      return $$1.v() < $$0.z_() - 5;
   }

   @Override
   protected boolean y() {
      return false;
   }

   @Override
   protected atx v() {
      return this.bc() ? aty.hx : aty.hw;
   }

   @Override
   protected atx d(bnw $$0) {
      return this.bc() ? aty.hB : aty.hA;
   }

   @Override
   protected atx n_() {
      return this.bc() ? aty.hz : aty.hy;
   }

   @Override
   protected atx gn() {
      return aty.hD;
   }

   @Override
   protected atx aN() {
      return aty.hE;
   }

   @Override
   protected cqm go() {
      return cqm.h;
   }

   @Override
   protected void a(axd $$0, bnb $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bpe.a, new cqm(cqp.vN));
         } else {
            this.a(bpe.a, new cqm(cqp.qU));
         }
      }
   }

   @Override
   protected boolean b(cqm $$0, cqm $$1) {
      if ($$1.a(cqp.vP)) {
         return false;
      } else if ($$1.a(cqp.vN)) {
         return $$0.a(cqp.vN) ? $$0.l() < $$1.l() : false;
      } else {
         return $$0.a(cqp.vN) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   public boolean a(cxe $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bpp $$0) {
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
         bpp $$0 = this.p();
         return $$0 != null && $$0.bc();
      }
   }

   @Override
   public void a(ept $$0) {
      if (this.cX() && this.bc() && this.gx()) {
         this.a(0.01F, $$0);
         this.a(bpu.a, this.dp());
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
      ejd $$0 = this.K().j();
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
   public void a(bpp $$0, float $$1) {
      cjz $$2 = new cjz(this.dM(), this, new cqm(cqp.vN));
      double $$3 = $$0.dr() - this.dr();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dt();
      double $$5 = $$0.dx() - this.dx();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dM().aj().a() * 4));
      this.a(aty.hC, 1.0F, 1.0F / (this.ei().i() * 0.4F + 0.8F));
      this.dM().b($$2);
   }

   public void w(boolean $$0) {
      this.ca = $$0;
   }

   static class a extends byb {
      private final cfo b;

      public a(cfo $$0, double $$1, boolean $$2) {
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

   static class b extends bwz {
      private final cfo g;

      public b(cfo $$0, double $$1) {
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
      protected boolean a(cxe $$0, ib $$1) {
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

   static class c extends bwm {
      private final bpx a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final cxb f;

      public c(bpx $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dM();
         this.a(EnumSet.of(bwm.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.P()) {
            return false;
         } else if (this.a.bc()) {
            return false;
         } else {
            ept $$0 = this.h();
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
      private ept h() {
         axd $$0 = this.a.ei();
         ib $$1 = this.a.dm();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            ib $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dae.G)) {
               return ept.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bvp {
      private final cfo l;

      public d(cfo $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bpp $$0 = this.l.p();
         if (this.l.gx() && this.l.bc()) {
            if ($$0 != null && $$0.dt() > this.l.dt() || this.l.ca) {
               this.l.g(this.l.dp().b(0.0, 0.002, 0.0));
            }

            if (this.k != bvp.a.b || this.l.K().l()) {
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
            float $$6 = (float)(this.h * this.l.g(bqw.r));
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

   static class e extends bwm {
      private final cfo a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cfo $$0, double $$1, int $$2) {
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
            ept $$0 = caj.a(this.a, 4, 8, new ept(this.a.dr(), (double)(this.c - 1), this.a.dx()), (float) (Math.PI / 2));
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

   static class f extends bxl {
      private final cfo a;

      public f(cge $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cfo)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eU().a(cqp.vN);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bnc.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fy();
         this.a.v(false);
      }
   }
}
