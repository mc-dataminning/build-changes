import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byy extends bxx {
   private static final agm<hx> bW = agp.a(byy.class, ago.n);
   private static final agm<Boolean> bX = agp.a(byy.class, ago.k);
   private static final agm<Boolean> bY = agp.a(byy.class, ago.k);
   private static final agm<hx> bZ = agp.a(byy.class, ago.n);
   private static final agm<Boolean> ca = agp.a(byy.class, ago.k);
   private static final agm<Boolean> cb = agp.a(byy.class, ago.k);
   public static final cpy bT = cpy.a(cwr.bw.k());
   int cc;
   public static final Predicate<bmk> bU = $$0 -> $$0.o_() && !$$0.aZ();

   public byy(bly<? extends byy> $$0, cto $$1) {
      super($$0, $$1);
      this.a(efb.j, 0.0F);
      this.a(efb.t, -1.0F);
      this.a(efb.s, -1.0F);
      this.a(efb.r, -1.0F);
      this.bL = new byy.e(this);
      this.t(1.0F);
   }

   public void i(hx $$0) {
      this.an.b(bW, $$0);
   }

   hx ge() {
      return this.an.b(bW);
   }

   void j(hx $$0) {
      this.an.b(bZ, $$0);
   }

   hx gk() {
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
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.ge().u());
      $$0.a("HomePosY", this.ge().v());
      $$0.a("HomePosZ", this.ge().w());
      $$0.a("HasEgg", this.u());
      $$0.a("TravelPosX", this.gk().u());
      $$0.a("TravelPosY", this.gk().v());
      $$0.a("TravelPosZ", this.gk().w());
   }

   @Override
   public void a(sn $$0) {
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
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      this.i(this.dm());
      this.j(hx.b);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bly<byy> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      return $$3.v() < $$1.A_() + 4 && dfg.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void B() {
      this.bO.a(0, new byy.f(this, 1.2));
      this.bO.a(1, new byy.a(this, 1.0));
      this.bO.a(1, new byy.d(this, 1.0));
      this.bO.a(2, new buo(this, 1.1, bT, false));
      this.bO.a(3, new byy.c(this, 1.0));
      this.bO.a(4, new byy.b(this, 1.0));
      this.bO.a(7, new byy.i(this, 1.0));
      this.bO.a(8, new bto(this, cfh.class, 8.0F));
      this.bO.a(9, new byy.h(this, 1.0, 100));
   }

   public static bnp.a A() {
      return bmm.C().a(bnq.l, 30.0).a(bnq.m, 0.25);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   public bmp eS() {
      return bmp.e;
   }

   @Override
   public int Q() {
      return 200;
   }

   @Nullable
   @Override
   protected arq y() {
      return !this.aZ() && this.aC() && !this.o_() ? arr.zi : super.y();
   }

   @Override
   protected void e(float $$0) {
      super.e($$0 * 1.5F);
   }

   @Override
   protected arq aN() {
      return arr.zt;
   }

   @Nullable
   @Override
   protected arq d(bks $$0) {
      return this.o_() ? arr.zp : arr.zo;
   }

   @Nullable
   @Override
   protected arq n_() {
      return this.o_() ? arr.zk : arr.zj;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      arq $$2 = this.o_() ? arr.zs : arr.zr;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gf() {
      return super.gf() && !this.u();
   }

   @Override
   protected float aM() {
      return this.Z + 0.15F;
   }

   @Override
   public float dZ() {
      return this.o_() ? 0.3F : 1.0F;
   }

   @Override
   protected bvu b(cto $$0) {
      return new byy.g(this, $$0);
   }

   @Nullable
   @Override
   public blp a(and $$0, blp $$1) {
      return bly.be.a((cto)$$0);
   }

   @Override
   public boolean m(cmx $$0) {
      return $$0.a(cwr.bw.k());
   }

   @Override
   public float a(hx $$0, ctr $$1) {
      if (!this.gl() && $$1.b_($$0).a(asl.a)) {
         return 10.0F;
      } else {
         return dfg.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bx() && this.w() && this.cc >= 1 && this.cc % 5 == 0) {
         hx $$0 = this.dm();
         if (dfg.a(this.dM(), $$0)) {
            this.dM().c(2001, $$0, cwp.i(this.dM().a_($$0.d())));
            this.a(dnq.u);
         }
      }
   }

   @Override
   protected void m() {
      super.m();
      if (!this.o_() && this.dM().Z().b(ctk.f)) {
         this.a(cna.oo, 1);
      }
   }

   @Override
   public void a(els $$0) {
      if (this.cX() && this.aZ()) {
         this.a(0.1F, $$0);
         this.a(bmq.a, this.dp());
         this.g(this.dp().a(0.9));
         if (this.q() == null && (!this.gl() || !this.ge().a(this.dk(), 20.0))) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cfh $$0) {
      return false;
   }

   @Override
   public void a(and $$0, bmj $$1) {
      this.a(this.dN().b(), Float.MAX_VALUE);
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + (this.o_() ? 0.0F : 0.15625F) * $$2, -0.25F * $$2);
   }

   static class a extends bss {
      private final byy d;

      a(byy $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.u();
      }

      @Override
      protected void g() {
         ane $$0 = this.a.gh();
         if ($$0 == null && this.c.gh() != null) {
            $$0 = this.c.gh();
         }

         if ($$0 != null) {
            $$0.a(asb.P);
            am.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gj();
         this.c.gj();
         auu $$1 = this.a.eg();
         if (this.b.Z().b(ctk.f)) {
            this.b.b(new bma(this.b, this.a.dr(), this.a.dt(), this.a.dx(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends btg {
      private final byy a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(byy $$0, double $$1) {
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
            return this.a.eg().a(b(700)) != 0 ? false : !this.a.ge().a(this.a.dk(), 64.0);
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
         return !this.a.ge().a(this.a.dk(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void e() {
         hx $$0 = this.a.ge();
         boolean $$1 = $$0.a(this.a.dk(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.N().l()) {
            els $$2 = els.c($$0);
            els $$3 = bxc.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = bxc.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dM().a_(hx.a($$3)).a(cwr.G)) {
               $$3 = bxc.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.N().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends btt {
      private static final int g = 1200;
      private final byy h;

      c(byy $$0, double $$1) {
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
            return !this.h.gl() && !this.h.aZ() && !this.h.u() ? super.a() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(ctr $$0, hx $$1) {
         return $$0.a_($$1).a(cwr.G);
      }
   }

   static class d extends btt {
      private final byy g;

      d(byy $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return this.g.u() && this.g.ge().a(this.g.dk(), 9.0) ? super.a() : false;
      }

      @Override
      public boolean b() {
         return super.b() && this.g.u() && this.g.ge().a(this.g.dk(), 9.0);
      }

      @Override
      public void e() {
         super.e();
         hx $$0 = this.g.dm();
         if (!this.g.aZ() && this.m()) {
            if (this.g.cc < 1) {
               this.g.x(true);
            } else if (this.g.cc > this.a(200)) {
               cto $$1 = this.g.dM();
               $$1.a(null, $$0, arr.zq, ars.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               hx $$2 = this.e.c();
               djg $$3 = cwr.mf.o().a(dfg.f, Integer.valueOf(this.g.ag.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dnq.i, $$2, dnq.a.a(this.g, $$3));
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
      protected boolean a(ctr $$0, hx $$1) {
         return !$$0.u($$1.c()) ? false : dfg.b($$0, $$1);
      }
   }

   static class e extends bsj {
      private final byy l;

      e(byy $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.aZ()) {
            this.l.g(this.l.dp().b(0.0, 0.005, 0.0));
            if (!this.l.ge().a(this.l.dk(), 16.0)) {
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
         if (this.k == bsj.a.b && !this.l.N().l()) {
            double $$0 = this.e - this.l.dr();
            double $$1 = this.f - this.l.dt();
            double $$2 = this.g - this.l.dx();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.w(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(aun.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dC(), $$4, 90.0F));
               this.l.aU = this.l.dC();
               float $$5 = (float)(this.h * this.l.b(bnq.m));
               this.l.w(aun.i(0.125F, this.l.ff(), $$5));
               this.l.g(this.l.dp().b(0.0, (double)this.l.ff() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class f extends btz {
      f(byy $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a() {
         if (!this.h()) {
            return false;
         } else {
            hx $$0 = this.a(this.b.dM(), this.b, 7);
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

   static class g extends bvr {
      g(byy $$0, cto $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(hx $$0) {
         if (this.a instanceof byy $$1 && $$1.gm()) {
            return this.b.a_($$0).a(cwr.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends bud {
      private final byy i;

      h(byy $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.aZ() && !this.i.gl() && !this.i.u() ? super.a() : false;
      }
   }

   static class i extends btg {
      private final byy a;
      private final double b;
      private boolean c;

      i(byy $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         return !this.a.gl() && !this.a.u() && this.a.aZ();
      }

      @Override
      public void c() {
         int $$0 = 512;
         int $$1 = 4;
         auu $$2 = this.a.ag;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dt() > (double)(this.a.dM().A_() - 1)) {
            $$4 = 0;
         }

         hx $$6 = hx.a((double)$$3 + this.a.dr(), (double)$$4 + this.a.dt(), (double)$$5 + this.a.dx());
         this.a.j($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void e() {
         if (this.a.N().l()) {
            els $$0 = els.c(this.a.gk());
            els $$1 = bxc.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = bxc.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = aun.a($$1.c);
               int $$3 = aun.a($$1.e);
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
         return !this.a.N().l() && !this.c && !this.a.gl() && !this.a.gi() && !this.a.u();
      }

      @Override
      public void d() {
         this.a.z(false);
         super.d();
      }
   }
}
