import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byt extends bxs {
   private static final agj<hx> bW = agm.a(byt.class, agl.n);
   private static final agj<Boolean> bX = agm.a(byt.class, agl.k);
   private static final agj<Boolean> bY = agm.a(byt.class, agl.k);
   private static final agj<hx> bZ = agm.a(byt.class, agl.n);
   private static final agj<Boolean> ca = agm.a(byt.class, agl.k);
   private static final agj<Boolean> cb = agm.a(byt.class, agl.k);
   public static final cps bT = cps.a(cwl.bw.k());
   int cc;
   public static final Predicate<bmf> bU = $$0 -> $$0.o_() && !$$0.aZ();

   public byt(blt<? extends byt> $$0, cti $$1) {
      super($$0, $$1);
      this.a(eev.j, 0.0F);
      this.a(eev.t, -1.0F);
      this.a(eev.s, -1.0F);
      this.a(eev.r, -1.0F);
      this.bL = new byt.e(this);
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
   public void b(sl $$0) {
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
   public void a(sl $$0) {
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
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      this.i(this.dm());
      this.j(hx.b);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(blt<byt> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      return $$3.v() < $$1.A_() + 4 && dfa.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void B() {
      this.bO.a(0, new byt.f(this, 1.2));
      this.bO.a(1, new byt.a(this, 1.0));
      this.bO.a(1, new byt.d(this, 1.0));
      this.bO.a(2, new buj(this, 1.1, bT, false));
      this.bO.a(3, new byt.c(this, 1.0));
      this.bO.a(4, new byt.b(this, 1.0));
      this.bO.a(7, new byt.i(this, 1.0));
      this.bO.a(8, new btj(this, cfb.class, 8.0F));
      this.bO.a(9, new byt.h(this, 1.0, 100));
   }

   public static bnk.a A() {
      return bmh.C().a(bnl.l, 30.0).a(bnl.m, 0.25);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   public bmk eS() {
      return bmk.e;
   }

   @Override
   public int Q() {
      return 200;
   }

   @Nullable
   @Override
   protected arl y() {
      return !this.aZ() && this.aC() && !this.o_() ? arm.zi : super.y();
   }

   @Override
   protected void e(float $$0) {
      super.e($$0 * 1.5F);
   }

   @Override
   protected arl aN() {
      return arm.zt;
   }

   @Nullable
   @Override
   protected arl d(bkn $$0) {
      return this.o_() ? arm.zp : arm.zo;
   }

   @Nullable
   @Override
   protected arl n_() {
      return this.o_() ? arm.zk : arm.zj;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      arl $$2 = this.o_() ? arm.zs : arm.zr;
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
   protected bvp b(cti $$0) {
      return new byt.g(this, $$0);
   }

   @Nullable
   @Override
   public blk a(amz $$0, blk $$1) {
      return blt.be.a((cti)$$0);
   }

   @Override
   public boolean m(cmr $$0) {
      return $$0.a(cwl.bw.k());
   }

   @Override
   public float a(hx $$0, ctl $$1) {
      if (!this.gl() && $$1.b_($$0).a(asg.a)) {
         return 10.0F;
      } else {
         return dfa.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bx() && this.w() && this.cc >= 1 && this.cc % 5 == 0) {
         hx $$0 = this.dm();
         if (dfa.a(this.dM(), $$0)) {
            this.dM().c(2001, $$0, cwj.i(this.dM().a_($$0.d())));
            this.a(dnk.u);
         }
      }
   }

   @Override
   protected void m() {
      super.m();
      if (!this.o_() && this.dM().Z().b(cte.f)) {
         this.a(cmu.oo, 1);
      }
   }

   @Override
   public void a(elm $$0) {
      if (this.cX() && this.aZ()) {
         this.a(0.1F, $$0);
         this.a(bml.a, this.dp());
         this.g(this.dp().a(0.9));
         if (this.q() == null && (!this.gl() || !this.ge().a(this.dk(), 20.0))) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cfb $$0) {
      return false;
   }

   @Override
   public void a(amz $$0, bme $$1) {
      this.a(this.dN().b(), Float.MAX_VALUE);
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + (this.o_() ? 0.0F : 0.15625F) * $$2, -0.25F * $$2);
   }

   static class a extends bsn {
      private final byt d;

      a(byt $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.u();
      }

      @Override
      protected void g() {
         ana $$0 = this.a.gh();
         if ($$0 == null && this.c.gh() != null) {
            $$0 = this.c.gh();
         }

         if ($$0 != null) {
            $$0.a(arw.P);
            am.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gj();
         this.c.gj();
         aup $$1 = this.a.eg();
         if (this.b.Z().b(cte.f)) {
            this.b.b(new blv(this.b, this.a.dr(), this.a.dt(), this.a.dx(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends btb {
      private final byt a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(byt $$0, double $$1) {
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
            elm $$2 = elm.c($$0);
            elm $$3 = bwx.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = bwx.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dM().a_(hx.a($$3)).a(cwl.G)) {
               $$3 = bwx.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.N().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends bto {
      private static final int g = 1200;
      private final byt h;

      c(byt $$0, double $$1) {
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
      protected boolean a(ctl $$0, hx $$1) {
         return $$0.a_($$1).a(cwl.G);
      }
   }

   static class d extends bto {
      private final byt g;

      d(byt $$0, double $$1) {
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
               cti $$1 = this.g.dM();
               $$1.a(null, $$0, arm.zq, arn.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               hx $$2 = this.e.c();
               dja $$3 = cwl.mf.o().a(dfa.f, Integer.valueOf(this.g.ag.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dnk.i, $$2, dnk.a.a(this.g, $$3));
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
      protected boolean a(ctl $$0, hx $$1) {
         return !$$0.u($$1.c()) ? false : dfa.b($$0, $$1);
      }
   }

   static class e extends bse {
      private final byt l;

      e(byt $$0) {
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
         if (this.k == bse.a.b && !this.l.N().l()) {
            double $$0 = this.e - this.l.dr();
            double $$1 = this.f - this.l.dt();
            double $$2 = this.g - this.l.dx();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.w(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(aui.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dC(), $$4, 90.0F));
               this.l.aU = this.l.dC();
               float $$5 = (float)(this.h * this.l.b(bnl.m));
               this.l.w(aui.i(0.125F, this.l.ff(), $$5));
               this.l.g(this.l.dp().b(0.0, (double)this.l.ff() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class f extends btu {
      f(byt $$0, double $$1) {
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

   static class g extends bvm {
      g(byt $$0, cti $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(hx $$0) {
         if (this.a instanceof byt $$1 && $$1.gm()) {
            return this.b.a_($$0).a(cwl.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends bty {
      private final byt i;

      h(byt $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.aZ() && !this.i.gl() && !this.i.u() ? super.a() : false;
      }
   }

   static class i extends btb {
      private final byt a;
      private final double b;
      private boolean c;

      i(byt $$0, double $$1) {
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
         aup $$2 = this.a.ag;
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
            elm $$0 = elm.c(this.a.gk());
            elm $$1 = bwx.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = bwx.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = aui.a($$1.c);
               int $$3 = aui.a($$1.e);
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
