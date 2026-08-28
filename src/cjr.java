import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjr extends ckw implements ckh {
   public static final float b = 0.03F;
   boolean cd;
   protected final cdc c;
   protected final ccz d;

   public cjr(bsx<? extends cjr> $$0, dcw $$1) {
      super($$0, $$1);
      this.bR = new cjr.d(this);
      this.a(ept.j, 0.0F);
      this.c = new cdc(this, $$1);
      this.d = new ccz(this, $$1);
   }

   public static buv.a s() {
      return ckw.gp().a(buw.B, 1.0);
   }

   @Override
   protected void t() {
      this.bU.a(1, new cjr.c(this, 1.0));
      this.bU.a(2, new cjr.f(this, 1.0, 40, 10.0F));
      this.bU.a(2, new cjr.a(this, 1.0, false));
      this.bU.a(5, new cjr.b(this, 1.0));
      this.bU.a(6, new cjr.e(this, 1.0, this.dP().z_()));
      this.bU.a(7, new cbj(this, 1.0));
      this.bV.a(1, new cce(this, cjr.class).a(cky.class));
      this.bV.a(2, new ccf<>(this, cmx.class, 10, true, false, this::j));
      this.bV.a(3, new ccf<>(this, cmf.class, false));
      this.bV.a(3, new ccf<>(this, cfq.class, true));
      this.bV.a(3, new ccf<>(this, cgq.class, true, false));
      this.bV.a(5, new ccf<>(this, cgf.class, 10, true, false, cgf.ca));
   }

   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bsy.b).e() && $$0.E_().i() < 0.03F) {
         this.a(bsy.b, new cuq(cut.vU));
         this.e(bsy.b);
      }

      return $$3;
   }

   public static boolean a(bsx<cjr> $$0, ddl $$1, btr $$2, jd $$3, ayw $$4) {
      if (!$$1.b_($$3.e()).a(awk.a) && !btr.a($$2)) {
         return false;
      } else {
         jm<ddw> $$5 = $$1.t($$3);
         boolean $$6 = $$1.al() != bqo.a && (btr.b($$2) || a($$1, $$3, $$4)) && (btr.a($$2) || $$1.b_($$3).a(awk.a));
         if ($$6 && btr.a($$2)) {
            return true;
         } else {
            return $$5.a(awd.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(dcx $$0, jd $$1) {
      return $$1.v() < $$0.z_() - 5;
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   protected avo v() {
      return this.bf() ? avp.hE : avp.hD;
   }

   @Override
   protected avo d(brk $$0) {
      return this.bf() ? avp.hI : avp.hH;
   }

   @Override
   protected avo n_() {
      return this.bf() ? avp.hG : avp.hF;
   }

   @Override
   protected avo gl() {
      return avp.hK;
   }

   @Override
   protected avo aQ() {
      return avp.hL;
   }

   @Override
   protected cuq gm() {
      return cuq.l;
   }

   @Override
   protected void a(ayw $$0, bqp $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bsy.a, new cuq(cut.vS));
         } else {
            this.a(bsy.a, new cuq(cut.qV));
         }
      }
   }

   @Override
   protected boolean b(cuq $$0, cuq $$1) {
      if ($$1.a(cut.vU)) {
         return false;
      } else if ($$1.a(cut.vS)) {
         return $$0.a(cut.vS) ? $$0.n() < $$1.n() : false;
      } else {
         return $$0.a(cut.vS) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gn() {
      return false;
   }

   @Override
   public boolean a(dcz $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable btn $$0) {
      return $$0 != null ? !this.dP().R() || $$0.bf() : false;
   }

   @Override
   public boolean cD() {
      return !this.cd();
   }

   boolean gv() {
      if (this.cd) {
         return true;
      } else {
         btn $$0 = this.p();
         return $$0 != null && $$0.bf();
      }
   }

   @Override
   public void a(exa $$0) {
      if (this.db() && this.bf() && this.gv()) {
         this.a(0.01F, $$0);
         this.a(bts.a, this.ds());
         this.i(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bl() {
      if (!this.dP().B) {
         if (this.dc() && this.bf() && this.gv()) {
            this.bT = this.c;
            this.i(true);
         } else {
            this.bT = this.d;
            this.i(false);
         }
      }
   }

   @Override
   public boolean ce() {
      return this.cd();
   }

   protected boolean go() {
      epq $$0 = this.N().j();
      if ($$0 != null) {
         jd $$1 = $$0.l();
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
   public void a(btn $$0, float $$1) {
      coc $$2 = new coc(this.dP(), this, new cuq(cut.vS));
      double $$3 = $$0.du() - this.du();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dw();
      double $$5 = $$0.dA() - this.dA();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dP().al().a() * 4));
      this.a(avp.hJ, 1.0F, 1.0F / (this.dS().i() * 0.4F + 0.8F));
      this.dP().b($$2);
   }

   public void w(boolean $$0) {
      this.cd = $$0;
   }

   static class a extends ccb {
      private final cjr b;

      public a(cjr $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b.j(this.b.p());
      }

      @Override
      public boolean c() {
         return super.c() && this.b.j(this.b.p());
      }
   }

   static class b extends caz {
      private final cjr g;

      public b(cjr $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.g.dP().R() && this.g.bf() && this.g.dw() >= (double)(this.g.dP().z_() - 3);
      }

      @Override
      public boolean c() {
         return super.c();
      }

      @Override
      protected boolean a(dcz $$0, jd $$1) {
         jd $$2 = $$1.d();
         return $$0.u($$2) && $$0.u($$2.d()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void d() {
         this.g.w(false);
         this.g.bT = this.g.d;
         super.d();
      }

      @Override
      public void e() {
         super.e();
      }
   }

   static class c extends cam {
      private final btw a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dcw f;

      public c(btw $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dP();
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.R()) {
            return false;
         } else if (this.a.bf()) {
            return false;
         } else {
            exa $$0 = this.h();
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
      public boolean c() {
         return !this.a.N().l();
      }

      @Override
      public void d() {
         this.a.N().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private exa h() {
         ayw $$0 = this.a.dS();
         jd $$1 = this.a.dp();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            jd $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dga.G)) {
               return exa.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bzp {
      private final cjr l;

      public d(cjr $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         btn $$0 = this.l.p();
         if (this.l.gv() && this.l.bf()) {
            if ($$0 != null && $$0.dw() > this.l.dw() || this.l.cd) {
               this.l.i(this.l.ds().b(0.0, 0.002, 0.0));
            }

            if (this.k != bzp.a.b || this.l.N().l()) {
               this.l.A(0.0F);
               return;
            }

            double $$1 = this.e - this.l.du();
            double $$2 = this.f - this.l.dw();
            double $$3 = this.g - this.l.dA();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(ayo.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.t(this.a(this.l.dF(), $$5, 90.0F));
            this.l.aY = this.l.dF();
            float $$6 = (float)(this.h * this.l.g(buw.v));
            float $$7 = ayo.i(0.125F, this.l.fk(), $$6);
            this.l.A($$7);
            this.l.i(this.l.ds().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aF()) {
               this.l.i(this.l.ds().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends cam {
      private final cjr a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cjr $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean b() {
         return !this.a.dP().R() && this.a.bf() && this.a.dw() < (double)(this.c - 2);
      }

      @Override
      public boolean c() {
         return this.b() && !this.d;
      }

      @Override
      public void a() {
         if (this.a.dw() < (double)(this.c - 1) && (this.a.N().l() || this.a.go())) {
            exa $$0 = cej.a(this.a, 4, 8, new exa(this.a.du(), (double)(this.c - 1), this.a.dA()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.N().a($$0.c, $$0.d, $$0.e, this.b);
         }
      }

      @Override
      public void d() {
         this.a.w(true);
         this.d = false;
      }

      @Override
      public void e() {
         this.a.w(false);
      }
   }

   static class f extends cbl {
      private final cjr a;

      public f(ckh $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cjr)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.eU().a(cut.vS);
      }

      @Override
      public void d() {
         super.d();
         this.a.v(true);
         this.a.c(bqq.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fy();
         this.a.v(false);
      }
   }
}
