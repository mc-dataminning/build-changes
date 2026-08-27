import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxs extends bwr {
   private static final afo<ht> bW = afr.a(bxs.class, afq.n);
   private static final afo<Boolean> bX = afr.a(bxs.class, afq.k);
   private static final afo<Boolean> bY = afr.a(bxs.class, afq.k);
   private static final afo<ht> bZ = afr.a(bxs.class, afq.n);
   private static final afo<Boolean> ca = afr.a(bxs.class, afq.k);
   private static final afo<Boolean> cb = afr.a(bxs.class, afq.k);
   public static final cok bT = cok.a(cvc.bw.k());
   int cc;
   public static final Predicate<blg> bU = $$0 -> $$0.n_() && !$$0.aZ();

   public bxs(bku<? extends bxs> $$0, csa $$1) {
      super($$0, $$1);
      this.a(edd.j, 0.0F);
      this.a(edd.t, -1.0F);
      this.a(edd.s, -1.0F);
      this.a(edd.r, -1.0F);
      this.bL = new bxs.e(this);
      this.t(1.0F);
   }

   public void i(ht $$0) {
      this.an.b(bW, $$0);
   }

   ht gf() {
      return this.an.b(bW);
   }

   void j(ht $$0) {
      this.an.b(bZ, $$0);
   }

   ht gl() {
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
   protected void b_() {
      super.b_();
      this.an.a(bW, ht.b);
      this.an.a(bX, false);
      this.an.a(bZ, ht.b);
      this.an.a(ca, false);
      this.an.a(cb, false);
      this.an.a(bY, false);
   }

   @Override
   public void b(rz $$0) {
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
   public void a(rz $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.i(new ht($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.j(new ht($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      this.i(this.dn());
      this.j(ht.b);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bku<bxs> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      return $$3.v() < $$1.z_() + 4 && ddq.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void B() {
      this.bO.a(0, new bxs.f(this, 1.2));
      this.bO.a(1, new bxs.a(this, 1.0));
      this.bO.a(1, new bxs.d(this, 1.0));
      this.bO.a(2, new btj(this, 1.1, bT, false));
      this.bO.a(3, new bxs.c(this, 1.0));
      this.bO.a(4, new bxs.b(this, 1.0));
      this.bO.a(7, new bxs.i(this, 1.0));
      this.bO.a(8, new bsj(this, cdu.class, 8.0F));
      this.bO.a(9, new bxs.h(this, 1.0, 100));
   }

   public static bml.a A() {
      return bli.C().a(bmm.l, 30.0).a(bmm.m, 0.25);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   public bll eT() {
      return bll.e;
   }

   @Override
   public int Q() {
      return 200;
   }

   @Nullable
   @Override
   protected aqq y() {
      return !this.aZ() && this.aC() && !this.n_() ? aqr.yN : super.y();
   }

   @Override
   protected void e(float $$0) {
      super.e($$0 * 1.5F);
   }

   @Override
   protected aqq aN() {
      return aqr.yY;
   }

   @Nullable
   @Override
   protected aqq d(bjo $$0) {
      return this.n_() ? aqr.yU : aqr.yT;
   }

   @Nullable
   @Override
   protected aqq m_() {
      return this.n_() ? aqr.yP : aqr.yO;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      aqq $$2 = this.n_() ? aqr.yX : aqr.yW;
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
      return this.n_() ? 0.3F : 1.0F;
   }

   @Override
   protected bup b(csa $$0) {
      return new bxs.g(this, $$0);
   }

   @Nullable
   @Override
   public bkl a(ame $$0, bkl $$1) {
      return bku.bd.a((csa)$$0);
   }

   @Override
   public boolean m(clj $$0) {
      return $$0.a(cvc.bw.k());
   }

   @Override
   public float a(ht $$0, csd $$1) {
      if (!this.gm() && $$1.b_($$0).a(arl.a)) {
         return 10.0F;
      } else {
         return ddq.a($$1, $$0) ? 10.0F : $$1.v($$0);
      }
   }

   @Override
   public void c_() {
      super.c_();
      if (this.bx() && this.w() && this.cc >= 1 && this.cc % 5 == 0) {
         ht $$0 = this.dn();
         if (ddq.a(this.dN(), $$0)) {
            this.dN().c(2001, $$0, cva.i(this.dN().a_($$0.d())));
            this.a(dls.u);
         }
      }
   }

   @Override
   protected void m() {
      super.m();
      if (!this.n_() && this.dN().Y().b(crw.f)) {
         this.a(clm.oo, 1);
      }
   }

   @Override
   public void a(eju $$0) {
      if (this.cY() && this.aZ()) {
         this.a(0.1F, $$0);
         this.a(blm.a, this.dq());
         this.g(this.dq().a(0.9));
         if (this.q() == null && (!this.gm() || !this.gf().a(this.dl(), 20.0))) {
            this.g(this.dq().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cdu $$0) {
      return false;
   }

   @Override
   public void a(ame $$0, blf $$1) {
      this.a(this.dO().b(), Float.MAX_VALUE);
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + (this.n_() ? 0.0F : 0.15625F) * $$2, -0.25F * $$2);
   }

   static class a extends brn {
      private final bxs d;

      a(bxs $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.u();
      }

      @Override
      protected void g() {
         amf $$0 = this.a.gi();
         if ($$0 == null && this.c.gi() != null) {
            $$0 = this.c.gi();
         }

         if ($$0 != null) {
            $$0.a(arb.P);
            al.o.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gk();
         this.c.gk();
         ats $$1 = this.a.eh();
         if (this.b.Y().b(crw.f)) {
            this.b.b(new bkw(this.b, this.a.ds(), this.a.du(), this.a.dy(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends bsb {
      private final bxs a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(bxs $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         if (this.a.n_()) {
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
         ht $$0 = this.a.gf();
         boolean $$1 = $$0.a(this.a.dl(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.N().l()) {
            eju $$2 = eju.c($$0);
            eju $$3 = bvw.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = bvw.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dN().a_(ht.a($$3)).a(cvc.G)) {
               $$3 = bvw.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.N().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends bso {
      private static final int g = 1200;
      private final bxs h;

      c(bxs $$0, double $$1) {
         super($$0, $$0.n_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean b() {
         return !this.h.aZ() && this.d <= 1200 && this.a(this.h.dN(), this.e);
      }

      @Override
      public boolean a() {
         if (this.h.n_() && !this.h.aZ()) {
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
      protected boolean a(csd $$0, ht $$1) {
         return $$0.a_($$1).a(cvc.G);
      }
   }

   static class d extends bso {
      private final bxs g;

      d(bxs $$0, double $$1) {
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
         ht $$0 = this.g.dn();
         if (!this.g.aZ() && this.m()) {
            if (this.g.cc < 1) {
               this.g.x(true);
            } else if (this.g.cc > this.a(200)) {
               csa $$1 = this.g.dN();
               $$1.a(null, $$0, aqr.yV, aqs.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               ht $$2 = this.e.c();
               dhi $$3 = cvc.mf.o().a(ddq.f, Integer.valueOf(this.g.ag.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dls.i, $$2, dls.a.a(this.g, $$3));
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
      protected boolean a(csd $$0, ht $$1) {
         return !$$0.t($$1.c()) ? false : ddq.b($$0, $$1);
      }
   }

   static class e extends bre {
      private final bxs l;

      e(bxs $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.aZ()) {
            this.l.g(this.l.dq().b(0.0, 0.005, 0.0));
            if (!this.l.gf().a(this.l.dl(), 16.0)) {
               this.l.w(Math.max(this.l.fg() / 2.0F, 0.08F));
            }

            if (this.l.n_()) {
               this.l.w(Math.max(this.l.fg() / 3.0F, 0.06F));
            }
         } else if (this.l.aC()) {
            this.l.w(Math.max(this.l.fg() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == bre.a.b && !this.l.N().l()) {
            double $$0 = this.e - this.l.ds();
            double $$1 = this.f - this.l.du();
            double $$2 = this.g - this.l.dy();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.w(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(atm.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dD(), $$4, 90.0F));
               this.l.aU = this.l.dD();
               float $$5 = (float)(this.h * this.l.b(bmm.m));
               this.l.w(atm.i(0.125F, this.l.fg(), $$5));
               this.l.g(this.l.dq().b(0.0, (double)this.l.fg() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class f extends bsu {
      f(bxs $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a() {
         if (!this.h()) {
            return false;
         } else {
            ht $$0 = this.a(this.b.dN(), this.b, 7);
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

   static class g extends bum {
      g(bxs $$0, csa $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(ht $$0) {
         if (this.a instanceof bxs $$1 && $$1.gn()) {
            return this.b.a_($$0).a(cvc.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends bsy {
      private final bxs i;

      h(bxs $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.aZ() && !this.i.gm() && !this.i.u() ? super.a() : false;
      }
   }

   static class i extends bsb {
      private final bxs a;
      private final double b;
      private boolean c;

      i(bxs $$0, double $$1) {
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
         ats $$2 = this.a.ag;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.du() > (double)(this.a.dN().z_() - 1)) {
            $$4 = 0;
         }

         ht $$6 = ht.a((double)$$3 + this.a.ds(), (double)$$4 + this.a.du(), (double)$$5 + this.a.dy());
         this.a.j($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void e() {
         if (this.a.N().l()) {
            eju $$0 = eju.c(this.a.gl());
            eju $$1 = bvw.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = bvw.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = atm.a($$1.c);
               int $$3 = atm.a($$1.e);
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
