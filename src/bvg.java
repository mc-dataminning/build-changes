import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bvg extends bum implements bjz<bvg.g> {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.0;
   public static final double bX = 2.2;
   public static final double bY = 1.4;
   private static final aec<Integer> cb = aef.a(bvg.class, aee.b);
   private static final aeu cc = new aeu("killer_bunny");
   public static final int bZ = 8;
   public static final int ca = 8;
   private static final int cd = 40;
   private int ce;
   private int cf;
   private boolean cg;
   private int ch;
   int ci;

   public bvg(bip<? extends bvg> $$0, cpq $$1) {
      super($$0, $$1);
      this.bM = new bvg.c(this);
      this.bL = new bvg.d(this);
      this.i(0.0);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bpq(this));
      this.bO.a(1, new bpl(this, this.dK()));
      this.bO.a(1, new bvg.e(this, 2.2));
      this.bO.a(2, new bpi(this, 0.8));
      this.bO.a(3, new bre(this, 1.0, cmb.a(cjd.tl, cjd.tq, csr.bR), false));
      this.bO.a(4, new bvg.a<>(this, cbp.class, 8.0F, 2.2, 2.2));
      this.bO.a(4, new bvg.a<>(this, bvp.class, 10.0F, 2.2, 2.2));
      this.bO.a(4, new bvg.a<>(this, bzd.class, 4.0F, 2.2, 2.2));
      this.bO.a(5, new bvg.f(this));
      this.bO.a(6, new brj(this, 0.6));
      this.bO.a(11, new bqe(this, cbp.class, 10.0F));
   }

   @Override
   protected float eX() {
      float $$0 = 0.3F;
      if (this.P || this.bL.b() && this.bL.e() > this.dr() + 0.5) {
         $$0 = 0.5F;
      }

      eaw $$1 = this.bN.j();
      if ($$1 != null && !$$1.c()) {
         ehi $$2 = $$1.a(this);
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
            this.a(0.1F, new ehi(0.0, 0.0, 1.0));
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
      this.an.a(cb, bvg.g.a.j);
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

         if (this.ga() == bvg.g.g && this.ch == 0) {
            bjb $$0 = this.j();
            if ($$0 != null && this.f((bil)$$0) < 16.0) {
               this.c($$0.dp(), $$0.dv());
               this.bL.a($$0.dp(), $$0.dr(), $$0.dv(), this.bL.c());
               this.p();
               this.cg = true;
            }
         }

         bvg.c $$1 = (bvg.c)this.bM;
         if (!$$1.c()) {
            if (this.bL.b() && this.ch == 0) {
               eaw $$2 = this.bN.j();
               ehi $$3 = new ehi(this.bL.d(), this.bL.e(), this.bL.f());
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
      this.r((float)(ars.d($$1 - this.dv(), $$0 - this.dp()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gg() {
      ((bvg.c)this.bM).a(true);
   }

   private void gh() {
      ((bvg.c)this.bM).a(false);
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

   public static bkg.a q() {
      return bjd.x().a(bkh.a, 3.0).a(bkh.d, 0.3F);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.ga().j);
      $$0.a("MoreCarrotTicks", this.ci);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.a(bvg.g.a($$0.h("RabbitType")));
      this.ci = $$0.h("MoreCarrotTicks");
   }

   protected aoy t() {
      return aoz.to;
   }

   @Override
   protected aoy r() {
      return aoz.tk;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.tn;
   }

   @Override
   protected aoy h_() {
      return aoz.tm;
   }

   @Override
   public boolean C(bil $$0) {
      if (this.ga() == bvg.g.g) {
         this.a(aoz.tl, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         return $$0.a(this.dL().b((bjb)this), 8.0F);
      } else {
         return $$0.a(this.dL().b((bjb)this), 3.0F);
      }
   }

   @Override
   public apa da() {
      return this.ga() == bvg.g.g ? apa.f : apa.g;
   }

   private static boolean l(cja $$0) {
      return $$0.a(cjd.tl) || $$0.a(cjd.tq) || $$0.a(csr.bR.k());
   }

   @Nullable
   public bvg b(akn $$0, big $$1) {
      bvg $$2 = bip.aC.a((cpq)$$0);
      if ($$2 != null) {
         bvg.g $$3;
         $$3 = a($$0, this.dk());
         label16:
         if (this.ag.a(20) != 0) {
            if ($$1 instanceof bvg $$4 && this.ag.h()) {
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
   public boolean m(cja $$0) {
      return l($$0);
   }

   public bvg.g ga() {
      return bvg.g.a(this.an.b(cb));
   }

   public void a(bvg.g $$0) {
      if ($$0 == bvg.g.g) {
         this.a(bkh.i).a(8.0);
         this.bO.a(4, new bqg(this, 1.4, true));
         this.bP.a(1, new bro(this).a());
         this.bP.a(2, new brp<>(this, cbp.class, true));
         this.bP.a(2, new brp<>(this, bvp.class, true));
         if (!this.ac()) {
            this.b(ti.c(ac.a("entity", cc)));
         }
      }

      this.an.b(cb, $$0.j);
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      bvg.g $$5 = a($$0, this.dk());
      if ($$3 instanceof bvg.b) {
         $$5 = ((bvg.b)$$3).a;
      } else {
         $$3 = new bvg.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private static bvg.g a(cpr $$0, gw $$1) {
      hg<cqo> $$2 = $$0.s($$1);
      int $$3 = $$0.y_().a(100);
      if ($$2.a(apn.ak)) {
         return $$3 < 80 ? bvg.g.b : bvg.g.d;
      } else if ($$2.a(apn.aj)) {
         return bvg.g.e;
      } else {
         return $$3 < 50 ? bvg.g.a : ($$3 < 90 ? bvg.g.f : bvg.g.c);
      }
   }

   public static boolean c(bip<bvg> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      return $$1.a_($$3.d()).a(apo.bV) && a((cot)$$1, $$3);
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
   public ehi cI() {
      return new ehi(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   static class a<T extends bjb> extends bpd<T> {
      private final bvg i;

      public a(bvg $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.ga() != bvg.g.g && super.a();
      }
   }

   public static class b extends big.a {
      public final bvg.g a;

      public b(bvg.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends box {
      private final bvg b;
      private boolean c;

      public c(bvg $$0) {
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

   static class d extends boz {
      private final bvg l;
      private double m;

      public d(bvg $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aA() && !this.l.bj && !((bvg.c)this.l.bM).c()) {
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

   static class e extends bqp {
      private final bvg h;

      public e(bvg $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends bqj {
      private final bvg g;
      private boolean h;
      private boolean i;

      public f(bvg $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dK().X().b(cpm.c)) {
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
            cpq $$0 = this.g.dK();
            gw $$1 = this.e.c();
            dfe $$2 = $$0.a_($$1);
            csq $$3 = $$2.b();
            if (this.i && $$3 instanceof cth) {
               int $$4 = $$2.c(cth.d);
               if ($$4 == 0) {
                  $$0.a($$1, csr.a.n(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(cth.d, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(djo.c, $$1, djo.a.a(this.g));
                  $$0.c(2001, $$1, csq.i($$2));
               }

               this.g.ci = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(cpt $$0, gw $$1) {
         dfe $$2 = $$0.a_($$1);
         if ($$2.a(csr.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof cth && ((cth)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements ask {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<bvg.g> i = aqn.a(bvg.g::a, values(), a);
      public static final Codec<bvg.g> h = ask.a(bvg.g::values);
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

      public static bvg.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
