import javax.annotation.Nullable;

public class chx extends cgw {
   private static final ajx<ji> bZ = akb.a(chx.class, ajz.o);
   private static final ajx<Boolean> ca = akb.a(chx.class, ajz.k);
   private static final ajx<Boolean> cc = akb.a(chx.class, ajz.k);
   private static final ajx<ji> cd = akb.a(chx.class, ajz.o);
   private static final ajx<Boolean> ce = akb.a(chx.class, ajz.k);
   private static final ajx<Boolean> cf = akb.a(chx.class, ajz.k);
   private static final float cg = 0.3F;
   private static final bum ch = buq.bA.n().a(bul.a().a(buk.a, 0.0F, buq.bA.m(), -0.25F)).a(0.3F);
   int ci;
   public static final cfw.a bY = ($$0, $$1) -> $$0.e_() && !$$0.bj();

   public chx(buq<? extends chx> $$0, dgg $$1) {
      super($$0, $$1);
      this.a(eto.j, 0.0F);
      this.a(eto.t, -1.0F);
      this.a(eto.s, -1.0F);
      this.a(eto.r, -1.0F);
      this.bP = new chx.e(this);
   }

   public void h(ji $$0) {
      this.al.a(bZ, $$0);
   }

   ji gp() {
      return this.al.a(bZ);
   }

   void i(ji $$0) {
      this.al.a(cd, $$0);
   }

   ji gq() {
      return this.al.a(cd);
   }

   public boolean p() {
      return this.al.a(ca);
   }

   void x(boolean $$0) {
      this.al.a(ca, $$0);
   }

   public boolean t() {
      return this.al.a(cc);
   }

   void y(boolean $$0) {
      this.ci = $$0 ? 1 : 0;
      this.al.a(cc, $$0);
   }

   boolean gr() {
      return this.al.a(ce);
   }

   void z(boolean $$0) {
      this.al.a(ce, $$0);
   }

   boolean gs() {
      return this.al.a(cf);
   }

