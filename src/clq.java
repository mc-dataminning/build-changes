import java.util.EnumSet;

public class clq extends buw implements clo {
   private static final ajx<Boolean> a = akb.a(clq.class, ajz.k);
   private int b = 1;

   public clq(buq<? extends clq> $$0, dgg $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new clq.b(this);
   }

   @Override
   protected void B() {
      this.bS.a(5, new clq.d(this));
      this.bS.a(7, new clq.a(this));
      this.bS.a(7, new clq.c(this));
      this.bT.a(1, new cdw<>(this, cov.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dD() - this.dD()) <= 4.0));
   }

   public boolean m() {
      return this.al.a(a);
   }

   public void x(boolean $$0) {
      this.al.a(a, $$0);
   }

   public int p() {
      return this.b;
   }

   @Override
   protected boolean Y() {
      return true;
   }

   private static boolean j(bsz $$0) {
      return $$0.c() instanceof cpm && $$0.d() instanceof cov;
   }

   @Override
   public boolean a(arc $$0, bsz $$1) {
      return this.cC() && !$$1.a(awq.d) || !j($$1) && super.a($$0, $$1);
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      if (j($$1)) {
         super.a($$0, $$1, 1000.0F);
         return true;
      } else {
         return this.a($$0, $$1) ? false : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   public static bwm.a t() {
      return bvh.C().a(bwn.s, 10.0).a(bwn.m, 100.0);
   }

   @Override
   public awa dn() {
      return awa.f;
   }

   @Override
   protected avy u() {
      return avz.kK;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.kM;
   }

   @Override
   protected avy o_() {
      return avz.kL;
   }

   @Override
   protected float fg() {
      return 5.0F;
   }

   public static boolean b(buq<clq> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      return $$1.am() != bsf.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int af() {
      return 1;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.b);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.b = $$0.f("ExplosionPower");
      }
   }

   static class a extends ccd {
      private final clq a;

      public a(clq $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccd.a.b));
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.O_() == null) {
            fay $$0 = this.a.dz();
            this.a.v(-((float)ayy.d($$0.d, $$0.f)) * (180.0F / (float)Math.PI));
            this.a.aX = this.a.dM();
         } else {
            bvf $$1 = this.a.O_();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dB() - this.a.dB();
               double $$4 = $$1.dH() - this.a.dH();
               this.a.v(-((float)ayy.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aX = this.a.dM();
            }
         }
      }
   }

   static class b extends cbg {
      private final clq l;
      private int m;

      public b(clq $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cbg.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.dZ().a(5) + 2;
               fay $$0 = new fay(this.e - this.l.dB(), this.f - this.l.dD(), this.g - this.l.dH());
               double $$1 = $$0.g();
               $$0 = $$0.d();
               if (this.a($$0, ayy.c($$1))) {
                  this.l.h(this.l.dz().e($$0.c(0.1)));
               } else {
                  this.k = cbg.a.a;
               }
            }
         }
      }

      private boolean a(fay $$0, int $$1) {
         fat $$2 = this.l.cR();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dW().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends ccd {
      private final clq b;
      public int a;

      public c(clq $$0) {
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.O_() != null;
      }

      @Override
      public void d() {
         this.a = 0;
      }

      @Override
      public void e() {
         this.b.x(false);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         bvf $$0 = this.b.O_();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.E($$0)) {
               dgg $$2 = this.b.dW();
               this.a++;
               if (this.a == 10 && !this.b.bb()) {
                  $$2.a(null, 1015, this.b.dw(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  fay $$4 = this.b.g(1.0F);
                  double $$5 = $$0.dB() - (this.b.dB() + $$4.d * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dH() - (this.b.dH() + $$4.f * 4.0);
                  fay $$8 = new fay($$5, $$6, $$7);
                  if (!this.b.bb()) {
                     $$2.a(null, 1016, this.b.dw(), 0);
                  }

                  cpm $$9 = new cpm($$2, this.b, $$8.d(), this.b.p());
                  $$9.a_(this.b.dB() + $$4.d * 4.0, this.b.e(0.5) + 0.5, $$9.dH() + $$4.f * 4.0);
                  $$2.b($$9);
                  this.a = -40;
               }
            } else if (this.a > 0) {
               this.a--;
            }

            this.b.x(this.a > 10);
         }
      }
   }

   static class d extends ccd {
      private final clq a;

      public d(clq $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccd.a.a));
      }

      @Override
      public boolean b() {
         cbg $$0 = this.a.I();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.dB();
            double $$2 = $$0.e() - this.a.dD();
            double $$3 = $$0.f() - this.a.dH();
            double $$4 = $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
            return $$4 < 1.0 || $$4 > 3600.0;
         }
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void d() {
         azg $$0 = this.a.dZ();
         double $$1 = this.a.dB() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dD() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dH() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.I().a($$1, $$2, $$3, 1.0);
      }
   }
}
