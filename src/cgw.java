import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgw extends cfv {
   private static final akg<je> ca = akk.a(cgw.class, aki.o);
   private static final akg<Boolean> cb = akk.a(cgw.class, aki.k);
   private static final akg<Boolean> cd = akk.a(cgw.class, aki.k);
   private static final akg<je> ce = akk.a(cgw.class, aki.o);
   private static final akg<Boolean> cf = akk.a(cgw.class, aki.k);
   private static final akg<Boolean> cg = akk.a(cgw.class, aki.k);
   private static final float ch = 0.3F;
   private static final btm ci = btq.bh.n().a(btl.a().a(btk.a, 0.0F, btq.bh.m(), -0.25F)).a(0.3F);
   int cj;
   public static final Predicate<buf> bZ = $$0 -> $$0.o_() && !$$0.bi();

   public cgw(btq<? extends cgw> $$0, dds $$1) {
      super($$0, $$1);
      this.a(eqs.j, 0.0F);
      this.a(eqs.t, -1.0F);
      this.a(eqs.s, -1.0F);
      this.a(eqs.r, -1.0F);
      this.bQ = new cgw.e(this);
   }

   public void h(je $$0) {
      this.am.a(ca, $$0);
   }

   je go() {
      return this.am.a(ca);
   }

   void i(je $$0) {
      this.am.a(ce, $$0);
   }

   je gp() {
      return this.am.a(ce);
   }

   @Override
   public boolean q() {
      return this.am.a(cb);
   }

   void x(boolean $$0) {
      this.am.a(cb, $$0);
   }

   public boolean t() {
      return this.am.a(cd);
   }

   void y(boolean $$0) {
      this.cj = $$0 ? 1 : 0;
      this.am.a(cd, $$0);
   }

   boolean gq() {
      return this.am.a(cf);
   }

   void z(boolean $$0) {
      this.am.a(cf, $$0);
   }

   boolean gr() {
      return this.am.a(cg);
   }

   void A(boolean $$0) {
      this.am.a(cg, $$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ca, je.c);
      $$0.a(cb, false);
      $$0.a(ce, je.c);
      $$0.a(cf, false);
      $$0.a(cg, false);
      $$0.a(cd, false);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.go().u());
      $$0.a("HomePosY", this.go().v());
      $$0.a("HomePosZ", this.go().w());
      $$0.a("HasEgg", this.q());
      $$0.a("TravelPosX", this.gp().u());
      $$0.a("TravelPosY", this.gp().v());
      $$0.a("TravelPosZ", this.gp().w());
   }

   @Override
   public void a(uf $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.h(new je($$1, $$2, $$3));
      super.a($$0);
      this.x($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.i(new je($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      this.h(this.ds());
      this.i(je.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(btq<cgw> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      return $$3.v() < $$1.N() + 4 && dpo.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void D() {
      this.bT.a(0, new cgw.f(this, 1.2));
      this.bT.a(1, new cgw.a(this, 1.0));
      this.bT.a(1, new cgw.d(this, 1.0));
      this.bT.a(2, new cck(this, 1.1, $$0 -> $$0.a(axb.av), false));
      this.bT.a(3, new cgw.c(this, 1.0));
      this.bT.a(4, new cgw.b(this, 1.0));
      this.bT.a(7, new cgw.i(this, 1.0));
      this.bT.a(8, new cbk(this, cnp.class, 8.0F));
      this.bT.a(9, new cgw.h(this, 1.0, 100));
   }

   public static bvl.a y() {
      return cfv.gt().a(bvm.s, 30.0).a(bvm.v, 0.25).a(bvm.B, 1.0);
   }

   @Override
   public boolean cG() {
      return false;
   }

   @Override
   public int T() {
      return 200;
   }

   @Nullable
   @Override
   protected awc w() {
      return !this.bi() && this.aH() && !this.o_() ? awd.Al : super.w();
   }

   @Override
   protected void f(float $$0) {
      super.f($$0 * 1.5F);
   }

   @Override
   protected awc aT() {
      return awd.Aw;
   }

   @Nullable
   @Override
   protected awc d(bsb $$0) {
      return this.o_() ? awd.As : awd.Ar;
   }

   @Nullable
   @Override
   protected awc n_() {
      return this.o_() ? awd.An : awd.Am;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      awc $$2 = this.o_() ? awd.Av : awd.Au;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gv() {
      return super.gv() && !this.q();
   }

   @Override
   protected float aS() {
      return this.Y + 0.15F;
   }

   @Override
   public float ee() {
      return this.o_() ? 0.3F : 1.0F;
   }

   @Override
   protected cdq b(dds $$0) {
      return new cgw.g(this, $$0);
   }

   @Nullable
   @Override
   public btc a(arg $$0, btc $$1) {
      return btq.bh.a($$0, btp.e);
   }

   @Override
   public boolean p(cvl $$0) {
      return $$0.a(axb.av);
   }

   @Override
   public float a(je $$0, ddv $$1) {
      if (!this.gq() && $$1.b_($$0).a(awy.a)) {
         return 10.0F;
      } else {
         return dpo.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void m_() {
      super.m_();
      if (this.bI() && this.t() && this.cj >= 1 && this.cj % 5 == 0) {
         je $$0 = this.ds();
         if (dpo.a(this.dS(), $$0)) {
            this.dS().c(2001, $$0, dgv.j(this.dS().a_($$0.e())));
            this.a(dyx.u);
         }
      }
   }

   @Override
   protected void k() {
      super.k();
      if (!this.o_() && this.dS().ac().b(ddo.f)) {
         this.a(cvo.oq, 1);
      }
   }

   @Override
   public void a_(eye $$0) {
      if (this.de() && this.bi()) {
         this.a(0.1F, $$0);
         this.a(buj.a, this.dv());
         this.h(this.dv().c(0.9));
         if (this.m() == null && (!this.gq() || !this.go().a(this.dq(), 20.0))) {
            this.h(this.dv().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean A() {
      return false;
   }

   @Override
   public void a(arg $$0, bue $$1) {
      this.a(this.dT().c(), Float.MAX_VALUE);
   }

   @Override
   public btm e(bur $$0) {
      return this.o_() ? ci : super.e($$0);
   }

   static class a extends cao {
      private final cgw d;

      a(cgw $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.q();
      }

      @Override
      protected void g() {
         arh $$0 = this.a.gx();
         if ($$0 == null && this.c.gx() != null) {
            $$0 = this.c.gx();
         }

         if ($$0 != null) {
            $$0.a(awn.P);
            an.p.a($$0, this.a, this.c, null);
         }

         this.d.x(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gz();
         this.c.gz();
         azk $$1 = this.a.dV();
         if (this.b.ac().b(ddo.f)) {
            this.b.b(new btv(this.b, this.a.dx(), this.a.dz(), this.a.dD(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends cbc {
      private final cgw a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(cgw $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         if (this.a.o_()) {
            return false;
         } else if (this.a.q()) {
            return true;
         } else {
            return this.a.dV().a(b(700)) != 0 ? false : !this.a.go().a(this.a.dq(), 64.0);
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
         return !this.a.go().a(this.a.dq(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void a() {
         je $$0 = this.a.go();
         boolean $$1 = $$0.a(this.a.dq(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.P().m()) {
            eye $$2 = eye.c($$0);
            eye $$3 = cez.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cez.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dS().a_(je.a((jx)$$3)).a(dgx.G)) {
               $$3 = cez.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.P().a($$3.d, $$3.e, $$3.f, this.b);
         }
      }
   }

   static class c extends cbp {
      private static final int g = 1200;
      private final cgw h;

      c(cgw $$0, double $$1) {
         super($$0, $$0.o_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean c() {
         return !this.h.bi() && this.d <= 1200 && this.a(this.h.dS(), this.e);
      }

      @Override
      public boolean b() {
         if (this.h.o_() && !this.h.bi()) {
            return super.b();
         } else {
            return !this.h.gq() && !this.h.bi() && !this.h.q() ? super.b() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(ddv $$0, je $$1) {
         return $$0.a_($$1).a(dgx.G);
      }
   }

   static class d extends cbp {
      private final cgw g;

      d(cgw $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return this.g.q() && this.g.go().a(this.g.dq(), 9.0) ? super.b() : false;
      }

      @Override
      public boolean c() {
         return super.c() && this.g.q() && this.g.go().a(this.g.dq(), 9.0);
      }

      @Override
      public void a() {
         super.a();
         je $$0 = this.g.ds();
         if (!this.g.bi() && this.m()) {
            if (this.g.cj < 1) {
               this.g.y(true);
            } else if (this.g.cj > this.a(200)) {
               dds $$1 = this.g.dS();
               $$1.a(null, $$0, awd.At, awe.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               je $$2 = this.e.d();
               dua $$3 = dgx.mf.o().b(dpo.f, Integer.valueOf(this.g.af.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dyx.i, $$2, dyx.a.a(this.g, $$3));
               this.g.x(false);
               this.g.y(false);
               this.g.s(600);
            }

            if (this.g.t()) {
               this.g.cj++;
            }
         }
      }

      @Override
      protected boolean a(ddv $$0, je $$1) {
         return !$$0.u($$1.d()) ? false : dpo.b($$0, $$1);
      }
   }

   static class e extends caf {
      private final cgw l;

      e(cgw $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bi()) {
            this.l.h(this.l.dv().b(0.0, 0.005, 0.0));
            if (!this.l.go().a(this.l.dq(), 16.0)) {
               this.l.C(Math.max(this.l.fm() / 2.0F, 0.08F));
            }

            if (this.l.o_()) {
               this.l.C(Math.max(this.l.fm() / 3.0F, 0.06F));
            }
         } else if (this.l.aH()) {
            this.l.C(Math.max(this.l.fm() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == caf.a.b && !this.l.P().m()) {
            double $$0 = this.e - this.l.dx();
            double $$1 = this.f - this.l.dz();
            double $$2 = this.g - this.l.dD();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.C(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(azc.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.a(this.l.dI(), $$4, 90.0F));
               this.l.aU = this.l.dI();
               float $$5 = (float)(this.h * this.l.h(bvm.v));
               this.l.C(azc.h(0.125F, this.l.fm(), $$5));
               this.l.h(this.l.dv().b(0.0, (double)this.l.fm() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class f extends cbv {
      f(cgw $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b() {
         if (!this.h()) {
            return false;
         } else {
            je $$0 = this.a(this.c.dS(), this.c, 7);
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

   static class g extends cdn {
      g(cgw $$0, dds $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(je $$0) {
         if (this.a instanceof cgw $$1 && $$1.gr()) {
            return this.b.a_($$0).a(dgx.G);
         }

         return !this.b.a_($$0.e()).l();
      }
   }

   static class h extends cbz {
      private final cgw i;

      h(cgw $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.b.bi() && !this.i.gq() && !this.i.q() ? super.b() : false;
      }
   }

   static class i extends cbc {
      private final cgw a;
      private final double b;
      private boolean c;

      i(cgw $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         return !this.a.gq() && !this.a.q() && this.a.bi();
      }

      @Override
      public void d() {
         int $$0 = 512;
         int $$1 = 4;
         azk $$2 = this.a.af;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dz() > (double)(this.a.dS().N() - 1)) {
            $$4 = 0;
         }

         je $$6 = je.a((double)$$3 + this.a.dx(), (double)$$4 + this.a.dz(), (double)$$5 + this.a.dD());
         this.a.i($$6);
         this.a.A(true);
         this.c = false;
      }

      @Override
      public void a() {
         if (this.a.P().m()) {
            eye $$0 = eye.c(this.a.gp());
            eye $$1 = cez.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cez.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = azc.a($$1.d);
               int $$3 = azc.a($$1.f);
               int $$4 = 34;
               if (!this.a.dS().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                  $$1 = null;
               }
            }

            if ($$1 == null) {
               this.c = true;
               return;
            }

            this.a.P().a($$1.d, $$1.e, $$1.f, this.b);
         }
      }

      @Override
      public boolean c() {
         return !this.a.P().m() && !this.c && !this.a.gq() && !this.a.gy() && !this.a.q();
      }

      @Override
      public void e() {
         this.a.A(false);
         super.e();
      }
   }
}
