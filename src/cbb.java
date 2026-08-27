import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbb extends ccg implements cbr {
   public static final float b = 0.03F;
   boolean bX;
   protected final buw c;
   protected final but d;

   public cbb(bkz<? extends cbb> $$0, csf $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bL = new cbb.d(this);
      this.a(edi.j, 0.0F);
      this.c = new buw(this, $$1);
      this.d = new but(this, $$1);
   }

   @Override
   protected void u() {
      this.bO.a(1, new cbb.c(this, 1.0));
      this.bO.a(2, new cbb.f(this, 1.0, 40, 10.0F));
      this.bO.a(2, new cbb.a(this, 1.0, false));
      this.bO.a(5, new cbb.b(this, 1.0));
      this.bO.a(6, new cbb.e(this, 1.0, this.dN().A_()));
      this.bO.a(7, new btd(this, 1.0));
      this.bP.a(1, new bty(this, cbb.class).a(cci.class));
      this.bP.a(2, new btz<>(this, cdz.class, 10, true, false, this::j));
      this.bP.a(3, new btz<>(this, cdh.class, false));
      this.bP.a(3, new btz<>(this, bxi.class, true));
      this.bP.a(3, new btz<>(this, byd.class, true, false));
      this.bP.a(5, new btz<>(this, bxx.class, 10, true, false, bxx.bU));
   }

   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if (this.c(bla.b).b() && $$0.F_().i() < 0.03F) {
         this.a(bla.b, new clo(clr.vJ));
         this.e(bla.b);
      }

      return $$3;
   }

   public static boolean a(bkz<cbb> $$0, csu $$1, blp $$2, hx $$3, atw $$4) {
      if (!$$1.b_($$3.d()).a(arp.a)) {
         return false;
      } else {
         ig<ctd> $$5 = $$1.s($$3);
         boolean $$6 = $$1.aj() != biy.a && a($$1, $$3, $$4) && ($$2 == blp.c || $$1.b_($$3).a(arp.a));
         return $$5.a(arj.ao) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
      }
   }

   private static boolean a(csg $$0, hx $$1) {
      return $$1.v() < $$0.A_() - 5;
   }

   @Override
   protected boolean w() {
      return false;
   }

   @Override
   protected aqu y() {
      return this.aZ() ? aqv.gR : aqv.gQ;
   }

   @Override
   protected aqu d(bjt $$0) {
      return this.aZ() ? aqv.gV : aqv.gU;
   }

   @Override
   protected aqu n_() {
      return this.aZ() ? aqv.gT : aqv.gS;
   }

   @Override
   protected aqu A() {
      return aqv.gX;
   }

   @Override
   protected aqu aN() {
      return aqv.gY;
   }

   @Override
   protected clo gf() {
      return clo.b;
   }

   @Override
   protected void a(atw $$0, biz $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bla.a, new clo(clr.vH));
         } else {
            this.a(bla.a, new clo(clr.qS));
         }
      }
   }

   @Override
   protected boolean b(clo $$0, clo $$1) {
      if ($$1.a(clr.vJ)) {
         return false;
      } else if ($$1.a(clr.vH)) {
         return $$0.a(clr.vH) ? $$0.k() < $$1.k() : false;
      } else {
         return $$0.a(clr.vH) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gg() {
      return false;
   }

   @Override
   public boolean a(csi $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bll $$0) {
      return $$0 != null ? !this.dN().O() || $$0.aZ() : false;
   }

   @Override
   public boolean cz() {
      return !this.bZ();
   }

   boolean gp() {
      if (this.bX) {
         return true;
      } else {
         bll $$0 = this.q();
         return $$0 != null && $$0.aZ();
      }
   }

   @Override
   public void a(ejz $$0) {
      if (this.cY() && this.aZ() && this.gp()) {
         this.a(0.01F, $$0);
         this.a(blr.a, this.dq());
         this.g(this.dq().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bf() {
      if (!this.dN().B) {
         if (this.cZ() && this.aZ() && this.gp()) {
            this.bN = this.c;
            this.h(true);
         } else {
            this.bN = this.d;
            this.h(false);
         }
      }
   }

   @Override
   public boolean ca() {
      return this.bZ();
   }

   protected boolean gh() {
      edm $$0 = this.N().j();
      if ($$0 != null) {
         hx $$1 = $$0.l();
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
   public void a(bll $$0, float $$1) {
      cfd $$2 = new cfd(this.dN(), this, new clo(clr.vH));
      double $$3 = $$0.ds() - this.ds();
      double $$4 = $$0.e(0.3333333333333333) - $$2.du();
      double $$5 = $$0.dy() - this.dy();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dN().aj().a() * 4));
      this.a(aqv.gW, 1.0F, 1.0F / (this.eh().i() * 0.4F + 0.8F));
      this.dN().b($$2);
   }

   public void w(boolean $$0) {
      this.bX = $$0;
   }

   static class a extends btv {
      private final cbb b;

      public a(cbb $$0, double $$1, boolean $$2) {
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

   static class b extends bst {
      private final cbb g;

      public b(cbb $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dN().O() && this.g.aZ() && this.g.du() >= (double)(this.g.dN().A_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(csi $$0, hx $$1) {
         hx $$2 = $$1.c();
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

   static class c extends bsg {
      private final blu a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final csf f;

      public c(blu $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dN();
         this.a(EnumSet.of(bsg.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.O()) {
            return false;
         } else if (this.a.aZ()) {
            return false;
         } else {
            ejz $$0 = this.h();
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
         return !this.a.N().l();
      }

      @Override
      public void c() {
         this.a.N().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private ejz h() {
         atw $$0 = this.a.eh();
         hx $$1 = this.a.dn();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            hx $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(cvh.G)) {
               return ejz.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends brj {
      private final cbb l;

      public d(cbb $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bll $$0 = this.l.q();
         if (this.l.gp() && this.l.aZ()) {
            if ($$0 != null && $$0.du() > this.l.du() || this.l.bX) {
               this.l.g(this.l.dq().b(0.0, 0.002, 0.0));
            }

            if (this.k != brj.a.b || this.l.N().l()) {
               this.l.w(0.0F);
               return;
            }

            double $$1 = this.e - this.l.ds();
            double $$2 = this.f - this.l.du();
            double $$3 = this.g - this.l.dy();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(atq.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dD(), $$5, 90.0F));
            this.l.aU = this.l.dD();
            float $$6 = (float)(this.h * this.l.b(bmr.m));
            float $$7 = atq.i(0.125F, this.l.fg(), $$6);
            this.l.w($$7);
            this.l.g(this.l.dq().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aC()) {
               this.l.g(this.l.dq().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends bsg {
      private final cbb a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cbb $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dN().O() && this.a.aZ() && this.a.du() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.du() < (double)(this.c - 1) && (this.a.N().l() || this.a.gh())) {
            ejz $$0 = bwb.a(this.a, 4, 8, new ejz(this.a.ds(), (double)(this.c - 1), this.a.dy()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.N().a($$0.c, $$0.d, $$0.e, this.b);
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

   static class f extends btf {
      private final cbb a;

      public f(cbr $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cbb)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eU().a(clr.vH);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bja.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fu();
         this.a.v(false);
      }
   }
}
