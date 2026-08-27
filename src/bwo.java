import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bwo extends bvu implements blh<bwo.g> {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.0;
   public static final double bX = 2.2;
   public static final double bY = 1.4;
   private static final afc<Integer> cb = aff.a(bwo.class, afe.b);
   private static final afw cc = new afw("killer_bunny");
   public static final int bZ = 8;
   public static final int ca = 8;
   private static final int cd = 40;
   private int ce;
   private int cf;
   private boolean cg;
   private int ch;
   int ci;

   public bwo(bjx<? extends bwo> $$0, cqz $$1) {
      super($$0, $$1);
      this.bM = new bwo.c(this);
      this.bL = new bwo.d(this);
      this.i(0.0);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bqy(this));
      this.bO.a(1, new bqt(this, this.dL()));
      this.bO.a(1, new bwo.e(this, 2.2));
      this.bO.a(2, new bqq(this, 0.8));
      this.bO.a(3, new bsm(this, 1.0, cnk.a(ckm.tl, ckm.tq, cuc.bR), false));
      this.bO.a(4, new bwo.a<>(this, ccx.class, 8.0F, 2.2, 2.2));
      this.bO.a(4, new bwo.a<>(this, bwx.class, 10.0F, 2.2, 2.2));
      this.bO.a(4, new bwo.a<>(this, cal.class, 4.0F, 2.2, 2.2));
      this.bO.a(5, new bwo.f(this));
      this.bO.a(6, new bsr(this, 0.6));
      this.bO.a(11, new brm(this, ccx.class, 10.0F));
   }

   @Override
   protected float eY() {
      float $$0 = 0.3F;
      if (this.P || this.bL.b() && this.bL.e() > this.ds() + 0.5) {
         $$0 = 0.5F;
      }

      ebt $$1 = this.bN.j();
      if ($$1 != null && !$$1.c()) {
         eif $$2 = $$1.a(this);
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
            this.a(0.1F, new eif(0.0, 0.0, 1.0));
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
   protected void b_() {
      super.b_();
      this.an.a(cb, bwo.g.a.j);
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

         if (this.ge() == bwo.g.g && this.ch == 0) {
            bkj $$0 = this.q();
            if ($$0 != null && this.f((bjt)$$0) < 16.0) {
               this.c($$0.dq(), $$0.dw());
               this.bL.a($$0.dq(), $$0.ds(), $$0.dw(), this.bL.c());
               this.s();
               this.cg = true;
            }
         }

         bwo.c $$1 = (bwo.c)this.bM;
         if (!$$1.c()) {
            if (this.bL.b() && this.ch == 0) {
               ebt $$2 = this.bN.j();
               eif $$3 = new eif(this.bL.d(), this.bL.e(), this.bL.f());
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
      this.r((float)(asy.d($$1 - this.dw(), $$0 - this.dq()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gk() {
      ((bwo.c)this.bM).a(true);
   }

   private void gl() {
      ((bwo.c)this.bM).a(false);
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
   public void c_() {
      super.c_();
      if (this.ce != this.cf) {
         this.ce++;
      } else if (this.cf != 0) {
         this.ce = 0;
         this.cf = 0;
         this.r(false);
      }
   }

   public static blo.a t() {
      return bkl.A().a(blp.l, 3.0).a(blp.m, 0.3F);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.ge().j);
      $$0.a("MoreCarrotTicks", this.ci);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.a(bwo.g.a($$0.h("RabbitType")));
      this.ci = $$0.h("MoreCarrotTicks");
   }

   protected aqc y() {
      return aqd.tq;
   }

   @Override
   protected aqc w() {
      return aqd.tm;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.tp;
   }

   @Override
   protected aqc m_() {
      return aqd.to;
   }

   @Override
   public boolean C(bjt $$0) {
      if (this.ge() == bwo.g.g) {
         this.a(aqd.tn, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         return $$0.a(this.dM().b((bkj)this), 8.0F);
      } else {
         return $$0.a(this.dM().b((bkj)this), 3.0F);
      }
   }

   @Override
   public aqe da() {
      return this.ge() == bwo.g.g ? aqe.f : aqe.g;
   }

   private static boolean l(ckj $$0) {
      return $$0.a(ckm.tl) || $$0.a(ckm.tq) || $$0.a(cuc.bR.k());
   }

   @Nullable
   public bwo b(alq $$0, bjo $$1) {
      bwo $$2 = bjx.aC.a((cqz)$$0);
      if ($$2 != null) {
         bwo.g $$3;
         $$3 = a($$0, this.dl());
         label16:
         if (this.ag.a(20) != 0) {
            if ($$1 instanceof bwo $$4 && this.ag.h()) {
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
   public boolean m(ckj $$0) {
      return l($$0);
   }

   public bwo.g ge() {
      return bwo.g.a(this.an.b(cb));
   }

   public void a(bwo.g $$0) {
      if ($$0 == bwo.g.g) {
         this.a(blp.a).a(8.0);
         this.bO.a(4, new bro(this, 1.4, true));
         this.bP.a(1, new bsw(this).a());
         this.bP.a(2, new bsx<>(this, ccx.class, true));
         this.bP.a(2, new bsx<>(this, bwx.class, true));
         if (!this.ac()) {
            this.b(ui.c(ac.a("entity", cc)));
         }
      }

      this.an.b(cb, $$0.j);
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      bwo.g $$5 = a($$0, this.dl());
      if ($$3 instanceof bwo.b) {
         $$5 = ((bwo.b)$$3).a;
      } else {
         $$3 = new bwo.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private static bwo.g a(cra $$0, ht $$1) {
      ib<crx> $$2 = $$0.s($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(aqr.ak)) {
         return $$3 < 80 ? bwo.g.b : bwo.g.d;
      } else if ($$2.a(aqr.aj)) {
         return bwo.g.e;
      } else {
         return $$3 < 50 ? bwo.g.a : ($$3 < 90 ? bwo.g.f : bwo.g.c);
      }
   }

   public static boolean c(bjx<bwo> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      return $$1.a_($$3.d()).a(aqs.bV) && a((cqc)$$1, $$3);
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
   public eif cI() {
      return new eif(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   static class a<T extends bkj> extends bql<T> {
      private final bwo i;

      public a(bwo $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.ge() != bwo.g.g && super.a();
      }
   }

   public static class b extends bjo.a {
      public final bwo.g a;

      public b(bwo.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bqf {
      private final bwo b;
      private boolean c;

      public c(bwo $$0) {
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

   static class d extends bqh {
      private final bwo l;
      private double m;

      public d(bwo $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aA() && !this.l.bj && !((bwo.c)this.l.bM).c()) {
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

   static class e extends brx {
      private final bwo h;

      public e(bwo $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends brr {
      private final bwo g;
      private boolean h;
      private boolean i;

      public f(bwo $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dL().X().b(cqv.c)) {
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
            cqz $$0 = this.g.dL();
            ht $$1 = this.e.c();
            dgb $$2 = $$0.a_($$1);
            cua $$3 = $$2.b();
            if (this.i && $$3 instanceof cus) {
               int $$4 = $$2.c(cus.f);
               if ($$4 == 0) {
                  $$0.a($$1, cuc.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(cus.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dkl.c, $$1, dkl.a.a(this.g));
                  $$0.c(2001, $$1, cua.i($$2));
               }

               this.g.ci = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(crc $$0, ht $$1) {
         dgb $$2 = $$0.a_($$1);
         if ($$2.a(cuc.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof cus && ((cus)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements atr {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<bwo.g> i = arr.a(bwo.g::a, values(), a);
      public static final Codec<bwo.g> h = atr.a(bwo.g::values);
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

      public static bwo.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
