import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bvr extends bux implements bkk<bvr.g> {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.0;
   public static final double bX = 2.2;
   public static final double bY = 1.4;
   private static final aef<Integer> cb = aei.a(bvr.class, aeh.b);
   private static final aez cc = new aez("killer_bunny");
   public static final int bZ = 8;
   public static final int ca = 8;
   private static final int cd = 40;
   private int ce;
   private int cf;
   private boolean cg;
   private int ch;
   int ci;

   public bvr(bja<? extends bvr> $$0, cqb $$1) {
      super($$0, $$1);
      this.bM = new bvr.c(this);
      this.bL = new bvr.d(this);
      this.i(0.0);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bqb(this));
      this.bO.a(1, new bpw(this, this.dL()));
      this.bO.a(1, new bvr.e(this, 2.2));
      this.bO.a(2, new bpt(this, 0.8));
      this.bO.a(3, new brp(this, 1.0, cmm.a(cjo.tl, cjo.tq, cte.bR), false));
      this.bO.a(4, new bvr.a<>(this, cca.class, 8.0F, 2.2, 2.2));
      this.bO.a(4, new bvr.a<>(this, bwa.class, 10.0F, 2.2, 2.2));
      this.bO.a(4, new bvr.a<>(this, bzo.class, 4.0F, 2.2, 2.2));
      this.bO.a(5, new bvr.f(this));
      this.bO.a(6, new bru(this, 0.6));
      this.bO.a(11, new bqp(this, cca.class, 10.0F));
   }

   @Override
   protected float eY() {
      float $$0 = 0.3F;
      if (this.P || this.bL.b() && this.bL.e() > this.ds() + 0.5) {
         $$0 = 0.5F;
      }

      eav $$1 = this.bN.j();
      if ($$1 != null && !$$1.c()) {
         ehh $$2 = $$1.a(this);
         if ($$2.d > this.ds() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bL.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return $$0 + this.eZ();
   }

   @Override
   protected void fa() {
      super.fa();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.do().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new ehh(0.0, 0.0, 1.0));
         }
      }

      if (!this.dL().B) {
         this.dL().a(this, (byte)1);
      }
   }

   public float E(float $$0) {
      return this.cf == 0 ? 0.0F : ((float)this.ce + $$0) / (float)this.cf;
   }

   public void i(double $$0) {
      this.L().a($$0);
      this.bL.a(this.bL.d(), this.bL.e(), this.bL.f(), $$0);
   }

   @Override
   public void r(boolean $$0) {
      super.r($$0);
      if ($$0) {
         this.a(this.y(), this.eV(), ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void s() {
      this.r(true);
      this.cf = 10;
      this.ce = 0;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cb, bvr.g.a.j);
   }

   @Override
   public void X() {
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
            this.gn();
         }

         if (this.ge() == bvr.g.g && this.ch == 0) {
            bjm $$0 = this.q();
            if ($$0 != null && this.f((biw)$$0) < 16.0) {
               this.c($$0.dq(), $$0.dw());
               this.bL.a($$0.dq(), $$0.ds(), $$0.dw(), this.bL.c());
               this.s();
               this.cg = true;
            }
         }

         bvr.c $$1 = (bvr.c)this.bM;
         if (!$$1.c()) {
            if (this.bL.b() && this.ch == 0) {
               eav $$2 = this.bN.j();
               ehh $$3 = new ehh(this.bL.d(), this.bL.e(), this.bL.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.s();
            }
         } else if (!$$1.d()) {
            this.gk();
         }
      }

      this.cg = this.aA();
   }

   @Override
   public boolean bj() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.r((float)(asb.d($$1 - this.dw(), $$0 - this.dq()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gk() {
      ((bvr.c)this.bM).a(true);
   }

   private void gl() {
      ((bvr.c)this.bM).a(false);
   }

   private void gm() {
      if (this.bL.c() < 2.2) {
         this.ch = 10;
      } else {
         this.ch = 1;
      }
   }

   private void gn() {
      this.gm();
      this.gl();
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

   public static bkr.a t() {
      return bjo.A().a(bks.l, 3.0).a(bks.m, 0.3F);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.ge().j);
      $$0.a("MoreCarrotTicks", this.ci);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.a(bvr.g.a($$0.h("RabbitType")));
      this.ci = $$0.h("MoreCarrotTicks");
   }

   protected apf y() {
      return apg.to;
   }

   @Override
   protected apf w() {
      return apg.tk;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.tn;
   }

   @Override
   protected apf l_() {
      return apg.tm;
   }

   @Override
   public boolean C(biw $$0) {
      if (this.ge() == bvr.g.g) {
         this.a(apg.tl, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         return $$0.a(this.dM().b((bjm)this), 8.0F);
      } else {
         return $$0.a(this.dM().b((bjm)this), 3.0F);
      }
   }

   @Override
   public aph da() {
      return this.ge() == bvr.g.g ? aph.f : aph.g;
   }

   private static boolean l(cjl $$0) {
      return $$0.a(cjo.tl) || $$0.a(cjo.tq) || $$0.a(cte.bR.k());
   }

   @Nullable
   public bvr b(akt $$0, bir $$1) {
      bvr $$2 = bja.aC.a((cqb)$$0);
      if ($$2 != null) {
         bvr.g $$3;
         $$3 = a($$0, this.dl());
         label16:
         if (this.ag.a(20) != 0) {
            if ($$1 instanceof bvr $$4 && this.ag.h()) {
               $$3 = $$4.ge();
               break label16;
            }

            $$3 = this.ge();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean m(cjl $$0) {
      return l($$0);
   }

   public bvr.g ge() {
      return bvr.g.a(this.an.b(cb));
   }

   public void a(bvr.g $$0) {
      if ($$0 == bvr.g.g) {
         this.a(bks.a).a(8.0);
         this.bO.a(4, new bqr(this, 1.4, true));
         this.bP.a(1, new brz(this).a());
         this.bP.a(2, new bsa<>(this, cca.class, true));
         this.bP.a(2, new bsa<>(this, bwa.class, true));
         if (!this.ac()) {
            this.b(tl.c(ac.a("entity", cc)));
         }
      }

      this.an.b(cb, $$0.j);
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      bvr.g $$5 = a($$0, this.dl());
      if ($$3 instanceof bvr.b) {
         $$5 = ((bvr.b)$$3).a;
      } else {
         $$3 = new bvr.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private static bvr.g a(cqc $$0, gw $$1) {
      he<cqz> $$2 = $$0.s($$1);
      int $$3 = $$0.D_().a(100);
      if ($$2.a(apu.ak)) {
         return $$3 < 80 ? bvr.g.b : bvr.g.d;
      } else if ($$2.a(apu.aj)) {
         return bvr.g.e;
      } else {
         return $$3 < 50 ? bvr.g.a : ($$3 < 90 ? bvr.g.f : bvr.g.c);
      }
   }

   public static boolean c(bja<bvr> $$0, cqc $$1, bjq $$2, gw $$3, ash $$4) {
      return $$1.a_($$3.d()).a(apv.bV) && a((cpe)$$1, $$3);
   }

   boolean go() {
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
   public ehh cI() {
      return new ehh(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   static class a<T extends bjm> extends bpo<T> {
      private final bvr i;

      public a(bvr $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.ge() != bvr.g.g && super.a();
      }
   }

   public static class b extends bir.a {
      public final bvr.g a;

      public b(bvr.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bpi {
      private final bvr b;
      private boolean c;

      public c(bvr $$0) {
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
            this.b.s();
            this.a = false;
         }
      }
   }

   static class d extends bpk {
      private final bvr l;
      private double m;

      public d(bvr $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aA() && !this.l.bj && !((bvr.c)this.l.bM).c()) {
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

   static class e extends bra {
      private final bvr h;

      public e(bvr $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends bqu {
      private final bvr g;
      private boolean h;
      private boolean i;

      public f(bvr $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dL().X().b(cpx.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.go();
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
         this.g.G().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.Y());
         if (this.m()) {
            cqb $$0 = this.g.dL();
            gw $$1 = this.e.c();
            dfd $$2 = $$0.a_($$1);
            ctc $$3 = $$2.b();
            if (this.i && $$3 instanceof ctu) {
               int $$4 = $$2.c(ctu.f);
               if ($$4 == 0) {
                  $$0.a($$1, cte.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(ctu.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(djn.c, $$1, djn.a.a(this.g));
                  $$0.c(2001, $$1, ctc.i($$2));
               }

               this.g.ci = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(cqe $$0, gw $$1) {
         dfd $$2 = $$0.a_($$1);
         if ($$2.a(cte.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof ctu && ((ctu)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements asu {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<bvr.g> i = aqu.a(bvr.g::a, values(), a);
      public static final Codec<bvr.g> h = asu.a(bvr.g::values);
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

      public static bvr.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
