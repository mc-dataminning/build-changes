import java.util.EnumSet;
import javax.annotation.Nullable;

public class cgu extends chz implements chk {
   public static final float b = 0.03F;
   boolean ca;
   protected final cag c;
   protected final cad d;

   public cgu(bqg<? extends cgu> $$0, czg $$1) {
      super($$0, $$1);
      this.bO = new cgu.d(this);
      this.a(els.j, 0.0F);
      this.c = new cag(this, $$1);
      this.d = new cad(this, $$1);
   }

   public static brz.a r() {
      return chz.gr().a(bsa.v, 1.0);
   }

   @Override
   protected void u() {
      this.bR.a(1, new cgu.c(this, 1.0));
      this.bR.a(2, new cgu.f(this, 1.0, 40, 10.0F));
      this.bR.a(2, new cgu.a(this, 1.0, false));
      this.bR.a(5, new cgu.b(this, 1.0));
      this.bR.a(6, new cgu.e(this, 1.0, this.dM().z_()));
      this.bR.a(7, new byn(this, 1.0));
      this.bS.a(1, new bzi(this, cgu.class).a(cib.class));
      this.bS.a(2, new bzj<>(this, cka.class, 10, true, false, this::j));
      this.bS.a(3, new bzj<>(this, cji.class, false));
      this.bS.a(3, new bzj<>(this, ccu.class, true));
      this.bS.a(3, new bzj<>(this, cdu.class, true, false));
      this.bS.a(5, new bzj<>(this, cdj.class, 10, true, false, cdj.bY));
   }

   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.d(bqh.b).d() && $$0.E_().i() < 0.03F) {
         this.a(bqh.b, new crs(crv.vP));
         this.f(bqh.b);
      }

      return $$3;
   }

   public static boolean a(bqg<cgu> $$0, czv $$1, bqx $$2, id $$3, axt $$4) {
      if (!$$1.b_($$3.d()).a(avj.a) && !bqx.a($$2)) {
         return false;
      } else {
         in<daf> $$5 = $$1.t($$3);
         boolean $$6 = $$1.ak() != boc.a && (bqx.b($$2) || a($$1, $$3, $$4)) && (bqx.a($$2) || $$1.b_($$3).a(avj.a));
         if ($$6 && bqx.a($$2)) {
            return true;
         } else {
            return $$5.a(avd.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(czh $$0, id $$1) {
      return $$1.v() < $$0.z_() - 5;
   }

   @Override
   protected boolean y() {
      return false;
   }

   @Override
   protected aun v() {
      return this.bc() ? auo.hz : auo.hy;
   }

   @Override
   protected aun d(boy $$0) {
      return this.bc() ? auo.hD : auo.hC;
   }

   @Override
   protected aun o_() {
      return this.bc() ? auo.hB : auo.hA;
   }

   @Override
   protected aun gn() {
      return auo.hF;
   }

   @Override
   protected aun aN() {
      return auo.hG;
   }

   @Override
   protected crs go() {
      return crs.i;
   }

   @Override
   protected void a(axt $$0, bod $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bqh.a, new crs(crv.vN));
         } else {
            this.a(bqh.a, new crs(crv.qU));
         }
      }
   }

   @Override
   protected boolean b(crs $$0, crs $$1) {
      if ($$1.a(crv.vP)) {
         return false;
      } else if ($$1.a(crv.vN)) {
         return $$0.a(crv.vN) ? $$0.m() < $$1.m() : false;
      } else {
         return $$0.a(crv.vN) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   public boolean a(czj $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bqt $$0) {
      return $$0 != null ? !this.dM().Q() || $$0.bc() : false;
   }

   @Override
   public boolean cz() {
      return !this.bZ();
   }

   boolean gx() {
      if (this.ca) {
         return true;
      } else {
         bqt $$0 = this.p();
         return $$0 != null && $$0.bc();
      }
   }

   @Override
   public void a(esj $$0) {
      if (this.cX() && this.bc() && this.gx()) {
         this.a(0.01F, $$0);
         this.a(bqy.a, this.dp());
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
      elp $$0 = this.K().j();
      if ($$0 != null) {
         id $$1 = $$0.l();
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
   public void a(bqt $$0, float $$1) {
      clf $$2 = new clf(this.dM(), this, new crs(crv.vN));
      double $$3 = $$0.dr() - this.dr();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dt();
      double $$5 = $$0.dx() - this.dx();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dM().ak().a() * 4));
      this.a(auo.hE, 1.0F, 1.0F / (this.ei().i() * 0.4F + 0.8F));
      this.dM().b($$2);
   }

   public void w(boolean $$0) {
      this.ca = $$0;
   }

   static class a extends bzf {
      private final cgu b;

      public a(cgu $$0, double $$1, boolean $$2) {
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

   static class b extends byd {
      private final cgu g;

      public b(cgu $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dM().Q() && this.g.bc() && this.g.dt() >= (double)(this.g.dM().z_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(czj $$0, id $$1) {
         id $$2 = $$1.c();
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

   static class c extends bxq {
      private final brb a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final czg f;

      public c(brb $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dM();
         this.a(EnumSet.of(bxq.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.Q()) {
            return false;
         } else if (this.a.bc()) {
            return false;
         } else {
            esj $$0 = this.h();
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
      private esj h() {
         axt $$0 = this.a.ei();
         id $$1 = this.a.dm();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            id $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dcj.G)) {
               return esj.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bwt {
      private final cgu l;

      public d(cgu $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bqt $$0 = this.l.p();
         if (this.l.gx() && this.l.bc()) {
            if ($$0 != null && $$0.dt() > this.l.dt() || this.l.ca) {
               this.l.g(this.l.dp().b(0.0, 0.002, 0.0));
            }

            if (this.k != bwt.a.b || this.l.K().l()) {
               this.l.y(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dr();
            double $$2 = this.f - this.l.dt();
            double $$3 = this.g - this.l.dx();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(axm.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dC(), $$5, 90.0F));
            this.l.aX = this.l.dC();
            float $$6 = (float)(this.h * this.l.g(bsa.r));
            float $$7 = axm.i(0.125F, this.l.fk(), $$6);
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

   static class e extends bxq {
      private final cgu a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cgu $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dM().Q() && this.a.bc() && this.a.dt() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.dt() < (double)(this.c - 1) && (this.a.K().l() || this.a.gq())) {
            esj $$0 = cbn.a(this.a, 4, 8, new esj(this.a.dr(), (double)(this.c - 1), this.a.dx()), (float) (Math.PI / 2));
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

   static class f extends byp {
      private final cgu a;

      public f(chk $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cgu)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eU().a(crv.vN);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(boe.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fy();
         this.a.v(false);
      }
   }
}
