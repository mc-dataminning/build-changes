import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxx extends bww {
   private static final afs<hx> bW = afv.a(bxx.class, afu.n);
   private static final afs<Boolean> bX = afv.a(bxx.class, afu.k);
   private static final afs<Boolean> bY = afv.a(bxx.class, afu.k);
   private static final afs<hx> bZ = afv.a(bxx.class, afu.n);
   private static final afs<Boolean> ca = afv.a(bxx.class, afu.k);
   private static final afs<Boolean> cb = afv.a(bxx.class, afu.k);
   public static final coq bT = coq.a(cvh.bw.k());
   int cc;
   public static final Predicate<bll> bU = $$0 -> $$0.o_() && !$$0.aZ();

   public bxx(bkz<? extends bxx> $$0, csf $$1) {
      super($$0, $$1);
      this.a(edi.j, 0.0F);
      this.a(edi.t, -1.0F);
      this.a(edi.s, -1.0F);
      this.a(edi.r, -1.0F);
      this.bL = new bxx.e(this);
      this.t(1.0F);
   }

   public void i(hx $$0) {
      this.an.b(bW, $$0);
   }

   hx gf() {
      return this.an.b(bW);
   }

   void j(hx $$0) {
      this.an.b(bZ, $$0);
   }

   hx gl() {
      return this.an.b(bZ);
   }

   @Override
   public boolean u() {
      return this.an.b(bX);
   }

   void w(boolean $$0) {
      this.an.b(bX, $$0);
   }

   public boolean w() {
      return this.an.b(bY);
   }

   void x(boolean $$0) {
      this.cc = $$0 ? 1 : 0;
      this.an.b(bY, $$0);
   }

   boolean gm() {
      return this.an.b(ca);
   }

   void y(boolean $$0) {
      this.an.b(ca, $$0);
   }

   boolean gn() {
      return this.an.b(cb);
   }

   void z(boolean $$0) {
      this.an.b(cb, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bW, hx.b);
      this.an.a(bX, false);
      this.an.a(bZ, hx.b);
      this.an.a(ca, false);
      this.an.a(cb, false);
      this.an.a(bY, false);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gf().u());
      $$0.a("HomePosY", this.gf().v());
      $$0.a("HomePosZ", this.gf().w());
      $$0.a("HasEgg", this.u());
      $$0.a("TravelPosX", this.gl().u());
      $$0.a("TravelPosY", this.gl().v());
      $$0.a("TravelPosZ", this.gl().w());
   }

   @Override
   public void a(sd $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.i(new hx($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.j(new hx($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      this.i(this.dn());
      this.j(hx.b);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bkz<bxx> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      return $$3.v() < $$1.A_() + 4 && ddv.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void B() {
      this.bO.a(0, new bxx.f(this, 1.2));
      this.bO.a(1, new bxx.a(this, 1.0));
      this.bO.a(1, new bxx.d(this, 1.0));
      this.bO.a(2, new bto(this, 1.1, bT, false));
      this.bO.a(3, new bxx.c(this, 1.0));
      this.bO.a(4, new bxx.b(this, 1.0));
      this.bO.a(7, new bxx.i(this, 1.0));
      this.bO.a(8, new bso(this, cdz.class, 8.0F));
      this.bO.a(9, new bxx.h(this, 1.0, 100));
   }

   public static bmq.a A() {
      return bln.C().a(bmr.l, 30.0).a(bmr.m, 0.25);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   public blq eT() {
      return blq.e;
   }

   @Override
   public int Q() {
      return 200;
   }

   @Nullable
   @Override
   protected aqu y() {
      return !this.aZ() && this.aC() && !this.o_() ? aqv.yN : super.y();
   }

   @Override
   protected void e(float $$0) {
      super.e($$0 * 1.5F);
   }

   @Override
   protected aqu aN() {
      return aqv.yY;
   }

   @Nullable
   @Override
   protected aqu d(bjt $$0) {
      return this.o_() ? aqv.yU : aqv.yT;
   }

   @Nullable
   @Override
   protected aqu n_() {
      return this.o_() ? aqv.yP : aqv.yO;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      aqu $$2 = this.o_() ? aqv.yX : aqv.yW;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gg() {
      return super.gg() && !this.u();
   }

   @Override
   protected float aM() {
      return this.Z + 0.15F;
   }

   @Override
   public float ea() {
      return this.o_() ? 0.3F : 1.0F;
   }

   @Override
   protected buu b(csf $$0) {
      return new bxx.g(this, $$0);
   }

   @Nullable
   @Override
   public bkq a(ami $$0, bkq $$1) {
      return bkz.bd.a((csf)$$0);
   }

   @Override
   public boolean m(clo $$0) {
      return $$0.a(cvh.bw.k());
   }

   @Override
   public float a(hx $$0, csi $$1) {
      if (!this.gm() && $$1.b_($$0).a(arp.a)) {
         return 10.0F;
      } else {
         return ddv.a($$1, $$0) ? 10.0F : $$1.v($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bx() && this.w() && this.cc >= 1 && this.cc % 5 == 0) {
         hx $$0 = this.dn();
         if (ddv.a(this.dN(), $$0)) {
            this.dN().c(2001, $$0, cvf.i(this.dN().a_($$0.d())));
            this.a(dlx.u);
         }
      }
   }

   @Override
   protected void m() {
      super.m();
      if (!this.o_() && this.dN().Y().b(csb.f)) {
         this.a(clr.oo, 1);
      }
   }

   @Override
   public void a(ejz $$0) {
      if (this.cY() && this.aZ()) {
         this.a(0.1F, $$0);
         this.a(blr.a, this.dq());
         this.g(this.dq().a(0.9));
         if (this.q() == null && (!this.gm() || !this.gf().a(this.dl(), 20.0))) {
            this.g(this.dq().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cdz $$0) {
      return false;
   }

   @Override
   public void a(ami $$0, blk $$1) {
      this.a(this.dO().b(), Float.MAX_VALUE);
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + (this.o_() ? 0.0F : 0.15625F) * $$2, -0.25F * $$2);
   }

   static class a extends brs {
      private final bxx d;

      a(bxx $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.u();
      }

      @Override
      protected void g() {
         amj $$0 = this.a.gi();
         if ($$0 == null && this.c.gi() != null) {
            $$0 = this.c.gi();
         }

         if ($$0 != null) {
            $$0.a(arf.P);
            al.o.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gk();
         this.c.gk();
         atw $$1 = this.a.eh();
         if (this.b.Y().b(csb.f)) {
            this.b.b(new blb(this.b, this.a.ds(), this.a.du(), this.a.dy(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends bsg {
      private final bxx a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(bxx $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         if (this.a.o_()) {
            return false;
         } else if (this.a.u()) {
            return true;
         } else {
            return this.a.eh().a(b(700)) != 0 ? false : !this.a.gf().a(this.a.dl(), 64.0);
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
         return !this.a.gf().a(this.a.dl(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void e() {
         hx $$0 = this.a.gf();
         boolean $$1 = $$0.a(this.a.dl(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.N().l()) {
            ejz $$2 = ejz.c($$0);
            ejz $$3 = bwb.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = bwb.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dN().a_(hx.a($$3)).a(cvh.G)) {
               $$3 = bwb.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.N().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends bst {
      private static final int g = 1200;
      private final bxx h;

      c(bxx $$0, double $$1) {
         super($$0, $$0.o_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean b() {
         return !this.h.aZ() && this.d <= 1200 && this.a(this.h.dN(), this.e);
      }

      @Override
      public boolean a() {
         if (this.h.o_() && !this.h.aZ()) {
            return super.a();
         } else {
            return !this.h.gm() && !this.h.aZ() && !this.h.u() ? super.a() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(csi $$0, hx $$1) {
         return $$0.a_($$1).a(cvh.G);
      }
   }

   static class d extends bst {
      private final bxx g;

      d(bxx $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return this.g.u() && this.g.gf().a(this.g.dl(), 9.0) ? super.a() : false;
      }

      @Override
      public boolean b() {
         return super.b() && this.g.u() && this.g.gf().a(this.g.dl(), 9.0);
      }

      @Override
      public void e() {
         super.e();
         hx $$0 = this.g.dn();
         if (!this.g.aZ() && this.m()) {
            if (this.g.cc < 1) {
               this.g.x(true);
            } else if (this.g.cc > this.a(200)) {
               csf $$1 = this.g.dN();
               $$1.a(null, $$0, aqv.yV, aqw.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               hx $$2 = this.e.c();
               dhn $$3 = cvh.mf.o().a(ddv.f, Integer.valueOf(this.g.ag.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dlx.i, $$2, dlx.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.s(600);
            }

            if (this.g.w()) {
               this.g.cc++;
            }
         }
      }

      @Override
      protected boolean a(csi $$0, hx $$1) {
         return !$$0.t($$1.c()) ? false : ddv.b($$0, $$1);
      }
   }

   static class e extends brj {
      private final bxx l;

      e(bxx $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.aZ()) {
            this.l.g(this.l.dq().b(0.0, 0.005, 0.0));
            if (!this.l.gf().a(this.l.dl(), 16.0)) {
               this.l.w(Math.max(this.l.fg() / 2.0F, 0.08F));
            }

            if (this.l.o_()) {
               this.l.w(Math.max(this.l.fg() / 3.0F, 0.06F));
            }
         } else if (this.l.aC()) {
            this.l.w(Math.max(this.l.fg() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == brj.a.b && !this.l.N().l()) {
            double $$0 = this.e - this.l.ds();
            double $$1 = this.f - this.l.du();
            double $$2 = this.g - this.l.dy();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.w(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(atq.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dD(), $$4, 90.0F));
               this.l.aU = this.l.dD();
               float $$5 = (float)(this.h * this.l.b(bmr.m));
               this.l.w(atq.i(0.125F, this.l.fg(), $$5));
               this.l.g(this.l.dq().b(0.0, (double)this.l.fg() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class f extends bsz {
      f(bxx $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a() {
         if (!this.h()) {
            return false;
         } else {
            hx $$0 = this.a(this.b.dN(), this.b, 7);
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

   static class g extends bur {
      g(bxx $$0, csf $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(hx $$0) {
         if (this.a instanceof bxx $$1 && $$1.gn()) {
            return this.b.a_($$0).a(cvh.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends btd {
      private final bxx i;

      h(bxx $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.aZ() && !this.i.gm() && !this.i.u() ? super.a() : false;
      }
   }

   static class i extends bsg {
      private final bxx a;
      private final double b;
      private boolean c;

      i(bxx $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         return !this.a.gm() && !this.a.u() && this.a.aZ();
      }

      @Override
      public void c() {
         int $$0 = 512;
         int $$1 = 4;
         atw $$2 = this.a.ag;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.du() > (double)(this.a.dN().A_() - 1)) {
            $$4 = 0;
         }

         hx $$6 = hx.a((double)$$3 + this.a.ds(), (double)$$4 + this.a.du(), (double)$$5 + this.a.dy());
         this.a.j($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void e() {
         if (this.a.N().l()) {
            ejz $$0 = ejz.c(this.a.gl());
            ejz $$1 = bwb.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = bwb.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = atq.a($$1.c);
               int $$3 = atq.a($$1.e);
               int $$4 = 34;
               if (!this.a.dN().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
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
      public boolean b() {
         return !this.a.N().l() && !this.c && !this.a.gm() && !this.a.gj() && !this.a.u();
      }

      @Override
      public void d() {
         this.a.z(false);
         super.d();
      }
   }
}
