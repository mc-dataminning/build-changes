import java.util.EnumSet;
import javax.annotation.Nullable;

public class cla extends cmf implements clq {
   public static final float b = 0.03F;
   boolean cb;
   protected final cej c;
   protected final ceg d;

   public cla(bug<? extends cla> $$0, dev $$1) {
      super($$0, $$1);
      this.bP = new cla.d(this);
      this.a(erv.j, 0.0F);
      this.c = new cej(this, $$1);
      this.d = new ceg(this, $$1);
   }

   public static bwc.a q() {
      return cmf.gy().a(bwd.B, 1.0);
   }

   @Override
   protected void t() {
      this.bS.a(1, new cla.c(this, 1.0));
      this.bS.a(2, new cla.f(this, 1.0, 40, 10.0F));
      this.bS.a(2, new cla.a(this, 1.0, false));
      this.bS.a(5, new cla.b(this, 1.0));
      this.bS.a(6, new cla.e(this, 1.0, this.dX().N()));
      this.bS.a(7, new ccq(this, 1.0));
      this.bT.a(1, new cdl(this, cla.class).a(cmh.class));
      this.bT.a(2, new cdm<>(this, coh.class, 10, true, false, this::j));
      this.bT.a(3, new cdm<>(this, cno.class, false));
      this.bT.a(3, new cdm<>(this, cgy.class, true));
      this.bT.a(3, new cdm<>(this, chy.class, true, false));
      this.bT.a(5, new cdm<>(this, chn.class, 10, true, false, chn.bY));
   }

   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(buh.b).f() && $$0.E_().i() < 0.03F) {
         this.a(buh.b, new cvx(cwb.vV));
         this.g(buh.b);
      }

      return $$3;
   }

   public static boolean a(bug<cla> $$0, dfl $$1, buf $$2, jg $$3, azr $$4) {
      if (!$$1.b_($$3.e()).a(axf.a) && !buf.a($$2)) {
         return false;
      } else {
         jp<dfw> $$5 = $$1.t($$3);
         boolean $$6 = $$1.am() != brv.a && (buf.b($$2) || a($$1, $$3, $$4)) && (buf.a($$2) || $$1.b_($$3).a(axf.a));
         if ($$6 && buf.a($$2)) {
            return true;
         } else {
            return $$5.a(awy.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(dew $$0, jg $$1) {
      return $$1.v() < $$0.N() - 5;
   }

   @Override
   protected awj w() {
      return this.bk() ? awk.hF : awk.hE;
   }

   @Override
   protected awj d(bsp $$0) {
      return this.bk() ? awk.hJ : awk.hI;
   }

   @Override
   protected awj o_() {
      return this.bk() ? awk.hH : awk.hG;
   }

   @Override
   protected awj y() {
      return awk.hL;
   }

   @Override
   protected awj aV() {
      return awk.hM;
   }

   @Override
   protected cvx gv() {
      return cvx.k;
   }

   @Override
   protected void a(azr $$0, brw $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(buh.a, new cvx(cwb.vU));
         } else {
            this.a(buh.a, new cvx(cwb.qW));
         }
      }
   }

   @Override
   protected boolean a(cvx $$0, cvx $$1, buh $$2) {
      if ($$1.a(cwb.vV)) {
         return false;
      } else if ($$1.a(cwb.vU)) {
         return $$0.a(cwb.vU) ? $$0.o() < $$1.o() : false;
      } else {
         return $$0.a(cwb.vU) ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean gw() {
      return false;
   }

   @Override
   public boolean a(dey $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable buv $$0) {
      return $$0 != null ? !this.dX().S() || $$0.bk() : false;
   }

   @Override
   public boolean cK() {
      return !this.cl();
   }

   boolean gE() {
      if (this.cb) {
         return true;
      } else {
         buv $$0 = this.m();
         return $$0 != null && $$0.bk();
      }
   }

   @Override
   public void a_(ezh $$0) {
      if (this.dj() && this.bp() && this.gE()) {
         this.a(0.01F, $$0);
         this.a(buz.a, this.dA());
         this.h(this.dA().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void bq() {
      if (!this.dX().C) {
         if (this.dk() && this.bp() && this.gE()) {
            this.bR = this.c;
            this.i(true);
         } else {
            this.bR = this.d;
            this.i(false);
         }
      }
   }

   @Override
   public boolean cm() {
      return this.cl();
   }

   protected boolean gx() {
      ers $$0 = this.P().k();
      if ($$0 != null) {
         jg $$1 = $$0.l();
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
   public void a(buv $$0, float $$1) {
      cvx $$2 = this.fb();
      cvx $$3 = $$2.a(cwb.vU) ? $$2 : new cvx(cwb.vU);
      cpo $$4 = new cpo(this.dX(), this, $$3);
      double $$5 = $$0.dC() - this.dC();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dE();
      double $$7 = $$0.dI() - this.dI();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dX() instanceof arm $$9) {
         cpb.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dX().am().a() * 4));
      }

      this.a(awk.hK, 1.0F, 1.0F / (this.ea().i() * 0.4F + 0.8F));
   }

   public void x(boolean $$0) {
      this.cb = $$0;
   }

   static class a extends cdi {
      private final cla b;

      public a(cla $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b.j(this.b.m());
      }

      @Override
      public boolean c() {
         return super.c() && this.b.j(this.b.m());
      }
   }

   static class b extends ccg {
      private final cla g;

      public b(cla $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.g.dX().S() && this.g.bk() && this.g.dE() >= (double)(this.g.dX().N() - 3);
      }

      @Override
      public boolean c() {
         return super.c();
      }

      @Override
      protected boolean a(dey $$0, jg $$1) {
         jg $$2 = $$1.d();
         return $$0.u($$2) && $$0.u($$2.d()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void d() {
         this.g.x(false);
         this.g.bR = this.g.d;
         super.d();
      }

      @Override
      public void e() {
         super.e();
      }
   }

   static class c extends cbt {
      private final bvd a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dev f;

      public c(bvd $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dX();
         this.a(EnumSet.of(cbt.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.S()) {
            return false;
         } else if (this.a.bk()) {
            return false;
         } else {
            ezh $$0 = this.h();
            if ($$0 == null) {
               return false;
            } else {
               this.b = $$0.d;
               this.c = $$0.e;
               this.d = $$0.f;
               return true;
            }
         }
      }

      @Override
      public boolean c() {
         return !this.a.P().m();
      }

      @Override
      public void d() {
         this.a.P().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private ezh h() {
         azr $$0 = this.a.ea();
         jg $$1 = this.a.dx();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            jg $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dia.G)) {
               return ezh.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends caw {
      private final cla l;

      public d(cla $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         buv $$0 = this.l.m();
         if (this.l.gE() && this.l.bk()) {
            if ($$0 != null && $$0.dE() > this.l.dE() || this.l.cb) {
               this.l.h(this.l.dA().b(0.0, 0.002, 0.0));
            }

            if (this.k != caw.a.b || this.l.P().m()) {
               this.l.C(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dC();
            double $$2 = this.f - this.l.dE();
            double $$3 = this.g - this.l.dI();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(azj.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.b(this.l.dN(), $$5, 90.0F));
            this.l.aU = this.l.dN();
            float $$6 = (float)(this.h * this.l.h(bwd.v));
            float $$7 = azj.h(0.125F, this.l.fr(), $$6);
            this.l.C($$7);
            this.l.h(this.l.dA().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aJ()) {
               this.l.h(this.l.dA().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends cbt {
      private final cla a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cla $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean b() {
         return !this.a.dX().S() && this.a.bk() && this.a.dE() < (double)(this.c - 2);
      }

      @Override
      public boolean c() {
         return this.b() && !this.d;
      }

      @Override
      public void a() {
         if (this.a.dE() < (double)(this.c - 1) && (this.a.P().m() || this.a.gx())) {
            ezh $$0 = cfq.a(this.a, 4, 8, new ezh(this.a.dC(), (double)(this.c - 1), this.a.dI()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.P().a($$0.d, $$0.e, $$0.f, this.b);
         }
      }

      @Override
      public void d() {
         this.a.x(true);
         this.d = false;
      }

      @Override
      public void e() {
         this.a.x(false);
      }
   }

   static class f extends ccs {
      private final cla a;

      public f(clq $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cla)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.fb().a(cwb.vU);
      }

      @Override
      public void d() {
         super.d();
         this.a.w(true);
         this.a.c(brx.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fH();
         this.a.w(false);
      }
   }
}
