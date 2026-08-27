import java.util.EnumSet;
import javax.annotation.Nullable;

public class byw extends cab implements bzm {
   public static final float b = 0.03F;
   boolean bX;
   protected final bsr c;
   protected final bso d;

   public byw(biu<? extends byw> $$0, cpv $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bL = new byw.d(this);
      this.a(eax.j, 0.0F);
      this.c = new bsr(this, $$1);
      this.d = new bso(this, $$1);
   }

   @Override
   protected void s() {
      this.bO.a(1, new byw.c(this, 1.0));
      this.bO.a(2, new byw.f(this, 1.0, 40, 10.0F));
      this.bO.a(2, new byw.a(this, 1.0, false));
      this.bO.a(5, new byw.b(this, 1.0));
      this.bO.a(6, new byw.e(this, 1.0, this.dL().y_()));
      this.bO.a(7, new bqy(this, 1.0));
      this.bP.a(1, new brt(this, byw.class).a(cad.class));
      this.bP.a(2, new bru<>(this, cbu.class, 10, true, false, this::j));
      this.bP.a(3, new bru<>(this, cbc.class, false));
      this.bP.a(3, new bru<>(this, bvd.class, true));
      this.bP.a(3, new bru<>(this, bvy.class, true, false));
      this.bP.a(5, new bru<>(this, bvs.class, 10, true, false, bvs.bU));
   }

   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qx $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if (this.c(biv.b).b() && $$0.D_().i() < 0.03F) {
         this.a(biv.b, new cjf(cji.uX));
         this.e(biv.b);
      }

