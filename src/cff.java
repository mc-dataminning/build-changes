import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cff extends cee {
   private static final ajy<ir> ci = akc.a(cff.class, aka.o);
   private static final ajy<Boolean> ck = akc.a(cff.class, aka.k);
   private static final ajy<Boolean> cl = akc.a(cff.class, aka.k);
   private static final ajy<ir> cm = akc.a(cff.class, aka.o);
   private static final ajy<Boolean> cn = akc.a(cff.class, aka.k);
   private static final ajy<Boolean> co = akc.a(cff.class, aka.k);
   private static final float cp = 0.3F;
   private static final bry cq = bsb.bl.n().a(brx.a().a(brw.a, 0.0F, bsb.bl.l(), -0.25F)).a(0.3F);
   int cr;
   public static final Predicate<bso> ch = $$0 -> $$0.o_() && !$$0.bi();

   public cff(bsb<? extends cff> $$0, dca $$1) {
      super($$0, $$1);
      this.a(epv.j, 0.0F);
      this.a(epv.t, -1.0F);
      this.a(epv.s, -1.0F);
      this.a(epv.r, -1.0F);
      this.bY = new cff.e(this);
   }

   public void e(ir $$0) {
      this.as.a(ci, $$0);
   }

   ir gy() {
      return this.as.a(ci);
   }

   void j(ir $$0) {
      this.as.a(cm, $$0);
   }

   ir gE() {
      return this.as.a(cm);
   }

   public boolean r() {
      return this.as.a(ck);
   }

   void w(boolean $$0) {
      this.as.a(ck, $$0);
   }

   public boolean t() {
      return this.as.a(cl);
   }

   void x(boolean $$0) {
      this.cr = $$0 ? 1 : 0;
      this.as.a(cl, $$0);
   }

   boolean gF() {
      return this.as.a(cn);
   }

   void y(boolean $$0) {
      this.as.a(cn, $$0);
   }

   boolean gG() {
      return this.as.a(co);
   }

   void z(boolean $$0) {
      this.as.a(co, $$0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ci, ir.c);
      $$0.a(ck, false);
      $$0.a(cm, ir.c);
      $$0.a(cn, false);
      $$0.a(co, false);
      $$0.a(cl, false);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gy().u());
      $$0.a("HomePosY", this.gy().v());
      $$0.a("HomePosZ", this.gy().w());
      $$0.a("HasEgg", this.r());
      $$0.a("TravelPosX", this.gE().u());
      $$0.a("TravelPosY", this.gE().v());
      $$0.a("TravelPosZ", this.gE().w());
   }

   @Override
   public void a(uk $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.e(new ir($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.j(new ir($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      this.e(this.du());
      this.j(ir.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bsb<cff> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      return $$3.v() < $$1.A_() + 4 && doj.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void y() {
      this.cb.a(0, new cff.f(this, 1.2));
      this.cb.a(1, new cff.a(this, 1.0));
      this.cb.a(1, new cff.d(this, 1.0));
      this.cb.a(2, new cat(this, 1.1, $$0 -> $$0.a(awm.av), false));
      this.cb.a(3, new cff.c(this, 1.0));
      this.cb.a(4, new cff.b(this, 1.0));
      this.cb.a(7, new cff.i(this, 1.0));
      this.cb.a(8, new bzt(this, cly.class, 8.0F));
      this.cb.a(9, new cff.h(this, 1.0, 100));
   }

   public static btu.a x() {
      return bsq.A().a(btv.q, 30.0).a(btv.r, 0.25).a(btv.v, 1.0);
   }

   @Override
   public boolean cH() {
      return false;
   }

   @Override
   public int O() {
      return 200;
   }

   @Nullable
   @Override
   protected avn u() {
      return !this.bi() && this.aE() && !this.o_() ? avo.AA : super.u();
   }

   @Override
   protected void e(float $$0) {
      super.e($$0 * 1.5F);
   }

   @Override
   protected avn aT() {
      return avo.AL;
   }

   @Nullable
   @Override
   protected avn d(bqt $$0) {
      return this.o_() ? avo.AH : avo.AG;
   }

   @Nullable
   @Override
   protected avn n_() {
      return this.o_() ? avo.AC : avo.AB;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      avn $$2 = this.o_() ? avo.AK : avo.AJ;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gz() {
      return super.gz() && !this.r();
   }

   @Override
   protected float aS() {
      return this.ab + 0.15F;
   }

   @Override
   public float el() {
      return this.o_() ? 0.3F : 1.0F;
   }

   @Override
   protected cbz b(dca $$0) {
      return new cff.g(this, $$0);
   }

   @Nullable
   @Override
   public brp a(aqt $$0, brp $$1) {
      return bsb.bl.a((dca)$$0);
   }

   @Override
   public boolean o(cuh $$0) {
      return $$0.a(awm.av);
   }

   @Override
   public float a(ir $$0, dcd $$1) {
      if (!this.gF() && $$1.b_($$0).a(awj.a)) {
         return 10.0F;
      } else {
         return doj.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void m_() {
      super.m_();
      if (this.bI() && this.t() && this.cr >= 1 && this.cr % 5 == 0) {
         ir $$0 = this.du();
         if (doj.a(this.dU(), $$0)) {
            this.dU().c(2001, $$0, dfc.i(this.dU().a_($$0.d())));
            this.a(dxv.u);
         }
      }
   }

   @Override
   protected void k() {
      super.k();
      if (!this.o_() && this.dU().ab().b(dbw.f)) {
         this.a(cuk.pF, 1);
      }
   }

   @Override
   public void a(ewu $$0) {
      if (this.df() && this.bi()) {
         this.a(0.1F, $$0);
         this.a(bst.a, this.dx());
         this.g(this.dx().a(0.9));
         if (this.p() == null && (!this.gF() || !this.gy().a(this.ds(), 20.0))) {
            this.g(this.dx().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cly $$0) {
      return false;
   }

   @Override
   public void a(aqt $$0, bsn $$1) {
      this.a(this.dX().b(), Float.MAX_VALUE);
   }

   @Override
   public bry e(bsz $$0) {
      return this.o_() ? cq : super.e($$0);
   }

   static class a extends byx {
      private final cff d;

      a(cff $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.r();
      }

      @Override
      protected void g() {
         aqu $$0 = this.a.gB();
         if ($$0 == null && this.c.gB() != null) {
            $$0 = this.c.gB();
         }

         if ($$0 != null) {
            $$0.a(avz.P);
            an.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gD();
         this.c.gD();
         ayt $$1 = this.a.et();
         if (this.b.ab().b(dbw.f)) {
            this.b.b(new bse(this.b, this.a.dz(), this.a.dB(), this.a.dF(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends bzl {
      private final cff a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(cff $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         if (this.a.o_()) {
            return false;
         } else if (this.a.r()) {
            return true;
         } else {
            return this.a.et().a(b(700)) != 0 ? false : !this.a.gy().a(this.a.ds(), 64.0);
         }
      }

      @Override
      public void c() {
         this.a.y(true);
         this.c = false;
         this.d = 0;
      }

      @Override
      public void d() {
         this.a.y(false);
      }

      @Override
      public boolean b() {
         return !this.a.gy().a(this.a.ds(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void e() {
         ir $$0 = this.a.gy();
         boolean $$1 = $$0.a(this.a.ds(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.J().l()) {
            ewu $$2 = ewu.c($$0);
            ewu $$3 = cdi.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cdi.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dU().a_(ir.a($$3)).a(dfe.al)) {
               $$3 = cdi.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.J().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends bzy {
      private static final int g = 1200;
      private final cff h;

      c(cff $$0, double $$1) {
         super($$0, $$0.o_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean b() {
         return !this.h.bi() && this.d <= 1200 && this.a(this.h.dU(), this.e);
      }

      @Override
      public boolean a() {
         if (this.h.o_() && !this.h.bi()) {
            return super.a();
         } else {
            return !this.h.gF() && !this.h.bi() && !this.h.r() ? super.a() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dcd $$0, ir $$1) {
         return $$0.a_($$1).a(dfe.al);
      }
   }

   static class d extends bzy {
      private final cff g;

      d(cff $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return this.g.r() && this.g.gy().a(this.g.ds(), 9.0) ? super.a() : false;
      }

      @Override
      public boolean b() {
         return super.b() && this.g.r() && this.g.gy().a(this.g.ds(), 9.0);
      }

      @Override
      public void e() {
         super.e();
         ir $$0 = this.g.du();
         if (!this.g.bi() && this.m()) {
            if (this.g.cr < 1) {
               this.g.x(true);
            } else if (this.g.cr > this.a(200)) {
               dca $$1 = this.g.dU();
               $$1.a(null, $$0, avo.AI, avq.e, 0.3F, 0.9F + $$1.A.i() * 0.2F);
               ir $$2 = this.e.c();
               dtc $$3 = dfe.nd.n().a(doj.f, Integer.valueOf(this.g.al.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dxv.i, $$2, dxv.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.u(600);
            }

            if (this.g.t()) {
               this.g.cr++;
            }
         }
      }

      @Override
      protected boolean a(dcd $$0, ir $$1) {
         return !$$0.u($$1.c()) ? false : doj.b($$0, $$1);
      }
   }

   static class e extends byo {
      private final cff l;

      e(cff $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bi()) {
            this.l.g(this.l.dx().b(0.0, 0.005, 0.0));
            if (!this.l.gy().a(this.l.ds(), 16.0)) {
               this.l.y(Math.max(this.l.fw() / 2.0F, 0.08F));
            }

            if (this.l.o_()) {
               this.l.y(Math.max(this.l.fw() / 3.0F, 0.06F));
            }
         } else if (this.l.aE()) {
            this.l.y(Math.max(this.l.fw() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == byo.a.b && !this.l.J().l()) {
            double $$0 = this.e - this.l.dz();
            double $$1 = this.f - this.l.dB();
            double $$2 = this.g - this.l.dF();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.y(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(aym.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dK(), $$4, 90.0F));
               this.l.bj = this.l.dK();
               float $$5 = (float)(this.h * this.l.g(btv.r));
               this.l.y(aym.i(0.125F, this.l.fw(), $$5));
               this.l.g(this.l.dx().b(0.0, (double)this.l.fw() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.y(0.0F);
         }
      }
   }

   static class f extends cae {
      f(cff $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a() {
         if (!this.h()) {
            return false;
         } else {
            ir $$0 = this.a(this.b.dU(), this.b, 7);
            if ($$0 != null) {
               this.d = (double)$$0.u();
               this.e = (double)$$0.v();
               this.f = (double)$$0.w();
               return true;
            } else {
               return this.i();
            }
         }
      }
   }

   static class g extends cbw {
      g(cff $$0, dca $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(ir $$0) {
         if (this.a instanceof cff $$1 && $$1.gG()) {
            return this.b.a_($$0).a(dfe.al);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends cai {
      private final cff i;

      h(cff $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.bi() && !this.i.gF() && !this.i.r() ? super.a() : false;
      }
   }

   static class i extends bzl {
      private final cff a;
      private final double b;
      private boolean c;

      i(cff $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         return !this.a.gF() && !this.a.r() && this.a.bi();
      }

      @Override
      public void c() {
         int $$0 = 512;
         int $$1 = 4;
         ayt $$2 = this.a.al;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dB() > (double)(this.a.dU().A_() - 1)) {
            $$4 = 0;
         }

         ir $$6 = ir.a((double)$$3 + this.a.dz(), (double)$$4 + this.a.dB(), (double)$$5 + this.a.dF());
         this.a.j($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void e() {
         if (this.a.J().l()) {
            ewu $$0 = ewu.c(this.a.gE());
            ewu $$1 = cdi.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cdi.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = aym.a($$1.c);
               int $$3 = aym.a($$1.e);
               int $$4 = 34;
               if (!this.a.dU().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
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
      public boolean b() {
         return !this.a.J().l() && !this.c && !this.a.gF() && !this.a.gC() && !this.a.r();
      }

      @Override
      public void d() {
         this.a.z(false);
         super.d();
      }
   }
}
