import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjz extends ciz {
   public static final double bG = 0.6;
   public static final double bH = 0.8;
   public static final double bI = 1.0;
   public static final double bK = 2.2;
   public static final double bL = 1.4;
   private static final akj<Integer> bM = akn.a(cjz.class, akl.b);
   private static final alg bN = alg.b("killer_bunny");
   private static final int bO = 3;
   private static final int bP = 5;
   private static final alg bQ = alg.b("evil");
   private static final int bR = 8;
   private static final int bS = 40;
   private int bT;
   private int bU;
   private boolean bV;
   private int bW;
   int bX;

   public cjz(bwr<? extends cjz> $$0, djm $$1) {
      super($$0, $$1);
      this.bB = new cjz.c(this);
      this.bA = new cjz.d(this);
      this.i(0.0);
   }

   @Override
   protected void D() {
      this.bD.a(1, new cdz(this));
      this.bD.a(1, new cdu(this, this.dU()));
      this.bD.a(1, new cjz.e(this, 2.2));
      this.bD.a(2, new cdr(this, 0.8));
      this.bD.a(3, new cfn(this, 1.0, $$0 -> $$0.a(axk.ax), false));
      this.bD.a(4, new cjz.a<>(this, crm.class, 8.0F, 2.2, 2.2));
      this.bD.a(4, new cjz.a<>(this, cmb.class, 10.0F, 2.2, 2.2));
      this.bD.a(4, new cjz.a<>(this, coo.class, 4.0F, 2.2, 2.2));
      this.bD.a(5, new cjz.f(this));
      this.bD.a(6, new cfs(this, 0.6));
      this.bD.a(11, new cen(this, crm.class, 10.0F));
   }

   @Override
   protected float fg() {
      float $$0 = 0.3F;
      if (this.bA.c() <= 0.6) {
         $$0 = 0.2F;
      }

      exo $$1 = this.bC.i();
      if ($$1 != null && !$$1.c()) {
         ffc $$2 = $$1.a(this);
         if ($$2.e > this.dB() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.P || this.bf && this.bA.e() > this.dB() + 0.5) {
         $$0 = 0.5F;
      }

      return super.z($$0 / 0.42F);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bA.c();
      if ($$0 > 0.0) {
         double $$1 = this.dx().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new ffc(0.0, 0.0, 1.0));
         }
      }

      if (!this.dU().C) {
         this.dU().a(this, (byte)1);
      }
   }

   public float J(float $$0) {
      return this.bU == 0 ? 0.0F : ((float)this.bT + $$0) / (float)this.bU;
   }

   public void i(double $$0) {
      this.O().a($$0);
      this.bA.a(this.bA.d(), this.bA.e(), this.bA.f(), $$0);
   }

   @Override
   public void s(boolean $$0) {
      super.s($$0);
      if ($$0) {
         this.a(this.x(), this.fd(), ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void q() {
      this.s(true);
      this.bU = 10;
      this.bT = 0;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bM, cjz.g.a.l);
   }

   @Override
   public void a(arq $$0) {
      if (this.bW > 0) {
         this.bW--;
      }

      if (this.bX > 0) {
         this.bX = this.bX - this.ae.a(3);
         if (this.bX < 0) {
            this.bX = 0;
         }
      }

      if (this.aH()) {
         if (!this.bV) {
            this.s(false);
            this.gx();
         }

         if (this.gt() == cjz.g.g && this.bW == 0) {
            bxj $$1 = this.f();
            if ($$1 != null && this.g((bwi)$$1) < 16.0) {
               this.c($$1.dz(), $$1.dF());
               this.bA.a($$1.dz(), $$1.dB(), $$1.dF(), this.bA.c());
               this.q();
               this.bV = true;
            }
         }

         cjz.c $$2 = (cjz.c)this.bB;
         if (!$$2.c()) {
            if (this.bA.b() && this.bW == 0) {
               exo $$3 = this.bC.i();
               ffc $$4 = new ffc(this.bA.d(), this.bA.e(), this.bA.f());
               if ($$3 != null && !$$3.c()) {
                  $$4 = $$3.a(this);
               }

               this.c($$4.d, $$4.f);
               this.q();
            }
         } else if (!$$2.d()) {
            this.gu();
         }
      }

      this.bV = this.aH();
   }

   @Override
   public boolean bs() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.w((float)(azm.d($$1 - this.dF(), $$0 - this.dz()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gu() {
      ((cjz.c)this.bB).a(true);
   }

   private void gv() {
      ((cjz.c)this.bB).a(false);
   }

   private void gw() {
      if (this.bA.c() < 2.2) {
         this.bW = 10;
      } else {
         this.bW = 1;
      }
   }

   private void gx() {
      this.gw();
      this.gv();
   }

   @Override
   public void k_() {
      super.k_();
      if (this.bT != this.bU) {
         this.bT++;
      } else if (this.bU != 0) {
         this.bT = 0;
         this.bU = 0;
         this.s(false);
      }
   }

   public static byo.a t() {
      return ciz.gy().a(byp.s, 3.0).a(byp.v, 0.3F).a(byp.c, 3.0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("RabbitType", cjz.g.i, this.gt());
      $$0.a("MoreCarrotTicks", this.bX);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.<cjz.g>a("RabbitType", cjz.g.i).orElse(cjz.g.a));
      this.bX = $$0.f("MoreCarrotTicks");
   }

   protected awm x() {
      return awn.vP;
   }

   @Override
   protected awm u() {
      return awn.vL;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.vO;
   }

   @Override
   protected awm l_() {
      return awn.vN;
   }

   @Override
   public void gm() {
      if (this.gt() == cjz.g.g) {
         this.a(awn.vM, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public awo dl() {
      return this.gt() == cjz.g.g ? awo.f : awo.g;
   }

   @Nullable
   public cjz b(arq $$0, bvy $$1) {
      cjz $$2 = bwr.aY.a($$0, bwq.e);
      if ($$2 != null) {
         cjz.g $$3;
         $$3 = a($$0, this.du());
         label16:
         if (this.ae.a(20) != 0) {
            if ($$1 instanceof cjz $$4 && this.ae.h()) {
               $$3 = $$4.gt();
               break label16;
            }

            $$3 = this.gt();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean i(czn $$0) {
      return $$0.a(axk.ax);
   }

   public cjz.g gt() {
      return cjz.g.a(this.al.a(bM));
   }

   private void a(cjz.g $$0) {
      if ($$0 == cjz.g.g) {
         this.g(byp.a).a(8.0);
         this.bD.a(4, new cep(this, 1.4, true));
         this.bE.a(1, new cfx(this).a());
         this.bE.a(2, new cfy<>(this, crm.class, true));
         this.bE.a(2, new cfy<>(this, cmb.class, true));
         this.g(byp.c).a(new byn(bQ, 5.0, byn.a.a));
         if (!this.h_()) {
            this.b(wy.c(ag.a("entity", bN)));
         }
      } else {
         this.g(byp.c).c(bQ);
      }

      this.al.a(bM, $$0.l);
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aG ? c((kj<T>)$$0, this.gt()) : super.a($$0);
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
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      cjz.g $$4 = a($$0, this.du());
      if ($$3 instanceof cjz.b) {
         $$4 = ((cjz.b)$$3).a;
      } else {
         $$3 = new cjz.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cjz.g a(djn $$0, iv $$1) {
      jf<dkp> $$2 = $$0.u($$1);
      int $$3 = $$0.C_().a(100);
      if ($$2.a(axb.an)) {
         return $$3 < 80 ? cjz.g.b : cjz.g.d;
      } else if ($$2.a(axb.am)) {
         return cjz.g.e;
      } else {
         return $$3 < 50 ? cjz.g.a : ($$3 < 90 ? cjz.g.f : cjz.g.c);
      }
   }

   public static boolean c(bwr<cjz> $$0, djn $$1, bwq $$2, iv $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.ch) && a((din)$$1, $$3);
   }

   boolean gF() {
      return this.bX <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bt();
         this.bU = 10;
         this.bT = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public ffc cS() {
      return new ffc(0.0, (double)(0.6F * this.cR()), (double)(this.dp() * 0.4F));
   }

   static class a<T extends bxj> extends cdm<T> {
      private final cjz i;

      public a(cjz $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gt() != cjz.g.g && super.b();
      }
   }

   public static class b extends bvy.a {
      public final cjz.g a;

      public b(cjz.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends cdg {
      private final cjz b;
      private boolean c;

      public c(cjz $$0) {
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

   static class d extends cdi {
      private final cjz l;
      private double m;

      public d(cjz $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aH() && !this.l.bf && !((cjz.c)this.l.bB).c()) {
            this.l.i(0.0);
         } else if (this.b() || this.k == cdi.a.d) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.bh()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends cey {
      private final cjz a;

      public e(cjz $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends ces {
      private final cjz g;
      private boolean h;
      private boolean i;

      public f(cjz $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!a(this.g).O().c(dji.d)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gF();
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
            djm $$0 = this.g.dU();
            iv $$1 = this.e.d();
            eat $$2 = $$0.a_($$1);
            dmr $$3 = $$2.b();
            if (this.i && $$3 instanceof dnl) {
               int $$4 = $$2.c(dnl.f);
               if ($$4 == 0) {
                  $$0.a($$1, dmt.a.m(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.b(dnl.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(eft.c, $$1, eft.a.a(this.g));
                  $$0.c(2001, $$1, dmr.j($$2));
               }

               this.g.bX = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(djp $$0, iv $$1) {
         eat $$2 = $$0.a_($$1);
         if ($$2.a(dmt.cN) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof dnl && ((dnl)$$2.b()).i($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements bak {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cjz.g> k = ayc.a(cjz.g::a, values(), a);
      public static final Codec<cjz.g> h = bak.a(cjz.g::values);
      @Deprecated
      public static final Codec<cjz.g> i = Codec.INT.xmap(k::apply, cjz.g::a);
      public static final yw<ByteBuf, cjz.g> j = yu.a(k, cjz.g::a);
      final int l;
      private final String m;

      private g(final int $$0, final String $$1) {
         this.l = $$0;
         this.m = $$1;
      }

      @Override
      public String c() {
         return this.m;
      }

      public int a() {
         return this.l;
      }

      public static cjz.g a(int $$0) {
         return k.apply($$0);
      }
   }
}
