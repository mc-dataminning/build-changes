import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgf extends cfe {
   private static final ajw<jd> cb = aka.a(cgf.class, ajy.o);
   private static final ajw<Boolean> cc = aka.a(cgf.class, ajy.k);
   private static final ajw<Boolean> ce = aka.a(cgf.class, ajy.k);
   private static final ajw<jd> cf = aka.a(cgf.class, ajy.o);
   private static final ajw<Boolean> cg = aka.a(cgf.class, ajy.k);
   private static final ajw<Boolean> ch = aka.a(cgf.class, ajy.k);
   private static final float ci = 0.3F;
   private static final bsu cj = bsx.bh.n().a(bst.a().a(bss.a, 0.0F, bsx.bh.m(), -0.25F)).a(0.3F);
   int ck;
   public static final Predicate<btn> ca = $$0 -> $$0.o_() && !$$0.bf();

   public cgf(bsx<? extends cgf> $$0, dcw $$1) {
      super($$0, $$1);
      this.a(epv.j, 0.0F);
      this.a(epv.t, -1.0F);
      this.a(epv.s, -1.0F);
      this.a(epv.r, -1.0F);
      this.bR = new cgf.e(this);
   }

   public void h(jd $$0) {
      this.ao.a(cb, $$0);
   }

   jd gk() {
      return this.ao.a(cb);
   }

   void i(jd $$0) {
      this.ao.a(cf, $$0);
   }

   jd gl() {
      return this.ao.a(cf);
   }

   public boolean s() {
      return this.ao.a(cc);
   }

   void x(boolean $$0) {
      this.ao.a(cc, $$0);
   }

   public boolean t() {
      return this.ao.a(ce);
   }

   void y(boolean $$0) {
      this.ck = $$0 ? 1 : 0;
      this.ao.a(ce, $$0);
   }

   boolean gm() {
      return this.ao.a(cg);
   }

   void z(boolean $$0) {
      this.ao.a(cg, $$0);
   }

   boolean gn() {
      return this.ao.a(ch);
   }

   void A(boolean $$0) {
      this.ao.a(ch, $$0);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cb, jd.c);
      $$0.a(cc, false);
      $$0.a(cf, jd.c);
      $$0.a(cg, false);
      $$0.a(ch, false);
      $$0.a(ce, false);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gk().u());
      $$0.a("HomePosY", this.gk().v());
      $$0.a("HomePosZ", this.gk().w());
      $$0.a("HasEgg", this.s());
      $$0.a("TravelPosX", this.gl().u());
      $$0.a("TravelPosY", this.gl().v());
      $$0.a("TravelPosZ", this.gl().w());
   }

   @Override
   public void a(ub $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.h(new jd($$1, $$2, $$3));
      super.a($$0);
      this.x($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.i(new jd($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      this.h(this.do());
      this.i(jd.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bsx<cgf> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return $$3.v() < $$1.z_() + 4 && dor.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void B() {
      this.bU.a(0, new cgf.f(this, 1.2));
      this.bU.a(1, new cgf.a(this, 1.0));
      this.bU.a(1, new cgf.d(this, 1.0));
      this.bU.a(2, new cbu(this, 1.1, $$0 -> $$0.a(awn.av), false));
      this.bU.a(3, new cgf.c(this, 1.0));
      this.bU.a(4, new cgf.b(this, 1.0));
      this.bU.a(7, new cgf.i(this, 1.0));
      this.bU.a(8, new cau(this, cmx.class, 8.0F));
      this.bU.a(9, new cgf.h(this, 1.0, 100));
   }

   public static buv.a x() {
      return btp.C().a(buw.s, 30.0).a(buw.v, 0.25).a(buw.B, 1.0);
   }

   @Override
   public boolean cC() {
      return false;
   }

   @Override
   public int R() {
      return 200;
   }

   @Nullable
   @Override
   protected avo v() {
      return !this.bf() && this.aF() && !this.o_() ? avp.Af : super.v();
   }

   @Override
   protected void f(float $$0) {
      super.f($$0 * 1.5F);
   }

   @Override
   protected avo aQ() {
      return avp.Aq;
   }

   @Nullable
   @Override
   protected avo d(brk $$0) {
      return this.o_() ? avp.Am : avp.Al;
   }

   @Nullable
   @Override
   protected avo n_() {
      return this.o_() ? avp.Ah : avp.Ag;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      avo $$2 = this.o_() ? avp.Ap : avp.Ao;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gp() {
      return super.gp() && !this.s();
   }

   @Override
   protected float aP() {
      return this.aa + 0.15F;
   }

   @Override
   public float ea() {
      return this.o_() ? 0.3F : 1.0F;
   }

   @Override
   protected cda b(dcw $$0) {
      return new cgf.g(this, $$0);
   }

   @Nullable
   @Override
   public bsl a(aqu $$0, bsl $$1) {
      return bsx.bh.a((dcw)$$0);
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.av);
   }

   @Override
   public float a(jd $$0, dcz $$1) {
      if (!this.gm() && $$1.b_($$0).a(awk.a)) {
         return 10.0F;
      } else {
         return dor.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void m_() {
      super.m_();
      if (this.bE() && this.t() && this.ck >= 1 && this.ck % 5 == 0) {
         jd $$0 = this.do();
         if (dor.a(this.dO(), $$0)) {
            this.dO().c(2001, $$0, dfy.i(this.dO().a_($$0.e())));
            this.a(dxz.u);
         }
      }
   }

   @Override
   protected void k() {
      super.k();
      if (!this.o_() && this.dO().ab().b(dcs.f)) {
         this.a(cut.op, 1);
      }
   }

   @Override
   public void a(exc $$0) {
      if (this.da() && this.bf()) {
         this.a(0.1F, $$0);
         this.a(bts.a, this.dr());
         this.i(this.dr().a(0.9));
         if (this.p() == null && (!this.gm() || !this.gk().a(this.dm(), 20.0))) {
            this.i(this.dr().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean y() {
      return false;
   }

   @Override
   public void a(aqu $$0, btm $$1) {
      this.a(this.dP().c(), Float.MAX_VALUE);
   }

   @Override
   public bsu e(bua $$0) {
      return this.o_() ? cj : super.e($$0);
   }

   static class a extends bzy {
      private final cgf d;

      a(cgf $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.s();
      }

      @Override
      protected void g() {
         aqv $$0 = this.a.gr();
         if ($$0 == null && this.c.gr() != null) {
            $$0 = this.c.gr();
         }

         if ($$0 != null) {
            $$0.a(avz.P);
            an.p.a($$0, this.a, this.c, null);
         }

         this.d.x(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gt();
         this.c.gt();
         ayw $$1 = this.a.dR();
         if (this.b.ab().b(dcs.f)) {
            this.b.b(new btc(this.b, this.a.dt(), this.a.dv(), this.a.dz(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends cam {
      private final cgf a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(cgf $$0, double $$1) {
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
            return this.a.dR().a(b(700)) != 0 ? false : !this.a.gk().a(this.a.dm(), 64.0);
         }
      }

      @Override
      public void d() {
         this.a.z(true);
         this.c = false;
         this.d = 0;
      }

      @Override
      public void e() {
         this.a.z(false);
      }

      @Override
      public boolean c() {
         return !this.a.gk().a(this.a.dm(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void a() {
         jd $$0 = this.a.gk();
         boolean $$1 = $$0.a(this.a.dm(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.N().l()) {
            exc $$2 = exc.c($$0);
            exc $$3 = cej.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cej.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dO().a_(jd.a((jw)$$3)).a(dga.G)) {
               $$3 = cej.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.N().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends caz {
      private static final int g = 1200;
      private final cgf h;

      c(cgf $$0, double $$1) {
         super($$0, $$0.o_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean c() {
         return !this.h.bf() && this.d <= 1200 && this.a(this.h.dO(), this.e);
      }

      @Override
      public boolean b() {
         if (this.h.o_() && !this.h.bf()) {
            return super.b();
         } else {
            return !this.h.gm() && !this.h.bf() && !this.h.s() ? super.b() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dcz $$0, jd $$1) {
         return $$0.a_($$1).a(dga.G);
      }
   }

   static class d extends caz {
      private final cgf g;

      d(cgf $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return this.g.s() && this.g.gk().a(this.g.dm(), 9.0) ? super.b() : false;
      }

      @Override
      public boolean c() {
         return super.c() && this.g.s() && this.g.gk().a(this.g.dm(), 9.0);
      }

      @Override
      public void a() {
         super.a();
         jd $$0 = this.g.do();
         if (!this.g.bf() && this.m()) {
            if (this.g.ck < 1) {
               this.g.y(true);
            } else if (this.g.ck > this.a(200)) {
               dcw $$1 = this.g.dO();
               $$1.a(null, $$0, avp.An, avq.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               jd $$2 = this.e.d();
               dtc $$3 = dga.mf.o().a(dor.f, Integer.valueOf(this.g.ah.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dxz.i, $$2, dxz.a.a(this.g, $$3));
               this.g.x(false);
               this.g.y(false);
               this.g.s(600);
            }

            if (this.g.t()) {
               this.g.ck++;
            }
         }
      }

      @Override
      protected boolean a(dcz $$0, jd $$1) {
         return !$$0.u($$1.d()) ? false : dor.b($$0, $$1);
      }
   }

   static class e extends bzp {
      private final cgf l;

      e(cgf $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bf()) {
            this.l.i(this.l.dr().b(0.0, 0.005, 0.0));
            if (!this.l.gk().a(this.l.dm(), 16.0)) {
               this.l.A(Math.max(this.l.fj() / 2.0F, 0.08F));
            }

            if (this.l.o_()) {
               this.l.A(Math.max(this.l.fj() / 3.0F, 0.06F));
            }
         } else if (this.l.aF()) {
            this.l.A(Math.max(this.l.fj() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == bzp.a.b && !this.l.N().l()) {
            double $$0 = this.e - this.l.dt();
            double $$1 = this.f - this.l.dv();
            double $$2 = this.g - this.l.dz();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.A(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(ayo.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.t(this.a(this.l.dE(), $$4, 90.0F));
               this.l.aY = this.l.dE();
               float $$5 = (float)(this.h * this.l.g(buw.v));
               this.l.A(ayo.i(0.125F, this.l.fj(), $$5));
               this.l.i(this.l.dr().b(0.0, (double)this.l.fj() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.A(0.0F);
         }
      }
   }

   static class f extends cbf {
      f(cgf $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b() {
         if (!this.h()) {
            return false;
         } else {
            jd $$0 = this.a(this.c.dO(), this.c, 7);
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

   static class g extends ccx {
      g(cgf $$0, dcw $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(jd $$0) {
         if (this.a instanceof cgf $$1 && $$1.gn()) {
            return this.b.a_($$0).a(dga.G);
         }

         return !this.b.a_($$0.e()).i();
      }
   }

   static class h extends cbj {
      private final cgf i;

      h(cgf $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.b.bf() && !this.i.gm() && !this.i.s() ? super.b() : false;
      }
   }

   static class i extends cam {
      private final cgf a;
      private final double b;
      private boolean c;

      i(cgf $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         return !this.a.gm() && !this.a.s() && this.a.bf();
      }

      @Override
      public void d() {
         int $$0 = 512;
         int $$1 = 4;
         ayw $$2 = this.a.ah;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dv() > (double)(this.a.dO().z_() - 1)) {
            $$4 = 0;
         }

         jd $$6 = jd.a((double)$$3 + this.a.dt(), (double)$$4 + this.a.dv(), (double)$$5 + this.a.dz());
         this.a.i($$6);
         this.a.A(true);
         this.c = false;
      }

      @Override
      public void a() {
         if (this.a.N().l()) {
            exc $$0 = exc.c(this.a.gl());
            exc $$1 = cej.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cej.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = ayo.a($$1.c);
               int $$3 = ayo.a($$1.e);
               int $$4 = 34;
               if (!this.a.dO().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                  $$1 = null;
               }
            }

            if ($$1 == null) {
               this.c = true;
               return;
            }

            this.a.N().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      @Override
      public boolean c() {
         return !this.a.N().l() && !this.c && !this.a.gm() && !this.a.gs() && !this.a.s();
      }

      @Override
      public void e() {
         this.a.A(false);
         super.e();
      }
   }
}
