import javax.annotation.Nullable;

public class cip extends cho {
   private static final aks<jh> ca = akw.a(cip.class, aku.o);
   private static final aks<Boolean> cb = akw.a(cip.class, aku.k);
   private static final aks<Boolean> cd = akw.a(cip.class, aku.k);
   private static final aks<jh> ce = akw.a(cip.class, aku.o);
   private static final aks<Boolean> cf = akw.a(cip.class, aku.k);
   private static final aks<Boolean> cg = akw.a(cip.class, aku.k);
   private static final float ch = 0.3F;
   private static final bve ci = bvi.bB.n().a(bvd.a().a(bvc.a, 0.0F, bvi.bB.m(), -0.25F)).a(0.3F);
   int cj;
   public static final cgo.a bZ = ($$0, $$1) -> $$0.e_() && !$$0.bj();

   public cip(bvi<? extends cip> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(euh.j, 0.0F);
      this.a(euh.t, -1.0F);
      this.a(euh.s, -1.0F);
      this.a(euh.r, -1.0F);
      this.bQ = new cip.e(this);
   }

   public void h(jh $$0) {
      this.al.a(ca, $$0);
   }

   jh go() {
      return this.al.a(ca);
   }

   void i(jh $$0) {
      this.al.a(ce, $$0);
   }

   jh gp() {
      return this.al.a(ce);
   }

   public boolean p() {
      return this.al.a(cb);
   }

   void x(boolean $$0) {
      this.al.a(cb, $$0);
   }

   public boolean t() {
      return this.al.a(cd);
   }

   void y(boolean $$0) {
      this.cj = $$0 ? 1 : 0;
      this.al.a(cd, $$0);
   }

   boolean gq() {
      return this.al.a(cf);
   }

   void z(boolean $$0) {
      this.al.a(cf, $$0);
   }

   boolean gr() {
      return this.al.a(cg);
   }

