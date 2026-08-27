import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bvd extends buj implements bjw<bvd.g> {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.0;
   public static final double bX = 2.2;
   public static final double bY = 1.4;
   private static final adz<Integer> cb = aec.a(bvd.class, aeb.b);
   private static final aer cc = new aer("killer_bunny");
   public static final int bZ = 8;
   public static final int ca = 8;
   private static final int cd = 40;
   private int ce;
   private int cf;
   private boolean cg;
   private int ch;
   int ci;

   public bvd(bim<? extends bvd> $$0, cpl $$1) {
      super($$0, $$1);
      this.bM = new bvd.c(this);
      this.bL = new bvd.d(this);
      this.i(0.0);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bpn(this));
      this.bO.a(1, new bpi(this, this.dK()));
      this.bO.a(1, new bvd.e(this, 2.2));
      this.bO.a(2, new bpf(this, 0.8));
      this.bO.a(3, new brb(this, 1.0, clx.a(cja.tl, cja.tq, csm.bR), false));
      this.bO.a(4, new bvd.a<>(this, cbm.class, 8.0F, 2.2, 2.2));
      this.bO.a(4, new bvd.a<>(this, bvm.class, 10.0F, 2.2, 2.2));
      this.bO.a(4, new bvd.a<>(this, bza.class, 4.0F, 2.2, 2.2));
      this.bO.a(5, new bvd.f(this));
      this.bO.a(6, new brg(this, 0.6));
      this.bO.a(11, new bqb(this, cbm.class, 10.0F));
   }

   @Override
   protected float eX() {
      float $$0 = 0.3F;
      if (this.P || this.bL.b() && this.bL.e() > this.dr() + 0.5) {
         $$0 = 0.5F;
      }

      ear $$1 = this.bN.j();
      if ($$1 != null && !$$1.c()) {
         ehd $$2 = $$1.a(this);
         if ($$2.d > this.dr() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bL.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return $$0 + this.eY();
   }

   @Override
   protected void eZ() {
      super.eZ();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.dn().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new ehd(0.0, 0.0, 1.0));
         }
      }

      if (!this.dK().B) {
         this.dK().a(this, (byte)1);
      }
   }

   public float E(float $$0) {
      return this.cf == 0 ? 0.0F : ((float)this.ce + $$0) / (float)this.cf;
   }

   public void i(double $$0) {
      this.H().a($$0);
      this.bL.a(this.bL.d(), this.bL.e(), this.bL.f(), $$0);
   }

   @Override
   public void r(boolean $$0) {
      super.r($$0);
      if ($$0) {
         this.a(this.t(), this.eU(), ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void p() {
      this.r(true);
      this.cf = 10;
      this.ce = 0;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cb, bvd.g.a.j);
   }

   @Override
   public void V() {
      if (this.ch > 0) {
         this.ch--;
      }

      if (this.ci > 0) {
         this.ci = this.ci - this.ag.a(3);
         if (this.ci < 0) {
            this.ci = 0;
         }
      }

      if (this.aA()) {
         if (!this.cg) {
            this.r(false);
            this.gj();
         }

         if (this.ga() == bvd.g.g && this.ch == 0) {
            biy $$0 = this.j();
            if ($$0 != null && this.f((bii)$$0) < 16.0) {
               this.c($$0.dp(), $$0.dv());
               this.bL.a($$0.dp(), $$0.dr(), $$0.dv(), this.bL.c());
               this.p();
               this.cg = true;
            }
         }

         bvd.c $$1 = (bvd.c)this.bM;
         if (!$$1.c()) {
            if (this.bL.b() && this.ch == 0) {
               ear $$2 = this.bN.j();
               ehd $$3 = new ehd(this.bL.d(), this.bL.e(), this.bL.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.p();
            }
         } else if (!$$1.d()) {
            this.gg();
         }
      }

      this.cg = this.aA();
   }

   @Override
   public boolean bj() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.r((float)(arp.d($$1 - this.dv(), $$0 - this.dp()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gg() {
      ((bvd.c)this.bM).a(true);
   }

   private void gh() {
      ((bvd.c)this.bM).a(false);
   }

   private void gi() {
      if (this.bL.c() < 2.2) {
         this.ch = 10;
      } else {
         this.ch = 1;
      }
   }

   private void gj() {
      this.gi();
      this.gh();
   }

   @Override
   public void b_() {
      super.b_();
      if (this.ce != this.cf) {
         this.ce++;
      } else if (this.cf != 0) {
         this.ce = 0;
         this.cf = 0;
         this.r(false);
      }
   }

   public static bkd.a q() {
      return bja.x().a(bke.a, 3.0).a(bke.d, 0.3F);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.ga().j);
      $$0.a("MoreCarrotTicks", this.ci);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a(bvd.g.a($$0.h("RabbitType")));
      this.ci = $$0.h("MoreCarrotTicks");
   }

   protected aov t() {
      return aow.to;
   }

   @Override
   protected aov r() {
      return aow.tk;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.tn;
   }

   @Override
   protected aov h_() {
      return aow.tm;
   }

   @Override
   public boolean C(bii $$0) {
      if (this.ga() == bvd.g.g) {
         this.a(aow.tl, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         return $$0.a(this.dL().b((biy)this), 8.0F);
      } else {
         return $$0.a(this.dL().b((biy)this), 3.0F);
      }
   }

   @Override
   public aox da() {
      return this.ga() == bvd.g.g ? aox.f : aox.g;
   }

   private static boolean l(cix $$0) {
      return $$0.a(cja.tl) || $$0.a(cja.tq) || $$0.a(csm.bR.k());
   }

   @Nullable
   public bvd b(akk $$0, bid $$1) {
      bvd $$2 = bim.aC.a((cpl)$$0);
      if ($$2 != null) {
         bvd.g $$3;
         $$3 = a($$0, this.dk());
         label16:
         if (this.ag.a(20) != 0) {
            if ($$1 instanceof bvd $$4 && this.ag.h()) {
               $$3 = $$4.ga();
               break label16;
            }

            $$3 = this.ga();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean m(cix $$0) {
      return l($$0);
   }

   public bvd.g ga() {
      return bvd.g.a(this.an.b(cb));
   }

   public void a(bvd.g $$0) {
      if ($$0 == bvd.g.g) {
         this.a(bke.i).a(8.0);
         this.bO.a(4, new bqd(this, 1.4, true));
         this.bP.a(1, new brl(this).a());
         this.bP.a(2, new brm<>(this, cbm.class, true));
         this.bP.a(2, new brm<>(this, bvm.class, true));
         if (!this.ac()) {
            this.b(tf.c(ac.a("entity", cc)));
         }
      }

      this.an.b(cb, $$0.j);
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      bvd.g $$5 = a($$0, this.dk());
      if ($$3 instanceof bvd.b) {
         $$5 = ((bvd.b)$$3).a;
      } else {
         $$3 = new bvd.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private static bvd.g a(cpm $$0, gu $$1) {
      he<cqj> $$2 = $$0.s($$1);
      int $$3 = $$0.y_().a(100);
      if ($$2.a(apk.ak)) {
         return $$3 < 80 ? bvd.g.b : bvd.g.d;
      } else if ($$2.a(apk.aj)) {
         return bvd.g.e;
      } else {
         return $$3 < 50 ? bvd.g.a : ($$3 < 90 ? bvd.g.f : bvd.g.c);
      }
   }

   public static boolean c(bim<bvd> $$0, cpm $$1, bjc $$2, gu $$3, aru $$4) {
      return $$1.a_($$3.d()).a(apl.bV) && a((coo)$$1, $$3);
   }

   boolean gk() {
      return this.ci <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bk();
         this.cf = 10;
         this.ce = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public ehd cI() {
      return new ehd(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   static class a<T extends biy> extends bpa<T> {
      private final bvd i;

      public a(bvd $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.ga() != bvd.g.g && super.a();
      }
   }

   public static class b extends bid.a {
      public final bvd.g a;

      public b(bvd.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bou {
      private final bvd b;
      private boolean c;

      public c(bvd $$0) {
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
            this.b.p();
            this.a = false;
         }
      }
   }

   static class d extends bow {
      private final bvd l;
      private double m;

      public d(bvd $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aA() && !this.l.bj && !((bvd.c)this.l.bM).c()) {
            this.l.i(0.0);
         } else if (this.b()) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.aX()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends bqm {
      private final bvd h;

      public e(bvd $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends bqg {
      private final bvd g;
      private boolean h;
      private boolean i;

      public f(bvd $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dK().X().b(cph.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gk();
         }

         return super.a();
      }

      @Override
      public boolean b() {
         return this.i && super.b();
      }

      @Override
      public void e() {
         super.e();
         this.g.D().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.W());
         if (this.m()) {
            cpl $$0 = this.g.dK();
            gu $$1 = this.e.c();
            dez $$2 = $$0.a_($$1);
            csl $$3 = $$2.b();
            if (this.i && $$3 instanceof ctc) {
               int $$4 = $$2.c(ctc.d);
               if ($$4 == 0) {
                  $$0.a($$1, csm.a.n(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(ctc.d, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(djj.c, $$1, djj.a.a(this.g));
                  $$0.c(2001, $$1, csl.i($$2));
               }

               this.g.ci = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(cpo $$0, gu $$1) {
         dez $$2 = $$0.a_($$1);
         if ($$2.a(csm.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof ctc && ((ctc)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements ash {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<bvd.g> i = aqk.a(bvd.g::a, values(), a);
      public static final Codec<bvd.g> h = ash.a(bvd.g::values);
      final int j;
      private final String k;

      private g(int $$0, String $$1) {
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

      public static bvd.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
