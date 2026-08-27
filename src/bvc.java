import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bvc extends bui implements bjv<bvc.h> {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.0;
   public static final double bX = 2.2;
   public static final double bY = 1.4;
   private static final adx<Integer> cb = aea.a(bvc.class, adz.b);
   private static final aep cc = new aep("killer_bunny");
   public static final int bZ = 8;
   public static final int ca = 8;
   private static final int cd = 40;
   private int ce;
   private int cf;
   private boolean cg;
   private int ch;
   int ci;

   public bvc(bik<? extends bvc> $$0, cpk $$1) {
      super($$0, $$1);
      this.bM = new bvc.d(this);
      this.bL = new bvc.e(this);
      this.i(0.0);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bpm(this));
      this.bO.a(1, new bph(this, this.dK()));
      this.bO.a(1, new bvc.f(this, 2.2));
      this.bO.a(2, new bpe(this, 0.8));
      this.bO.a(3, new bra(this, 1.0, clw.a(ciz.tl, ciz.tq, csl.bR), false));
      this.bO.a(4, new bvc.b<>(this, cbl.class, 8.0F, 2.2, 2.2));
      this.bO.a(4, new bvc.b<>(this, bvl.class, 10.0F, 2.2, 2.2));
      this.bO.a(4, new bvc.b<>(this, byz.class, 4.0F, 2.2, 2.2));
      this.bO.a(5, new bvc.g(this));
      this.bO.a(6, new brf(this, 0.6));
      this.bO.a(11, new bqa(this, cbl.class, 10.0F));
   }

   @Override
   protected float eX() {
      float $$0 = 0.3F;
      if (this.P || this.bL.b() && this.bL.e() > this.dr() + 0.5) {
         $$0 = 0.5F;
      }

      eaq $$1 = this.bN.j();
      if ($$1 != null && !$$1.c()) {
         ehf $$2 = $$1.a(this);
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
            this.a(0.1F, new ehf(0.0, 0.0, 1.0));
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
      this.an.a(cb, bvc.h.a.j);
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
            this.gi();
         }

         if (this.fZ() == bvc.h.g && this.ch == 0) {
            biw $$0 = this.j();
            if ($$0 != null && this.f((big)$$0) < 16.0) {
               this.c($$0.dp(), $$0.dv());
               this.bL.a($$0.dp(), $$0.dr(), $$0.dv(), this.bL.c());
               this.p();
               this.cg = true;
            }
         }

         bvc.d $$1 = (bvc.d)this.bM;
         if (!$$1.c()) {
            if (this.bL.b() && this.ch == 0) {
               eaq $$2 = this.bN.j();
               ehf $$3 = new ehf(this.bL.d(), this.bL.e(), this.bL.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.p();
            }
         } else if (!$$1.d()) {
            this.gf();
         }
      }

      this.cg = this.aA();
   }

   @Override
   public boolean bj() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.r((float)(aro.d($$1 - this.dv(), $$0 - this.dp()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gf() {
      ((bvc.d)this.bM).a(true);
   }

   private void gg() {
      ((bvc.d)this.bM).a(false);
   }

   private void gh() {
      if (this.bL.c() < 2.2) {
         this.ch = 10;
      } else {
         this.ch = 1;
      }
   }

   private void gi() {
      this.gh();
      this.gg();
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

   public static bkc.a q() {
      return biy.x().a(bkd.a, 3.0).a(bkd.d, 0.3F);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.fZ().j);
      $$0.a("MoreCarrotTicks", this.ci);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.a(bvc.h.a($$0.h("RabbitType")));
      this.ci = $$0.h("MoreCarrotTicks");
   }

   protected aot t() {
      return aou.to;
   }

   @Override
   protected aot r() {
      return aou.tk;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.tn;
   }

   @Override
   protected aot h_() {
      return aou.tm;
   }

   @Override
   public boolean C(big $$0) {
      if (this.fZ() == bvc.h.g) {
         this.a(aou.tl, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         return $$0.a(this.dL().b((biw)this), 8.0F);
      } else {
         return $$0.a(this.dL().b((biw)this), 3.0F);
      }
   }

   @Override
   public aov da() {
      return this.fZ() == bvc.h.g ? aov.f : aov.g;
   }

   private static boolean l(ciw $$0) {
      return $$0.a(ciz.tl) || $$0.a(ciz.tq) || $$0.a(csl.bR.k());
   }

   @Nullable
   public bvc b(aki $$0, bib $$1) {
      bvc $$2 = bik.aC.a((cpk)$$0);
      if ($$2 != null) {
         bvc.h $$3;
         $$3 = a($$0, this.dk());
         label16:
         if (this.ag.a(20) != 0) {
            if ($$1 instanceof bvc $$4 && this.ag.h()) {
               $$3 = $$4.fZ();
               break label16;
            }

            $$3 = this.fZ();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean m(ciw $$0) {
      return l($$0);
   }

   public bvc.h fZ() {
      return bvc.h.a(this.an.b(cb));
   }

   public void a(bvc.h $$0) {
      if ($$0 == bvc.h.g) {
         this.a(bkd.i).a(8.0);
         this.bO.a(4, new bvc.a(this));
         this.bP.a(1, new brk(this).a());
         this.bP.a(2, new brl<>(this, cbl.class, true));
         this.bP.a(2, new brl<>(this, bvl.class, true));
         if (!this.ac()) {
            this.b(te.c(ac.a("entity", cc)));
         }
      }

      this.an.b(cb, $$0.j);
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      bvc.h $$5 = a($$0, this.dk());
      if ($$3 instanceof bvc.c) {
         $$5 = ((bvc.c)$$3).a;
      } else {
         $$3 = new bvc.c($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private static bvc.h a(cpl $$0, gv $$1) {
      hf<cqi> $$2 = $$0.s($$1);
      int $$3 = $$0.y_().a(100);
      if ($$2.a(api.ak)) {
         return $$3 < 80 ? bvc.h.b : bvc.h.d;
      } else if ($$2.a(api.aj)) {
         return bvc.h.e;
      } else {
         return $$3 < 50 ? bvc.h.a : ($$3 < 90 ? bvc.h.f : bvc.h.c);
      }
   }

   public static boolean c(bik<bvc> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      return $$1.a_($$3.d()).a(apj.bV) && a((com)$$1, $$3);
   }

   boolean gj() {
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
   public ehf cI() {
      return new ehf(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   static class a extends bqc {
      public a(bvc $$0) {
         super($$0, 1.4, true);
      }

      @Override
      protected double a(biw $$0) {
         return (double)(4.0F + $$0.df());
      }
   }

   static class b<T extends biw> extends boz<T> {
      private final bvc i;

      public b(bvc $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.fZ() != bvc.h.g && super.a();
      }
   }

   public static class c extends bib.a {
      public final bvc.h a;

      public c(bvc.h $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class d extends bot {
      private final bvc b;
      private boolean c;

      public d(bvc $$0) {
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

   static class e extends bov {
      private final bvc l;
      private double m;

      public e(bvc $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aA() && !this.l.bj && !((bvc.d)this.l.bM).c()) {
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

   static class f extends bql {
      private final bvc h;

      public f(bvc $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class g extends bqf {
      private final bvc g;
      private boolean h;
      private boolean i;

      public g(bvc $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dK().X().b(cpg.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gj();
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
            cpk $$0 = this.g.dK();
            gv $$1 = this.e.c();
            dey $$2 = $$0.a_($$1);
            csk $$3 = $$2.b();
            if (this.i && $$3 instanceof ctb) {
               int $$4 = $$2.c(ctb.d);
               if ($$4 == 0) {
                  $$0.a($$1, csl.a.n(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(ctb.d, Integer.valueOf($$4 - 1)), 2);
                  $$0.c(2001, $$1, csk.i($$2));
               }

               this.g.ci = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(cpn $$0, gv $$1) {
         dey $$2 = $$0.a_($$1);
         if ($$2.a(csl.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof ctb && ((ctb)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum h implements asf {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<bvc.h> i = aqi.a(bvc.h::a, values(), a);
      public static final Codec<bvc.h> h = asf.a(bvc.h::values);
      final int j;
      private final String k;

      private h(int $$0, String $$1) {
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

      public static bvc.h a(int $$0) {
         return i.apply($$0);
      }
   }
}
