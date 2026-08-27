import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ceq extends cdp {
   private static final ajm<in> bZ = ajq.a(ceq.class, ajo.o);
   private static final ajm<Boolean> cb = ajq.a(ceq.class, ajo.k);
   private static final ajm<Boolean> cc = ajq.a(ceq.class, ajo.k);
   private static final ajm<in> cd = ajq.a(ceq.class, ajo.o);
   private static final ajm<Boolean> ce = ajq.a(ceq.class, ajo.k);
   private static final ajm<Boolean> cf = ajq.a(ceq.class, ajo.k);
   private static final float cg = 0.3F;
   private static final brk ch = brn.bg.n().a(brj.a().a(bri.a, 0.0F, brn.bg.l(), -0.25F)).a(0.3F);
   int ci;
   public static final Predicate<bsa> bY = $$0 -> $$0.p_() && !$$0.bc();

   public ceq(brn<? extends ceq> $$0, dad $$1) {
      super($$0, $$1);
      this.a(emr.j, 0.0F);
      this.a(emr.t, -1.0F);
      this.a(emr.s, -1.0F);
      this.a(emr.r, -1.0F);
      this.bP = new ceq.e(this);
   }

   public void i(in $$0) {
      this.ao.a(bZ, $$0);
   }

   in gp() {
      return this.ao.a(bZ);
   }

   void j(in $$0) {
      this.ao.a(cd, $$0);
   }

   in gv() {
      return this.ao.a(cd);
   }

   public boolean r() {
      return this.ao.a(cb);
   }

   void w(boolean $$0) {
      this.ao.a(cb, $$0);
   }

   public boolean u() {
      return this.ao.a(cc);
   }

   void x(boolean $$0) {
      this.ci = $$0 ? 1 : 0;
      this.ao.a(cc, $$0);
   }

   boolean gw() {
      return this.ao.a(ce);
   }

   void y(boolean $$0) {
      this.ao.a(ce, $$0);
   }

   boolean gx() {
      return this.ao.a(cf);
   }

   void z(boolean $$0) {
      this.ao.a(cf, $$0);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(bZ, in.c);
      $$0.a(cb, false);
      $$0.a(cd, in.c);
      $$0.a(ce, false);
      $$0.a(cf, false);
      $$0.a(cc, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gp().u());
      $$0.a("HomePosY", this.gp().v());
      $$0.a("HomePosZ", this.gp().w());
      $$0.a("HasEgg", this.r());
      $$0.a("TravelPosX", this.gv().u());
      $$0.a("TravelPosY", this.gv().v());
      $$0.a("TravelPosZ", this.gv().w());
   }

   @Override
   public void a(ua $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.i(new in($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.j(new in($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      this.i(this.dn());
      this.j(in.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(brn<ceq> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      return $$3.v() < $$1.z_() + 4 && dlw.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void z() {
      this.bS.a(0, new ceq.f(this, 1.2));
      this.bS.a(1, new ceq.a(this, 1.0));
      this.bS.a(1, new ceq.d(this, 1.0));
      this.bS.a(2, new caf(this, 1.1, $$0 -> $$0.a(avz.av), false));
      this.bS.a(3, new ceq.c(this, 1.0));
      this.bS.a(4, new ceq.b(this, 1.0));
      this.bS.a(7, new ceq.i(this, 1.0));
      this.bS.a(8, new bzf(this, clh.class, 8.0F));
      this.bS.a(9, new ceq.h(this, 1.0, 100));
   }

   public static btg.a y() {
      return bsc.A().a(bth.q, 30.0).a(bth.r, 0.25).a(bth.v, 1.0);
   }

   @Override
   public boolean cA() {
      return false;
   }

   @Override
   public int O() {
      return 200;
   }

   @Nullable
   @Override
   protected avb v() {
      return !this.bc() && this.aC() && !this.p_() ? avc.zR : super.v();
   }

   @Override
   protected void e(float $$0) {
      super.e($$0 * 1.5F);
   }

   @Override
   protected avb aN() {
      return avc.Ac;
   }

   @Nullable
   @Override
   protected avb d(bqf $$0) {
      return this.p_() ? avc.zY : avc.zX;
   }

   @Nullable
   @Override
   protected avb o_() {
      return this.p_() ? avc.zT : avc.zS;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      avb $$2 = this.p_() ? avc.Ab : avc.Aa;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gq() {
      return super.gq() && !this.r();
   }

   @Override
   protected float aM() {
      return this.aa + 0.15F;
   }

   @Override
   public float eb() {
      return this.p_() ? 0.3F : 1.0F;
   }

   @Override
   protected cbl b(dad $$0) {
      return new ceq.g(this, $$0);
   }

   @Nullable
   @Override
   public brb a(aqh $$0, brb $$1) {
      return brn.bg.a((dad)$$0);
   }

   @Override
   public boolean o(csz $$0) {
      return $$0.a(avz.av);
   }

   @Override
   public float a(in $$0, dag $$1) {
      if (!this.gw() && $$1.b_($$0).a(avw.a)) {
         return 10.0F;
      } else {
         return dlw.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bB() && this.u() && this.ci >= 1 && this.ci % 5 == 0) {
         in $$0 = this.dn();
         if (dlw.a(this.dN(), $$0)) {
            this.dN().c(2001, $$0, dde.i(this.dN().a_($$0.d())));
            this.a(dva.u);
         }
      }
   }

   @Override
   protected void k() {
      super.k();
      if (!this.p_() && this.dN().aa().b(czz.f)) {
         this.a(ctc.op, 1);
      }
   }

   @Override
   public void a(etp $$0) {
      if (this.cY() && this.bc()) {
         this.a(0.1F, $$0);
         this.a(bsf.a, this.dq());
         this.g(this.dq().a(0.9));
         if (this.p() == null && (!this.gw() || !this.gp().a(this.dl(), 20.0))) {
            this.g(this.dq().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(clh $$0) {
      return false;
   }

   @Override
   public void a(aqh $$0, brz $$1) {
      this.a(this.dO().b(), Float.MAX_VALUE);
   }

   @Override
   public brk e(bsl $$0) {
      return this.p_() ? ch : super.e($$0);
   }

   static class a extends byj {
      private final ceq d;

      a(ceq $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.r();
      }

      @Override
      protected void g() {
         aqi $$0 = this.a.gs();
         if ($$0 == null && this.c.gs() != null) {
            $$0 = this.c.gs();
         }

         if ($$0 != null) {
            $$0.a(avm.P);
            am.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gu();
         this.c.gu();
         ayg $$1 = this.a.ej();
         if (this.b.aa().b(czz.f)) {
            this.b.b(new brq(this.b, this.a.ds(), this.a.du(), this.a.dy(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends byx {
      private final ceq a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(ceq $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         if (this.a.p_()) {
            return false;
         } else if (this.a.r()) {
            return true;
         } else {
            return this.a.ej().a(b(700)) != 0 ? false : !this.a.gp().a(this.a.dl(), 64.0);
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
         return !this.a.gp().a(this.a.dl(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void e() {
         in $$0 = this.a.gp();
         boolean $$1 = $$0.a(this.a.dl(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.K().l()) {
            etp $$2 = etp.c($$0);
            etp $$3 = ccu.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = ccu.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dN().a_(in.a($$3)).a(ddg.G)) {
               $$3 = ccu.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.K().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends bzk {
      private static final int g = 1200;
      private final ceq h;

      c(ceq $$0, double $$1) {
         super($$0, $$0.p_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean b() {
         return !this.h.bc() && this.d <= 1200 && this.a(this.h.dN(), this.e);
      }

      @Override
      public boolean a() {
         if (this.h.p_() && !this.h.bc()) {
            return super.a();
         } else {
            return !this.h.gw() && !this.h.bc() && !this.h.r() ? super.a() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dag $$0, in $$1) {
         return $$0.a_($$1).a(ddg.G);
      }
   }

   static class d extends bzk {
      private final ceq g;

      d(ceq $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return this.g.r() && this.g.gp().a(this.g.dl(), 9.0) ? super.a() : false;
      }

      @Override
      public boolean b() {
         return super.b() && this.g.r() && this.g.gp().a(this.g.dl(), 9.0);
      }

      @Override
      public void e() {
         super.e();
         in $$0 = this.g.dn();
         if (!this.g.bc() && this.m()) {
            if (this.g.ci < 1) {
               this.g.x(true);
            } else if (this.g.ci > this.a(200)) {
               dad $$1 = this.g.dN();
               $$1.a(null, $$0, avc.zZ, avd.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               in $$2 = this.e.c();
               dqh $$3 = ddg.mf.n().a(dlw.f, Integer.valueOf(this.g.ah.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dva.i, $$2, dva.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.t(600);
            }

            if (this.g.u()) {
               this.g.ci++;
            }
         }
      }

      @Override
      protected boolean a(dag $$0, in $$1) {
         return !$$0.u($$1.c()) ? false : dlw.b($$0, $$1);
      }
   }

   static class e extends bya {
      private final ceq l;

      e(ceq $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bc()) {
            this.l.g(this.l.dq().b(0.0, 0.005, 0.0));
            if (!this.l.gp().a(this.l.dl(), 16.0)) {
               this.l.y(Math.max(this.l.fl() / 2.0F, 0.08F));
            }

            if (this.l.p_()) {
               this.l.y(Math.max(this.l.fl() / 3.0F, 0.06F));
            }
         } else if (this.l.aC()) {
            this.l.y(Math.max(this.l.fl() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == bya.a.b && !this.l.K().l()) {
            double $$0 = this.e - this.l.ds();
            double $$1 = this.f - this.l.du();
            double $$2 = this.g - this.l.dy();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.y(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(axz.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dD(), $$4, 90.0F));
               this.l.aZ = this.l.dD();
               float $$5 = (float)(this.h * this.l.g(bth.r));
               this.l.y(axz.i(0.125F, this.l.fl(), $$5));
               this.l.g(this.l.dq().b(0.0, (double)this.l.fl() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.y(0.0F);
         }
      }
   }

   static class f extends bzq {
      f(ceq $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a() {
         if (!this.h()) {
            return false;
         } else {
            in $$0 = this.a(this.b.dN(), this.b, 7);
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

   static class g extends cbi {
      g(ceq $$0, dad $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(in $$0) {
         if (this.a instanceof ceq $$1 && $$1.gx()) {
            return this.b.a_($$0).a(ddg.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends bzu {
      private final ceq i;

      h(ceq $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.bc() && !this.i.gw() && !this.i.r() ? super.a() : false;
      }
   }

   static class i extends byx {
      private final ceq a;
      private final double b;
      private boolean c;

      i(ceq $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         return !this.a.gw() && !this.a.r() && this.a.bc();
      }

      @Override
      public void c() {
         int $$0 = 512;
         int $$1 = 4;
         ayg $$2 = this.a.ah;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.du() > (double)(this.a.dN().z_() - 1)) {
            $$4 = 0;
         }

         in $$6 = in.a((double)$$3 + this.a.ds(), (double)$$4 + this.a.du(), (double)$$5 + this.a.dy());
         this.a.j($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void e() {
         if (this.a.K().l()) {
            etp $$0 = etp.c(this.a.gv());
            etp $$1 = ccu.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = ccu.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = axz.a($$1.c);
               int $$3 = axz.a($$1.e);
               int $$4 = 34;
               if (!this.a.dN().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                  $$1 = null;
               }
            }

            if ($$1 == null) {
               this.c = true;
               return;
            }

            this.a.K().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      @Override
      public boolean b() {
         return !this.a.K().l() && !this.c && !this.a.gw() && !this.a.gt() && !this.a.r();
      }

      @Override
      public void d() {
         this.a.z(false);
         super.d();
      }
   }
}
