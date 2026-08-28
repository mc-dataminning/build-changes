import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgd extends cfc {
   private static final ajv<jd> cb = ajz.a(cgd.class, ajx.o);
   private static final ajv<Boolean> cc = ajz.a(cgd.class, ajx.k);
   private static final ajv<Boolean> ce = ajz.a(cgd.class, ajx.k);
   private static final ajv<jd> cf = ajz.a(cgd.class, ajx.o);
   private static final ajv<Boolean> cg = ajz.a(cgd.class, ajx.k);
   private static final ajv<Boolean> ch = ajz.a(cgd.class, ajx.k);
   private static final float ci = 0.3F;
   private static final bst cj = bsw.bh.n().a(bss.a().a(bsr.a, 0.0F, bsw.bh.m(), -0.25F)).a(0.3F);
   int ck;
   public static final Predicate<btl> ca = $$0 -> $$0.o_() && !$$0.bf();

   public cgd(bsw<? extends cgd> $$0, dcu $$1) {
      super($$0, $$1);
      this.a(epp.j, 0.0F);
      this.a(epp.t, -1.0F);
      this.a(epp.s, -1.0F);
      this.a(epp.r, -1.0F);
      this.bR = new cgd.e(this);
   }

   public void g(jd $$0) {
      this.ao.a(cb, $$0);
   }

   jd gm() {
      return this.ao.a(cb);
   }

   void h(jd $$0) {
      this.ao.a(cf, $$0);
   }

   jd gn() {
      return this.ao.a(cf);
   }

   public boolean s() {
      return this.ao.a(cc);
   }

   void w(boolean $$0) {
      this.ao.a(cc, $$0);
   }

   public boolean t() {
      return this.ao.a(ce);
   }

   void x(boolean $$0) {
      this.ck = $$0 ? 1 : 0;
      this.ao.a(ce, $$0);
   }

   boolean go() {
      return this.ao.a(cg);
   }

   void y(boolean $$0) {
      this.ao.a(cg, $$0);
   }

   boolean gp() {
      return this.ao.a(ch);
   }

   void z(boolean $$0) {
      this.ao.a(ch, $$0);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(cb, jd.c);
      $$0.a(cc, false);
      $$0.a(cf, jd.c);
      $$0.a(cg, false);
      $$0.a(ch, false);
      $$0.a(ce, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gm().u());
      $$0.a("HomePosY", this.gm().v());
      $$0.a("HomePosZ", this.gm().w());
      $$0.a("HasEgg", this.s());
      $$0.a("TravelPosX", this.gn().u());
      $$0.a("TravelPosY", this.gn().v());
      $$0.a("TravelPosZ", this.gn().w());
   }

   @Override
   public void a(ua $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.g(new jd($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.h(new jd($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      this.g(this.dq());
      this.h(jd.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bsw<cgd> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      return $$3.v() < $$1.z_() + 4 && dop.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void z() {
      this.bU.a(0, new cgd.f(this, 1.2));
      this.bU.a(1, new cgd.a(this, 1.0));
      this.bU.a(1, new cgd.d(this, 1.0));
      this.bU.a(2, new cbs(this, 1.1, $$0 -> $$0.a(awm.av), false));
      this.bU.a(3, new cgd.c(this, 1.0));
      this.bU.a(4, new cgd.b(this, 1.0));
      this.bU.a(7, new cgd.i(this, 1.0));
      this.bU.a(8, new cas(this, cmv.class, 8.0F));
      this.bU.a(9, new cgd.h(this, 1.0, 100));
   }

   public static but.a x() {
      return btn.A().a(buu.s, 30.0).a(buu.v, 0.25).a(buu.B, 1.0);
   }

   @Override
   public boolean cD() {
      return false;
   }

   @Override
   public int P() {
      return 200;
   }

   @Nullable
   @Override
   protected avn v() {
      return !this.bf() && this.aF() && !this.o_() ? avo.Af : super.v();
   }

   @Override
   protected void f(float $$0) {
      super.f($$0 * 1.5F);
   }

   @Override
   protected avn aQ() {
      return avo.Aq;
   }

   @Nullable
   @Override
   protected avn d(brj $$0) {
      return this.o_() ? avo.Am : avo.Al;
   }

   @Nullable
   @Override
   protected avn n_() {
      return this.o_() ? avo.Ah : avo.Ag;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      avn $$2 = this.o_() ? avo.Ap : avo.Ao;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gr() {
      return super.gr() && !this.s();
   }

   @Override
   protected float aP() {
      return this.aa + 0.15F;
   }

   @Override
   public float eb() {
      return this.o_() ? 0.3F : 1.0F;
   }

   @Override
   protected ccy b(dcu $$0) {
      return new cgd.g(this, $$0);
   }

   @Nullable
   @Override
   public bsk a(aqt $$0, bsk $$1) {
      return bsw.bh.a((dcu)$$0);
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awm.av);
   }

   @Override
   public float a(jd $$0, dcx $$1) {
      if (!this.go() && $$1.b_($$0).a(awj.a)) {
         return 10.0F;
      } else {
         return dop.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void m_() {
      super.m_();
      if (this.bE() && this.t() && this.ck >= 1 && this.ck % 5 == 0) {
         jd $$0 = this.dq();
         if (dop.a(this.dQ(), $$0)) {
            this.dQ().c(2001, $$0, dfw.i(this.dQ().a_($$0.d())));
            this.a(dxw.u);
         }
      }
   }

   @Override
   protected void k() {
      super.k();
      if (!this.o_() && this.dQ().ab().b(dcq.f)) {
         this.a(cur.op, 1);
      }
   }

   @Override
   public void a(eww $$0) {
      if (this.db() && this.bf()) {
         this.a(0.1F, $$0);
         this.a(btq.a, this.dt());
         this.i(this.dt().a(0.9));
         if (this.p() == null && (!this.go() || !this.gm().a(this.do(), 20.0))) {
            this.i(this.dt().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cmv $$0) {
      return false;
   }

   @Override
   public void a(aqt $$0, btk $$1) {
      this.a(this.dR().c(), Float.MAX_VALUE);
   }

   @Override
   public bst e(bty $$0) {
      return this.o_() ? cj : super.e($$0);
   }

   static class a extends bzw {
      private final cgd d;

      a(cgd $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.s();
      }

      @Override
      protected void g() {
         aqu $$0 = this.a.gt();
         if ($$0 == null && this.c.gt() != null) {
            $$0 = this.c.gt();
         }

         if ($$0 != null) {
            $$0.a(avy.P);
            an.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gv();
         this.c.gv();
         ayv $$1 = this.a.dT();
         if (this.b.ab().b(dcq.f)) {
            this.b.b(new btb(this.b, this.a.dv(), this.a.dx(), this.a.dB(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends cak {
      private final cgd a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(cgd $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         if (this.a.o_()) {
            return false;
         } else if (this.a.s()) {
            return true;
         } else {
            return this.a.dT().a(b(700)) != 0 ? false : !this.a.gm().a(this.a.do(), 64.0);
         }
      }

      @Override
      public void d() {
         this.a.y(true);
         this.c = false;
         this.d = 0;
      }

      @Override
      public void e() {
         this.a.y(false);
      }

      @Override
      public boolean c() {
         return !this.a.gm().a(this.a.do(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void a() {
         jd $$0 = this.a.gm();
         boolean $$1 = $$0.a(this.a.do(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.J().l()) {
            eww $$2 = eww.c($$0);
            eww $$3 = ceh.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = ceh.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dQ().a_(jd.a((jw)$$3)).a(dfy.G)) {
               $$3 = ceh.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.J().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends cax {
      private static final int g = 1200;
      private final cgd h;

      c(cgd $$0, double $$1) {
         super($$0, $$0.o_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean c() {
         return !this.h.bf() && this.d <= 1200 && this.a(this.h.dQ(), this.e);
      }

      @Override
      public boolean b() {
         if (this.h.o_() && !this.h.bf()) {
            return super.b();
         } else {
            return !this.h.go() && !this.h.bf() && !this.h.s() ? super.b() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dcx $$0, jd $$1) {
         return $$0.a_($$1).a(dfy.G);
      }
   }

   static class d extends cax {
      private final cgd g;

      d(cgd $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return this.g.s() && this.g.gm().a(this.g.do(), 9.0) ? super.b() : false;
      }

      @Override
      public boolean c() {
         return super.c() && this.g.s() && this.g.gm().a(this.g.do(), 9.0);
      }

      @Override
      public void a() {
         super.a();
         jd $$0 = this.g.dq();
         if (!this.g.bf() && this.m()) {
            if (this.g.ck < 1) {
               this.g.x(true);
            } else if (this.g.ck > this.a(200)) {
               dcu $$1 = this.g.dQ();
               $$1.a(null, $$0, avo.An, avp.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               jd $$2 = this.e.c();
               dta $$3 = dfy.mf.o().a(dop.f, Integer.valueOf(this.g.ah.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dxw.i, $$2, dxw.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.s(600);
            }

            if (this.g.t()) {
               this.g.ck++;
            }
         }
      }

      @Override
      protected boolean a(dcx $$0, jd $$1) {
         return !$$0.u($$1.c()) ? false : dop.b($$0, $$1);
      }
   }

   static class e extends bzn {
      private final cgd l;

      e(cgd $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bf()) {
            this.l.i(this.l.dt().b(0.0, 0.005, 0.0));
            if (!this.l.gm().a(this.l.do(), 16.0)) {
               this.l.z(Math.max(this.l.fk() / 2.0F, 0.08F));
            }

            if (this.l.o_()) {
               this.l.z(Math.max(this.l.fk() / 3.0F, 0.06F));
            }
         } else if (this.l.aF()) {
            this.l.z(Math.max(this.l.fk() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == bzn.a.b && !this.l.J().l()) {
            double $$0 = this.e - this.l.dv();
            double $$1 = this.f - this.l.dx();
            double $$2 = this.g - this.l.dB();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.z(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(ayn.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.s(this.a(this.l.dG(), $$4, 90.0F));
               this.l.aY = this.l.dG();
               float $$5 = (float)(this.h * this.l.g(buu.v));
               this.l.z(ayn.i(0.125F, this.l.fk(), $$5));
               this.l.i(this.l.dt().b(0.0, (double)this.l.fk() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.z(0.0F);
         }
      }
   }

   static class f extends cbd {
      f(cgd $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b() {
         if (!this.h()) {
            return false;
         } else {
            jd $$0 = this.a(this.c.dQ(), this.c, 7);
            if ($$0 != null) {
               this.e = (double)$$0.u();
               this.f = (double)$$0.v();
               this.g = (double)$$0.w();
               return true;
            } else {
               return this.i();
            }
         }
      }
   }

   static class g extends ccv {
      g(cgd $$0, dcu $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(jd $$0) {
         if (this.a instanceof cgd $$1 && $$1.gp()) {
            return this.b.a_($$0).a(dfy.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends cbh {
      private final cgd i;

      h(cgd $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.b.bf() && !this.i.go() && !this.i.s() ? super.b() : false;
      }
   }

   static class i extends cak {
      private final cgd a;
      private final double b;
      private boolean c;

      i(cgd $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         return !this.a.go() && !this.a.s() && this.a.bf();
      }

      @Override
      public void d() {
         int $$0 = 512;
         int $$1 = 4;
         ayv $$2 = this.a.ah;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dx() > (double)(this.a.dQ().z_() - 1)) {
            $$4 = 0;
         }

         jd $$6 = jd.a((double)$$3 + this.a.dv(), (double)$$4 + this.a.dx(), (double)$$5 + this.a.dB());
         this.a.h($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void a() {
         if (this.a.J().l()) {
            eww $$0 = eww.c(this.a.gn());
            eww $$1 = ceh.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = ceh.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = ayn.a($$1.c);
               int $$3 = ayn.a($$1.e);
               int $$4 = 34;
               if (!this.a.dQ().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                  $$1 = null;
               }
            }

            if ($$1 == null) {
               this.c = true;
               return;
            }

            this.a.J().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      @Override
      public boolean c() {
         return !this.a.J().l() && !this.c && !this.a.go() && !this.a.gu() && !this.a.s();
      }

      @Override
      public void e() {
         this.a.z(false);
         super.e();
      }
   }
}
