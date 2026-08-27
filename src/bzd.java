import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzd extends byc {
   private static final agn<hx> bX = agq.a(bzd.class, agp.n);
   private static final agn<Boolean> bY = agq.a(bzd.class, agp.k);
   private static final agn<Boolean> bZ = agq.a(bzd.class, agp.k);
   private static final agn<hx> ca = agq.a(bzd.class, agp.n);
   private static final agn<Boolean> cb = agq.a(bzd.class, agp.k);
   private static final agn<Boolean> cc = agq.a(bzd.class, agp.k);
   public static final cqh bU = cqh.a(cxa.bw.j());
   private static final float cd = 0.3F;
   private static final blz ce = bmc.bf.n().a(bly.a().a(blx.a, 0.0F, bmc.bf.l(), -0.25F)).a(0.3F);
   int cf;
   public static final Predicate<bmo> bV = $$0 -> $$0.o_() && !$$0.aZ();

   public bzd(bmc<? extends bzd> $$0, ctx $$1) {
      super($$0, $$1);
      this.a(efk.j, 0.0F);
      this.a(efk.t, -1.0F);
      this.a(efk.s, -1.0F);
      this.a(efk.r, -1.0F);
      this.bM = new bzd.e(this);
   }

   public void i(hx $$0) {
      this.an.b(bX, $$0);
   }

   hx gf() {
      return this.an.b(bX);
   }

   void j(hx $$0) {
      this.an.b(ca, $$0);
   }

   hx gl() {
      return this.an.b(ca);
   }

   @Override
   public boolean u() {
      return this.an.b(bY);
   }

   void w(boolean $$0) {
      this.an.b(bY, $$0);
   }

   public boolean w() {
      return this.an.b(bZ);
   }

   void x(boolean $$0) {
      this.cf = $$0 ? 1 : 0;
      this.an.b(bZ, $$0);
   }

   boolean gm() {
      return this.an.b(cb);
   }

   void y(boolean $$0) {
      this.an.b(cb, $$0);
   }

   boolean gn() {
      return this.an.b(cc);
   }

   void z(boolean $$0) {
      this.an.b(cc, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bX, hx.b);
      this.an.a(bY, false);
      this.an.a(ca, hx.b);
      this.an.a(cb, false);
      this.an.a(cc, false);
      this.an.a(bZ, false);
   }

   @Override
   public void b(so $$0) {
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
   public void a(so $$0) {
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
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      this.i(this.dl());
      this.j(hx.b);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bmc<bzd> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      return $$3.v() < $$1.A_() + 4 && dfp.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void B() {
      this.bP.a(0, new bzd.f(this, 1.2));
      this.bP.a(1, new bzd.a(this, 1.0));
      this.bP.a(1, new bzd.d(this, 1.0));
      this.bP.a(2, new bus(this, 1.1, bU, false));
      this.bP.a(3, new bzd.c(this, 1.0));
      this.bP.a(4, new bzd.b(this, 1.0));
      this.bP.a(7, new bzd.i(this, 1.0));
      this.bP.a(8, new bts(this, cfq.class, 8.0F));
      this.bP.a(9, new bzd.h(this, 1.0, 100));
   }

   public static bnt.a A() {
      return bmq.C().a(bnu.n, 30.0).a(bnu.o, 0.25).a(bnu.r, 1.0);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   public bmt eS() {
      return bmt.e;
   }

   @Override
   public int Q() {
      return 200;
   }

   @Nullable
   @Override
   protected ars y() {
      return !this.aZ() && this.aC() && !this.o_() ? art.zx : super.y();
   }

   @Override
   protected void e(float $$0) {
      super.e($$0 * 1.5F);
   }

   @Override
   protected ars aN() {
      return art.zI;
   }

   @Nullable
   @Override
   protected ars d(bkv $$0) {
      return this.o_() ? art.zE : art.zD;
   }

   @Nullable
   @Override
   protected ars n_() {
      return this.o_() ? art.zz : art.zy;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      ars $$2 = this.o_() ? art.zH : art.zG;
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
   public float dY() {
      return this.o_() ? 0.3F : 1.0F;
   }

   @Override
   protected bvy b(ctx $$0) {
      return new bzd.g(this, $$0);
   }

   @Nullable
   @Override
   public blr a(ane $$0, blr $$1) {
      return bmc.bf.a((ctx)$$0);
   }

   @Override
   public boolean m(cng $$0) {
      return $$0.a(cxa.bw.j());
   }

   @Override
   public float a(hx $$0, cua $$1) {
      if (!this.gm() && $$1.b_($$0).a(asn.a)) {
         return 10.0F;
      } else {
         return dfp.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bx() && this.w() && this.cf >= 1 && this.cf % 5 == 0) {
         hx $$0 = this.dl();
         if (dfp.a(this.dL(), $$0)) {
            this.dL().c(2001, $$0, cwy.i(this.dL().a_($$0.d())));
            this.b(dnz.u);
         }
      }
   }

   @Override
   protected void m() {
      super.m();
      if (!this.o_() && this.dL().Z().b(ctt.f)) {
         this.a(cnj.oo, 1);
      }
   }

   @Override
   public void a(emc $$0) {
      if (this.cX() && this.aZ()) {
         this.a(0.1F, $$0);
         this.a(bmu.a, this.do());
         this.g(this.do().a(0.9));
         if (this.q() == null && (!this.gm() || !this.gf().a(this.dj(), 20.0))) {
            this.g(this.do().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cfq $$0) {
      return false;
   }

   @Override
   public void a(ane $$0, bmn $$1) {
      this.a(this.dM().b(), Float.MAX_VALUE);
   }

   @Override
   public blz e(bna $$0) {
      return this.o_() ? ce : super.e($$0);
   }

   static class a extends bsw {
      private final bzd d;

      a(bzd $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.u();
      }

      @Override
      protected void g() {
         anf $$0 = this.a.gi();
         if ($$0 == null && this.c.gi() != null) {
            $$0 = this.c.gi();
         }

         if ($$0 != null) {
            $$0.a(asd.P);
            am.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gk();
         this.c.gk();
         auw $$1 = this.a.eg();
         if (this.b.Z().b(ctt.f)) {
            this.b.b(new bme(this.b, this.a.dq(), this.a.ds(), this.a.dw(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends btk {
      private final bzd a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(bzd $$0, double $$1) {
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
            return this.a.eg().a(b(700)) != 0 ? false : !this.a.gf().a(this.a.dj(), 64.0);
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
         return !this.a.gf().a(this.a.dj(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void e() {
         hx $$0 = this.a.gf();
         boolean $$1 = $$0.a(this.a.dj(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.N().l()) {
            emc $$2 = emc.c($$0);
            emc $$3 = bxh.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = bxh.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dL().a_(hx.a($$3)).a(cxa.G)) {
               $$3 = bxh.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.N().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends btx {
      private static final int g = 1200;
      private final bzd h;

      c(bzd $$0, double $$1) {
         super($$0, $$0.o_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean b() {
         return !this.h.aZ() && this.d <= 1200 && this.a(this.h.dL(), this.e);
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
      protected boolean a(cua $$0, hx $$1) {
         return $$0.a_($$1).a(cxa.G);
      }
   }

   static class d extends btx {
      private final bzd g;

      d(bzd $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return this.g.u() && this.g.gf().a(this.g.dj(), 9.0) ? super.a() : false;
      }

      @Override
      public boolean b() {
         return super.b() && this.g.u() && this.g.gf().a(this.g.dj(), 9.0);
      }

      @Override
      public void e() {
         super.e();
         hx $$0 = this.g.dl();
         if (!this.g.aZ() && this.m()) {
            if (this.g.cf < 1) {
               this.g.x(true);
            } else if (this.g.cf > this.a(200)) {
               ctx $$1 = this.g.dL();
               $$1.a(null, $$0, art.zF, aru.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               hx $$2 = this.e.c();
               djp $$3 = cxa.mf.o().a(dfp.f, Integer.valueOf(this.g.ag.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dnz.i, $$2, dnz.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.s(600);
            }

            if (this.g.w()) {
               this.g.cf++;
            }
         }
      }

      @Override
      protected boolean a(cua $$0, hx $$1) {
         return !$$0.u($$1.c()) ? false : dfp.b($$0, $$1);
      }
   }

   static class e extends bsn {
      private final bzd l;

      e(bzd $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.aZ()) {
            this.l.g(this.l.do().b(0.0, 0.005, 0.0));
            if (!this.l.gf().a(this.l.dj(), 16.0)) {
               this.l.v(Math.max(this.l.ff() / 2.0F, 0.08F));
            }

            if (this.l.o_()) {
               this.l.v(Math.max(this.l.ff() / 3.0F, 0.06F));
            }
         } else if (this.l.aC()) {
            this.l.v(Math.max(this.l.ff() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == bsn.a.b && !this.l.N().l()) {
            double $$0 = this.e - this.l.dq();
            double $$1 = this.f - this.l.ds();
            double $$2 = this.g - this.l.dw();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.v(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(aup.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dB(), $$4, 90.0F));
               this.l.aU = this.l.dB();
               float $$5 = (float)(this.h * this.l.g(bnu.o));
               this.l.v(aup.i(0.125F, this.l.ff(), $$5));
               this.l.g(this.l.do().b(0.0, (double)this.l.ff() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.v(0.0F);
         }
      }
   }

   static class f extends bud {
      f(bzd $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a() {
         if (!this.h()) {
            return false;
         } else {
            hx $$0 = this.a(this.b.dL(), this.b, 7);
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

   static class g extends bvv {
      g(bzd $$0, ctx $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(hx $$0) {
         if (this.a instanceof bzd $$1 && $$1.gn()) {
            return this.b.a_($$0).a(cxa.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends buh {
      private final bzd i;

      h(bzd $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.aZ() && !this.i.gm() && !this.i.u() ? super.a() : false;
      }
   }

   static class i extends btk {
      private final bzd a;
      private final double b;
      private boolean c;

      i(bzd $$0, double $$1) {
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
         auw $$2 = this.a.ag;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.ds() > (double)(this.a.dL().A_() - 1)) {
            $$4 = 0;
         }

         hx $$6 = hx.a((double)$$3 + this.a.dq(), (double)$$4 + this.a.ds(), (double)$$5 + this.a.dw());
         this.a.j($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void e() {
         if (this.a.N().l()) {
            emc $$0 = emc.c(this.a.gl());
            emc $$1 = bxh.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = bxh.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = aup.a($$1.c);
               int $$3 = aup.a($$1.e);
               int $$4 = 34;
               if (!this.a.dL().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
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
