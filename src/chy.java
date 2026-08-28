import javax.annotation.Nullable;

public class chy extends cgx {
   private static final ajx<ji> bZ = akb.a(chy.class, ajz.o);
   private static final ajx<Boolean> ca = akb.a(chy.class, ajz.k);
   private static final ajx<Boolean> cc = akb.a(chy.class, ajz.k);
   private static final ajx<ji> cd = akb.a(chy.class, ajz.o);
   private static final ajx<Boolean> ce = akb.a(chy.class, ajz.k);
   private static final ajx<Boolean> cf = akb.a(chy.class, ajz.k);
   private static final float cg = 0.3F;
   private static final bun ch = bur.bB.n().a(bum.a().a(bul.a, 0.0F, bur.bB.m(), -0.25F)).a(0.3F);
   int ci;
   public static final cfx.a bY = ($$0, $$1) -> $$0.e_() && !$$0.bj();

   public chy(bur<? extends chy> $$0, dgi $$1) {
      super($$0, $$1);
      this.a(etq.j, 0.0F);
      this.a(etq.t, -1.0F);
      this.a(etq.s, -1.0F);
      this.a(etq.r, -1.0F);
      this.bP = new chy.e(this);
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
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      this.h(this.dw());
      this.i(ji.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bur<chy> $$0, dgj $$1, buq $$2, ji $$3, azh $$4) {
      return $$3.v() < $$1.P() + 4 && dsj.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void B() {
      this.bS.a(0, new chy.f(this, 1.2));
      this.bS.a(1, new chy.a(this, 1.0));
      this.bS.a(1, new chy.d(this, 1.0));
      this.bS.a(2, new cdm(this, 1.1, $$0 -> $$0.a(awy.az), false));
      this.bS.a(3, new chy.c(this, 1.0));
      this.bS.a(4, new chy.b(this, 1.0));
      this.bS.a(7, new chy.i(this, 1.0));
      this.bS.a(8, new ccm(this, cox.class, 8.0F));
      this.bS.a(9, new chy.h(this, 1.0, 100));
   }

   public static bwn.a x() {
      return cgx.gu().a(bwo.s, 30.0).a(bwo.v, 0.25).a(bwo.B, 1.0);
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
   protected avz u() {
      return !this.bj() && this.aJ() && !this.e_() ? awa.AU : super.u();
   }

   @Override
   protected void f(float $$0) {
      super.f($$0 * 1.5F);
   }

   @Override
   protected avz aV() {
      return awa.Bf;
   }

   @Nullable
   @Override
   protected avz e(bta $$0) {
      return this.e_() ? awa.Bb : awa.Ba;
   }

   @Nullable
   @Override
   protected avz o_() {
      return this.e_() ? awa.AW : awa.AV;
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
      avz $$2 = this.e_() ? awa.Be : awa.Bd;
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
   protected ces b(dgi $$0) {
      return new chy.g(this, $$0);
   }

   @Nullable
   @Override
   public bub a(arc $$0, bub $$1) {
      return bur.bB.a($$0, buq.e);
   }

   @Override
   public boolean j(cwp $$0) {
      return $$0.a(awy.az);
   }

   @Override
   public float a(ji $$0, dgl $$1) {
      if (!this.gr() && $$1.b_($$0).a(awv.a)) {
         return 10.0F;
      } else {
         return dsj.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bL() && this.t() && this.ci >= 1 && this.ci % 5 == 0) {
         ji $$0 = this.dw();
         if (dsj.a(this.dW(), $$0)) {
            this.dW().c(2001, $$0, djm.j(this.dW().a_($$0.e())));
            this.a(ebt.u);
         }
      }
   }

   @Override
   protected void i() {
      super.i();
      if (!this.e_() && this.dW() instanceof arc $$0 && $$0.O().b(dge.f)) {
         this.a($$0, cwt.oU, 1);
      }
   }

   @Override
   public void a_(fba $$0) {
      if (this.di() && this.bj()) {
         this.a(0.1F, $$0);
         this.a(bvk.a, this.dz());
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
   public void a(arc $$0, bvf $$1) {
      this.a($$0, this.dX().c(), Float.MAX_VALUE);
   }

   @Override
   public bun e(bvs $$0) {
      return this.e_() ? ch : super.e($$0);
   }

   static class a extends cbq {
      private final chy d;

      a(chy $$0, double $$1) {
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
            $$0.a(awk.P);
            ap.p.a($$0, this.a, this.c, null);
         }

         this.d.x(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gA();
         this.c.gA();
         azh $$1 = this.a.dZ();
         if (a(this.b).O().b(dge.f)) {
            this.b.b(new buw(this.b, this.a.dB(), this.a.dD(), this.a.dH(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends cce {
      private final chy a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(chy $$0, double $$1) {
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
            fba $$2 = fba.c($$0);
            fba $$3 = cgb.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cgb.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dW().a_(ji.a((kb)$$3)).a(djo.J)) {
               $$3 = cgb.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.L().a($$3.d, $$3.e, $$3.f, this.b);
         }
      }
   }

   static class c extends ccr {
      private static final int g = 1200;
      private final chy h;

      c(chy $$0, double $$1) {
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
      protected boolean a(dgl $$0, ji $$1) {
         return $$0.a_($$1).a(djo.J);
      }
   }

   static class d extends ccr {
      private final chy g;

      d(chy $$0, double $$1) {
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
               dgi $$1 = this.g.dW();
               $$1.a(null, $$0, awa.Bc, awb.e, 0.3F, 0.9F + $$1.A.i() * 0.2F);
               ji $$2 = this.e.d();
               dwx $$3 = djo.mH.m().b(dsj.f, Integer.valueOf(this.g.ae.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(ebt.i, $$2, ebt.a.a(this.g, $$3));
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
      protected boolean a(dgl $$0, ji $$1) {
         return !$$0.u($$1.d()) ? false : dsj.b($$0, $$1);
      }
   }

   static class e extends cbh {
      private final chy l;

      e(chy $$0) {
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
         if (this.k == cbh.a.b && !this.l.L().k()) {
            double $$0 = this.e - this.l.dB();
            double $$1 = this.f - this.l.dD();
            double $$2 = this.g - this.l.dH();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.C(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(ayz.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.b(this.l.dM(), $$4, 90.0F));
               this.l.aX = this.l.dM();
               float $$5 = (float)(this.h * this.l.h(bwo.v));
               this.l.C(ayz.h(0.125F, this.l.fp(), $$5));
               this.l.h(this.l.dz().b(0.0, (double)this.l.fp() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class f extends ccx {
      f(chy $$0, double $$1) {
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

   static class g extends cep {
      g(chy $$0, dgi $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(ji $$0) {
         if (this.a instanceof chy $$1 && $$1.gs()) {
            return this.b.a_($$0).a(djo.J);
         }

         return !this.b.a_($$0.e()).l();
      }
   }

   static class h extends cdb {
      private final chy i;

      h(chy $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.b.bj() && !this.i.gr() && !this.i.p() ? super.b() : false;
      }
   }

   static class i extends cce {
      private final chy a;
      private final double b;
      private boolean c;

      i(chy $$0, double $$1) {
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
         azh $$2 = this.a.ae;
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
            fba $$0 = fba.c(this.a.gq());
            fba $$1 = cgb.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cgb.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = ayz.a($$1.d);
               int $$3 = ayz.a($$1.f);
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
