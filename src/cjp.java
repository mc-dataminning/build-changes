import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjp extends cku implements ckf {
   public static final float b = 0.03F;
   boolean cd;
   protected final cda c;
   protected final ccx d;

   public cjp(bsw<? extends cjp> $$0, dcu $$1) {
      super($$0, $$1);
      this.bR = new cjp.d(this);
      this.a(epp.j, 0.0F);
      this.c = new cda(this, $$1);
      this.d = new ccx(this, $$1);
   }

   public static but.a s() {
      return cku.gq().a(buu.B, 1.0);
   }

   @Override
   protected void t() {
      this.bU.a(1, new cjp.c(this, 1.0));
      this.bU.a(2, new cjp.f(this, 1.0, 40, 10.0F));
      this.bU.a(2, new cjp.a(this, 1.0, false));
      this.bU.a(5, new cjp.b(this, 1.0));
      this.bU.a(6, new cjp.e(this, 1.0, this.dQ().z_()));
      this.bU.a(7, new cbh(this, 1.0));
      this.bV.a(1, new ccc(this, cjp.class).a(ckw.class));
      this.bV.a(2, new ccd<>(this, cmv.class, 10, true, false, this::j));
      this.bV.a(3, new ccd<>(this, cmd.class, false));
      this.bV.a(3, new ccd<>(this, cfo.class, true));
      this.bV.a(3, new ccd<>(this, cgo.class, true, false));
      this.bV.a(5, new ccd<>(this, cgd.class, 10, true, false, cgd.ca));
   }

   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bsx.b).e() && $$0.E_().i() < 0.03F) {
         this.a(bsx.b, new cuo(cur.vU));
         this.e(bsx.b);
      }

      return $$3;
   }

   public static boolean a(bsw<cjp> $$0, ddj $$1, btp $$2, jd $$3, ayv $$4) {
      if (!$$1.b_($$3.d()).a(awj.a) && !btp.a($$2)) {
         return false;
      } else {
         jm<ddu> $$5 = $$1.t($$3);
         boolean $$6 = $$1.al() != bqn.a && (btp.b($$2) || a($$1, $$3, $$4)) && (btp.a($$2) || $$1.b_($$3).a(awj.a));
         if ($$6 && btp.a($$2)) {
            return true;
         } else {
            return $$5.a(awc.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(dcv $$0, jd $$1) {
      return $$1.v() < $$0.z_() - 5;
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   protected avn v() {
      return this.bf() ? avo.hE : avo.hD;
   }

   @Override
   protected avn d(brj $$0) {
      return this.bf() ? avo.hI : avo.hH;
   }

   @Override
   protected avn n_() {
      return this.bf() ? avo.hG : avo.hF;
   }

   @Override
   protected avn gm() {
      return avo.hK;
   }

   @Override
   protected avn aQ() {
      return avo.hL;
   }

   @Override
   protected cuo gn() {
      return cuo.l;
   }

   @Override
   protected void a(ayv $$0, bqo $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bsx.a, new cuo(cur.vS));
         } else {
            this.a(bsx.a, new cuo(cur.qV));
         }
      }
   }

   @Override
   protected boolean b(cuo $$0, cuo $$1) {
      if ($$1.a(cur.vU)) {
         return false;
      } else if ($$1.a(cur.vS)) {
         return $$0.a(cur.vS) ? $$0.n() < $$1.n() : false;
      } else {
         return $$0.a(cur.vS) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean go() {
      return false;
   }

   @Override
   public boolean a(dcx $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable btl $$0) {
      return $$0 != null ? !this.dQ().R() || $$0.bf() : false;
   }

   @Override
   public boolean cD() {
      return !this.cd();
   }

   boolean gw() {
      if (this.cd) {
         return true;
      } else {
         btl $$0 = this.p();
         return $$0 != null && $$0.bf();
      }
   }

   @Override
   public void a(eww $$0) {
      if (this.db() && this.bf() && this.gw()) {
         this.a(0.01F, $$0);
         this.a(btq.a, this.dt());
         this.i(this.dt().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bl() {
      if (!this.dQ().B) {
         if (this.dc() && this.bf() && this.gw()) {
            this.bT = this.c;
            this.j(true);
         } else {
            this.bT = this.d;
            this.j(false);
         }
      }
   }

   @Override
   public boolean ce() {
      return this.cd();
   }

   protected boolean gp() {
      epm $$0 = this.J().j();
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
   public void a(btl $$0, float $$1) {
      coa $$2 = new coa(this.dQ(), this, new cuo(cur.vS));
      double $$3 = $$0.dv() - this.dv();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dx();
      double $$5 = $$0.dB() - this.dB();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dQ().al().a() * 4));
      this.a(avo.hJ, 1.0F, 1.0F / (this.dT().i() * 0.4F + 0.8F));
      this.dQ().b($$2);
   }

   public void w(boolean $$0) {
      this.cd = $$0;
   }

   static class a extends cbz {
      private final cjp b;

      public a(cjp $$0, double $$1, boolean $$2) {
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

   static class b extends cax {
      private final cjp g;

      public b(cjp $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.g.dQ().R() && this.g.bf() && this.g.dx() >= (double)(this.g.dQ().z_() - 3);
      }

      @Override
      public boolean c() {
         return super.c();
      }

      @Override
      protected boolean a(dcx $$0, jd $$1) {
         jd $$2 = $$1.c();
         return $$0.u($$2) && $$0.u($$2.c()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
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

   static class c extends cak {
      private final btu a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dcu f;

      public c(btu $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dQ();
         this.a(EnumSet.of(cak.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.R()) {
            return false;
         } else if (this.a.bf()) {
            return false;
         } else {
            eww $$0 = this.h();
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
         return !this.a.J().l();
      }

      @Override
      public void d() {
         this.a.J().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private eww h() {
         ayv $$0 = this.a.dT();
         jd $$1 = this.a.dq();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            jd $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dfy.G)) {
               return eww.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bzn {
      private final cjp l;

      public d(cjp $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         btl $$0 = this.l.p();
         if (this.l.gw() && this.l.bf()) {
            if ($$0 != null && $$0.dx() > this.l.dx() || this.l.cd) {
               this.l.i(this.l.dt().b(0.0, 0.002, 0.0));
            }

            if (this.k != bzn.a.b || this.l.J().l()) {
               this.l.z(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dv();
            double $$2 = this.f - this.l.dx();
            double $$3 = this.g - this.l.dB();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(ayn.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.s(this.a(this.l.dG(), $$5, 90.0F));
            this.l.aY = this.l.dG();
            float $$6 = (float)(this.h * this.l.g(buu.v));
            float $$7 = ayn.i(0.125F, this.l.fk(), $$6);
            this.l.z($$7);
            this.l.i(this.l.dt().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aF()) {
               this.l.i(this.l.dt().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends cak {
      private final cjp a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cjp $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean b() {
         return !this.a.dQ().R() && this.a.bf() && this.a.dx() < (double)(this.c - 2);
      }

      @Override
      public boolean c() {
         return this.b() && !this.d;
      }

      @Override
      public void a() {
         if (this.a.dx() < (double)(this.c - 1) && (this.a.J().l() || this.a.gp())) {
            eww $$0 = ceh.a(this.a, 4, 8, new eww(this.a.dv(), (double)(this.c - 1), this.a.dB()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.J().a($$0.c, $$0.d, $$0.e, this.b);
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

   static class f extends cbj {
      private final cjp a;

      public f(ckf $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cjp)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.eU().a(cur.vS);
      }

      @Override
      public void d() {
         super.d();
         this.a.v(true);
         this.a.c(bqp.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fy();
         this.a.v(false);
      }
   }
}
