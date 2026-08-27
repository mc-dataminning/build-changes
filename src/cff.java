import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cff extends cee {
   private static final ajr<io> bZ = ajv.a(cff.class, ajt.o);
   private static final ajr<Boolean> cb = ajv.a(cff.class, ajt.k);
   private static final ajr<Boolean> cc = ajv.a(cff.class, ajt.k);
   private static final ajr<io> cd = ajv.a(cff.class, ajt.o);
   private static final ajr<Boolean> ce = ajv.a(cff.class, ajt.k);
   private static final ajr<Boolean> cf = ajv.a(cff.class, ajt.k);
   private static final float cg = 0.3F;
   private static final brx ch = bsa.bh.n().a(brw.a().a(brv.a, 0.0F, bsa.bh.m(), -0.25F)).a(0.3F);
   int ci;
   public static final Predicate<bso> bY = $$0 -> $$0.p_() && !$$0.be();

   public cff(bsa<? extends cff> $$0, dax $$1) {
      super($$0, $$1);
      this.a(enl.j, 0.0F);
      this.a(enl.t, -1.0F);
      this.a(enl.s, -1.0F);
      this.a(enl.r, -1.0F);
      this.bP = new cff.e(this);
   }

   public void i(io $$0) {
      this.ao.a(bZ, $$0);
   }

   io gp() {
      return this.ao.a(bZ);
   }

   void j(io $$0) {
      this.ao.a(cd, $$0);
   }

   io gv() {
      return this.ao.a(cd);
   }

   public boolean s() {
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
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(bZ, io.c);
      $$0.a(cb, false);
      $$0.a(cd, io.c);
      $$0.a(ce, false);
      $$0.a(cf, false);
      $$0.a(cc, false);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gp().u());
      $$0.a("HomePosY", this.gp().v());
      $$0.a("HomePosZ", this.gp().w());
      $$0.a("HasEgg", this.s());
      $$0.a("TravelPosX", this.gv().u());
      $$0.a("TravelPosY", this.gv().v());
      $$0.a("TravelPosZ", this.gv().w());
   }

   @Override
   public void a(ud $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.i(new io($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.j(new io($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      this.i(this.dp());
      this.j(io.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bsa<cff> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      return $$3.v() < $$1.z_() + 4 && dmq.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void z() {
      this.bS.a(0, new cff.f(this, 1.2));
      this.bS.a(1, new cff.a(this, 1.0));
      this.bS.a(1, new cff.d(this, 1.0));
      this.bS.a(2, new cau(this, 1.1, $$0 -> $$0.a(awe.av), false));
      this.bS.a(3, new cff.c(this, 1.0));
      this.bS.a(4, new cff.b(this, 1.0));
      this.bS.a(7, new cff.i(this, 1.0));
      this.bS.a(8, new bzu(this, clw.class, 8.0F));
      this.bS.a(9, new cff.h(this, 1.0, 100));
   }

   public static btv.a y() {
      return bsq.A().a(btw.q, 30.0).a(btw.r, 0.25).a(btw.v, 1.0);
   }

   @Override
   public boolean cC() {
      return false;
   }

   @Override
   public int O() {
      return 200;
   }

   @Nullable
   @Override
   protected avg v() {
      return !this.be() && this.aE() && !this.p_() ? avh.Ac : super.v();
   }

   @Override
   protected void e(float $$0) {
      super.e($$0 * 1.5F);
   }

   @Override
   protected avg aP() {
      return avh.An;
   }

   @Nullable
   @Override
   protected avg d(bqn $$0) {
      return this.p_() ? avh.Aj : avh.Ai;
   }

   @Nullable
   @Override
   protected avg o_() {
      return this.p_() ? avh.Ae : avh.Ad;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      avg $$2 = this.p_() ? avh.Am : avh.Al;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gq() {
      return super.gq() && !this.s();
   }

   @Override
   protected float aO() {
      return this.aa + 0.15F;
   }

   @Override
   public float ed() {
      return this.p_() ? 0.3F : 1.0F;
   }

   @Override
   protected cca b(dax $$0) {
      return new cff.g(this, $$0);
   }

   @Nullable
   @Override
   public bro a(aqm $$0, bro $$1) {
      return bsa.bh.a((dax)$$0);
   }

   @Override
   public boolean o(cto $$0) {
      return $$0.a(awe.av);
   }

   @Override
   public float a(io $$0, dba $$1) {
      if (!this.gw() && $$1.b_($$0).a(awb.a)) {
         return 10.0F;
      } else {
         return dmq.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bD() && this.u() && this.ci >= 1 && this.ci % 5 == 0) {
         io $$0 = this.dp();
         if (dmq.a(this.dP(), $$0)) {
            this.dP().c(2001, $$0, ddy.i(this.dP().a_($$0.d())));
            this.a(dvu.u);
         }
      }
   }

   @Override
   protected void k() {
      super.k();
      if (!this.p_() && this.dP().aa().b(dat.f)) {
         this.a(ctr.op, 1);
      }
   }

   @Override
   public void a(euk $$0) {
      if (this.da() && this.be()) {
         this.a(0.1F, $$0);
         this.a(bst.a, this.ds());
         this.g(this.ds().a(0.9));
         if (this.p() == null && (!this.gw() || !this.gp().a(this.dn(), 20.0))) {
            this.g(this.ds().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(clw $$0) {
      return false;
   }

   @Override
   public void a(aqm $$0, bsn $$1) {
      this.a(this.dQ().b(), Float.MAX_VALUE);
   }

   @Override
   public brx e(bta $$0) {
      return this.p_() ? ch : super.e($$0);
   }

   static class a extends byy {
      private final cff d;

      a(cff $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.s();
      }

      @Override
      protected void g() {
         aqn $$0 = this.a.gs();
         if ($$0 == null && this.c.gs() != null) {
            $$0 = this.c.gs();
         }

         if ($$0 != null) {
            $$0.a(avr.P);
            am.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gu();
         this.c.gu();
         ayk $$1 = this.a.el();
         if (this.b.aa().b(dat.f)) {
            this.b.b(new bse(this.b, this.a.du(), this.a.dw(), this.a.dA(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends bzm {
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
         if (this.a.p_()) {
            return false;
         } else if (this.a.s()) {
            return true;
         } else {
            return this.a.el().a(b(700)) != 0 ? false : !this.a.gp().a(this.a.dn(), 64.0);
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
         return !this.a.gp().a(this.a.dn(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void e() {
         io $$0 = this.a.gp();
         boolean $$1 = $$0.a(this.a.dn(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.K().l()) {
            euk $$2 = euk.c($$0);
            euk $$3 = cdj.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cdj.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dP().a_(io.a($$3)).a(dea.G)) {
               $$3 = cdj.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.K().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends bzz {
      private static final int g = 1200;
      private final cff h;

      c(cff $$0, double $$1) {
         super($$0, $$0.p_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean b() {
         return !this.h.be() && this.d <= 1200 && this.a(this.h.dP(), this.e);
      }

      @Override
      public boolean a() {
         if (this.h.p_() && !this.h.be()) {
            return super.a();
         } else {
            return !this.h.gw() && !this.h.be() && !this.h.s() ? super.a() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dba $$0, io $$1) {
         return $$0.a_($$1).a(dea.G);
      }
   }

   static class d extends bzz {
      private final cff g;

      d(cff $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return this.g.s() && this.g.gp().a(this.g.dn(), 9.0) ? super.a() : false;
      }

      @Override
      public boolean b() {
         return super.b() && this.g.s() && this.g.gp().a(this.g.dn(), 9.0);
      }

      @Override
      public void e() {
         super.e();
         io $$0 = this.g.dp();
         if (!this.g.be() && this.m()) {
            if (this.g.ci < 1) {
               this.g.x(true);
            } else if (this.g.ci > this.a(200)) {
               dax $$1 = this.g.dP();
               $$1.a(null, $$0, avh.Ak, avi.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               io $$2 = this.e.c();
               drb $$3 = dea.mf.n().a(dmq.f, Integer.valueOf(this.g.ah.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dvu.i, $$2, dvu.a.a(this.g, $$3));
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
      protected boolean a(dba $$0, io $$1) {
         return !$$0.u($$1.c()) ? false : dmq.b($$0, $$1);
      }
   }

   static class e extends byp {
      private final cff l;

      e(cff $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.be()) {
            this.l.g(this.l.ds().b(0.0, 0.005, 0.0));
            if (!this.l.gp().a(this.l.dn(), 16.0)) {
               this.l.y(Math.max(this.l.fn() / 2.0F, 0.08F));
            }

            if (this.l.p_()) {
               this.l.y(Math.max(this.l.fn() / 3.0F, 0.06F));
            }
         } else if (this.l.aE()) {
            this.l.y(Math.max(this.l.fn() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == byp.a.b && !this.l.K().l()) {
            double $$0 = this.e - this.l.du();
            double $$1 = this.f - this.l.dw();
            double $$2 = this.g - this.l.dA();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.y(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(ayd.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dF(), $$4, 90.0F));
               this.l.aZ = this.l.dF();
               float $$5 = (float)(this.h * this.l.g(btw.r));
               this.l.y(ayd.i(0.125F, this.l.fn(), $$5));
               this.l.g(this.l.ds().b(0.0, (double)this.l.fn() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.y(0.0F);
         }
      }
   }

   static class f extends caf {
      f(cff $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a() {
         if (!this.h()) {
            return false;
         } else {
            io $$0 = this.a(this.b.dP(), this.b, 7);
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

   static class g extends cbx {
      g(cff $$0, dax $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(io $$0) {
         if (this.a instanceof cff $$1 && $$1.gx()) {
            return this.b.a_($$0).a(dea.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends caj {
      private final cff i;

      h(cff $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.be() && !this.i.gw() && !this.i.s() ? super.a() : false;
      }
   }

   static class i extends bzm {
      private final cff a;
      private final double b;
      private boolean c;

      i(cff $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         return !this.a.gw() && !this.a.s() && this.a.be();
      }

      @Override
      public void c() {
         int $$0 = 512;
         int $$1 = 4;
         ayk $$2 = this.a.ah;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dw() > (double)(this.a.dP().z_() - 1)) {
            $$4 = 0;
         }

         io $$6 = io.a((double)$$3 + this.a.du(), (double)$$4 + this.a.dw(), (double)$$5 + this.a.dA());
         this.a.j($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void e() {
         if (this.a.K().l()) {
            euk $$0 = euk.c(this.a.gv());
            euk $$1 = cdj.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cdj.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = ayd.a($$1.c);
               int $$3 = ayd.a($$1.e);
               int $$4 = 34;
               if (!this.a.dP().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
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
         return !this.a.K().l() && !this.c && !this.a.gw() && !this.a.gt() && !this.a.s();
      }

      @Override
      public void d() {
         this.a.z(false);
         super.d();
      }
   }
}
