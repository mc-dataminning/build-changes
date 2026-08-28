import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chj extends chf implements bum<chj.d>, ckf {
   private static final int cb = 5;
   private static final ajv<Integer> cc = ajz.a(chj.class, ajx.b);
   private static final ajv<Integer> ce = ajz.a(chj.class, ajx.b);
   private static final bst cf = bsw.an.n().a(bss.a().a(bsr.a, 0.0F, bsw.an.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean cg;
   @Nullable
   private chj ch;
   @Nullable
   private chj ci;

   public chj(bsw<? extends chj> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public boolean gq() {
      return false;
   }

   private void w(int $$0) {
      this.ao.a(cc, Math.max(1, Math.min(5, $$0)));
   }

   private void b(ayv $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gw() {
      return this.ao.a(cc);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Variant", this.gy().g);
      $$0.a("Strength", this.gw());
   }

   @Override
   public void a(ua $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(chj.d.a($$0.h("Variant")));
   }

   @Override
   protected void z() {
      this.bU.a(0, new cae(this));
      this.bU.a(1, new cbo(this, 1.2));
      this.bU.a(2, new car(this, 2.1F));
      this.bU.a(3, new cbj(this, 1.25, 40, 20.0F));
      this.bU.a(3, new cbd(this, 1.2));
      this.bU.a(4, new bzw(this, 1.0));
      this.bU.a(5, new cbs(this, 1.25, $$0 -> $$0.a(awm.ao), false));
      this.bU.a(6, new caj(this, 1.0));
      this.bU.a(7, new cbx(this, 0.7));
      this.bU.a(8, new cas(this, cmv.class, 6.0F));
      this.bU.a(9, new cbf(this));
      this.bV.a(1, new chj.c(this));
      this.bV.a(2, new chj.a(this));
   }

   public static but.a gx() {
      return s().a(buu.m, 40.0);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(cc, 0);
      $$0.a(ce, 0);
   }

   public chj.d gy() {
      return chj.d.a(this.ao.a(ce));
   }

   public void a(chj.d $$0) {
      this.ao.a(ce, $$0.g);
   }

   @Override
   protected int ab_() {
      return this.t() ? 1 + 3 * this.gp() : super.ab_();
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awm.an);
   }

   @Override
   protected boolean a(cmv $$0, cuo $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cur.pw)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dfy.ij.r())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gB() && this.g() == 0 && this.gr()) {
            $$5 = true;
            this.g($$0);
         }
      }

      if (this.ex() < this.eO() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.o_() && $$2 > 0) {
         this.dQ().a(lm.O, this.d(1.0), this.dy() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dQ().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gB()) && this.gH() < this.gM()) {
         $$5 = true;
         if (!this.dQ().B) {
            this.v($$3);
         }
      }

      if ($$5 && !this.aX()) {
         avn $$6 = this.go();
         if ($$6 != null) {
            this.dQ().a(null, this.dv(), this.dx(), this.dB(), this.go(), this.df(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fd() {
      return this.ey() || this.gE();
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      ayv $$4 = $$0.E_();
      this.b($$4);
      chj.d $$5;
      if ($$3 instanceof chj.b) {
         $$5 = ((chj.b)$$3).a;
      } else {
         $$5 = ad.a(chj.d.values(), $$4);
         $$3 = new chj.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gn() {
      return false;
   }

   @Override
   protected avn gK() {
      return avo.nZ;
   }

   @Override
   protected avn v() {
      return avo.nY;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.od;
   }

   @Override
   protected avn n_() {
      return avo.ob;
   }

   @Nullable
   @Override
   protected avn go() {
      return avo.oc;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.of, 0.15F, 1.0F);
   }

   @Override
   protected void gm() {
      this.a(avo.oa, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
   }

   @Override
   public int gp() {
      return this.gw();
   }

   @Override
   public boolean d(bsx $$0) {
      return true;
   }

   @Override
   public boolean l(cuo $$0) {
      return $$0.a(awm.g);
   }

   @Override
   public boolean f() {
      return false;
   }

   @Nullable
   private static ctg n(cuo $$0) {
      dfw $$1 = dfw.a($$0.g());
      return $$1 instanceof dps ? ((dps)$$1).b() : null;
   }

   @Nullable
   public ctg gz() {
      return n(this.a(bsx.g));
   }

   @Override
   public int gM() {
      return 30;
   }

   @Override
   public boolean a(cfc $$0) {
      return $$0 != this && $$0 instanceof chj && this.gT() && ((chj)$$0).gT();
   }

   @Nullable
   public chj b(aqt $$0, bsk $$1) {
      chj $$2 = this.gA();
      if ($$2 != null) {
         this.a($$1, $$2);
         chj $$3 = (chj)$$1;
         int $$4 = this.ah.a(Math.max(this.gw(), $$3.gw())) + 1;
         if (this.ah.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ah.h() ? this.gy() : $$3.gy());
      }

      return $$2;
   }

   @Nullable
   protected chj gA() {
      return bsw.an.a(this.dQ());
   }

   private void k(btl $$0) {
      cnm $$1 = new cnm(this.dQ(), this);
      double $$2 = $$0.dv() - this.dv();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dx();
      double $$4 = $$0.dB() - this.dB();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aX()) {
         this.dQ().a(null, this.dv(), this.dx(), this.dB(), avo.oe, this.df(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
      }

      this.dQ().b($$1);
      this.cg = true;
   }

   void D(boolean $$0) {
      this.cg = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, brj $$2) {
      int $$3 = this.e($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bT()) {
               for (bsq $$4 : this.cX()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eK();
         return true;
      }
   }

   public void gW() {
      if (this.ch != null) {
         this.ch.ci = null;
      }

      this.ch = null;
   }

   public void a(chj $$0) {
      this.ch = $$0;
      this.ch.ci = this;
   }

   public boolean gX() {
      return this.ci != null;
   }

   public boolean gY() {
      return this.ch != null;
   }

   @Nullable
   public chj gZ() {
      return this.ch;
   }

   @Override
   protected double gl() {
      return 2.0;
   }

   @Override
   protected void gN() {
      if (!this.gY() && this.o_()) {
         super.gN();
      }
   }

   @Override
   public boolean gO() {
      return false;
   }

   @Override
   public void a(btl $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public eww cN() {
      return new eww(0.0, 0.75 * (double)this.cM(), (double)this.dk() * 0.5);
   }

   @Override
   public bst e(bty $$0) {
      return this.o_() ? cf : super.e($$0);
   }

   @Override
   protected eww a(bsq $$0, bst $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends ccd<cgf> {
      public a(chj $$0) {
         super($$0, cgf.class, 16, false, true, $$0x -> !((cgf)$$0x).s());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bsk.a {
      public final chj.d a;

      b(chj.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends ccc {
      public c(chj $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof chj $$0 && $$0.cg) {
            $$0.D(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements azj {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<chj.d> e = azj.a(chj.d::values);
      private static final IntFunction<chj.d> f = axd.a(chj.d::a, values(), axd.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static chj.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
