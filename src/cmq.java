import java.util.EnumSet;

public class cmq extends bvw implements cmo {
   private static final alc<Boolean> a = alg.a(cmq.class, ale.k);
   private int b = 1;

   public cmq(bvq<? extends cmq> $$0, dhh $$1) {
      super($$0, $$1);
      this.bO = 5;
      this.bQ = new cmq.b(this);
   }

   @Override
   protected void B() {
      this.bT.a(5, new cmq.d(this));
      this.bT.a(7, new cmq.a(this));
      this.bT.a(7, new cmq.c(this));
      this.bU.a(1, new cew<>(this, cpw.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dD() - this.dD()) <= 4.0));
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
   protected boolean X() {
      return true;
   }

   private static boolean h(btz $$0) {
      return $$0.c() instanceof cqn && $$0.d() instanceof cpw;
   }

   @Override
   public boolean a(ash $$0, btz $$1) {
      return this.cC() && !$$1.a(axw.d) || !h($$1) && super.a($$0, $$1);
   }

   @Override
   public boolean a(ash $$0, btz $$1, float $$2) {
      if (h($$1)) {
         super.a($$0, $$1, 1000.0F);
         return true;
      } else {
         return this.a($$0, $$1) ? false : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   public static bxm.a t() {
      return bwh.C().a(bxn.s, 10.0).a(bxn.m, 100.0);
   }

   @Override
   public axg dn() {
      return axg.f;
   }

   @Override
   protected axe u() {
      return axf.kE;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.kG;
   }

   @Override
   protected axe o_() {
      return axf.kF;
   }

   @Override
   protected float fg() {
      return 5.0F;
   }

   public static boolean b(bvq<cmq> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
      return $$1.al() != btf.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int ad() {
      return 1;
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.b);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.b = $$0.f("ExplosionPower");
      }
   }

   static class a extends cdd {
      private final cmq a;

      public a(cmq $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdd.a.b));
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
            fbx $$0 = this.a.dz();
            this.a.v(-((float)bae.d($$0.d, $$0.f)) * (180.0F / (float)Math.PI));
            this.a.aX = this.a.dM();
         } else {
            bwf $$1 = this.a.O_();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dB() - this.a.dB();
               double $$4 = $$1.dH() - this.a.dH();
               this.a.v(-((float)bae.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aX = this.a.dM();
            }
         }
      }
   }

   static class b extends ccg {
      private final cmq l;
      private int m;

      public b(cmq $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == ccg.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.dZ().a(5) + 2;
               fbx $$0 = new fbx(this.e - this.l.dB(), this.f - this.l.dD(), this.g - this.l.dH());
               double $$1 = $$0.g();
               $$0 = $$0.d();
               if (this.a($$0, bae.c($$1))) {
                  this.l.h(this.l.dz().e($$0.c(0.1)));
               } else {
                  this.k = ccg.a.a;
               }
            }
         }
      }

      private boolean a(fbx $$0, int $$1) {
         fbs $$2 = this.l.cR();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dW().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends cdd {
      private final cmq b;
      public int a;

      public c(cmq $$0) {
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
         bwf $$0 = this.b.O_();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.E($$0)) {
               dhh $$2 = this.b.dW();
               this.a++;
               if (this.a == 10 && !this.b.bb()) {
                  $$2.a(null, 1015, this.b.dw(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  fbx $$4 = this.b.g(1.0F);
                  double $$5 = $$0.dB() - (this.b.dB() + $$4.d * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dH() - (this.b.dH() + $$4.f * 4.0);
                  fbx $$8 = new fbx($$5, $$6, $$7);
                  if (!this.b.bb()) {
                     $$2.a(null, 1016, this.b.dw(), 0);
                  }

                  cqn $$9 = new cqn($$2, this.b, $$8.d(), this.b.p());
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

   static class d extends cdd {
      private final cmq a;

      public d(cmq $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdd.a.a));
      }

      @Override
      public boolean b() {
         ccg $$0 = this.a.I();
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
         bam $$0 = this.a.dZ();
         double $$1 = this.a.dB() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dD() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dH() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.I().a($$1, $$2, $$3, 1.0);
      }
   }
}
