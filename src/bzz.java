import java.util.EnumSet;
import javax.annotation.Nullable;

public class bzz extends cbe implements cap {
   public static final float b = 0.03F;
   boolean bX;
   protected final btu c;
   protected final btr d;

   public bzz(bjx<? extends bzz> $$0, cqz $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bL = new bzz.d(this);
      this.a(ebp.j, 0.0F);
      this.c = new btu(this, $$1);
      this.d = new btr(this, $$1);
   }

   @Override
   protected void s() {
      this.bO.a(1, new bzz.c(this, 1.0));
      this.bO.a(2, new bzz.f(this, 1.0, 40, 10.0F));
      this.bO.a(2, new bzz.a(this, 1.0, false));
      this.bO.a(5, new bzz.b(this, 1.0));
      this.bO.a(6, new bzz.e(this, 1.0, this.dL().z_()));
      this.bO.a(7, new bsb(this, 1.0));
      this.bP.a(1, new bsw(this, bzz.class).a(cbg.class));
      this.bP.a(2, new bsx<>(this, ccx.class, 10, true, false, this::j));
      this.bP.a(3, new bsx<>(this, ccf.class, false));
      this.bP.a(3, new bsx<>(this, bwg.class, true));
      this.bP.a(3, new bsx<>(this, bxb.class, true, false));
      this.bP.a(5, new bsx<>(this, bwv.class, 10, true, false, bwv.bU));
   }

   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if (this.c(bjy.b).b() && $$0.E_().i() < 0.03F) {
         this.a(bjy.b, new ckj(ckm.uX));
         this.e(bjy.b);
      }

      return $$3;
   }

   public static boolean a(bjx<bzz> $$0, cro $$1, bkn $$2, ht $$3, ate $$4) {
      if (!$$1.b_($$3.d()).a(aqx.a)) {
         return false;
      } else {
         ib<crx> $$5 = $$1.s($$3);
         boolean $$6 = $$1.ai() != bhy.a && a($$1, $$3, $$4) && ($$2 == bkn.c || $$1.b_($$3).a(aqx.a));
         return $$5.a(aqr.ao) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
      }
   }

   private static boolean a(cra $$0, ht $$1) {
      return $$1.v() < $$0.z_() - 5;
   }

   @Override
   protected boolean t() {
      return false;
   }

   @Override
   protected aqc w() {
      return this.aX() ? aqd.gz : aqd.gy;
   }

   @Override
   protected aqc d(bir $$0) {
      return this.aX() ? aqd.gD : aqd.gC;
   }

   @Override
   protected aqc m_() {
      return this.aX() ? aqd.gB : aqd.gA;
   }

   @Override
   protected aqc y() {
      return aqd.gF;
   }

   @Override
   protected aqc aL() {
      return aqd.gG;
   }

   @Override
   protected ckj ge() {
      return ckj.b;
   }

   @Override
   protected void a(ate $$0, bhz $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bjy.a, new ckj(ckm.uV));
         } else {
            this.a(bjy.a, new ckj(ckm.qh));
         }
      }
   }

   @Override
   protected boolean b(ckj $$0, ckj $$1) {
      if ($$1.a(ckm.uX)) {
         return false;
      } else if ($$1.a(ckm.uV)) {
         return $$0.a(ckm.uV) ? $$0.k() < $$1.k() : false;
      } else {
         return $$0.a(ckm.uV) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gf() {
      return false;
   }

   @Override
   public boolean a(crc $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bkj $$0) {
      return $$0 != null ? !this.dL().N() || $$0.aX() : false;
   }

   @Override
   public boolean cy() {
      return !this.bY();
   }

   boolean go() {
      if (this.bX) {
         return true;
      } else {
         bkj $$0 = this.q();
         return $$0 != null && $$0.aX();
      }
   }

   @Override
   public void h(eif $$0) {
      if (this.cW() && this.aX() && this.go()) {
         this.a(0.01F, $$0);
         this.a(bkp.a, this.do());
         this.f(this.do().a(0.9));
      } else {
         super.h($$0);
      }
   }

   @Override
   public void bd() {
      if (!this.dL().B) {
         if (this.cX() && this.aX() && this.go()) {
            this.bN = this.c;
            this.h(true);
         } else {
            this.bN = this.d;
            this.h(false);
         }
      }
   }

   @Override
   public boolean bZ() {
      return this.bY();
   }

   protected boolean gg() {
      ebt $$0 = this.L().j();
      if ($$0 != null) {
         ht $$1 = $$0.l();
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
   public void a(bkj $$0, float $$1) {
      ceb $$2 = new ceb(this.dL(), this, new ckj(ckm.uV));
      double $$3 = $$0.dq() - this.dq();
      double $$4 = $$0.e(0.3333333333333333) - $$2.ds();
      double $$5 = $$0.dw() - this.dw();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dL().ai().a() * 4));
      this.a(aqd.gE, 1.0F, 1.0F / (this.ef().i() * 0.4F + 0.8F));
      this.dL().b($$2);
   }

   public void w(boolean $$0) {
      this.bX = $$0;
   }

   static class a extends bst {
      private final bzz b;

      public a(bzz $$0, double $$1, boolean $$2) {
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

   static class b extends brr {
      private final bzz g;

      public b(bzz $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dL().N() && this.g.aX() && this.g.ds() >= (double)(this.g.dL().z_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(crc $$0, ht $$1) {
         ht $$2 = $$1.c();
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

   static class c extends bre {
      private final bks a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final cqz f;

      public c(bks $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dL();
         this.a(EnumSet.of(bre.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.N()) {
            return false;
         } else if (this.a.aX()) {
            return false;
         } else {
            eif $$0 = this.h();
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
      private eif h() {
         ate $$0 = this.a.ef();
         ht $$1 = this.a.dl();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            ht $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(cuc.G)) {
               return eif.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bqh {
      private final bzz l;

      public d(bzz $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bkj $$0 = this.l.q();
         if (this.l.go() && this.l.aX()) {
            if ($$0 != null && $$0.ds() > this.l.ds() || this.l.bX) {
               this.l.f(this.l.do().b(0.0, 0.002, 0.0));
            }

            if (this.k != bqh.a.b || this.l.L().l()) {
               this.l.w(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dq();
            double $$2 = this.f - this.l.ds();
            double $$3 = this.g - this.l.dw();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(asy.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dB(), $$5, 90.0F));
            this.l.aU = this.l.dB();
            float $$6 = (float)(this.h * this.l.b(blp.m));
            float $$7 = asy.i(0.125F, this.l.fe(), $$6);
            this.l.w($$7);
            this.l.f(this.l.do().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aA()) {
               this.l.f(this.l.do().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends bre {
      private final bzz a;
      private final double b;
      private final int c;
      private boolean d;

      public e(bzz $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dL().N() && this.a.aX() && this.a.ds() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.ds() < (double)(this.c - 1) && (this.a.L().l() || this.a.gg())) {
            eif $$0 = buz.a(this.a, 4, 8, new eif(this.a.dq(), (double)(this.c - 1), this.a.dw()), (float) (Math.PI / 2));
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

   static class f extends bsd {
      private final bzz a;

      public f(cap $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (bzz)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eS().a(ckm.uV);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bia.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.ft();
         this.a.v(false);
      }
   }
}
