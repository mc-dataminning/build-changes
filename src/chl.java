import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chl extends cgr implements bwa<chl.g> {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double ca = 1.0;
   public static final double cc = 2.2;
   public static final double cd = 1.4;
   private static final akl<Integer> ce = akp.a(chl.class, akn.b);
   private static final ali cf = ali.b("killer_bunny");
   private static final int cg = 3;
   private static final int ch = 5;
   private static final ali ci = ali.b("evil");
   private static final int cj = 8;
   private static final int ck = 40;
   private int cl;
   private int cm;
   private boolean cn;
   private int co;
   int cp;

   public chl(bul<? extends chl> $$0, dfb $$1) {
      super($$0, $$1);
      this.bQ = new chl.c(this);
      this.bP = new chl.d(this);
      this.i(0.0);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbs(this));
      this.bS.a(1, new cbn(this, this.dX()));
      this.bS.a(1, new chl.e(this, 2.2));
      this.bS.a(2, new cbk(this, 0.8));
      this.bS.a(3, new cdg(this, 1.0, $$0 -> $$0.a(axj.aw), false));
      this.bS.a(4, new chl.a<>(this, com.class, 8.0F, 2.2, 2.2));
      this.bS.a(4, new chl.a<>(this, chu.class, 10.0F, 2.2, 2.2));
      this.bS.a(4, new chl.a<>(this, clr.class, 4.0F, 2.2, 2.2));
      this.bS.a(5, new chl.f(this));
      this.bS.a(6, new cdl(this, 0.6));
      this.bS.a(11, new ccg(this, com.class, 10.0F));
   }

   @Override
   protected float fl() {
      float $$0 = 0.3F;
      if (this.Q || this.bP.b() && this.bP.e() > this.dE() + 0.5) {
         $$0 = 0.5F;
      }

      ery $$1 = this.bR.k();
      if ($$1 != null && !$$1.c()) {
         ezn $$2 = $$1.a(this);
         if ($$2.e > this.dE() + 0.5) {
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
         double $$1 = this.dA().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new ezn(0.0, 0.0, 1.0));
         }
      }

      if (!this.dX().C) {
         this.dX().a(this, (byte)1);
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
         this.a(this.y(), this.fi(), ((this.af.i() - this.af.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void q() {
      this.t(true);
      this.cm = 10;
      this.cl = 0;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(ce, chl.g.a.j);
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

      if (this.aK()) {
         if (!this.cn) {
            this.t(false);
            this.gy();
         }

         if (this.gu() == chl.g.g && this.co == 0) {
            bva $$0 = this.m();
            if ($$0 != null && this.g((bue)$$0) < 16.0) {
               this.c($$0.dC(), $$0.dI());
               this.bP.a($$0.dC(), $$0.dE(), $$0.dI(), this.bP.c());
               this.q();
               this.cn = true;
            }
         }

         chl.c $$1 = (chl.c)this.bQ;
         if (!$$1.c()) {
            if (this.bP.b() && this.co == 0) {
               ery $$2 = this.bR.k();
               ezn $$3 = new ezn(this.bP.d(), this.bP.e(), this.bP.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.d, $$3.f);
               this.q();
            }
         } else if (!$$1.d()) {
            this.gv();
         }
      }

      this.cn = this.aK();
   }

   @Override
   public boolean bw() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.v((float)(azk.d($$1 - this.dI(), $$0 - this.dC()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gv() {
      ((chl.c)this.bQ).a(true);
   }

   private void gw() {
      ((chl.c)this.bQ).a(false);
   }

   private void gx() {
      if (this.bP.c() < 2.2) {
         this.co = 10;
      } else {
         this.co = 1;
      }
   }

   private void gy() {
      this.gx();
      this.gw();
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

   public static bwh.a t() {
      return cgr.gz().a(bwi.s, 3.0).a(bwi.v, 0.3F).a(bwi.c, 3.0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gu().j);
      $$0.a("MoreCarrotTicks", this.cp);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a(chl.g.a($$0.h("RabbitType")));
      this.cp = $$0.h("MoreCarrotTicks");
   }

   protected awk y() {
      return awl.va;
   }

   @Override
   protected awk w() {
      return awl.uW;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.uZ;
   }

   @Override
   protected awk o_() {
      return awl.uY;
   }

   @Override
   public void gl() {
      if (this.gu() == chl.g.g) {
         this.a(awl.uX, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public awm dn() {
      return this.gu() == chl.g.g ? awm.f : awm.g;
   }

   @Nullable
   public chl b(arn $$0, btv $$1) {
      chl $$2 = bul.aG.a($$0, buk.e);
      if ($$2 != null) {
         chl.g $$3;
         $$3 = a($$0, this.dx());
         label16:
         if (this.af.a(20) != 0) {
            if ($$1 instanceof chl $$4 && this.af.h()) {
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
   public boolean l(cwb $$0) {
      return $$0.a(axj.aw);
   }

   public chl.g gu() {
      return chl.g.a(this.am.a(ce));
   }

   public void a(chl.g $$0) {
      if ($$0 == chl.g.g) {
         this.g(bwi.a).a(8.0);
         this.bS.a(4, new cci(this, 1.4, true));
         this.bT.a(1, new cdq(this).a());
         this.bT.a(2, new cdr<>(this, com.class, true));
         this.bT.a(2, new cdr<>(this, chu.class, true));
         this.g(bwi.c).a(new bwg(ci, 5.0, bwg.a.a));
         if (!this.an()) {
            this.b(xi.c(ae.a("entity", cf)));
         }
      } else {
         this.g(bwi.c).c(ci);
      }

      this.am.a(ce, $$0.j);
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      chl.g $$4 = a($$0, this.dx());
      if ($$3 instanceof chl.b) {
         $$4 = ((chl.b)$$3).a;
      } else {
         $$3 = new chl.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static chl.g a(dfc $$0, jh $$1) {
      jq<dgc> $$2 = $$0.t($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(awz.al)) {
         return $$3 < 80 ? chl.g.b : chl.g.d;
      } else if ($$2.a(awz.ak)) {
         return chl.g.e;
      } else {
         return $$3 < 50 ? chl.g.a : ($$3 < 90 ? chl.g.f : chl.g.c);
      }
   }

   public static boolean c(bul<chl> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      return $$1.a_($$3.e()).a(axa.ce) && a((ded)$$1, $$3);
   }

   boolean gG() {
      return this.cp <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bx();
         this.cm = 10;
         this.cl = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public ezn cU() {
      return new ezn(0.0, (double)(0.6F * this.cT()), (double)(this.ds() * 0.4F));
   }

   static class a<T extends bva> extends cbf<T> {
      private final chl i;

      public a(chl $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gu() != chl.g.g && super.b();
      }
   }

   public static class b extends btv.a {
      public final chl.g a;

      public b(chl.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends caz {
      private final chl b;
      private boolean c;

      public c(chl $$0) {
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

   static class d extends cbb {
      private final chl l;
      private double m;

      public d(chl $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aK() && !this.l.bn && !((chl.c)this.l.bQ).c()) {
            this.l.i(0.0);
         } else if (this.b()) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.bk()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends ccr {
      private final chl a;

      public e(chl $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends ccl {
      private final chl g;
      private boolean h;
      private boolean i;

      public f(chl $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!this.g.dX().ac().b(dex.c)) {
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
         this.g.K().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.ad());
         if (this.m()) {
            dfb $$0 = this.g.dX();
            jh $$1 = this.e.d();
            dvj $$2 = $$0.a_($$1);
            die $$3 = $$2.b();
            if (this.i && $$3 instanceof diw) {
               int $$4 = $$2.c(diw.f);
               if ($$4 == 0) {
                  $$0.a($$1, dig.a.m(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.b(diw.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(eag.c, $$1, eag.a.a(this.g));
                  $$0.c(2001, $$1, die.j($$2));
               }

               this.g.cp = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dfe $$0, jh $$1) {
         dvj $$2 = $$0.a_($$1);
         if ($$2.a(dig.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof diw && ((diw)$$2.b()).i($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements bag {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<chl.g> i = ayb.a(chl.g::a, values(), a);
      public static final Codec<chl.g> h = bag.a(chl.g::values);
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

      public static chl.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
