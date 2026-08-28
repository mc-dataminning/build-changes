import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cke extends cjm {
   public static final double bI = 0.6;
   public static final double bJ = 0.8;
   public static final double bK = 1.33;
   private static final akn<Boolean> bM = akr.a(cke.class, akp.k);
   private static final boolean bN = false;
   @Nullable
   private cke.a<crz> bO;
   @Nullable
   private cke.b bP;

   public cke(bxe<? extends cke> $$0, djz $$1) {
      super($$0, $$1);
      this.t();
   }

   boolean x() {
      return this.al.a(bM);
   }

   private void w(boolean $$0) {
      this.al.a(bM, $$0);
      this.t();
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Trusting", this.x());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.b("Trusting", false));
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bM, false);
   }

   @Override
   protected void D() {
      this.bP = new cke.b(this, 0.6, $$0 -> $$0.a(axo.au), true);
      this.bF.a(1, new cem(this));
      this.bF.a(3, this.bP);
      this.bF.a(7, new cey(this, 0.3F));
      this.bF.a(8, new cfi(this));
      this.bF.a(9, new cee(this, 0.8));
      this.bF.a(10, new cgf(this, 0.8, 1.0000001E-5F));
      this.bF.a(11, new cfa(this, crz.class, 10.0F));
      this.bG.a(1, new cgl<>(this, cjs.class, false));
      this.bG.a(1, new cgl<>(this, ckt.class, 10, false, false, ckt.bI));
   }

   @Override
   public void a(aru $$0) {
      if (this.L().b()) {
         double $$1 = this.L().c();
         if ($$1 == 0.6) {
            this.b(byi.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(byi.a);
            this.h(true);
         } else {
            this.b(byi.a);
            this.h(false);
         }
      } else {
         this.b(byi.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.x() && this.af > 2400;
   }

   public static bzb.a q() {
      return cjm.gz().a(bzc.s, 10.0).a(bzc.v, 0.3F).a(bzc.c, 3.0);
   }

   @Nullable
   @Override
   protected awq u() {
      return awr.tb;
   }

   @Override
   public int S() {
      return 900;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.ta;
   }

   @Override
   protected awq l_() {
      return awr.tc;
   }

   @Override
   public but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      if ((this.bP == null || this.bP.i()) && !this.x() && this.i($$2) && $$0.g(this) < 9.0) {
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

         return but.a;
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

   protected void t() {
      if (this.bO == null) {
         this.bO = new cke.a<>(this, crz.class, 16.0F, 0.8, 1.33);
      }

      this.bF.a(this.bO);
      if (!this.x()) {
         this.bF.a(4, this.bO);
      }
   }

   @Nullable
   public cke b(aru $$0, bwl $$1) {
      return bxe.aJ.a($$0, bxd.e);
   }

   @Override
   public boolean i(daa $$0) {
      return $$0.a(axo.au);
   }

   public static boolean c(bxe<cke> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dkc $$0) {
      if ($$0.f(this) && !$$0.d(this.cR())) {
         iw $$1 = this.dv();
         if ($$1.v() < $$0.P()) {
            return false;
         }

         ebg $$2 = $$0.a_($$1.e());
         if ($$2.a(dng.i) || $$2.a(axg.Q)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      if ($$3 == null) {
         $$3 = new bwl.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public ffs cT() {
      return new ffs(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   @Override
   public boolean cd() {
      return this.ch() || super.cd();
   }

   static class a<T extends bxw> extends cdz<T> {
      private final cke i;

      public a(cke $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bxc.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.x() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.x() && super.c();
      }
   }

   static class b extends cga {
      private final cke c;

      public b(cke $$0, double $$1, Predicate<daa> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.x();
      }
   }
}
