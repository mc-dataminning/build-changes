import java.util.EnumSet;
import javax.annotation.Nullable;

public class byy extends cad implements bzo {
   public static final float b = 0.03F;
   boolean bX;
   protected final bst c;
   protected final bsq d;

   public byy(biw<? extends byy> $$0, cpx $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bL = new byy.d(this);
      this.a(eaz.j, 0.0F);
      this.c = new bst(this, $$1);
      this.d = new bsq(this, $$1);
   }

   @Override
   protected void s() {
      this.bO.a(1, new byy.c(this, 1.0));
      this.bO.a(2, new byy.f(this, 1.0, 40, 10.0F));
      this.bO.a(2, new byy.a(this, 1.0, false));
      this.bO.a(5, new byy.b(this, 1.0));
      this.bO.a(6, new byy.e(this, 1.0, this.dL().y_()));
      this.bO.a(7, new bra(this, 1.0));
      this.bP.a(1, new brv(this, byy.class).a(caf.class));
      this.bP.a(2, new brw<>(this, cbw.class, 10, true, false, this::j));
      this.bP.a(3, new brw<>(this, cbe.class, false));
      this.bP.a(3, new brw<>(this, bvf.class, true));
      this.bP.a(3, new brw<>(this, bwa.class, true, false));
      this.bP.a(5, new brw<>(this, bvu.class, 10, true, false, bvu.bU));
   }

   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if (this.c(bix.b).b() && $$0.D_().i() < 0.03F) {
         this.a(bix.b, new cjh(cjk.uX));
         this.e(bix.b);
      }

      return $$3;
   }

   public static boolean a(biw<byy> $$0, cqm $$1, bjm $$2, gw $$3, ase $$4) {
      if (!$$1.b_($$3.d()).a(apz.a)) {
         return false;
      } else {
         hg<cqv> $$5 = $$1.s($$3);
         boolean $$6 = $$1.ai() != bgx.a && a($$1, $$3, $$4) && ($$2 == bjm.c || $$1.b_($$3).a(apz.a));
         return $$5.a(apt.ao) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
      }
   }

   private static boolean a(cpy $$0, gw $$1) {
      return $$1.v() < $$0.y_() - 5;
   }

   @Override
   protected boolean t() {
      return false;
   }

   @Override
   protected ape w() {
      return this.aX() ? apf.gx : apf.gw;
   }

   @Override
   protected ape d(bhq $$0) {
      return this.aX() ? apf.gB : apf.gA;
   }

   @Override
   protected ape l_() {
      return this.aX() ? apf.gz : apf.gy;
   }

   @Override
   protected ape y() {
      return apf.gD;
   }

   @Override
   protected ape aL() {
      return apf.gE;
   }

   @Override
   protected cjh gd() {
      return cjh.b;
   }

   @Override
   protected void a(ase $$0, bgy $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bix.a, new cjh(cjk.uV));
         } else {
            this.a(bix.a, new cjh(cjk.qh));
         }
      }
   }

   @Override
   protected boolean b(cjh $$0, cjh $$1) {
      if ($$1.a(cjk.uX)) {
         return false;
      } else if ($$1.a(cjk.uV)) {
         return $$0.a(cjk.uV) ? $$0.k() < $$1.k() : false;
      } else {
         return $$0.a(cjk.uV) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean ge() {
      return false;
   }

   @Override
   public boolean a(cqa $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bji $$0) {
      return $$0 != null ? !this.dL().N() || $$0.aX() : false;
   }

   @Override
   public boolean cy() {
      return !this.bY();
   }

   boolean gn() {
      if (this.bX) {
         return true;
      } else {
         bji $$0 = this.q();
         return $$0 != null && $$0.aX();
      }
   }

   @Override
   public void h(ehp $$0) {
      if (this.cW() && this.aX() && this.gn()) {
         this.a(0.01F, $$0);
         this.a(bjo.a, this.do());
         this.f(this.do().a(0.9));
      } else {
         super.h($$0);
      }
   }

   @Override
   public void bd() {
      if (!this.dL().B) {
         if (this.cX() && this.aX() && this.gn()) {
            this.bN = this.c;
            this.h(true);
         } else {
            this.bN = this.d;
            this.h(false);
         }
      }
   }

   @Override
   public boolean bZ() {
      return this.bY();
   }

   protected boolean gf() {
      ebd $$0 = this.L().j();
      if ($$0 != null) {
         gw $$1 = $$0.l();
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
   public void a(bji $$0, float $$1) {
      cda $$2 = new cda(this.dL(), this, new cjh(cjk.uV));
      double $$3 = $$0.dq() - this.dq();
      double $$4 = $$0.e(0.3333333333333333) - $$2.ds();
      double $$5 = $$0.dw() - this.dw();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dL().ai().a() * 4));
      this.a(apf.gC, 1.0F, 1.0F / (this.ef().i() * 0.4F + 0.8F));
      this.dL().b($$2);
   }

   public void w(boolean $$0) {
      this.bX = $$0;
   }

   static class a extends brs {
      private final byy b;

      public a(byy $$0, double $$1, boolean $$2) {
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

   static class b extends bqq {
      private final byy g;

      public b(byy $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dL().N() && this.g.aX() && this.g.ds() >= (double)(this.g.dL().y_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(cqa $$0, gw $$1) {
         gw $$2 = $$1.c();
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

   static class c extends bqd {
      private final bjr a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final cpx f;

      public c(bjr $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dL();
         this.a(EnumSet.of(bqd.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.N()) {
            return false;
         } else if (this.a.aX()) {
            return false;
         } else {
            ehp $$0 = this.h();
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
         return !this.a.L().l();
      }

      @Override
      public void c() {
         this.a.L().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private ehp h() {
         ase $$0 = this.a.ef();
         gw $$1 = this.a.dl();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            gw $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(csy.G)) {
               return ehp.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bpg {
      private final byy l;

      public d(byy $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bji $$0 = this.l.q();
         if (this.l.gn() && this.l.aX()) {
            if ($$0 != null && $$0.ds() > this.l.ds() || this.l.bX) {
               this.l.f(this.l.do().b(0.0, 0.002, 0.0));
            }

            if (this.k != bpg.a.b || this.l.L().l()) {
               this.l.w(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dq();
            double $$2 = this.f - this.l.ds();
            double $$3 = this.g - this.l.dw();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(ary.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dB(), $$5, 90.0F));
            this.l.aU = this.l.dB();
            float $$6 = (float)(this.h * this.l.b(bko.d));
            float $$7 = ary.i(0.125F, this.l.fe(), $$6);
            this.l.w($$7);
            this.l.f(this.l.do().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aA()) {
               this.l.f(this.l.do().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends bqd {
      private final byy a;
      private final double b;
      private final int c;
      private boolean d;

      public e(byy $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dL().N() && this.a.aX() && this.a.ds() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.ds() < (double)(this.c - 1) && (this.a.L().l() || this.a.gf())) {
            ehp $$0 = bty.a(this.a, 4, 8, new ehp(this.a.dq(), (double)(this.c - 1), this.a.dw()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.L().a($$0.c, $$0.d, $$0.e, this.b);
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

   static class f extends brc {
      private final byy a;

      public f(bzo $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (byy)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eS().a(cjk.uV);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bgz.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fs();
         this.a.v(false);
      }
   }
}
