import java.util.EnumSet;
import javax.annotation.Nullable;

public class clf extends cmk implements clv {
   public static final float b = 0.03F;
   boolean cb;
   protected final ceo c;
   protected final cel d;

   public clf(bul<? extends clf> $$0, dfb $$1) {
      super($$0, $$1);
      this.bP = new clf.d(this);
      this.a(esb.j, 0.0F);
      this.c = new ceo(this, $$1);
      this.d = new cel(this, $$1);
   }

   public static bwh.a q() {
      return cmk.gx().a(bwi.B, 1.0);
   }

   @Override
   protected void t() {
      this.bS.a(1, new clf.c(this, 1.0));
      this.bS.a(2, new clf.f(this, 1.0, 40, 10.0F));
      this.bS.a(2, new clf.a(this, 1.0, false));
      this.bS.a(5, new clf.b(this, 1.0));
      this.bS.a(6, new clf.e(this, 1.0, this.dX().N()));
      this.bS.a(7, new ccv(this, 1.0));
      this.bT.a(1, new cdq(this, clf.class).a(cmm.class));
      this.bT.a(2, new cdr<>(this, com.class, 10, true, false, this::j));
      this.bT.a(3, new cdr<>(this, cnt.class, false));
      this.bT.a(3, new cdr<>(this, chd.class, true));
      this.bT.a(3, new cdr<>(this, cid.class, true, false));
      this.bT.a(5, new cdr<>(this, chs.class, 10, true, false, chs.bY));
   }

   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bum.b).f() && $$0.E_().i() < 0.03F) {
         this.a(bum.b, new cwb(cwf.vV));
         this.g(bum.b);
      }

      return $$3;
   }

   public static boolean a(bul<clf> $$0, dfr $$1, buk $$2, jh $$3, azs $$4) {
      if (!$$1.b_($$3.e()).a(axg.a) && !buk.a($$2)) {
         return false;
      } else {
         jq<dgc> $$5 = $$1.t($$3);
         boolean $$6 = $$1.ak() != bsa.a && (buk.b($$2) || a($$1, $$3, $$4)) && (buk.a($$2) || $$1.b_($$3).a(axg.a));
         if ($$6 && buk.a($$2)) {
            return true;
         } else {
            return $$5.a(awz.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(dfc $$0, jh $$1) {
      return $$1.v() < $$0.N() - 5;
   }

   @Override
   protected awk w() {
      return this.bk() ? awl.hF : awl.hE;
   }

   @Override
   protected awk d(bsu $$0) {
      return this.bk() ? awl.hJ : awl.hI;
   }

   @Override
   protected awk o_() {
      return this.bk() ? awl.hH : awl.hG;
   }

   @Override
   protected awk y() {
      return awl.hL;
   }

   @Override
   protected awk aW() {
      return awl.hM;
   }

   @Override
   protected cwb gu() {
      return cwb.k;
   }

   @Override
   protected void a(azs $$0, bsb $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bum.a, new cwb(cwf.vU));
         } else {
            this.a(bum.a, new cwb(cwf.qW));
         }
      }
   }

   @Override
   protected boolean a(cwb $$0, cwb $$1, bum $$2) {
      if ($$1.a(cwf.vV)) {
         return false;
      } else if ($$1.a(cwf.vU)) {
         return $$0.a(cwf.vU) ? $$0.o() < $$1.o() : false;
      } else {
         return $$0.a(cwf.vU) ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean gv() {
      return false;
   }

   @Override
   public boolean a(dfe $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bva $$0) {
      return $$0 != null ? !this.dX().S() || $$0.bk() : false;
   }

   @Override
   public boolean cK() {
      return !this.cl();
   }

   boolean gD() {
      if (this.cb) {
         return true;
      } else {
         bva $$0 = this.m();
         return $$0 != null && $$0.bk();
      }
   }

   @Override
   public void a_(ezn $$0) {
      if (this.dj() && this.bp() && this.gD()) {
         this.a(0.01F, $$0);
         this.a(bve.a, this.dA());
         this.h(this.dA().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void bq() {
      if (!this.dX().C) {
         if (this.dk() && this.bp() && this.gD()) {
            this.bR = this.c;
            this.i(true);
         } else {
            this.bR = this.d;
            this.i(false);
         }
      }
   }

   @Override
   public boolean cm() {
      return this.cl();
   }

   protected boolean gw() {
      ery $$0 = this.P().k();
      if ($$0 != null) {
         jh $$1 = $$0.l();
         if ($$1 != null) {
            double $$2 = this.i((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            if ($$2 < 4.0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(bva $$0, float $$1) {
      cwb $$2 = this.fb();
      cwb $$3 = $$2.a(cwf.vU) ? $$2 : new cwb(cwf.vU);
      cpt $$4 = new cpt(this.dX(), this, $$3);
      double $$5 = $$0.dC() - this.dC();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dE();
      double $$7 = $$0.dI() - this.dI();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dX() instanceof arn $$9) {
         cpg.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dX().ak().a() * 4));
      }

      this.a(awl.hK, 1.0F, 1.0F / (this.ea().i() * 0.4F + 0.8F));
   }

   public void x(boolean $$0) {
      this.cb = $$0;
   }

   static class a extends cdn {
      private final clf b;

      public a(clf $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b.j(this.b.m());
      }

      @Override
      public boolean c() {
         return super.c() && this.b.j(this.b.m());
      }
   }

   static class b extends ccl {
      private final clf g;

      public b(clf $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.g.dX().S() && this.g.bk() && this.g.dE() >= (double)(this.g.dX().N() - 3);
      }

      @Override
      public boolean c() {
         return super.c();
      }

      @Override
      protected boolean a(dfe $$0, jh $$1) {
         jh $$2 = $$1.d();
         return $$0.u($$2) && $$0.u($$2.d()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void d() {
         this.g.x(false);
         this.g.bR = this.g.d;
         super.d();
      }

      @Override
      public void e() {
         super.e();
      }
   }

   static class c extends cby {
      private final bvi a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dfb f;

      public c(bvi $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dX();
         this.a(EnumSet.of(cby.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.S()) {
            return false;
         } else if (this.a.bk()) {
            return false;
         } else {
            ezn $$0 = this.h();
            if ($$0 == null) {
               return false;
            } else {
               this.b = $$0.d;
               this.c = $$0.e;
               this.d = $$0.f;
               return true;
            }
         }
      }

      @Override
      public boolean c() {
         return !this.a.P().m();
      }

      @Override
      public void d() {
         this.a.P().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private ezn h() {
         azs $$0 = this.a.ea();
         jh $$1 = this.a.dx();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            jh $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dig.G)) {
               return ezn.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends cbb {
      private final clf l;

      public d(clf $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bva $$0 = this.l.m();
         if (this.l.gD() && this.l.bk()) {
            if ($$0 != null && $$0.dE() > this.l.dE() || this.l.cb) {
               this.l.h(this.l.dA().b(0.0, 0.002, 0.0));
            }

            if (this.k != cbb.a.b || this.l.P().m()) {
               this.l.C(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dC();
            double $$2 = this.f - this.l.dE();
            double $$3 = this.g - this.l.dI();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(azk.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.b(this.l.dN(), $$5, 90.0F));
            this.l.aX = this.l.dN();
            float $$6 = (float)(this.h * this.l.h(bwi.v));
            float $$7 = azk.h(0.125F, this.l.fr(), $$6);
            this.l.C($$7);
            this.l.h(this.l.dA().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aK()) {
               this.l.h(this.l.dA().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends cby {
      private final clf a;
      private final double b;
      private final int c;
      private boolean d;

      public e(clf $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean b() {
         return !this.a.dX().S() && this.a.bk() && this.a.dE() < (double)(this.c - 2);
      }

      @Override
      public boolean c() {
         return this.b() && !this.d;
      }

      @Override
      public void a() {
         if (this.a.dE() < (double)(this.c - 1) && (this.a.P().m() || this.a.gw())) {
            ezn $$0 = cfv.a(this.a, 4, 8, new ezn(this.a.dC(), (double)(this.c - 1), this.a.dI()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.P().a($$0.d, $$0.e, $$0.f, this.b);
         }
      }

      @Override
      public void d() {
         this.a.x(true);
         this.d = false;
      }

      @Override
      public void e() {
         this.a.x(false);
      }
   }

   static class f extends ccx {
      private final clf a;

      public f(clv $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (clf)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.fb().a(cwf.vU);
      }

      @Override
      public void d() {
         super.d();
         this.a.w(true);
         this.a.c(bsc.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fH();
         this.a.w(false);
      }
   }
}
