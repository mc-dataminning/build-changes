import java.util.EnumSet;

public class ccq extends bmf implements cco {
   private static final agn<Boolean> b = agq.a(ccq.class, agp.k);
   private int c = 1;

   public ccq(bmc<? extends ccq> $$0, ctx $$1) {
      super($$0, $$1);
      this.bK = 5;
      this.bM = new ccq.b(this);
   }

   @Override
   protected void B() {
      this.bP.a(5, new ccq.d(this));
      this.bP.a(7, new ccq.a(this));
      this.bP.a(7, new ccq.c(this));
      this.bQ.a(1, new bvd<>(this, cfq.class, 10, true, false, $$0 -> Math.abs($$0.ds() - this.ds()) <= 4.0));
   }

   @Override
   public boolean u() {
      return this.an.b(b);
   }

   public void w(boolean $$0) {
      this.an.b(b, $$0);
   }

   public int w() {
      return this.c;
   }

   @Override
   protected boolean Y() {
      return true;
   }

   private static boolean h(bkv $$0) {
      return $$0.c() instanceof cgg && $$0.d() instanceof cfq;
   }

   @Override
   public boolean b(bkv $$0) {
      return !h($$0) && super.b($$0);
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      if (h($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, false);
   }

   public static bnt.a A() {
      return bmq.C().a(bnu.n, 10.0).a(bnu.i, 100.0);
   }

   @Override
   public aru db() {
      return aru.f;
   }

   @Override
   protected ars y() {
      return art.jV;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.jX;
   }

   @Override
   protected ars n_() {
      return art.jW;
   }

   @Override
   protected float eW() {
      return 5.0F;
   }

   public static boolean b(bmc<ccq> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      return $$1.ak() != bjz.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int fJ() {
      return 1;
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   static class a extends btk {
      private final ccq a;

      public a(ccq $$0) {
         this.a = $$0;
         this.a(EnumSet.of(btk.a.b));
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.q() == null) {
            emc $$0 = this.a.do();
            this.a.r(-((float)aup.d($$0.c, $$0.e)) * (180.0F / (float)Math.PI));
            this.a.aU = this.a.dB();
         } else {
            bmo $$1 = this.a.q();
            double $$2 = 64.0;
            if ($$1.f(this.a) < 4096.0) {
               double $$3 = $$1.dq() - this.a.dq();
               double $$4 = $$1.dw() - this.a.dw();
               this.a.r(-((float)aup.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aU = this.a.dB();
            }
         }
      }
   }

   static class b extends bsn {
      private final ccq l;
      private int m;

      public b(ccq $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bsn.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.eg().a(5) + 2;
               emc $$0 = new emc(this.e - this.l.dq(), this.f - this.l.ds(), this.g - this.l.dw());
               double $$1 = $$0.f();
               $$0 = $$0.d();
               if (this.a($$0, aup.c($$1))) {
                  this.l.g(this.l.do().e($$0.a(0.1)));
               } else {
                  this.k = bsn.a.a;
               }
            }
         }
      }

      private boolean a(emc $$0, int $$1) {
         elx $$2 = this.l.cH();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dL().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends btk {
      private final ccq b;
      public int a;

      public c(ccq $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.q() != null;
      }

      @Override
      public void c() {
         this.a = 0;
      }

      @Override
      public void d() {
         this.b.w(false);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         bmo $$0 = this.b.q();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.f(this.b) < 4096.0 && this.b.D($$0)) {
               ctx $$2 = this.b.dL();
               this.a++;
               if (this.a == 10 && !this.b.aU()) {
                  $$2.a(null, 1015, this.b.dl(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  emc $$4 = this.b.f(1.0F);
                  double $$5 = $$0.dq() - (this.b.dq() + $$4.c * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dw() - (this.b.dw() + $$4.e * 4.0);
                  if (!this.b.aU()) {
                     $$2.a(null, 1016, this.b.dl(), 0);
                  }

                  cgg $$8 = new cgg($$2, this.b, $$5, $$6, $$7, this.b.w());
                  $$8.a_(this.b.dq() + $$4.c * 4.0, this.b.e(0.5) + 0.5, $$8.dw() + $$4.e * 4.0);
                  $$2.b($$8);
                  this.a = -40;
               }
            } else if (this.a > 0) {
               this.a--;
            }

            this.b.w(this.a > 10);
         }
      }
   }

   static class d extends btk {
      private final ccq a;

      public d(ccq $$0) {
         this.a = $$0;
         this.a(EnumSet.of(btk.a.a));
      }

      @Override
      public boolean a() {
         bsn $$0 = this.a.K();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.dq();
            double $$2 = $$0.e() - this.a.ds();
            double $$3 = $$0.f() - this.a.dw();
            double $$4 = $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
            return $$4 < 1.0 || $$4 > 3600.0;
         }
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void c() {
         auw $$0 = this.a.eg();
         double $$1 = this.a.dq() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.ds() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dw() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.K().a($$1, $$2, $$3, 1.0);
      }
   }
}