   void A(boolean $$0) {
      this.al.a(cf, $$0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bZ, ji.c);
      $$0.a(ca, false);
      $$0.a(cd, ji.c);
      $$0.a(ce, false);
      $$0.a(cf, false);
      $$0.a(cc, false);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gp().u());
      $$0.a("HomePosY", this.gp().v());
      $$0.a("HomePosZ", this.gp().w());
      $$0.a("HasEgg", this.p());
      $$0.a("TravelPosX", this.gq().u());
      $$0.a("TravelPosY", this.gq().v());
      $$0.a("TravelPosZ", this.gq().w());
   }

   @Override
   public void a(tq $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.h(new ji($$1, $$2, $$3));
      super.a($$0);
      this.x($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.i(new ji($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      this.h(this.dw());
      this.i(ji.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(buq<chx> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      return $$3.v() < $$1.P() + 4 && dsh.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void B() {
      this.bS.a(0, new chx.f(this, 1.2));
      this.bS.a(1, new chx.a(this, 1.0));
      this.bS.a(1, new chx.d(this, 1.0));
      this.bS.a(2, new cdl(this, 1.1, $$0 -> $$0.a(awx.az), false));
      this.bS.a(3, new chx.c(this, 1.0));
      this.bS.a(4, new chx.b(this, 1.0));
      this.bS.a(7, new chx.i(this, 1.0));
      this.bS.a(8, new ccl(this, cov.class, 8.0F));
      this.bS.a(9, new chx.h(this, 1.0, 100));
   }

   public static bwm.a x() {
      return cgw.gu().a(bwn.s, 30.0).a(bwn.v, 0.25).a(bwn.B, 1.0);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   @Override
   public int Q() {
      return 200;
   }

   @Nullable
   @Override
   protected avy u() {
      return !this.bj() && this.aJ() && !this.e_() ? avz.AT : super.u();
   }

   @Override
   protected void f(float $$0) {
      super.f($$0 * 1.5F);
   }

   @Override
   protected avy aV() {
      return avz.Be;
   }

   @Nullable
   @Override
   protected avy e(bsz $$0) {
      return this.e_() ? avz.Ba : avz.AZ;
   }

   @Nullable
   @Override
   protected avy o_() {
      return this.e_() ? avz.AV : avz.AU;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      avy $$2 = this.e_() ? avz.Bd : avz.Bc;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gw() {
      return super.gw() && !this.p();
   }

   @Override
   protected float aU() {
      return this.X + 0.15F;
   }

   @Override
   public float ej() {
      return this.e_() ? 0.3F : 1.0F;
   }

   @Override
   protected cer b(dgg $$0) {
      return new chx.g(this, $$0);
   }

   @Nullable
   @Override
   public bua a(arc $$0, bua $$1) {
      return buq.bA.a($$0, bup.e);
   }

   @Override
   public boolean j(cwn $$0) {
      return $$0.a(awx.az);
   }

   @Override
   public float a(ji $$0, dgj $$1) {
      if (!this.gr() && $$1.b_($$0).a(awu.a)) {
         return 10.0F;
      } else {
         return dsh.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bL() && this.t() && this.ci >= 1 && this.ci % 5 == 0) {
         ji $$0 = this.dw();
         if (dsh.a(this.dW(), $$0)) {
            this.dW().c(2001, $$0, djk.j(this.dW().a_($$0.e())));
            this.a(ebr.u);
         }
      }
   }

   @Override
   protected void i() {
      super.i();
      if (!this.e_() && this.dW() instanceof arc $$0 && $$0.O().b(dgc.f)) {
         this.a($$0, cwr.oU, 1);
      }
   }

   @Override
   public void a_(fay $$0) {
      if (this.di() && this.bj()) {
         this.a(0.1F, $$0);
         this.a(bvj.a, this.dz());
         this.h(this.dz().c(0.9));
         if (this.O_() == null && (!this.gr() || !this.gp().a(this.du(), 20.0))) {
            this.h(this.dz().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean y() {
      return false;
   }

   @Override
   public void a(arc $$0, bve $$1) {
      this.a($$0, this.dX().c(), Float.MAX_VALUE);
   }

   @Override
   public bum e(bvr $$0) {
      return this.e_() ? ch : super.e($$0);
   }

   static class a extends cbp {
      private final chx d;

      a(chx $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.p();
      }

      @Override
      protected void g() {
         ard $$0 = this.a.gy();
         if ($$0 == null && this.c.gy() != null) {
            $$0 = this.c.gy();
         }

         if ($$0 != null) {
            $$0.a(awj.P);
            ap.p.a($$0, this.a, this.c, null);
         }

         this.d.x(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gA();
         this.c.gA();
         azg $$1 = this.a.dZ();
         if (a(this.b).O().b(dgc.f)) {
            this.b.b(new buv(this.b, this.a.dB(), this.a.dD(), this.a.dH(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends ccd {
      private final chx a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(chx $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         if (this.a.e_()) {
            return false;
         } else if (this.a.p()) {
            return true;
         } else {
            return this.a.dZ().a(b(700)) != 0 ? false : !this.a.gp().a(this.a.du(), 64.0);
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
         return !this.a.gp().a(this.a.du(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void a() {
         ji $$0 = this.a.gp();
         boolean $$1 = $$0.a(this.a.du(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.L().k()) {
            fay $$2 = fay.c($$0);
            fay $$3 = cga.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cga.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dW().a_(ji.a((kb)$$3)).a(djm.J)) {
               $$3 = cga.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.L().a($$3.d, $$3.e, $$3.f, this.b);
         }
      }
   }

   static class c extends ccq {
      private static final int g = 1200;
      private final chx h;

      c(chx $$0, double $$1) {
         super($$0, $$0.e_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean c() {
         return !this.h.bj() && this.d <= 1200 && this.a(this.h.dW(), this.e);
      }

      @Override
      public boolean b() {
         if (this.h.e_() && !this.h.bj()) {
            return super.b();
         } else {
            return !this.h.gr() && !this.h.bj() && !this.h.p() ? super.b() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dgj $$0, ji $$1) {
         return $$0.a_($$1).a(djm.J);
      }
   }

   static class d extends ccq {
      private final chx g;

      d(chx $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return this.g.p() && this.g.gp().a(this.g.du(), 9.0) ? super.b() : false;
      }

      @Override
      public boolean c() {
         return super.c() && this.g.p() && this.g.gp().a(this.g.du(), 9.0);
      }

      @Override
      public void a() {
         super.a();
         ji $$0 = this.g.dw();
         if (!this.g.bj() && this.m()) {
            if (this.g.ci < 1) {
               this.g.y(true);
            } else if (this.g.ci > this.a(200)) {
               dgg $$1 = this.g.dW();
               $$1.a(null, $$0, avz.Bb, awa.e, 0.3F, 0.9F + $$1.A.i() * 0.2F);
               ji $$2 = this.e.d();
               dwv $$3 = djm.mH.m().b(dsh.f, Integer.valueOf(this.g.ae.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(ebr.i, $$2, ebr.a.a(this.g, $$3));
               this.g.x(false);
               this.g.y(false);
               this.g.r(600);
            }

            if (this.g.t()) {
               this.g.ci++;
            }
         }
      }

      @Override
      protected boolean a(dgj $$0, ji $$1) {
         return !$$0.u($$1.d()) ? false : dsh.b($$0, $$1);
      }
   }

   static class e extends cbg {
      private final chx l;

      e(chx $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bj()) {
            this.l.h(this.l.dz().b(0.0, 0.005, 0.0));
            if (!this.l.gp().a(this.l.du(), 16.0)) {
               this.l.C(Math.max(this.l.fp() / 2.0F, 0.08F));
            }

            if (this.l.e_()) {
               this.l.C(Math.max(this.l.fp() / 3.0F, 0.06F));
            }
         } else if (this.l.aJ()) {
            this.l.C(Math.max(this.l.fp() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == cbg.a.b && !this.l.L().k()) {
            double $$0 = this.e - this.l.dB();
            double $$1 = this.f - this.l.dD();
            double $$2 = this.g - this.l.dH();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.C(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(ayy.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.b(this.l.dM(), $$4, 90.0F));
               this.l.aX = this.l.dM();
               float $$5 = (float)(this.h * this.l.h(bwn.v));
               this.l.C(ayy.h(0.125F, this.l.fp(), $$5));
               this.l.h(this.l.dz().b(0.0, (double)this.l.fp() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class f extends ccw {
      f(chx $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b() {
         if (!this.h()) {
            return false;
         } else {
            ji $$0 = this.a(this.c.dW(), this.c, 7);
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

   static class g extends ceo {
      g(chx $$0, dgg $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(ji $$0) {
         if (this.a instanceof chx $$1 && $$1.gs()) {
            return this.b.a_($$0).a(djm.J);
         }

         return !this.b.a_($$0.e()).l();
      }
   }

   static class h extends cda {
      private final chx i;

      h(chx $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.b.bj() && !this.i.gr() && !this.i.p() ? super.b() : false;
      }
   }

   static class i extends ccd {
      private final chx a;
      private final double b;
      private boolean c;

      i(chx $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         return !this.a.gr() && !this.a.p() && this.a.bj();
      }

      @Override
      public void d() {
         int $$0 = 512;
         int $$1 = 4;
         azg $$2 = this.a.ae;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dD() > (double)(this.a.dW().P() - 1)) {
            $$4 = 0;
         }

         ji $$6 = ji.a((double)$$3 + this.a.dB(), (double)$$4 + this.a.dD(), (double)$$5 + this.a.dH());
         this.a.i($$6);
         this.a.A(true);
         this.c = false;
      }

      @Override
      public void a() {
         if (this.a.L().k()) {
            fay $$0 = fay.c(this.a.gq());
            fay $$1 = cga.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cga.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = ayy.a($$1.d);
               int $$3 = ayy.a($$1.f);
               int $$4 = 34;
               if (!this.a.dW().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                  $$1 = null;
               }
            }

            if ($$1 == null) {
               this.c = true;
               return;
            }

            this.a.L().a($$1.d, $$1.e, $$1.f, this.b);
         }
      }

      @Override
      public boolean c() {
         return !this.a.L().k() && !this.c && !this.a.gr() && !this.a.gz() && !this.a.p();
      }

      @Override
      public void e() {
         this.a.A(false);
         super.e();
      }
   }
}
