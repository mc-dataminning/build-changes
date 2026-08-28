import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckv extends cjv {
   public static final double bI = 0.6;
   public static final double bJ = 0.8;
   public static final double bK = 1.0;
   public static final double bM = 2.2;
   public static final double bN = 1.4;
   private static final aku<Integer> bO = aky.a(ckv.class, akw.b);
   private static final int bP = 0;
   private static final alr bQ = alr.b("killer_bunny");
   private static final int bR = 3;
   private static final int bS = 5;
   private static final alr bT = alr.b("evil");
   private static final int bU = 8;
   private static final int bV = 40;
   private int bW;
   private int bX;
   private boolean bY;
   private int bZ;
   int ca = 0;

   public ckv(bxn<? extends ckv> $$0, dkj $$1) {
      super($$0, $$1);
      this.bD = new ckv.c(this);
      this.bC = new ckv.d(this);
      this.i(0.0);
   }

   @Override
   protected void C() {
      this.bF.a(1, new cev(this));
      this.bF.a(1, new ceq(this, this.dV()));
      this.bF.a(1, new ckv.e(this, 2.2));
      this.bF.a(2, new cen(this, 0.8));
      this.bF.a(3, new cgj(this, 1.0, $$0 -> $$0.a(axv.ay), false));
      this.bF.a(4, new ckv.a<>(this, csi.class, 8.0F, 2.2, 2.2));
      this.bF.a(4, new ckv.a<>(this, cmx.class, 10.0F, 2.2, 2.2));
      this.bF.a(4, new ckv.a<>(this, cpk.class, 4.0F, 2.2, 2.2));
      this.bF.a(5, new ckv.f(this));
      this.bF.a(6, new cgo(this, 0.6));
      this.bF.a(11, new cfj(this, csi.class, 10.0F));
   }

   @Override
   protected float fh() {
      float $$0 = 0.3F;
      if (this.bC.c() <= 0.6) {
         $$0 = 0.2F;
      }

      eyo $$1 = this.bE.i();
      if ($$1 != null && !$$1.c()) {
         fgc $$2 = $$1.a(this);
         if ($$2.e > this.dC() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.P || this.bf && this.bC.e() > this.dC() + 0.5) {
         $$0 = 0.5F;
      }

      return super.z($$0 / 0.42F);
   }

   @Override
   public void r() {
      super.r();
      double $$0 = this.bC.c();
      if ($$0 > 0.0) {
         double $$1 = this.dy().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fgc(0.0, 0.0, 1.0));
         }
      }

      if (!this.dV().C) {
         this.dV().a(this, (byte)1);
      }
   }

   public float J(float $$0) {
      return this.bX == 0 ? 0.0F : ((float)this.bW + $$0) / (float)this.bX;
   }

   public void i(double $$0) {
      this.N().a($$0);
      this.bC.a(this.bC.d(), this.bC.e(), this.bC.f(), $$0);
   }

   @Override
   public void s(boolean $$0) {
      super.s($$0);
      if ($$0) {
         this.a(this.u(), this.fe(), ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void m() {
      this.s(true);
      this.bX = 10;
      this.bW = 0;
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bO, ckv.g.h.m);
   }

   @Override
   public void a(asb $$0) {
      if (this.bZ > 0) {
         this.bZ--;
      }

      if (this.ca > 0) {
         this.ca = this.ca - this.ae.a(3);
         if (this.ca < 0) {
            this.ca = 0;
         }
      }

      if (this.aH()) {
         if (!this.bY) {
            this.s(false);
            this.gy();
         }

         if (this.gu() == ckv.g.g && this.bZ == 0) {
            byf $$1 = this.e();
            if ($$1 != null && this.g((bxe)$$1) < 16.0) {
               this.c($$1.dA(), $$1.dG());
               this.bC.a($$1.dA(), $$1.dC(), $$1.dG(), this.bC.c());
               this.m();
               this.bY = true;
            }
         }

         ckv.c $$2 = (ckv.c)this.bD;
         if (!$$2.c()) {
            if (this.bC.b() && this.bZ == 0) {
               eyo $$3 = this.bE.i();
               fgc $$4 = new fgc(this.bC.d(), this.bC.e(), this.bC.f());
               if ($$3 != null && !$$3.c()) {
                  $$4 = $$3.a(this);
               }

               this.c($$4.d, $$4.f);
               this.m();
            }
         } else if (!$$2.d()) {
            this.gv();
         }
      }

      this.bY = this.aH();
   }

   @Override
   public boolean bt() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.w((float)(azz.d($$1 - this.dG(), $$0 - this.dA()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gv() {
      ((ckv.c)this.bD).a(true);
   }

   private void gw() {
      ((ckv.c)this.bD).a(false);
   }

   private void gx() {
      if (this.bC.c() < 2.2) {
         this.bZ = 10;
      } else {
         this.bZ = 1;
      }
   }

   private void gy() {
      this.gx();
      this.gw();
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bW != this.bX) {
         this.bW++;
      } else if (this.bX != 0) {
         this.bW = 0;
         this.bX = 0;
         this.s(false);
      }
   }

   public static bzk.a p() {
      return cjv.gz().a(bzl.s, 3.0).a(bzl.v, 0.3F).a(bzl.c, 3.0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("RabbitType", ckv.g.j, this.gu());
      $$0.a("MoreCarrotTicks", this.ca);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.<ckv.g>a("RabbitType", ckv.g.j).orElse(ckv.g.h));
      this.ca = $$0.b("MoreCarrotTicks", 0);
   }

   protected awx u() {
      return awy.vP;
   }

   @Override
   protected awx s() {
      return awy.vL;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.vO;
   }

   @Override
   protected awx j_() {
      return awy.vN;
   }

   @Override
   public void gn() {
      if (this.gu() == ckv.g.g) {
         this.a(awy.vM, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public awz dm() {
      return this.gu() == ckv.g.g ? awz.f : awz.g;
   }

   @Nullable
   public ckv b(asb $$0, bwu $$1) {
      ckv $$2 = bxn.aZ.a($$0, bxm.e);
      if ($$2 != null) {
         ckv.g $$3;
         $$3 = a($$0, this.dv());
         label16:
         if (this.ae.a(20) != 0) {
            if ($$1 instanceof ckv $$4 && this.ae.h()) {
               $$3 = $$4.gu();
               break label16;
            }

            $$3 = this.gu();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean i(dak $$0) {
      return $$0.a(axv.ay);
   }

   public ckv.g gu() {
      return ckv.g.a(this.al.a(bO));
   }

   private void a(ckv.g $$0) {
      if ($$0 == ckv.g.g) {
         this.g(bzl.a).a(8.0);
         this.bF.a(4, new cfl(this, 1.4, true));
         this.bG.a(1, new cgt(this).a());
         this.bG.a(2, new cgu<>(this, csi.class, true));
         this.bG.a(2, new cgu<>(this, cmx.class, true));
         this.g(bzl.c).a(new bzj(bT, 5.0, bzj.a.a));
         if (!this.g_()) {
            this.b(xg.c(ag.a("entity", bQ)));
         }
      } else {
         this.g(bzl.c).c(bT);
      }

      this.al.a(bO, $$0.m);
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.aG ? c((kk<T>)$$0, this.gu()) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.aG);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.aG) {
         this.a(c(kl.aG, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      ckv.g $$4 = a($$0, this.dv());
      if ($$3 instanceof ckv.b) {
         $$4 = ((ckv.b)$$3).a;
      } else {
         $$3 = new ckv.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static ckv.g a(dkk $$0, iw $$1) {
      jg<dlm> $$2 = $$0.u($$1);
      int $$3 = $$0.G_().a(100);
      if ($$2.a(axm.an)) {
         return $$3 < 80 ? ckv.g.b : ckv.g.d;
      } else if ($$2.a(axm.am)) {
         return ckv.g.e;
      } else {
         return $$3 < 50 ? ckv.g.a : ($$3 < 90 ? ckv.g.f : ckv.g.c);
      }
   }

   public static boolean c(bxn<ckv> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return $$1.a_($$3.e()).a(axn.ch) && a((djk)$$1, $$3);
   }

   boolean gG() {
      return this.ca <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bu();
         this.bX = 10;
         this.bW = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public fgc cT() {
      return new fgc(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   static class a<T extends byf> extends cei<T> {
      private final ckv i;

      public a(ckv $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gu() != ckv.g.g && super.b();
      }
   }

   public static class b extends bwu.a {
      public final ckv.g a;

      public b(ckv.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends cec {
      private final ckv b;
      private boolean c;

      public c(ckv $$0) {
         super($$0);
         this.b = $$0;
      }

      public boolean c() {
         return this.a;
      }

      public boolean d() {
         return this.c;
      }

      public void a(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public void b() {
         if (this.a) {
            this.b.m();
            this.a = false;
         }
      }
   }

   static class d extends cee {
      private final ckv l;
      private double m;

      public d(ckv $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aH() && !this.l.bf && !((ckv.c)this.l.bD).c()) {
            this.l.i(0.0);
         } else if (this.b() || this.k == cee.a.d) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.bi()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends cfu {
      private final ckv a;

      public e(ckv $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends cfo {
      private final ckv g;
      private boolean h;
      private boolean i;

      public f(ckv $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!a(this.g).O().c(dkf.d)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gG();
         }

         return super.b();
      }

      @Override
      public boolean c() {
         return this.i && super.c();
      }

      @Override
      public void a() {
         super.a();
         this.g.I().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.ac());
         if (this.m()) {
            dkj $$0 = this.g.dV();
            iw $$1 = this.e.d();
            ebq $$2 = $$0.a_($$1);
            dno $$3 = $$2.b();
            if (this.i && $$3 instanceof doi) {
               int $$4 = $$2.c(doi.f);
               if ($$4 == 0) {
                  $$0.a($$1, dnq.a.m(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.b(doi.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(egq.c, $$1, egq.a.a(this.g));
                  $$0.c(2001, $$1, dno.j($$2));
               }

               this.g.ca = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dkm $$0, iw $$1) {
         ebq $$2 = $$0.a_($$1);
         if ($$2.a(dnq.cN) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof doi && ((doi)$$2.b()).i($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements bax {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      public static final ckv.g h = a;
      private static final IntFunction<ckv.g> l = ayo.a(ckv.g::a, values(), h);
      public static final Codec<ckv.g> i = bax.a(ckv.g::values);
      @Deprecated
      public static final Codec<ckv.g> j = Codec.INT.xmap(l::apply, ckv.g::a);
      public static final ze<ByteBuf, ckv.g> k = zc.a(l, ckv.g::a);
      final int m;
      private final String n;

      private g(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public String c() {
         return this.n;
      }

      public int a() {
         return this.m;
      }

      public static ckv.g a(int $$0) {
         return l.apply($$0);
      }
   }
}
