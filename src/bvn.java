import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bvn extends but implements bkg<bvn.g> {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.0;
   public static final double bX = 2.2;
   public static final double bY = 1.4;
   private static final aeg<Integer> cb = aej.a(bvn.class, aei.b);
   private static final aey cc = new aey("killer_bunny");
   public static final int bZ = 8;
   public static final int ca = 8;
   private static final int cd = 40;
   private int ce;
   private int cf;
   private boolean cg;
   private int ch;
   int ci;

   public bvn(biw<? extends bvn> $$0, cpx $$1) {
      super($$0, $$1);
      this.bM = new bvn.c(this);
      this.bL = new bvn.d(this);
      this.i(0.0);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bpx(this));
      this.bO.a(1, new bps(this, this.dL()));
      this.bO.a(1, new bvn.e(this, 2.2));
      this.bO.a(2, new bpp(this, 0.8));
      this.bO.a(3, new brl(this, 1.0, cmi.a(cjk.tl, cjk.tq, csy.bR), false));
      this.bO.a(4, new bvn.a<>(this, cbw.class, 8.0F, 2.2, 2.2));
      this.bO.a(4, new bvn.a<>(this, bvw.class, 10.0F, 2.2, 2.2));
      this.bO.a(4, new bvn.a<>(this, bzk.class, 4.0F, 2.2, 2.2));
      this.bO.a(5, new bvn.f(this));
      this.bO.a(6, new brq(this, 0.6));
      this.bO.a(11, new bql(this, cbw.class, 10.0F));
   }

   @Override
   protected float eY() {
      float $$0 = 0.3F;
      if (this.P || this.bL.b() && this.bL.e() > this.ds() + 0.5) {
         $$0 = 0.5F;
      }

      ebd $$1 = this.bN.j();
      if ($$1 != null && !$$1.c()) {
         ehp $$2 = $$1.a(this);
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
            this.a(0.1F, new ehp(0.0, 0.0, 1.0));
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
      this.an.a(cb, bvn.g.a.j);
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
            this.gm();
         }

         if (this.gd() == bvn.g.g && this.ch == 0) {
            bji $$0 = this.q();
            if ($$0 != null && this.f((bis)$$0) < 16.0) {
               this.c($$0.dq(), $$0.dw());
               this.bL.a($$0.dq(), $$0.ds(), $$0.dw(), this.bL.c());
               this.s();
               this.cg = true;
            }
         }

         bvn.c $$1 = (bvn.c)this.bM;
         if (!$$1.c()) {
            if (this.bL.b() && this.ch == 0) {
               ebd $$2 = this.bN.j();
               ehp $$3 = new ehp(this.bL.d(), this.bL.e(), this.bL.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.s();
            }
         } else if (!$$1.d()) {
            this.gj();
         }
      }

      this.cg = this.aA();
   }

   @Override
   public boolean bj() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.r((float)(ary.d($$1 - this.dw(), $$0 - this.dq()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gj() {
      ((bvn.c)this.bM).a(true);
   }

   private void gk() {
      ((bvn.c)this.bM).a(false);
   }

   private void gl() {
      if (this.bL.c() < 2.2) {
         this.ch = 10;
      } else {
         this.ch = 1;
      }
   }

   private void gm() {
      this.gl();
      this.gk();
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

   public static bkn.a t() {
      return bjk.A().a(bko.a, 3.0).a(bko.d, 0.3F);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gd().j);
      $$0.a("MoreCarrotTicks", this.ci);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.a(bvn.g.a($$0.h("RabbitType")));
      this.ci = $$0.h("MoreCarrotTicks");
   }

   protected ape y() {
      return apf.to;
   }

   @Override
   protected ape w() {
      return apf.tk;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.tn;
   }

   @Override
   protected ape l_() {
      return apf.tm;
   }

   @Override
   public boolean C(bis $$0) {
      if (this.gd() == bvn.g.g) {
         this.a(apf.tl, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         return $$0.a(this.dM().b((bji)this), 8.0F);
      } else {
         return $$0.a(this.dM().b((bji)this), 3.0F);
      }
   }

   @Override
   public apg da() {
      return this.gd() == bvn.g.g ? apg.f : apg.g;
   }

   private static boolean l(cjh $$0) {
      return $$0.a(cjk.tl) || $$0.a(cjk.tq) || $$0.a(csy.bR.k());
   }

   @Nullable
   public bvn b(aks $$0, bin $$1) {
      bvn $$2 = biw.aC.a((cpx)$$0);
      if ($$2 != null) {
         bvn.g $$3;
         $$3 = a($$0, this.dl());
         label16:
         if (this.ag.a(20) != 0) {
            if ($$1 instanceof bvn $$4 && this.ag.h()) {
               $$3 = $$4.gd();
               break label16;
            }

            $$3 = this.gd();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean m(cjh $$0) {
      return l($$0);
   }

   public bvn.g gd() {
      return bvn.g.a(this.an.b(cb));
   }

   public void a(bvn.g $$0) {
      if ($$0 == bvn.g.g) {
         this.a(bko.i).a(8.0);
         this.bO.a(4, new bqn(this, 1.4, true));
         this.bP.a(1, new brv(this).a());
         this.bP.a(2, new brw<>(this, cbw.class, true));
         this.bP.a(2, new brw<>(this, bvw.class, true));
         if (!this.ac()) {
            this.b(tn.c(ac.a("entity", cc)));
         }
      }

      this.an.b(cb, $$0.j);
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      bvn.g $$5 = a($$0, this.dl());
      if ($$3 instanceof bvn.b) {
         $$5 = ((bvn.b)$$3).a;
      } else {
         $$3 = new bvn.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private static bvn.g a(cpy $$0, gw $$1) {
      hg<cqv> $$2 = $$0.s($$1);
      int $$3 = $$0.D_().a(100);
      if ($$2.a(apt.ak)) {
         return $$3 < 80 ? bvn.g.b : bvn.g.d;
      } else if ($$2.a(apt.aj)) {
         return bvn.g.e;
      } else {
         return $$3 < 50 ? bvn.g.a : ($$3 < 90 ? bvn.g.f : bvn.g.c);
      }
   }

   public static boolean c(biw<bvn> $$0, cpy $$1, bjm $$2, gw $$3, ase $$4) {
      return $$1.a_($$3.d()).a(apu.bV) && a((cpa)$$1, $$3);
   }

   boolean gn() {
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
   public ehp cI() {
      return new ehp(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   static class a<T extends bji> extends bpk<T> {
      private final bvn i;

      public a(bvn $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gd() != bvn.g.g && super.a();
      }
   }

   public static class b extends bin.a {
      public final bvn.g a;

      public b(bvn.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bpe {
      private final bvn b;
      private boolean c;

      public c(bvn $$0) {
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

   static class d extends bpg {
      private final bvn l;
      private double m;

      public d(bvn $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aA() && !this.l.bj && !((bvn.c)this.l.bM).c()) {
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

   static class e extends bqw {
      private final bvn h;

      public e(bvn $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends bqq {
      private final bvn g;
      private boolean h;
      private boolean i;

      public f(bvn $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dL().X().b(cpt.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gn();
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
            cpx $$0 = this.g.dL();
            gw $$1 = this.e.c();
            dfl $$2 = $$0.a_($$1);
            csx $$3 = $$2.b();
            if (this.i && $$3 instanceof cto) {
               int $$4 = $$2.c(cto.d);
               if ($$4 == 0) {
                  $$0.a($$1, csy.a.n(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(cto.d, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(djv.c, $$1, djv.a.a(this.g));
                  $$0.c(2001, $$1, csx.i($$2));
               }

               this.g.ci = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(cqa $$0, gw $$1) {
         dfl $$2 = $$0.a_($$1);
         if ($$2.a(csy.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof cto && ((cto)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements asr {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<bvn.g> i = aqt.a(bvn.g::a, values(), a);
      public static final Codec<bvn.g> h = asr.a(bvn.g::values);
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

      public static bvn.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
