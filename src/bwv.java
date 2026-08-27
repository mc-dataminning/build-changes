import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwv extends bvu {
   private static final afc<ht> bW = aff.a(bwv.class, afe.n);
   private static final afc<Boolean> bX = aff.a(bwv.class, afe.k);
   private static final afc<Boolean> bY = aff.a(bwv.class, afe.k);
   private static final afc<ht> bZ = aff.a(bwv.class, afe.n);
   private static final afc<Boolean> ca = aff.a(bwv.class, afe.k);
   private static final afc<Boolean> cb = aff.a(bwv.class, afe.k);
   public static final cnk bT = cnk.a(cuc.bw.k());
   int cc;
   public static final Predicate<bkj> bU = $$0 -> $$0.n_() && !$$0.aX();

   public bwv(bjx<? extends bwv> $$0, cqz $$1) {
      super($$0, $$1);
      this.a(ebp.j, 0.0F);
      this.a(ebp.t, -1.0F);
      this.a(ebp.s, -1.0F);
      this.a(ebp.r, -1.0F);
      this.bL = new bwv.e(this);
      this.t(1.0F);
   }

   public void i(ht $$0) {
      this.an.b(bW, $$0);
   }

   ht ge() {
      return this.an.b(bW);
   }

   void j(ht $$0) {
      this.an.b(bZ, $$0);
   }

   ht gk() {
      return this.an.b(bZ);
   }

   public boolean s() {
      return this.an.b(bX);
   }

   void w(boolean $$0) {
      this.an.b(bX, $$0);
   }

   public boolean t() {
      return this.an.b(bY);
   }

   void x(boolean $$0) {
      this.cc = $$0 ? 1 : 0;
      this.an.b(bY, $$0);
   }

   boolean gl() {
      return this.an.b(ca);
   }

   void y(boolean $$0) {
      this.an.b(ca, $$0);
   }

   boolean gm() {
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
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.ge().u());
      $$0.a("HomePosY", this.ge().v());
      $$0.a("HomePosZ", this.ge().w());
      $$0.a("HasEgg", this.s());
      $$0.a("TravelPosX", this.gk().u());
      $$0.a("TravelPosY", this.gk().v());
      $$0.a("TravelPosZ", this.gk().w());
   }

   @Override
   public void a(rt $$0) {
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
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      this.i(this.dl());
      this.j(ht.b);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bjx<bwv> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      return $$3.v() < $$1.z_() + 4 && dco.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void z() {
      this.bO.a(0, new bwv.f(this, 1.2));
      this.bO.a(1, new bwv.a(this, 1.0));
      this.bO.a(1, new bwv.d(this, 1.0));
      this.bO.a(2, new bsm(this, 1.1, bT, false));
      this.bO.a(3, new bwv.c(this, 1.0));
      this.bO.a(4, new bwv.b(this, 1.0));
      this.bO.a(7, new bwv.i(this, 1.0));
      this.bO.a(8, new brm(this, ccx.class, 8.0F));
      this.bO.a(9, new bwv.h(this, 1.0, 100));
   }

   public static blo.a y() {
      return bkl.A().a(blp.l, 30.0).a(blp.m, 0.25);
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   public bko eR() {
      return bko.e;
   }

   @Override
   public int O() {
      return 200;
   }

   @Nullable
   @Override
   protected aqc w() {
      return !this.aX() && this.aA() && !this.n_() ? aqd.yk : super.w();
   }

   @Override
   protected void e(float $$0) {
      super.e($$0 * 1.5F);
   }

   @Override
   protected aqc aL() {
      return aqd.yv;
   }

   @Nullable
   @Override
   protected aqc d(bir $$0) {
      return this.n_() ? aqd.yr : aqd.yq;
   }

   @Nullable
   @Override
   protected aqc m_() {
      return this.n_() ? aqd.ym : aqd.yl;
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      aqc $$2 = this.n_() ? aqd.yu : aqd.yt;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gf() {
      return super.gf() && !this.s();
   }

   @Override
   protected float aK() {
      return this.Z + 0.15F;
   }

   @Override
   public float dY() {
      return this.n_() ? 0.3F : 1.0F;
   }

   @Override
   protected bts b(cqz $$0) {
      return new bwv.g(this, $$0);
   }

   @Nullable
   @Override
   public bjo a(alq $$0, bjo $$1) {
      return bjx.bd.a((cqz)$$0);
   }

   @Override
   public boolean m(ckj $$0) {
      return $$0.a(cuc.bw.k());
   }

   @Override
   public float a(ht $$0, crc $$1) {
      if (!this.gl() && $$1.b_($$0).a(aqx.a)) {
         return 10.0F;
      } else {
         return dco.a($$1, $$0) ? 10.0F : $$1.v($$0);
      }
   }

   @Override
   public void c_() {
      super.c_();
      if (this.bv() && this.t() && this.cc >= 1 && this.cc % 5 == 0) {
         ht $$0 = this.dl();
         if (dco.a(this.dL(), $$0)) {
            this.dL().c(2001, $$0, cua.i(this.dL().a_($$0.d())));
            this.a(dkl.u);
         }
      }
   }

   @Override
   protected void m() {
      super.m();
      if (!this.n_() && this.dL().X().b(cqv.f)) {
         this.a(ckm.nD, 1);
      }
   }

   @Override
   public void h(eif $$0) {
      if (this.cW() && this.aX()) {
         this.a(0.1F, $$0);
         this.a(bkp.a, this.do());
         this.f(this.do().a(0.9));
         if (this.q() == null && (!this.gl() || !this.ge().a(this.dj(), 20.0))) {
            this.f(this.do().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   @Override
   public boolean a(ccx $$0) {
      return false;
   }

   @Override
   public void a(alq $$0, bki $$1) {
      this.a(this.dM().b(), Float.MAX_VALUE);
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + (this.n_() ? 0.0F : 0.15625F) * $$2, -0.25F * $$2);
   }

   static class a extends bqq {
      private final bwv d;

      a(bwv $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.s();
      }

      @Override
      protected void g() {
         alr $$0 = this.a.gh();
         if ($$0 == null && this.c.gh() != null) {
            $$0 = this.c.gh();
         }

         if ($$0 != null) {
            $$0.a(aqn.P);
            al.o.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gj();
         this.c.gj();
         ate $$1 = this.a.ef();
         if (this.b.X().b(cqv.f)) {
            this.b.b(new bjz(this.b, this.a.dq(), this.a.ds(), this.a.dw(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends bre {
      private final bwv a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(bwv $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         if (this.a.n_()) {
            return false;
         } else if (this.a.s()) {
            return true;
         } else {
            return this.a.ef().a(b(700)) != 0 ? false : !this.a.ge().a(this.a.dj(), 64.0);
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
         return !this.a.ge().a(this.a.dj(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void e() {
         ht $$0 = this.a.ge();
         boolean $$1 = $$0.a(this.a.dj(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.L().l()) {
            eif $$2 = eif.c($$0);
            eif $$3 = buz.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = buz.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dL().a_(ht.a($$3)).a(cuc.G)) {
               $$3 = buz.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.L().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends brr {
      private static final int g = 1200;
      private final bwv h;

      c(bwv $$0, double $$1) {
         super($$0, $$0.n_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean b() {
         return !this.h.aX() && this.d <= 1200 && this.a(this.h.dL(), this.e);
      }

      @Override
      public boolean a() {
         if (this.h.n_() && !this.h.aX()) {
            return super.a();
         } else {
            return !this.h.gl() && !this.h.aX() && !this.h.s() ? super.a() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(crc $$0, ht $$1) {
         return $$0.a_($$1).a(cuc.G);
      }
   }

   static class d extends brr {
      private final bwv g;

      d(bwv $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return this.g.s() && this.g.ge().a(this.g.dj(), 9.0) ? super.a() : false;
      }

      @Override
      public boolean b() {
         return super.b() && this.g.s() && this.g.ge().a(this.g.dj(), 9.0);
      }

      @Override
      public void e() {
         super.e();
         ht $$0 = this.g.dl();
         if (!this.g.aX() && this.m()) {
            if (this.g.cc < 1) {
               this.g.x(true);
            } else if (this.g.cc > this.a(200)) {
               cqz $$1 = this.g.dL();
               $$1.a(null, $$0, aqd.ys, aqe.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               ht $$2 = this.e.c();
               dgb $$3 = cuc.mf.o().a(dco.f, Integer.valueOf(this.g.ag.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dkl.i, $$2, dkl.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.s(600);
            }

            if (this.g.t()) {
               this.g.cc++;
            }
         }
      }

      @Override
      protected boolean a(crc $$0, ht $$1) {
         return !$$0.t($$1.c()) ? false : dco.b($$0, $$1);
      }
   }

   static class e extends bqh {
      private final bwv l;

      e(bwv $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.aX()) {
            this.l.f(this.l.do().b(0.0, 0.005, 0.0));
            if (!this.l.ge().a(this.l.dj(), 16.0)) {
               this.l.w(Math.max(this.l.fe() / 2.0F, 0.08F));
            }

            if (this.l.n_()) {
               this.l.w(Math.max(this.l.fe() / 3.0F, 0.06F));
            }
         } else if (this.l.aA()) {
            this.l.w(Math.max(this.l.fe() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == bqh.a.b && !this.l.L().l()) {
            double $$0 = this.e - this.l.dq();
            double $$1 = this.f - this.l.ds();
            double $$2 = this.g - this.l.dw();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.w(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(asy.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dB(), $$4, 90.0F));
               this.l.aU = this.l.dB();
               float $$5 = (float)(this.h * this.l.b(blp.m));
               this.l.w(asy.i(0.125F, this.l.fe(), $$5));
               this.l.f(this.l.do().b(0.0, (double)this.l.fe() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class f extends brx {
      f(bwv $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a() {
         if (!this.h()) {
            return false;
         } else {
            ht $$0 = this.a(this.b.dL(), this.b, 7);
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

   static class g extends btp {
      g(bwv $$0, cqz $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(ht $$0) {
         if (this.a instanceof bwv $$1 && $$1.gm()) {
            return this.b.a_($$0).a(cuc.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends bsb {
      private final bwv i;

      h(bwv $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.aX() && !this.i.gl() && !this.i.s() ? super.a() : false;
      }
   }

   static class i extends bre {
      private final bwv a;
      private final double b;
      private boolean c;

      i(bwv $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         return !this.a.gl() && !this.a.s() && this.a.aX();
      }

      @Override
      public void c() {
         int $$0 = 512;
         int $$1 = 4;
         ate $$2 = this.a.ag;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.ds() > (double)(this.a.dL().z_() - 1)) {
            $$4 = 0;
         }

         ht $$6 = ht.a((double)$$3 + this.a.dq(), (double)$$4 + this.a.ds(), (double)$$5 + this.a.dw());
         this.a.j($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void e() {
         if (this.a.L().l()) {
            eif $$0 = eif.c(this.a.gk());
            eif $$1 = buz.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = buz.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = asy.a($$1.c);
               int $$3 = asy.a($$1.e);
               int $$4 = 34;
               if (!this.a.dL().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                  $$1 = null;
               }
            }

            if ($$1 == null) {
               this.c = true;
               return;
            }

            this.a.L().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      @Override
      public boolean b() {
         return !this.a.L().l() && !this.c && !this.a.gl() && !this.a.gi() && !this.a.s();
      }

      @Override
      public void d() {
         this.a.z(false);
         super.d();
      }
   }
}
