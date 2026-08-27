import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cau extends bzt {
   private static final aie<hz> bW = aih.a(cau.class, aig.n);
   private static final aie<Boolean> bX = aih.a(cau.class, aig.k);
   private static final aie<Boolean> bY = aih.a(cau.class, aig.k);
   private static final aie<hz> bZ = aih.a(cau.class, aig.n);
   private static final aie<Boolean> ca = aih.a(cau.class, aig.k);
   private static final aie<Boolean> cb = aih.a(cau.class, aig.k);
   public static final cry bT = cry.a(cyq.bw.j());
   private static final float cc = 0.3F;
   private static final bnr cd = bnu.bf.n().a(bnq.a().a(bnp.a, 0.0F, bnu.bf.l(), -0.25F)).a(0.3F);
   int ce;
   public static final Predicate<bog> bU = $$0 -> $$0.o_() && !$$0.aZ();

   public cau(bnu<? extends cau> $$0, cvn $$1) {
      super($$0, $$1);
      this.a(eha.j, 0.0F);
      this.a(eha.t, -1.0F);
      this.a(eha.s, -1.0F);
      this.a(eha.r, -1.0F);
      this.bL = new cau.e(this);
   }

   public void i(hz $$0) {
      this.am.b(bW, $$0);
   }

   hz gg() {
      return this.am.b(bW);
   }

   void j(hz $$0) {
      this.am.b(bZ, $$0);
   }

   hz gm() {
      return this.am.b(bZ);
   }

   @Override
   public boolean u() {
      return this.am.b(bX);
   }

   void w(boolean $$0) {
      this.am.b(bX, $$0);
   }

   public boolean w() {
      return this.am.b(bY);
   }

   void x(boolean $$0) {
      this.ce = $$0 ? 1 : 0;
      this.am.b(bY, $$0);
   }

   boolean gn() {
      return this.am.b(ca);
   }

   void y(boolean $$0) {
      this.am.b(ca, $$0);
   }

   boolean go() {
      return this.am.b(cb);
   }

   void z(boolean $$0) {
      this.am.b(cb, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bW, hz.c);
      this.am.a(bX, false);
      this.am.a(bZ, hz.c);
      this.am.a(ca, false);
      this.am.a(cb, false);
      this.am.a(bY, false);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gg().u());
      $$0.a("HomePosY", this.gg().v());
      $$0.a("HomePosZ", this.gg().w());
      $$0.a("HasEgg", this.u());
      $$0.a("TravelPosX", this.gm().u());
      $$0.a("TravelPosY", this.gm().v());
      $$0.a("TravelPosZ", this.gm().w());
   }

   @Override
   public void a(sw $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.i(new hz($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.j(new hz($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      this.i(this.dm());
      this.j(hz.c);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bnu<cau> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      return $$3.v() < $$1.A_() + 4 && dhf.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void B() {
      this.bO.a(0, new cau.f(this, 1.2));
      this.bO.a(1, new cau.a(this, 1.0));
      this.bO.a(1, new cau.d(this, 1.0));
      this.bO.a(2, new bwj(this, 1.1, bT, false));
      this.bO.a(3, new cau.c(this, 1.0));
      this.bO.a(4, new cau.b(this, 1.0));
      this.bO.a(7, new cau.i(this, 1.0));
      this.bO.a(8, new bvj(this, chh.class, 8.0F));
      this.bO.a(9, new cau.h(this, 1.0, 100));
   }

   public static bpk.a A() {
      return boi.C().a(bpl.n, 30.0).a(bpl.o, 0.25).a(bpl.r, 1.0);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   public int Q() {
      return 200;
   }

   @Nullable
   @Override
   protected atj y() {
      return !this.aZ() && this.aC() && !this.o_() ? atk.zx : super.y();
   }

   @Override
   protected void e(float $$0) {
      super.e($$0 * 1.5F);
   }

   @Override
   protected atj aN() {
      return atk.zI;
   }

   @Nullable
   @Override
   protected atj d(bmn $$0) {
      return this.o_() ? atk.zE : atk.zD;
   }

   @Nullable
   @Override
   protected atj n_() {
      return this.o_() ? atk.zz : atk.zy;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      atj $$2 = this.o_() ? atk.zH : atk.zG;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gh() {
      return super.gh() && !this.u();
   }

   @Override
   protected float aM() {
      return this.Y + 0.15F;
   }

   @Override
   public float dZ() {
      return this.o_() ? 0.3F : 1.0F;
   }

   @Override
   protected bxp b(cvn $$0) {
      return new cau.g(this, $$0);
   }

   @Nullable
   @Override
   public bnj a(aov $$0, bnj $$1) {
      return bnu.bf.a((cvn)$$0);
   }

   @Override
   public boolean m(coz $$0) {
      return $$0.a(cyq.bw.j());
   }

   @Override
   public float a(hz $$0, cvq $$1) {
      if (!this.gn() && $$1.b_($$0).a(aue.a)) {
         return 10.0F;
      } else {
         return dhf.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bx() && this.w() && this.ce >= 1 && this.ce % 5 == 0) {
         hz $$0 = this.dm();
         if (dhf.a(this.dM(), $$0)) {
            this.dM().c(2001, $$0, cyo.i(this.dM().a_($$0.d())));
            this.b(dpp.u);
         }
      }
   }

   @Override
   protected void m() {
      super.m();
      if (!this.o_() && this.dM().Z().b(cvj.f)) {
         this.a(cpc.oo, 1);
      }
   }

   @Override
   public void a(ens $$0) {
      if (this.cX() && this.aZ()) {
         this.a(0.1F, $$0);
         this.a(bol.a, this.dp());
         this.g(this.dp().a(0.9));
         if (this.q() == null && (!this.gn() || !this.gg().a(this.dk(), 20.0))) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(chh $$0) {
      return false;
   }

   @Override
   public void a(aov $$0, bof $$1) {
      this.a(this.dN().b(), Float.MAX_VALUE);
   }

   @Override
   public bnr e(bor $$0) {
      return this.o_() ? cd : super.e($$0);
   }

   static class a extends bun {
      private final cau d;

      a(cau $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.u();
      }

      @Override
      protected void g() {
         aow $$0 = this.a.gj();
         if ($$0 == null && this.c.gj() != null) {
            $$0 = this.c.gj();
         }

         if ($$0 != null) {
            $$0.a(atu.P);
            am.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gl();
         this.c.gl();
         awo $$1 = this.a.eh();
         if (this.b.Z().b(cvj.f)) {
            this.b.b(new bnw(this.b, this.a.dr(), this.a.dt(), this.a.dx(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends bvb {
      private final cau a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(cau $$0, double $$1) {
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
            return this.a.eh().a(b(700)) != 0 ? false : !this.a.gg().a(this.a.dk(), 64.0);
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
         return !this.a.gg().a(this.a.dk(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void e() {
         hz $$0 = this.a.gg();
         boolean $$1 = $$0.a(this.a.dk(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.N().l()) {
            ens $$2 = ens.c($$0);
            ens $$3 = byy.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = byy.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dM().a_(hz.a($$3)).a(cyq.G)) {
               $$3 = byy.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.N().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends bvo {
      private static final int g = 1200;
      private final cau h;

      c(cau $$0, double $$1) {
         super($$0, $$0.o_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean b() {
         return !this.h.aZ() && this.d <= 1200 && this.a(this.h.dM(), this.e);
      }

      @Override
      public boolean a() {
         if (this.h.o_() && !this.h.aZ()) {
            return super.a();
         } else {
            return !this.h.gn() && !this.h.aZ() && !this.h.u() ? super.a() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(cvq $$0, hz $$1) {
         return $$0.a_($$1).a(cyq.G);
      }
   }

   static class d extends bvo {
      private final cau g;

      d(cau $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return this.g.u() && this.g.gg().a(this.g.dk(), 9.0) ? super.a() : false;
      }

      @Override
      public boolean b() {
         return super.b() && this.g.u() && this.g.gg().a(this.g.dk(), 9.0);
      }

      @Override
      public void e() {
         super.e();
         hz $$0 = this.g.dm();
         if (!this.g.aZ() && this.m()) {
            if (this.g.ce < 1) {
               this.g.x(true);
            } else if (this.g.ce > this.a(200)) {
               cvn $$1 = this.g.dM();
               $$1.a(null, $$0, atk.zF, atl.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               hz $$2 = this.e.c();
               dlf $$3 = cyq.mf.o().a(dhf.f, Integer.valueOf(this.g.af.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dpp.i, $$2, dpp.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.t(600);
            }

            if (this.g.w()) {
               this.g.ce++;
            }
         }
      }

      @Override
      protected boolean a(cvq $$0, hz $$1) {
         return !$$0.u($$1.c()) ? false : dhf.b($$0, $$1);
      }
   }

   static class e extends bue {
      private final cau l;

      e(cau $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.aZ()) {
            this.l.g(this.l.dp().b(0.0, 0.005, 0.0));
            if (!this.l.gg().a(this.l.dk(), 16.0)) {
               this.l.w(Math.max(this.l.ff() / 2.0F, 0.08F));
            }

            if (this.l.o_()) {
               this.l.w(Math.max(this.l.ff() / 3.0F, 0.06F));
            }
         } else if (this.l.aC()) {
            this.l.w(Math.max(this.l.ff() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == bue.a.b && !this.l.N().l()) {
            double $$0 = this.e - this.l.dr();
            double $$1 = this.f - this.l.dt();
            double $$2 = this.g - this.l.dx();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.w(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(awh.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dC(), $$4, 90.0F));
               this.l.aU = this.l.dC();
               float $$5 = (float)(this.h * this.l.g(bpl.o));
               this.l.w(awh.i(0.125F, this.l.ff(), $$5));
               this.l.g(this.l.dp().b(0.0, (double)this.l.ff() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class f extends bvu {
      f(cau $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a() {
         if (!this.h()) {
            return false;
         } else {
            hz $$0 = this.a(this.b.dM(), this.b, 7);
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

   static class g extends bxm {
      g(cau $$0, cvn $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(hz $$0) {
         if (this.a instanceof cau $$1 && $$1.go()) {
            return this.b.a_($$0).a(cyq.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends bvy {
      private final cau i;

      h(cau $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.aZ() && !this.i.gn() && !this.i.u() ? super.a() : false;
      }
   }

   static class i extends bvb {
      private final cau a;
      private final double b;
      private boolean c;

      i(cau $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         return !this.a.gn() && !this.a.u() && this.a.aZ();
      }

      @Override
      public void c() {
         int $$0 = 512;
         int $$1 = 4;
         awo $$2 = this.a.af;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dt() > (double)(this.a.dM().A_() - 1)) {
            $$4 = 0;
         }

         hz $$6 = hz.a((double)$$3 + this.a.dr(), (double)$$4 + this.a.dt(), (double)$$5 + this.a.dx());
         this.a.j($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void e() {
         if (this.a.N().l()) {
            ens $$0 = ens.c(this.a.gm());
            ens $$1 = byy.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = byy.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = awh.a($$1.c);
               int $$3 = awh.a($$1.e);
               int $$4 = 34;
               if (!this.a.dM().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
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
         return !this.a.N().l() && !this.c && !this.a.gn() && !this.a.gk() && !this.a.u();
      }

      @Override
      public void d() {
         this.a.z(false);
         super.d();
      }
   }
}