   void A(boolean $$0) {
      this.al.a(cg, $$0);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(ca, jh.c);
      $$0.a(cb, false);
      $$0.a(ce, jh.c);
      $$0.a(cf, false);
      $$0.a(cg, false);
      $$0.a(cd, false);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.go().u());
      $$0.a("HomePosY", this.go().v());
      $$0.a("HomePosZ", this.go().w());
      $$0.a("HasEgg", this.p());
      $$0.a("TravelPosX", this.gp().u());
      $$0.a("TravelPosY", this.gp().v());
      $$0.a("TravelPosZ", this.gp().w());
   }

   @Override
   public void a(um $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.h(new jh($$1, $$2, $$3));
      super.a($$0);
      this.x($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.i(new jh($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      this.h(this.dw());
      this.i(jh.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bvi<cip> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      return $$3.v() < $$1.P() + 4 && dta.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void B() {
      this.bT.a(0, new cip.f(this, 1.2));
      this.bT.a(1, new cip.a(this, 1.0));
      this.bT.a(1, new cip.d(this, 1.0));
      this.bT.a(2, new ced(this, 1.1, $$0 -> $$0.a(axt.aB), false));
      this.bT.a(3, new cip.c(this, 1.0));
      this.bT.a(4, new cip.b(this, 1.0));
      this.bT.a(7, new cip.i(this, 1.0));
      this.bT.a(8, new cdd(this, cpo.class, 8.0F));
      this.bT.a(9, new cip.h(this, 1.0, 100));
   }

   public static bxe.a x() {
      return cho.gt().a(bxf.s, 30.0).a(bxf.v, 0.25).a(bxf.B, 1.0);
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
   protected awu u() {
      return !this.bj() && this.aJ() && !this.e_() ? awv.AU : super.u();
   }

   @Override
   protected void f(float $$0) {
      super.f($$0 * 1.5F);
   }

   @Override
   protected awu aV() {
      return awv.Bf;
   }

   @Nullable
   @Override
   protected awu e(btr $$0) {
      return this.e_() ? awv.Bb : awv.Ba;
   }

   @Nullable
   @Override
   protected awu o_() {
      return this.e_() ? awv.AW : awv.AV;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      awu $$2 = this.e_() ? awv.Be : awv.Bd;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gv() {
      return super.gv() && !this.p();
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
   protected cfj b(dgz $$0) {
      return new cip.g(this, $$0);
   }

   @Nullable
   @Override
   public bus a(arx $$0, bus $$1) {
      return bvi.bB.a($$0, bvh.e);
   }

   @Override
   public boolean j(cxg $$0) {
      return $$0.a(axt.aB);
   }

   @Override
   public float a(jh $$0, dhc $$1) {
      if (!this.gq() && $$1.b_($$0).a(axq.a)) {
         return 10.0F;
      } else {
         return dta.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bL() && this.t() && this.cj >= 1 && this.cj % 5 == 0) {
         jh $$0 = this.dw();
         if (dta.a(this.dW(), $$0)) {
            this.dW().c(2001, $$0, dkd.j(this.dW().a_($$0.e())));
            this.a(eck.u);
         }
      }
   }

   @Override
   protected void i() {
      super.i();
      if (!this.e_() && this.dW() instanceof arx $$0 && $$0.O().b(dgv.f)) {
         this.a($$0, cxk.oU, 1);
      }
   }

   @Override
   public void a_(fbr $$0) {
      if (this.di() && this.bj()) {
         this.a(0.1F, $$0);
         this.a(bwb.a, this.dz());
         this.h(this.dz().c(0.9));
         if (this.O_() == null && (!this.gq() || !this.go().a(this.du(), 20.0))) {
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
   public void a(arx $$0, bvw $$1) {
      this.a($$0, this.dX().c(), Float.MAX_VALUE);
   }

   @Override
   public bve e(bwj $$0) {
      return this.e_() ? ci : super.e($$0);
   }

   static class a extends cch {
      private final cip d;

      a(cip $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.p();
      }

      @Override
      protected void g() {
         ary $$0 = this.a.gx();
         if ($$0 == null && this.c.gx() != null) {
            $$0 = this.c.gx();
         }

         if ($$0 != null) {
            $$0.a(axf.P);
            ao.p.a($$0, this.a, this.c, null);
         }

         this.d.x(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gz();
         this.c.gz();
         bac $$1 = this.a.dZ();
         if (a(this.b).O().b(dgv.f)) {
            this.b.b(new bvn(this.b, this.a.dB(), this.a.dD(), this.a.dH(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends ccv {
      private final cip a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(cip $$0, double $$1) {
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
            return this.a.dZ().a(b(700)) != 0 ? false : !this.a.go().a(this.a.du(), 64.0);
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
         return !this.a.go().a(this.a.du(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void a() {
         jh $$0 = this.a.go();
         boolean $$1 = $$0.a(this.a.du(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.L().m()) {
            fbr $$2 = fbr.c($$0);
            fbr $$3 = cgs.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cgs.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dW().a_(jh.a((ka)$$3)).a(dkf.J)) {
               $$3 = cgs.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.L().a($$3.d, $$3.e, $$3.f, this.b);
         }
      }
   }

   static class c extends cdi {
      private static final int g = 1200;
      private final cip h;

      c(cip $$0, double $$1) {
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
            return !this.h.gq() && !this.h.bj() && !this.h.p() ? super.b() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dhc $$0, jh $$1) {
         return $$0.a_($$1).a(dkf.J);
      }
   }

   static class d extends cdi {
      private final cip g;

      d(cip $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return this.g.p() && this.g.go().a(this.g.du(), 9.0) ? super.b() : false;
      }

      @Override
      public boolean c() {
         return super.c() && this.g.p() && this.g.go().a(this.g.du(), 9.0);
      }

      @Override
      public void a() {
         super.a();
         jh $$0 = this.g.dw();
         if (!this.g.bj() && this.m()) {
            if (this.g.cj < 1) {
               this.g.y(true);
            } else if (this.g.cj > this.a(200)) {
               dgz $$1 = this.g.dW();
               $$1.a(null, $$0, awv.Bc, aww.e, 0.3F, 0.9F + $$1.A.i() * 0.2F);
               jh $$2 = this.e.d();
               dxo $$3 = dkf.mH.m().b(dta.f, Integer.valueOf(this.g.ae.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(eck.i, $$2, eck.a.a(this.g, $$3));
               this.g.x(false);
               this.g.y(false);
               this.g.r(600);
            }

            if (this.g.t()) {
               this.g.cj++;
            }
         }
      }

      @Override
      protected boolean a(dhc $$0, jh $$1) {
         return !$$0.u($$1.d()) ? false : dta.b($$0, $$1);
      }
   }

   static class e extends cby {
      private final cip l;

      e(cip $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bj()) {
            this.l.h(this.l.dz().b(0.0, 0.005, 0.0));
            if (!this.l.go().a(this.l.du(), 16.0)) {
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
         if (this.k == cby.a.b && !this.l.L().m()) {
            double $$0 = this.e - this.l.dB();
            double $$1 = this.f - this.l.dD();
            double $$2 = this.g - this.l.dH();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.C(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(azu.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.b(this.l.dM(), $$4, 90.0F));
               this.l.aX = this.l.dM();
               float $$5 = (float)(this.h * this.l.h(bxf.v));
               this.l.C(azu.h(0.125F, this.l.fp(), $$5));
               this.l.h(this.l.dz().b(0.0, (double)this.l.fp() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class f extends cdo {
      f(cip $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b() {
         if (!this.h()) {
            return false;
         } else {
            jh $$0 = this.a(this.c.dW(), this.c, 7);
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

   static class g extends cfg {
      g(cip $$0, dgz $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(jh $$0) {
         if (this.a instanceof cip $$1 && $$1.gr()) {
            return this.b.a_($$0).a(dkf.J);
         }

         return !this.b.a_($$0.e()).l();
      }
   }

   static class h extends cds {
      private final cip i;

      h(cip $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.b.bj() && !this.i.gq() && !this.i.p() ? super.b() : false;
      }
   }

   static class i extends ccv {
      private final cip a;
      private final double b;
      private boolean c;

      i(cip $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         return !this.a.gq() && !this.a.p() && this.a.bj();
      }

      @Override
      public void d() {
         int $$0 = 512;
         int $$1 = 4;
         bac $$2 = this.a.ae;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dD() > (double)(this.a.dW().P() - 1)) {
            $$4 = 0;
         }

         jh $$6 = jh.a((double)$$3 + this.a.dB(), (double)$$4 + this.a.dD(), (double)$$5 + this.a.dH());
         this.a.i($$6);
         this.a.A(true);
         this.c = false;
      }

      @Override
      public void a() {
         if (this.a.L().m()) {
            fbr $$0 = fbr.c(this.a.gp());
            fbr $$1 = cgs.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cgs.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = azu.a($$1.d);
               int $$3 = azu.a($$1.f);
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
         return !this.a.L().m() && !this.c && !this.a.gq() && !this.a.gy() && !this.a.p();
      }

      @Override
      public void e() {
         this.a.A(false);
         super.e();
      }
   }
}