      return $$3;
   }

   public static boolean a(biu<byw> $$0, cqk $$1, bjk $$2, gw $$3, asc $$4) {
      if (!$$1.b_($$3.d()).a(apy.a)) {
         return false;
      } else {
         hg<cqt> $$5 = $$1.s($$3);
         boolean $$6 = $$1.ai() != bgv.a && a($$1, $$3, $$4) && ($$2 == bjk.c || $$1.b_($$3).a(apy.a));
         return $$5.a(aps.ao) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
      }
   }

   private static boolean a(cpw $$0, gw $$1) {
      return $$1.v() < $$0.y_() - 5;
   }

   @Override
   protected boolean t() {
      return false;
   }

   @Override
   protected apd w() {
      return this.aY() ? ape.gx : ape.gw;
   }

   @Override
   protected apd d(bho $$0) {
      return this.aY() ? ape.gB : ape.gA;
   }

   @Override
   protected apd l_() {
      return this.aY() ? ape.gz : ape.gy;
   }

   @Override
   protected apd y() {
      return ape.gD;
   }

   @Override
   protected apd aM() {
      return ape.gE;
   }

   @Override
   protected cjf gd() {
      return cjf.b;
   }

   @Override
   protected void a(asc $$0, bgw $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(biv.a, new cjf(cji.uV));
         } else {
            this.a(biv.a, new cjf(cji.qh));
         }
      }
   }

   @Override
   protected boolean b(cjf $$0, cjf $$1) {
      if ($$1.a(cji.uX)) {
         return false;
      } else if ($$1.a(cji.uV)) {
         return $$0.a(cji.uV) ? $$0.k() < $$1.k() : false;
      } else {
         return $$0.a(cji.uV) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean ge() {
      return false;
   }

   @Override
   public boolean a(cpy $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bjg $$0) {
      return $$0 != null ? !this.dL().N() || $$0.aY() : false;
   }

   @Override
   public boolean cz() {
      return !this.bZ();
   }

   boolean gn() {
      if (this.bX) {
         return true;
      } else {
         bjg $$0 = this.q();
         return $$0 != null && $$0.aY();
      }
   }

   @Override
   public void h(ehn $$0) {
      if (this.cX() && this.aY() && this.gn()) {
         this.a(0.01F, $$0);
         this.a(bjm.a, this.do());
         this.f(this.do().a(0.9));
      } else {
         super.h($$0);
      }
   }

   @Override
   public void be() {
      if (!this.dL().B) {
         if (this.cY() && this.aY() && this.gn()) {
            this.bN = this.c;
            this.h(true);
         } else {
            this.bN = this.d;
            this.h(false);
         }
      }
   }

   @Override
   public boolean ca() {
      return this.bZ();
   }

   protected boolean gf() {
      ebb $$0 = this.L().j();
      if ($$0 != null) {
         gw $$1 = $$0.l();
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
   public void a(bjg $$0, float $$1) {
      ccy $$2 = new ccy(this.dL(), this, new cjf(cji.uV));
      double $$3 = $$0.dq() - this.dq();
      double $$4 = $$0.e(0.3333333333333333) - $$2.ds();
      double $$5 = $$0.dw() - this.dw();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dL().ai().a() * 4));
      this.a(ape.gC, 1.0F, 1.0F / (this.ef().i() * 0.4F + 0.8F));
      this.dL().b($$2);
   }

   public void w(boolean $$0) {
      this.bX = $$0;
   }

   static class a extends brq {
      private final byw b;

      public a(byw $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b.j(this.b.q());
      }

      @Override
      public boolean b() {
         return super.b() && this.b.j(this.b.q());
      }
   }

   static class b extends bqo {
      private final byw g;

      public b(byw $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dL().N() && this.g.aY() && this.g.ds() >= (double)(this.g.dL().y_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(cpy $$0, gw $$1) {
         gw $$2 = $$1.c();
         return $$0.t($$2) && $$0.t($$2.c()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void c() {
         this.g.w(false);
         this.g.bN = this.g.d;
         super.c();
      }

      @Override
      public void d() {
         super.d();
      }
   }

   static class c extends bqb {
      private final bjp a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final cpv f;

      public c(bjp $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dL();
         this.a(EnumSet.of(bqb.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.N()) {
            return false;
         } else if (this.a.aY()) {
            return false;
         } else {
            ehn $$0 = this.h();
            if ($$0 == null) {
               return false;
            } else {
               this.b = $$0.c;
               this.c = $$0.d;
               this.d = $$0.e;
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return !this.a.L().l();
      }

      @Override
      public void c() {
         this.a.L().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private ehn h() {
         asc $$0 = this.a.ef();
         gw $$1 = this.a.dl();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            gw $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(csw.G)) {
               return ehn.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bpe {
      private final byw l;

      public d(byw $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bjg $$0 = this.l.q();
         if (this.l.gn() && this.l.aY()) {
            if ($$0 != null && $$0.ds() > this.l.ds() || this.l.bX) {
               this.l.f(this.l.do().b(0.0, 0.002, 0.0));
            }

            if (this.k != bpe.a.b || this.l.L().l()) {
               this.l.w(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dq();
            double $$2 = this.f - this.l.ds();
            double $$3 = this.g - this.l.dw();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(arx.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dB(), $$5, 90.0F));
            this.l.aU = this.l.dB();
            float $$6 = (float)(this.h * this.l.b(bkm.d));
            float $$7 = arx.i(0.125F, this.l.fe(), $$6);
            this.l.w($$7);
            this.l.f(this.l.do().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aB()) {
               this.l.f(this.l.do().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends bqb {
      private final byw a;
      private final double b;
      private final int c;
      private boolean d;

      public e(byw $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dL().N() && this.a.aY() && this.a.ds() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.ds() < (double)(this.c - 1) && (this.a.L().l() || this.a.gf())) {
            ehn $$0 = btw.a(this.a, 4, 8, new ehn(this.a.dq(), (double)(this.c - 1), this.a.dw()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.L().a($$0.c, $$0.d, $$0.e, this.b);
         }
      }

      @Override
      public void c() {
         this.a.w(true);
         this.d = false;
      }

      @Override
      public void d() {
         this.a.w(false);
      }
   }

   static class f extends bra {
      private final byw a;

      public f(bzm $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (byw)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eS().a(cji.uV);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bgx.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fs();
         this.a.v(false);
      }
   }
}
