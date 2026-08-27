import java.util.EnumSet;
import javax.annotation.Nullable;

public class cgn extends chs implements chd {
   public static final float b = 0.03F;
   boolean ca;
   protected final cab c;
   protected final bzy d;

   public cgn(bqb<? extends cgn> $$0, cyx $$1) {
      super($$0, $$1);
      this.bO = new cgn.d(this);
      this.a(elj.j, 0.0F);
      this.c = new cab(this, $$1);
      this.d = new bzy(this, $$1);
   }

   public static bru.a r() {
      return chs.gr().a(brv.v, 1.0);
   }

   @Override
   protected void u() {
      this.bR.a(1, new cgn.c(this, 1.0));
      this.bR.a(2, new cgn.f(this, 1.0, 40, 10.0F));
      this.bR.a(2, new cgn.a(this, 1.0, false));
      this.bR.a(5, new cgn.b(this, 1.0));
      this.bR.a(6, new cgn.e(this, 1.0, this.dM().z_()));
      this.bR.a(7, new byi(this, 1.0));
      this.bS.a(1, new bzd(this, cgn.class).a(chu.class));
      this.bS.a(2, new bze<>(this, cjt.class, 10, true, false, this::j));
      this.bS.a(3, new bze<>(this, cjb.class, false));
      this.bS.a(3, new bze<>(this, ccp.class, true));
      this.bS.a(3, new bze<>(this, cdn.class, true, false));
      this.bS.a(5, new bze<>(this, cde.class, 10, true, false, cde.bY));
   }

   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.d(bqc.b).d() && $$0.E_().i() < 0.03F) {
         this.a(bqc.b, new crj(crm.vP));
         this.f(bqc.b);
      }

      return $$3;
   }

   public static boolean a(bqb<cgn> $$0, czm $$1, bqs $$2, ib $$3, axr $$4) {
      if (!$$1.b_($$3.d()).a(avh.a) && !bqs.a($$2)) {
         return false;
      } else {
         il<czw> $$5 = $$1.t($$3);
         boolean $$6 = $$1.ak() != bnx.a && (bqs.b($$2) || a($$1, $$3, $$4)) && (bqs.a($$2) || $$1.b_($$3).a(avh.a));
         if ($$6 && bqs.a($$2)) {
            return true;
         } else {
            return $$5.a(avb.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(cyy $$0, ib $$1) {
      return $$1.v() < $$0.z_() - 5;
   }

   @Override
   protected boolean y() {
      return false;
   }

   @Override
   protected aul v() {
      return this.bc() ? aum.hz : aum.hy;
   }

   @Override
   protected aul d(bot $$0) {
      return this.bc() ? aum.hD : aum.hC;
   }

   @Override
   protected aul o_() {
      return this.bc() ? aum.hB : aum.hA;
   }

   @Override
   protected aul gn() {
      return aum.hF;
   }

   @Override
   protected aul aN() {
      return aum.hG;
   }

   @Override
   protected crj go() {
      return crj.i;
   }

   @Override
   protected void a(axr $$0, bny $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bqc.a, new crj(crm.vN));
         } else {
            this.a(bqc.a, new crj(crm.qU));
         }
      }
   }

   @Override
   protected boolean b(crj $$0, crj $$1) {
      if ($$1.a(crm.vP)) {
         return false;
      } else if ($$1.a(crm.vN)) {
         return $$0.a(crm.vN) ? $$0.m() < $$1.m() : false;
      } else {
         return $$0.a(crm.vN) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   public boolean a(cza $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bqo $$0) {
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
         bqo $$0 = this.p();
         return $$0 != null && $$0.bc();
      }
   }

   @Override
   public void a(esa $$0) {
      if (this.cX() && this.bc() && this.gx()) {
         this.a(0.01F, $$0);
         this.a(bqt.a, this.dp());
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
      elg $$0 = this.K().j();
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
   public void a(bqo $$0, float $$1) {
      cky $$2 = new cky(this.dM(), this, new crj(crm.vN));
      double $$3 = $$0.dr() - this.dr();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dt();
      double $$5 = $$0.dx() - this.dx();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dM().ak().a() * 4));
      this.a(aum.hE, 1.0F, 1.0F / (this.ei().i() * 0.4F + 0.8F));
      this.dM().b($$2);
   }

   public void w(boolean $$0) {
      this.ca = $$0;
   }

   static class a extends bza {
      private final cgn b;

      public a(cgn $$0, double $$1, boolean $$2) {
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

   static class b extends bxy {
      private final cgn g;

      public b(cgn $$0, double $$1) {
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
      protected boolean a(cza $$0, ib $$1) {
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

   static class c extends bxl {
      private final bqw a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final cyx f;

      public c(bqw $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dM();
         this.a(EnumSet.of(bxl.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.Q()) {
            return false;
         } else if (this.a.bc()) {
            return false;
         } else {
            esa $$0 = this.h();
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
      private esa h() {
         axr $$0 = this.a.ei();
         ib $$1 = this.a.dm();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            ib $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dca.G)) {
               return esa.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bwo {
      private final cgn l;

      public d(cgn $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bqo $$0 = this.l.p();
         if (this.l.gx() && this.l.bc()) {
            if ($$0 != null && $$0.dt() > this.l.dt() || this.l.ca) {
               this.l.g(this.l.dp().b(0.0, 0.002, 0.0));
            }

            if (this.k != bwo.a.b || this.l.K().l()) {
               this.l.y(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dr();
            double $$2 = this.f - this.l.dt();
            double $$3 = this.g - this.l.dx();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(axk.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dC(), $$5, 90.0F));
            this.l.aX = this.l.dC();
            float $$6 = (float)(this.h * this.l.g(brv.r));
            float $$7 = axk.i(0.125F, this.l.fk(), $$6);
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

   static class e extends bxl {
      private final cgn a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cgn $$0, double $$1, int $$2) {
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
            esa $$0 = cbi.a(this.a, 4, 8, new esa(this.a.dr(), (double)(this.c - 1), this.a.dx()), (float) (Math.PI / 2));
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

   static class f extends byk {
      private final cgn a;

      public f(chd $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cgn)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eU().a(crm.vN);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bnz.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fy();
         this.a.v(false);
      }
   }
}
