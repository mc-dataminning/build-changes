import java.util.EnumSet;

public class cmm extends bvo implements cmk {
   private static final ajx<Boolean> a = akb.a(cmm.class, ajz.k);
   private int b = 1;

   public cmm(bvi<? extends cmm> $$0, dgz $$1) {
      super($$0, $$1);
      this.bx = 5;
      this.bz = new cmm.b(this);
   }

   @Override
   protected void D() {
      this.bC.a(5, new cmm.d(this));
      this.bC.a(7, new cmm.a(this));
      this.bC.a(7, new cmm.c(this));
      this.bD.a(1, new cep<>(this, cpr.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dB() - this.dB()) <= 4.0));
   }

   public boolean j() {
      return this.al.a(a);
   }

   public void w(boolean $$0) {
      this.al.a(a, $$0);
   }

   public int m() {
      return this.b;
   }

   @Override
   protected boolean aa() {
      return true;
   }

   private static boolean j(btp $$0) {
      return $$0.c() instanceof cqi && $$0.d() instanceof cpr;
   }

   @Override
   public boolean a(ard $$0, btp $$1) {
      return this.cB() && !$$1.a(awr.d) || !j($$1) && super.a($$0, $$1);
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
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

   public static bxf.a n() {
      return bwa.E().a(bxg.s, 10.0).a(bxg.m, 100.0);
   }

   @Override
   public awb dl() {
      return awb.f;
   }

   @Override
   protected avz u() {
      return awa.kK;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.kM;
   }

   @Override
   protected avz l_() {
      return awa.kL;
   }

   @Override
   protected float fg() {
      return 5.0F;
   }

   public static boolean b(bvi<cmm> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      return $$1.an() != bsv.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int ai() {
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

   static class a extends ccw {
      private final cmm a;

      public a(cmm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccw.a.b));
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.f() == null) {
            fbx $$0 = this.a.dx();
            this.a.w(-((float)ayz.d($$0.d, $$0.f)) * (180.0F / (float)Math.PI));
            this.a.aV = this.a.dK();
         } else {
            bvy $$1 = this.a.f();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dz() - this.a.dz();
               double $$4 = $$1.dF() - this.a.dF();
               this.a.w(-((float)ayz.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aV = this.a.dK();
            }
         }
      }
   }

   static class b extends cbz {
      private final cmm l;
      private int m;

      public b(cmm $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cbz.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.dX().a(5) + 2;
               fbx $$0 = new fbx(this.e - this.l.dz(), this.f - this.l.dB(), this.g - this.l.dF());
               double $$1 = $$0.g();
               $$0 = $$0.d();
               if (this.a($$0, ayz.c($$1))) {
                  this.l.i(this.l.dx().e($$0.c(0.1)));
               } else {
                  this.k = cbz.a.a;
               }
            }
         }
      }

      private boolean a(fbx $$0, int $$1) {
         fbs $$2 = this.l.cQ();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dU().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends ccw {
      private final cmm b;
      public int a;

      public c(cmm $$0) {
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.f() != null;
      }

      @Override
      public void d() {
         this.a = 0;
      }

      @Override
      public void e() {
         this.b.w(false);
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         bvy $$0 = this.b.f();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.E($$0)) {
               dgz $$2 = this.b.dU();
               this.a++;
               if (this.a == 10 && !this.b.bb()) {
                  $$2.a(null, 1015, this.b.du(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  fbx $$4 = this.b.h(1.0F);
                  double $$5 = $$0.dz() - (this.b.dz() + $$4.d * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dF() - (this.b.dF() + $$4.f * 4.0);
                  fbx $$8 = new fbx($$5, $$6, $$7);
                  if (!this.b.bb()) {
                     $$2.a(null, 1016, this.b.du(), 0);
                  }

                  cqi $$9 = new cqi($$2, this.b, $$8.d(), this.b.m());
                  $$9.a_(this.b.dz() + $$4.d * 4.0, this.b.e(0.5) + 0.5, $$9.dF() + $$4.f * 4.0);
                  $$2.b($$9);
                  this.a = -40;
               }
            } else if (this.a > 0) {
               this.a--;
            }

            this.b.w(this.a > 10);
         }
      }
   }

   static class d extends ccw {
      private final cmm a;

      public d(cmm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccw.a.a));
      }

      @Override
      public boolean b() {
         cbz $$0 = this.a.L();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.dz();
            double $$2 = $$0.e() - this.a.dB();
            double $$3 = $$0.f() - this.a.dF();
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
         azh $$0 = this.a.dX();
         double $$1 = this.a.dz() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dB() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dF() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.L().a($$1, $$2, $$3, 1.0);
      }
   }
}
