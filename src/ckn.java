import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckn extends cjv {
   public static final double bI = 0.6;
   public static final double bJ = 0.8;
   public static final double bK = 1.33;
   private static final aku<Boolean> bM = aky.a(ckn.class, akw.k);
   private static final boolean bN = false;
   @Nullable
   private ckn.a<csi> bO;
   @Nullable
   private ckn.b bP;

   public ckn(bxn<? extends ckn> $$0, dkj $$1) {
      super($$0, $$1);
      this.p();
   }

   boolean u() {
      return this.al.a(bM);
   }

   private void w(boolean $$0) {
      this.al.a(bM, $$0);
      this.p();
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Trusting", this.u());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.b("Trusting", false));
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bM, false);
   }

   @Override
   protected void C() {
      this.bP = new ckn.b(this, 0.6, $$0 -> $$0.a(axv.au), true);
      this.bF.a(1, new cev(this));
      this.bF.a(3, this.bP);
      this.bF.a(7, new cfh(this, 0.3F));
      this.bF.a(8, new cfr(this));
      this.bF.a(9, new cen(this, 0.8));
      this.bF.a(10, new cgo(this, 0.8, 1.0000001E-5F));
      this.bF.a(11, new cfj(this, csi.class, 10.0F));
      this.bG.a(1, new cgu<>(this, ckb.class, false));
      this.bG.a(1, new cgu<>(this, clc.class, 10, false, false, clc.bI));
   }

   @Override
   public void a(asb $$0) {
      if (this.K().b()) {
         double $$1 = this.K().c();
         if ($$1 == 0.6) {
            this.b(byr.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(byr.a);
            this.h(true);
         } else {
            this.b(byr.a);
            this.h(false);
         }
      } else {
         this.b(byr.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && this.af > 2400;
   }

   public static bzk.a m() {
      return cjv.gz().a(bzl.s, 10.0).a(bzl.v, 0.3F).a(bzl.c, 3.0);
   }

   @Nullable
   @Override
   protected awx s() {
      return awy.tb;
   }

   @Override
   public int R() {
      return 900;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.ta;
   }

   @Override
   protected awx j_() {
      return awy.tc;
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      if ((this.bP == null || this.bP.i()) && !this.u() && this.i($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dV().C) {
            if (this.ae.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dV().a(this, (byte)41);
            } else {
               this.x(false);
               this.dV().a(this, (byte)40);
            }
         }

         return bvc.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 41) {
         this.x(true);
      } else if ($$0 == 40) {
         this.x(false);
      } else {
         super.b($$0);
      }
   }

   private void x(boolean $$0) {
      lx $$1 = lz.S;
      if (!$$0) {
         $$1 = lz.ah;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         double $$5 = this.ae.k() * 0.02;
         this.dV().a($$1, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void p() {
      if (this.bO == null) {
         this.bO = new ckn.a<>(this, csi.class, 16.0F, 0.8, 1.33);
      }

      this.bF.a(this.bO);
      if (!this.u()) {
         this.bF.a(4, this.bO);
      }
   }

   @Nullable
   public ckn b(asb $$0, bwu $$1) {
      return bxn.aJ.a($$0, bxm.e);
   }

   @Override
   public boolean i(dak $$0) {
      return $$0.a(axv.au);
   }

   public static boolean c(bxn<ckn> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dkm $$0) {
      if ($$0.f(this) && !$$0.d(this.cR())) {
         iw $$1 = this.dv();
         if ($$1.v() < $$0.P()) {
            return false;
         }

         ebq $$2 = $$0.a_($$1.e());
         if ($$2.a(dnq.i) || $$2.a(axn.Q)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      if ($$3 == null) {
         $$3 = new bwu.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public fgc cT() {
      return new fgc(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   @Override
   public boolean cd() {
      return this.ch() || super.cd();
   }

   static class a<T extends byf> extends cei<T> {
      private final ckn i;

      public a(ckn $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bxl.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.u() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.u() && super.c();
      }
   }

   static class b extends cgj {
      private final ckn c;

      public b(ckn $$0, double $$1, Predicate<dak> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.u();
      }
   }
}
