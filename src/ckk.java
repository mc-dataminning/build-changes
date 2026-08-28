import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckk extends cjk {
   public static final double bI = 0.6;
   public static final double bJ = 0.8;
   public static final double bK = 1.0;
   public static final double bM = 2.2;
   public static final double bN = 1.4;
   private static final akl<Integer> bO = akp.a(ckk.class, akn.b);
   private static final int bP = 0;
   private static final ali bQ = ali.b("killer_bunny");
   private static final int bR = 3;
   private static final int bS = 5;
   private static final ali bT = ali.b("evil");
   private static final int bU = 8;
   private static final int bV = 40;
   private int bW;
   private int bX;
   private boolean bY;
   private int bZ;
   int ca = 0;

   public ckk(bxc<? extends ckk> $$0, djx $$1) {
      super($$0, $$1);
      this.bD = new ckk.c(this);
      this.bC = new ckk.d(this);
      this.i(0.0);
   }

   @Override
   protected void D() {
      this.bF.a(1, new cek(this));
      this.bF.a(1, new cef(this, this.dV()));
      this.bF.a(1, new ckk.e(this, 2.2));
      this.bF.a(2, new cec(this, 0.8));
      this.bF.a(3, new cfy(this, 1.0, $$0 -> $$0.a(axm.ax), false));
      this.bF.a(4, new ckk.a<>(this, crx.class, 8.0F, 2.2, 2.2));
      this.bF.a(4, new ckk.a<>(this, cmm.class, 10.0F, 2.2, 2.2));
      this.bF.a(4, new ckk.a<>(this, coz.class, 4.0F, 2.2, 2.2));
      this.bF.a(5, new ckk.f(this));
      this.bF.a(6, new cgd(this, 0.6));
      this.bF.a(11, new cey(this, crx.class, 10.0F));
   }

   @Override
   protected float fh() {
      float $$0 = 0.3F;
      if (this.bC.c() <= 0.6) {
         $$0 = 0.2F;
      }

      eyc $$1 = this.bE.i();
      if ($$1 != null && !$$1.c()) {
         ffq $$2 = $$1.a(this);
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
   public void s() {
      super.s();
      double $$0 = this.bC.c();
      if ($$0 > 0.0) {
         double $$1 = this.dy().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new ffq(0.0, 0.0, 1.0));
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
      this.O().a($$0);
      this.bC.a(this.bC.d(), this.bC.e(), this.bC.f(), $$0);
   }

   @Override
   public void s(boolean $$0) {
      super.s($$0);
      if ($$0) {
         this.a(this.x(), this.fe(), ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void q() {
      this.s(true);
      this.bX = 10;
      this.bW = 0;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bO, ckk.g.h.m);
   }

   @Override
   public void a(ars $$0) {
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

         if (this.gu() == ckk.g.g && this.bZ == 0) {
            bxu $$1 = this.f();
            if ($$1 != null && this.g((bwt)$$1) < 16.0) {
               this.c($$1.dA(), $$1.dG());
               this.bC.a($$1.dA(), $$1.dC(), $$1.dG(), this.bC.c());
               this.q();
               this.bY = true;
            }
         }

         ckk.c $$2 = (ckk.c)this.bD;
         if (!$$2.c()) {
            if (this.bC.b() && this.bZ == 0) {
               eyc $$3 = this.bE.i();
               ffq $$4 = new ffq(this.bC.d(), this.bC.e(), this.bC.f());
               if ($$3 != null && !$$3.c()) {
                  $$4 = $$3.a(this);
               }

               this.c($$4.d, $$4.f);
               this.q();
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
      this.w((float)(azo.d($$1 - this.dG(), $$0 - this.dA()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gv() {
      ((ckk.c)this.bD).a(true);
   }

   private void gw() {
      ((ckk.c)this.bD).a(false);
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
   public void k_() {
      super.k_();
      if (this.bW != this.bX) {
         this.bW++;
      } else if (this.bX != 0) {
         this.bW = 0;
         this.bX = 0;
         this.s(false);
      }
   }

   public static byz.a t() {
      return cjk.gz().a(bza.s, 3.0).a(bza.v, 0.3F).a(bza.c, 3.0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("RabbitType", ckk.g.j, this.gu());
      $$0.a("MoreCarrotTicks", this.ca);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.<ckk.g>a("RabbitType", ckk.g.j).orElse(ckk.g.h));
      this.ca = $$0.b("MoreCarrotTicks", 0);
   }

   protected awo x() {
      return awp.vP;
   }

   @Override
   protected awo u() {
      return awp.vL;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.vO;
   }

   @Override
   protected awo l_() {
      return awp.vN;
   }

   @Override
   public void gn() {
      if (this.gu() == ckk.g.g) {
         this.a(awp.vM, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public awq dm() {
      return this.gu() == ckk.g.g ? awq.f : awq.g;
   }

   @Nullable
   public ckk b(ars $$0, bwj $$1) {
      ckk $$2 = bxc.aZ.a($$0, bxb.e);
      if ($$2 != null) {
         ckk.g $$3;
         $$3 = a($$0, this.dv());
         label16:
         if (this.ae.a(20) != 0) {
            if ($$1 instanceof ckk $$4 && this.ae.h()) {
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
   public boolean i(czy $$0) {
      return $$0.a(axm.ax);
   }

   public ckk.g gu() {
      return ckk.g.a(this.al.a(bO));
   }

   private void a(ckk.g $$0) {
      if ($$0 == ckk.g.g) {
         this.g(bza.a).a(8.0);
         this.bF.a(4, new cfa(this, 1.4, true));
         this.bG.a(1, new cgi(this).a());
         this.bG.a(2, new cgj<>(this, crx.class, true));
         this.bG.a(2, new cgj<>(this, cmm.class, true));
         this.g(bza.c).a(new byy(bT, 5.0, byy.a.a));
         if (!this.h_()) {
            this.b(xa.c(ag.a("entity", bQ)));
         }
      } else {
         this.g(bza.c).c(bT);
      }

      this.al.a(bO, $$0.m);
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aG ? c((kj<T>)$$0, this.gu()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aG);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aG) {
         this.a(c(kk.aG, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      ckk.g $$4 = a($$0, this.dv());
      if ($$3 instanceof ckk.b) {
         $$4 = ((ckk.b)$$3).a;
      } else {
         $$3 = new ckk.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static ckk.g a(djy $$0, iv $$1) {
      jf<dla> $$2 = $$0.u($$1);
      int $$3 = $$0.G_().a(100);
      if ($$2.a(axd.an)) {
         return $$3 < 80 ? ckk.g.b : ckk.g.d;
      } else if ($$2.a(axd.am)) {
         return ckk.g.e;
      } else {
         return $$3 < 50 ? ckk.g.a : ($$3 < 90 ? ckk.g.f : ckk.g.c);
      }
   }

   public static boolean c(bxc<ckk> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      return $$1.a_($$3.e()).a(axe.ch) && a((diy)$$1, $$3);
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
   public ffq cT() {
      return new ffq(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   static class a<T extends bxu> extends cdx<T> {
      private final ckk i;

      public a(ckk $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gu() != ckk.g.g && super.b();
      }
   }

   public static class b extends bwj.a {
      public final ckk.g a;

      public b(ckk.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends cdr {
      private final ckk b;
      private boolean c;

      public c(ckk $$0) {
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
            this.b.q();
            this.a = false;
         }
      }
   }

   static class d extends cdt {
      private final ckk l;
      private double m;

      public d(ckk $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aH() && !this.l.bf && !((ckk.c)this.l.bD).c()) {
            this.l.i(0.0);
         } else if (this.b() || this.k == cdt.a.d) {
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

   static class e extends cfj {
      private final ckk a;

      public e(ckk $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends cfd {
      private final ckk g;
      private boolean h;
      private boolean i;

      public f(ckk $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!a(this.g).O().c(djt.d)) {
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
         this.g.J().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.ad());
         if (this.m()) {
            djx $$0 = this.g.dV();
            iv $$1 = this.e.d();
            ebe $$2 = $$0.a_($$1);
            dnc $$3 = $$2.b();
            if (this.i && $$3 instanceof dnw) {
               int $$4 = $$2.c(dnw.f);
               if ($$4 == 0) {
                  $$0.a($$1, dne.a.m(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.b(dnw.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(ege.c, $$1, ege.a.a(this.g));
                  $$0.c(2001, $$1, dnc.j($$2));
               }

               this.g.ca = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dka $$0, iv $$1) {
         ebe $$2 = $$0.a_($$1);
         if ($$2.a(dne.cN) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof dnw && ((dnw)$$2.b()).i($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements bam {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      public static final ckk.g h = a;
      private static final IntFunction<ckk.g> l = aye.a(ckk.g::a, values(), h);
      public static final Codec<ckk.g> i = bam.a(ckk.g::values);
      @Deprecated
      public static final Codec<ckk.g> j = Codec.INT.xmap(l::apply, ckk.g::a);
      public static final yy<ByteBuf, ckk.g> k = yw.a(l, ckk.g::a);
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

      public static ckk.g a(int $$0) {
         return l.apply($$0);
      }
   }
}
