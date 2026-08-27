import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdu extends cct {
   private static final ajk<im> cb = ajo.a(cdu.class, ajm.o);
   private static final ajk<Boolean> cc = ajo.a(cdu.class, ajm.k);
   private static final ajk<Boolean> cd = ajo.a(cdu.class, ajm.k);
   private static final ajk<im> ce = ajo.a(cdu.class, ajm.o);
   private static final ajk<Boolean> cf = ajo.a(cdu.class, ajm.k);
   private static final ajk<Boolean> cg = ajo.a(cdu.class, ajm.k);
   public static final cwd bY = cwd.a(dcx.bw.p());
   private static final float ch = 0.3F;
   private static final bqo ci = bqr.bg.n().a(bqn.a().a(bqm.a, 0.0F, bqr.bg.l(), -0.25F)).a(0.3F);
   int cj;
   public static final Predicate<bre> bZ = $$0 -> $$0.p_() && !$$0.bc();

   public cdu(bqr<? extends cdu> $$0, czu $$1) {
      super($$0, $$1);
      this.a(emi.j, 0.0F);
      this.a(emi.t, -1.0F);
      this.a(emi.s, -1.0F);
      this.a(emi.r, -1.0F);
      this.bP = new cdu.e(this);
   }

   public void i(im $$0) {
      this.ao.a(cb, $$0);
   }

   im gp() {
      return this.ao.a(cb);
   }

   void j(im $$0) {
      this.ao.a(ce, $$0);
   }

   im gv() {
      return this.ao.a(ce);
   }

   public boolean r() {
      return this.ao.a(cc);
   }

   void w(boolean $$0) {
      this.ao.a(cc, $$0);
   }

   public boolean u() {
      return this.ao.a(cd);
   }

   void x(boolean $$0) {
      this.cj = $$0 ? 1 : 0;
      this.ao.a(cd, $$0);
   }

   boolean gw() {
      return this.ao.a(cf);
   }

   void y(boolean $$0) {
      this.ao.a(cf, $$0);
   }

   boolean gx() {
      return this.ao.a(cg);
   }

   void z(boolean $$0) {
      this.ao.a(cg, $$0);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(cb, im.c);
      $$0.a(cc, false);
      $$0.a(ce, im.c);
      $$0.a(cf, false);
      $$0.a(cg, false);
      $$0.a(cd, false);
   }

   @Override
   public void b(ty $$0) {
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
   public void a(ty $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.i(new im($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.j(new im($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      this.i(this.dn());
      this.j(im.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bqr<cdu> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      return $$3.v() < $$1.z_() + 4 && dln.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void z() {
      this.bS.a(0, new cdu.f(this, 1.2));
      this.bS.a(1, new cdu.a(this, 1.0));
      this.bS.a(1, new cdu.d(this, 1.0));
      this.bS.a(2, new bzj(this, 1.1, bY, false));
      this.bS.a(3, new cdu.c(this, 1.0));
      this.bS.a(4, new cdu.b(this, 1.0));
      this.bS.a(7, new cdu.i(this, 1.0));
      this.bS.a(8, new byj(this, ckl.class, 8.0F));
      this.bS.a(9, new cdu.h(this, 1.0, 100));
   }

   public static bsk.a y() {
      return brg.A().a(bsl.q, 30.0).a(bsl.r, 0.25).a(bsl.v, 1.0);
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
   protected auy v() {
      return !this.bc() && this.aC() && !this.p_() ? auz.zQ : super.v();
   }

   @Override
   protected void e(float $$0) {
      super.e($$0 * 1.5F);
   }

   @Override
   protected auy aN() {
      return auz.Ab;
   }

   @Nullable
   @Override
   protected auy d(bpj $$0) {
      return this.p_() ? auz.zX : auz.zW;
   }

   @Nullable
   @Override
   protected auy o_() {
      return this.p_() ? auz.zS : auz.zR;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      auy $$2 = this.p_() ? auz.Aa : auz.zZ;
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
   protected cap b(czu $$0) {
      return new cdu.g(this, $$0);
   }

   @Nullable
   @Override
   public bqf a(aqe $$0, bqf $$1) {
      return bqr.bg.a((czu)$$0);
   }

   @Override
   public boolean o(csd $$0) {
      return $$0.a(dcx.bw.p());
   }

   @Override
   public float a(im $$0, czx $$1) {
      if (!this.gw() && $$1.b_($$0).a(avt.a)) {
         return 10.0F;
      } else {
         return dln.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bB() && this.u() && this.cj >= 1 && this.cj % 5 == 0) {
         im $$0 = this.dn();
         if (dln.a(this.dN(), $$0)) {
            this.dN().c(2001, $$0, dcv.i(this.dN().a_($$0.d())));
            this.a(dur.u);
         }
      }
   }

   @Override
   protected void k() {
      super.k();
      if (!this.p_() && this.dN().aa().b(czq.f)) {
         this.a(csg.op, 1);
      }
   }

   @Override
   public void a(etf $$0) {
      if (this.cY() && this.bc()) {
         this.a(0.1F, $$0);
         this.a(brj.a, this.dq());
         this.g(this.dq().a(0.9));
         if (this.p() == null && (!this.gw() || !this.gp().a(this.dl(), 20.0))) {
            this.g(this.dq().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(ckl $$0) {
      return false;
   }

   @Override
   public void a(aqe $$0, brd $$1) {
      this.a(this.dO().b(), Float.MAX_VALUE);
   }

   @Override
   public bqo e(brp $$0) {
      return this.p_() ? ci : super.e($$0);
   }

   static class a extends bxn {
      private final cdu d;

      a(cdu $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.r();
      }

      @Override
      protected void g() {
         aqf $$0 = this.a.gs();
         if ($$0 == null && this.c.gs() != null) {
            $$0 = this.c.gs();
         }

         if ($$0 != null) {
            $$0.a(avj.P);
            am.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gu();
         this.c.gu();
         ayd $$1 = this.a.ej();
         if (this.b.aa().b(czq.f)) {
            this.b.b(new bqu(this.b, this.a.ds(), this.a.du(), this.a.dy(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends byb {
      private final cdu a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(cdu $$0, double $$1) {
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
         im $$0 = this.a.gp();
         boolean $$1 = $$0.a(this.a.dl(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.K().l()) {
            etf $$2 = etf.c($$0);
            etf $$3 = cby.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cby.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dN().a_(im.a($$3)).a(dcx.G)) {
               $$3 = cby.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.K().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends byo {
      private static final int g = 1200;
      private final cdu h;

      c(cdu $$0, double $$1) {
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
      protected boolean a(czx $$0, im $$1) {
         return $$0.a_($$1).a(dcx.G);
      }
   }

   static class d extends byo {
      private final cdu g;

      d(cdu $$0, double $$1) {
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
         im $$0 = this.g.dn();
         if (!this.g.bc() && this.m()) {
            if (this.g.cj < 1) {
               this.g.x(true);
            } else if (this.g.cj > this.a(200)) {
               czu $$1 = this.g.dN();
               $$1.a(null, $$0, auz.zY, ava.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               im $$2 = this.e.c();
               dpy $$3 = dcx.mf.n().a(dln.f, Integer.valueOf(this.g.ah.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dur.i, $$2, dur.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.t(600);
            }

            if (this.g.u()) {
               this.g.cj++;
            }
         }
      }

      @Override
      protected boolean a(czx $$0, im $$1) {
         return !$$0.u($$1.c()) ? false : dln.b($$0, $$1);
      }
   }

   static class e extends bxe {
      private final cdu l;

      e(cdu $$0) {
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
         if (this.k == bxe.a.b && !this.l.K().l()) {
            double $$0 = this.e - this.l.ds();
            double $$1 = this.f - this.l.du();
            double $$2 = this.g - this.l.dy();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.y(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(axw.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dD(), $$4, 90.0F));
               this.l.aZ = this.l.dD();
               float $$5 = (float)(this.h * this.l.g(bsl.r));
               this.l.y(axw.i(0.125F, this.l.fl(), $$5));
               this.l.g(this.l.dq().b(0.0, (double)this.l.fl() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.y(0.0F);
         }
      }
   }

   static class f extends byu {
      f(cdu $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a() {
         if (!this.h()) {
            return false;
         } else {
            im $$0 = this.a(this.b.dN(), this.b, 7);
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

   static class g extends cam {
      g(cdu $$0, czu $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(im $$0) {
         if (this.a instanceof cdu $$1 && $$1.gx()) {
            return this.b.a_($$0).a(dcx.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends byy {
      private final cdu i;

      h(cdu $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.bc() && !this.i.gw() && !this.i.r() ? super.a() : false;
      }
   }

   static class i extends byb {
      private final cdu a;
      private final double b;
      private boolean c;

      i(cdu $$0, double $$1) {
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
         ayd $$2 = this.a.ah;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.du() > (double)(this.a.dN().z_() - 1)) {
            $$4 = 0;
         }

         im $$6 = im.a((double)$$3 + this.a.ds(), (double)$$4 + this.a.du(), (double)$$5 + this.a.dy());
         this.a.j($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void e() {
         if (this.a.K().l()) {
            etf $$0 = etf.c(this.a.gv());
            etf $$1 = cby.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cby.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = axw.a($$1.c);
               int $$3 = axw.a($$1.e);
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
