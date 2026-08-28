import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chp extends cgv implements bwe<chp.g> {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double ca = 1.0;
   public static final double cc = 2.2;
   public static final double cd = 1.4;
   private static final ako<Integer> ce = aks.a(chp.class, akq.b);
   private static final all cf = all.b("killer_bunny");
   private static final int cg = 3;
   private static final int ch = 5;
   private static final all ci = all.b("evil");
   private static final int cj = 8;
   private static final int ck = 40;
   private int cl;
   private int cm;
   private boolean cn;
   private int co;
   int cp;

   public chp(bup<? extends chp> $$0, dff $$1) {
      super($$0, $$1);
      this.bQ = new chp.c(this);
      this.bP = new chp.d(this);
      this.i(0.0);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbw(this));
      this.bS.a(1, new cbr(this, this.dY()));
      this.bS.a(1, new chp.e(this, 2.2));
      this.bS.a(2, new cbo(this, 0.8));
      this.bS.a(3, new cdk(this, 1.0, $$0 -> $$0.a(axm.ax), false));
      this.bS.a(4, new chp.a<>(this, cor.class, 8.0F, 2.2, 2.2));
      this.bS.a(4, new chp.a<>(this, chy.class, 10.0F, 2.2, 2.2));
      this.bS.a(4, new chp.a<>(this, clv.class, 4.0F, 2.2, 2.2));
      this.bS.a(5, new chp.f(this));
      this.bS.a(6, new cdp(this, 0.6));
      this.bS.a(11, new cck(this, cor.class, 10.0F));
   }

   @Override
   protected float fm() {
      float $$0 = 0.3F;
      if (this.Q || this.bP.b() && this.bP.e() > this.dF() + 0.5) {
         $$0 = 0.5F;
      }

      esc $$1 = this.bR.k();
      if ($$1 != null && !$$1.c()) {
         ezr $$2 = $$1.a(this);
         if ($$2.e > this.dF() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bP.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return super.A($$0 / 0.42F);
   }

   @Override
   public void v() {
      super.v();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.dB().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new ezr(0.0, 0.0, 1.0));
         }
      }

      if (!this.dY().C) {
         this.dY().a(this, (byte)1);
      }
   }

   public float J(float $$0) {
      return this.cm == 0 ? 0.0F : ((float)this.cl + $$0) / (float)this.cm;
   }

   public void i(double $$0) {
      this.P().a($$0);
      this.bP.a(this.bP.d(), this.bP.e(), this.bP.f(), $$0);
   }

   @Override
   public void t(boolean $$0) {
      super.t($$0);
      if ($$0) {
         this.a(this.y(), this.fj(), ((this.af.i() - this.af.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void q() {
      this.t(true);
      this.cm = 10;
      this.cl = 0;
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(ce, chp.g.a.j);
   }

   @Override
   public void ac() {
      if (this.co > 0) {
         this.co--;
      }

      if (this.cp > 0) {
         this.cp = this.cp - this.af.a(3);
         if (this.cp < 0) {
            this.cp = 0;
         }
      }

      if (this.aL()) {
         if (!this.cn) {
            this.t(false);
            this.gz();
         }

         if (this.gv() == chp.g.g && this.co == 0) {
            bve $$0 = this.m();
            if ($$0 != null && this.g((bui)$$0) < 16.0) {
               this.c($$0.dD(), $$0.dJ());
               this.bP.a($$0.dD(), $$0.dF(), $$0.dJ(), this.bP.c());
               this.q();
               this.cn = true;
            }
         }

         chp.c $$1 = (chp.c)this.bQ;
         if (!$$1.c()) {
            if (this.bP.b() && this.co == 0) {
               esc $$2 = this.bR.k();
               ezr $$3 = new ezr(this.bP.d(), this.bP.e(), this.bP.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.d, $$3.f);
               this.q();
            }
         } else if (!$$1.d()) {
            this.gw();
         }
      }

      this.cn = this.aL();
   }

   @Override
   public boolean bx() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.v((float)(azn.d($$1 - this.dJ(), $$0 - this.dD()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gw() {
      ((chp.c)this.bQ).a(true);
   }

   private void gx() {
      ((chp.c)this.bQ).a(false);
   }

   private void gy() {
      if (this.bP.c() < 2.2) {
         this.co = 10;
      } else {
         this.co = 1;
      }
   }

   private void gz() {
      this.gy();
      this.gx();
   }

   @Override
   public void n_() {
      super.n_();
      if (this.cl != this.cm) {
         this.cl++;
      } else if (this.cm != 0) {
         this.cl = 0;
         this.cm = 0;
         this.t(false);
      }
   }

   public static bwl.a t() {
      return cgv.gA().a(bwm.s, 3.0).a(bwm.v, 0.3F).a(bwm.c, 3.0);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gv().j);
      $$0.a("MoreCarrotTicks", this.cp);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.a(chp.g.a($$0.h("RabbitType")));
      this.cp = $$0.h("MoreCarrotTicks");
   }

   protected awn y() {
      return awo.va;
   }

   @Override
   protected awn w() {
      return awo.uW;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.uZ;
   }

   @Override
   protected awn o_() {
      return awo.uY;
   }

   @Override
   public void gm() {
      if (this.gv() == chp.g.g) {
         this.a(awo.uX, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public awp do() {
      return this.gv() == chp.g.g ? awp.f : awp.g;
   }

   @Nullable
   public chp b(arq $$0, btz $$1) {
      chp $$2 = bup.aG.a($$0, buo.e);
      if ($$2 != null) {
         chp.g $$3;
         $$3 = a($$0, this.dy());
         label16:
         if (this.af.a(20) != 0) {
            if ($$1 instanceof chp $$4 && this.af.h()) {
               $$3 = $$4.gv();
               break label16;
            }

            $$3 = this.gv();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.ax);
   }

   public chp.g gv() {
      return chp.g.a(this.am.a(ce));
   }

   public void a(chp.g $$0) {
      if ($$0 == chp.g.g) {
         this.g(bwm.a).a(8.0);
         this.bS.a(4, new ccm(this, 1.4, true));
         this.bT.a(1, new cdu(this).a());
         this.bT.a(2, new cdv<>(this, cor.class, true));
         this.bT.a(2, new cdv<>(this, chy.class, true));
         this.g(bwm.c).a(new bwk(ci, 5.0, bwk.a.a));
         if (!this.an()) {
            this.b(xl.c(ae.a("entity", cf)));
         }
      } else {
         this.g(bwm.c).c(ci);
      }

      this.am.a(ce, $$0.j);
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      chp.g $$4 = a($$0, this.dy());
      if ($$3 instanceof chp.b) {
         $$4 = ((chp.b)$$3).a;
      } else {
         $$3 = new chp.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static chp.g a(dfg $$0, jh $$1) {
      jq<dgh> $$2 = $$0.t($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(axc.al)) {
         return $$3 < 80 ? chp.g.b : chp.g.d;
      } else if ($$2.a(axc.ak)) {
         return chp.g.e;
      } else {
         return $$3 < 50 ? chp.g.a : ($$3 < 90 ? chp.g.f : chp.g.c);
      }
   }

   public static boolean c(bup<chp> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axd.ce) && a((deh)$$1, $$3);
   }

   boolean gH() {
      return this.cp <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.by();
         this.cm = 10;
         this.cl = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public ezr cV() {
      return new ezr(0.0, (double)(0.6F * this.cU()), (double)(this.dt() * 0.4F));
   }

   static class a<T extends bve> extends cbj<T> {
      private final chp i;

      public a(chp $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gv() != chp.g.g && super.b();
      }
   }

   public static class b extends btz.a {
      public final chp.g a;

      public b(chp.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends cbd {
      private final chp b;
      private boolean c;

      public c(chp $$0) {
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

   static class d extends cbf {
      private final chp l;
      private double m;

      public d(chp $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aL() && !this.l.bn && !((chp.c)this.l.bQ).c()) {
            this.l.i(0.0);
         } else if (this.b()) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.bl()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends ccv {
      private final chp a;

      public e(chp $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends ccp {
      private final chp g;
      private boolean h;
      private boolean i;

      public f(chp $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!this.g.dY().ac().b(dfb.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gH();
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
         this.g.K().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.ad());
         if (this.m()) {
            dff $$0 = this.g.dY();
            jh $$1 = this.e.d();
            dvo $$2 = $$0.a_($$1);
            dij $$3 = $$2.b();
            if (this.i && $$3 instanceof djb) {
               int $$4 = $$2.c(djb.f);
               if ($$4 == 0) {
                  $$0.a($$1, dil.a.m(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.b(djb.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(eak.c, $$1, eak.a.a(this.g));
                  $$0.c(2001, $$1, dij.j($$2));
               }

               this.g.cp = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dfi $$0, jh $$1) {
         dvo $$2 = $$0.a_($$1);
         if ($$2.a(dil.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof djb && ((djb)$$2.b()).i($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements baj {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<chp.g> i = aye.a(chp.g::a, values(), a);
      public static final Codec<chp.g> h = baj.a(chp.g::values);
      final int j;
      private final String k;

      private g(final int $$0, final String $$1) {
         this.j = $$0;
         this.k = $$1;
      }

      @Override
      public String c() {
         return this.k;
      }

      public int a() {
         return this.j;
      }

      public static chp.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
