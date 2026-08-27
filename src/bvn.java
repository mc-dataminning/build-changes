import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvn extends bum {
   private static final aec<gw> bW = aef.a(bvn.class, aee.n);
   private static final aec<Boolean> bX = aef.a(bvn.class, aee.k);
   private static final aec<Boolean> bY = aef.a(bvn.class, aee.k);
   private static final aec<gw> bZ = aef.a(bvn.class, aee.n);
   private static final aec<Boolean> ca = aef.a(bvn.class, aee.k);
   private static final aec<Boolean> cb = aef.a(bvn.class, aee.k);
   public static final cmb bT = cmb.a(csr.bw.k());
   int cc;
   public static final Predicate<bjb> bU = $$0 -> $$0.i_() && !$$0.aX();

   public bvn(bip<? extends bvn> $$0, cpq $$1) {
      super($$0, $$1);
      this.a(eas.j, 0.0F);
      this.a(eas.t, -1.0F);
      this.a(eas.s, -1.0F);
      this.a(eas.r, -1.0F);
      this.bL = new bvn.e(this);
      this.t(1.0F);
   }

   public void i(gw $$0) {
      this.an.b(bW, $$0);
   }

   gw ga() {
      return this.an.b(bW);
   }

   void j(gw $$0) {
      this.an.b(bZ, $$0);
   }

   gw gg() {
      return this.an.b(bZ);
   }

   @Override
   public boolean p() {
      return this.an.b(bX);
   }

   void w(boolean $$0) {
      this.an.b(bX, $$0);
   }

   public boolean q() {
      return this.an.b(bY);
   }

   void x(boolean $$0) {
      this.cc = $$0 ? 1 : 0;
      this.an.b(bY, $$0);
   }

   boolean gh() {
      return this.an.b(ca);
   }

   void y(boolean $$0) {
      this.an.b(ca, $$0);
   }

   boolean gi() {
      return this.an.b(cb);
   }

   void z(boolean $$0) {
      this.an.b(cb, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bW, gw.b);
      this.an.a(bX, false);
      this.an.a(bZ, gw.b);
      this.an.a(ca, false);
      this.an.a(cb, false);
      this.an.a(bY, false);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.ga().u());
      $$0.a("HomePosY", this.ga().v());
      $$0.a("HomePosZ", this.ga().w());
      $$0.a("HasEgg", this.p());
      $$0.a("TravelPosX", this.gg().u());
      $$0.a("TravelPosY", this.gg().v());
      $$0.a("TravelPosZ", this.gg().w());
   }

   @Override
   public void a(qu $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.i(new gw($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.j(new gw($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      this.i(this.dk());
      this.j(gw.b);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bip<bvn> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      return $$3.v() < $$1.t_() + 4 && dbh.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void w() {
      this.bO.a(0, new bvn.f(this, 1.2));
      this.bO.a(1, new bvn.a(this, 1.0));
      this.bO.a(1, new bvn.d(this, 1.0));
      this.bO.a(2, new bre(this, 1.1, bT, false));
      this.bO.a(3, new bvn.c(this, 1.0));
      this.bO.a(4, new bvn.b(this, 1.0));
      this.bO.a(7, new bvn.i(this, 1.0));
      this.bO.a(8, new bqe(this, cbp.class, 8.0F));
      this.bO.a(9, new bvn.h(this, 1.0, 100));
   }

   public static bkg.a t() {
      return bjd.x().a(bkh.a, 30.0).a(bkh.d, 0.25);
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   public boolean dP() {
      return true;
   }

   @Override
   public bjg eQ() {
      return bjg.e;
   }

   @Override
   public int L() {
      return 200;
   }

   @Nullable
   @Override
   protected aoy r() {
      return !this.aX() && this.aA() && !this.i_() ? aoz.yi : super.r();
   }

   @Override
   protected void e(float $$0) {
      super.e($$0 * 1.5F);
   }

   @Override
   protected aoy aL() {
      return aoz.yt;
   }

   @Nullable
   @Override
   protected aoy d(bhj $$0) {
      return this.i_() ? aoz.yp : aoz.yo;
   }

   @Nullable
   @Override
   protected aoy h_() {
      return this.i_() ? aoz.yk : aoz.yj;
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      aoy $$2 = this.i_() ? aoz.ys : aoz.yr;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gb() {
      return super.gb() && !this.p();
   }

   @Override
   protected float aK() {
      return this.Z + 0.15F;
   }

   @Override
   public float dX() {
      return this.i_() ? 0.3F : 1.0F;
   }

   @Override
   protected bsk b(cpq $$0) {
      return new bvn.g(this, $$0);
   }

   @Nullable
   @Override
   public big a(akn $$0, big $$1) {
      return bip.bd.a((cpq)$$0);
   }

   @Override
   public boolean m(cja $$0) {
      return $$0.a(csr.bw.k());
   }

   @Override
   public float a(gw $$0, cpt $$1) {
      if (!this.gh() && $$1.b_($$0).a(apt.a)) {
         return 10.0F;
      } else {
         return dbh.a($$1, $$0) ? 10.0F : $$1.v($$0);
      }
   }

   @Override
   public void b_() {
      super.b_();
      if (this.bv() && this.q() && this.cc >= 1 && this.cc % 5 == 0) {
         gw $$0 = this.dk();
         if (dbh.a(this.dK(), $$0)) {
            this.dK().c(2001, $$0, csq.i(this.dK().a_($$0.d())));
            this.a(djo.u);
         }
      }
   }

   @Override
   protected void m() {
      super.m();
      if (!this.i_() && this.dK().X().b(cpm.f)) {
         this.a(cjd.nD, 1);
      }
   }

   @Override
   public void h(ehi $$0) {
      if (this.cW() && this.aX()) {
         this.a(0.1F, $$0);
         this.a(bjh.a, this.dn());
         this.f(this.dn().a(0.9));
         if (this.j() == null && (!this.gh() || !this.ga().a(this.di(), 20.0))) {
            this.f(this.dn().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   @Override
   public boolean a(cbp $$0) {
      return false;
   }

   @Override
   public void a(akn $$0, bja $$1) {
      this.a(this.dL().b(), Float.MAX_VALUE);
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + (this.i_() ? 0.0F : 0.15625F) * $$2, -0.25F * $$2);
   }

   static class a extends bpi {
      private final bvn d;

      a(bvn $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.p();
      }

      @Override
      protected void g() {
         ako $$0 = this.a.gd();
         if ($$0 == null && this.c.gd() != null) {
            $$0 = this.c.gd();
         }

         if ($$0 != null) {
            $$0.a(apj.P);
            al.o.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gf();
         this.c.gf();
         arx $$1 = this.a.ee();
         if (this.b.X().b(cpm.f)) {
            this.b.b(new bir(this.b, this.a.dp(), this.a.dr(), this.a.dv(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends bpw {
      private final bvn a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(bvn $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         if (this.a.i_()) {
            return false;
         } else if (this.a.p()) {
            return true;
         } else {
            return this.a.ee().a(b(700)) != 0 ? false : !this.a.ga().a(this.a.di(), 64.0);
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
         return !this.a.ga().a(this.a.di(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void e() {
         gw $$0 = this.a.ga();
         boolean $$1 = $$0.a(this.a.di(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.H().l()) {
            ehi $$2 = ehi.c($$0);
            ehi $$3 = btr.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = btr.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dK().a_(gw.a($$3)).a(csr.G)) {
               $$3 = btr.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.H().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends bqj {
      private static final int g = 1200;
      private final bvn h;

      c(bvn $$0, double $$1) {
         super($$0, $$0.i_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean b() {
         return !this.h.aX() && this.d <= 1200 && this.a(this.h.dK(), this.e);
      }

      @Override
      public boolean a() {
         if (this.h.i_() && !this.h.aX()) {
            return super.a();
         } else {
            return !this.h.gh() && !this.h.aX() && !this.h.p() ? super.a() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(cpt $$0, gw $$1) {
         return $$0.a_($$1).a(csr.G);
      }
   }

   static class d extends bqj {
      private final bvn g;

      d(bvn $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return this.g.p() && this.g.ga().a(this.g.di(), 9.0) ? super.a() : false;
      }

      @Override
      public boolean b() {
         return super.b() && this.g.p() && this.g.ga().a(this.g.di(), 9.0);
      }

      @Override
      public void e() {
         super.e();
         gw $$0 = this.g.dk();
         if (!this.g.aX() && this.m()) {
            if (this.g.cc < 1) {
               this.g.x(true);
            } else if (this.g.cc > this.a(200)) {
               cpq $$1 = this.g.dK();
               $$1.a(null, $$0, aoz.yq, apa.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               gw $$2 = this.e.c();
               dfe $$3 = csr.mf.n().a(dbh.e, Integer.valueOf(this.g.ag.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(djo.i, $$2, djo.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.s(600);
            }

            if (this.g.q()) {
               this.g.cc++;
            }
         }
      }

      @Override
      protected boolean a(cpt $$0, gw $$1) {
         return !$$0.t($$1.c()) ? false : dbh.b($$0, $$1);
      }
   }

   static class e extends boz {
      private final bvn l;

      e(bvn $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.aX()) {
            this.l.f(this.l.dn().b(0.0, 0.005, 0.0));
            if (!this.l.ga().a(this.l.di(), 16.0)) {
               this.l.w(Math.max(this.l.fd() / 2.0F, 0.08F));
            }

            if (this.l.i_()) {
               this.l.w(Math.max(this.l.fd() / 3.0F, 0.06F));
            }
         } else if (this.l.aA()) {
            this.l.w(Math.max(this.l.fd() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == boz.a.b && !this.l.H().l()) {
            double $$0 = this.e - this.l.dp();
            double $$1 = this.f - this.l.dr();
            double $$2 = this.g - this.l.dv();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.w(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(ars.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dA(), $$4, 90.0F));
               this.l.aU = this.l.dA();
               float $$5 = (float)(this.h * this.l.b(bkh.d));
               this.l.w(ars.i(0.125F, this.l.fd(), $$5));
               this.l.f(this.l.dn().b(0.0, (double)this.l.fd() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class f extends bqp {
      f(bvn $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a() {
         if (!this.h()) {
            return false;
         } else {
            gw $$0 = this.a(this.b.dK(), this.b, 7);
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

   static class g extends bsh {
      g(bvn $$0, cpq $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(gw $$0) {
         if (this.a instanceof bvn $$1 && $$1.gi()) {
            return this.b.a_($$0).a(csr.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends bqt {
      private final bvn i;

      h(bvn $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.aX() && !this.i.gh() && !this.i.p() ? super.a() : false;
      }
   }

   static class i extends bpw {
      private final bvn a;
      private final double b;
      private boolean c;

      i(bvn $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         return !this.a.gh() && !this.a.p() && this.a.aX();
      }

      @Override
      public void c() {
         int $$0 = 512;
         int $$1 = 4;
         arx $$2 = this.a.ag;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dr() > (double)(this.a.dK().t_() - 1)) {
            $$4 = 0;
         }

         gw $$6 = gw.a((double)$$3 + this.a.dp(), (double)$$4 + this.a.dr(), (double)$$5 + this.a.dv());
         this.a.j($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void e() {
         if (this.a.H().l()) {
            ehi $$0 = ehi.c(this.a.gg());
            ehi $$1 = btr.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = btr.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = ars.a($$1.c);
               int $$3 = ars.a($$1.e);
               int $$4 = 34;
               if (!this.a.dK().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                  $$1 = null;
               }
            }

            if ($$1 == null) {
               this.c = true;
               return;
            }

            this.a.H().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      @Override
      public boolean b() {
         return !this.a.H().l() && !this.c && !this.a.gh() && !this.a.ge() && !this.a.p();
      }

      @Override
      public void d() {
         this.a.z(false);
         super.d();
      }
   }
}
