import java.util.EnumSet;

public class cmm extends bvs implements cmk {
   private static final alc<Boolean> a = alg.a(cmm.class, ale.k);
   private int b = 1;

   public cmm(bvm<? extends cmm> $$0, dha $$1) {
      super($$0, $$1);
      this.bO = 5;
      this.bQ = new cmm.b(this);
   }

   @Override
   protected void B() {
      this.bT.a(5, new cmm.d(this));
      this.bT.a(7, new cmm.a(this));
      this.bT.a(7, new cmm.c(this));
      this.bU.a(1, new ces<>(this, cps.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dC() - this.dC()) <= 4.0));
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

   private static boolean h(btv $$0) {
      return $$0.c() instanceof cqj && $$0.d() instanceof cps;
   }

   @Override
   public boolean a(ash $$0, btv $$1) {
      return this.cC() && !$$1.a(axw.d) || !h($$1) && super.a($$0, $$1);
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
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

   public static bxi.a t() {
      return bwd.C().a(bxj.s, 10.0).a(bxj.m, 100.0);
   }

   @Override
   public axg dm() {
      return axg.f;
   }

   @Override
   protected axe u() {
      return axf.kD;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.kF;
   }

   @Override
   protected axe o_() {
      return axf.kE;
   }

   @Override
   protected float fe() {
      return 5.0F;
   }

   public static boolean b(bvm<cmm> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      return $$1.al() != btb.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
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

   static class a extends ccz {
      private final cmm a;

      public a(cmm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccz.a.b));
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
            fbs $$0 = this.a.dy();
            this.a.v(-((float)bae.d($$0.d, $$0.f)) * (180.0F / (float)Math.PI));
            this.a.aX = this.a.dL();
         } else {
            bwb $$1 = this.a.O_();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dA() - this.a.dA();
               double $$4 = $$1.dG() - this.a.dG();
               this.a.v(-((float)bae.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aX = this.a.dL();
            }
         }
      }
   }

   static class b extends ccc {
      private final cmm l;
      private int m;

      public b(cmm $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == ccc.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.dY().a(5) + 2;
               fbs $$0 = new fbs(this.e - this.l.dA(), this.f - this.l.dC(), this.g - this.l.dG());
               double $$1 = $$0.g();
               $$0 = $$0.d();
               if (this.a($$0, bae.c($$1))) {
                  this.l.h(this.l.dy().e($$0.c(0.1)));
               } else {
                  this.k = ccc.a.a;
               }
            }
         }
      }

      private boolean a(fbs $$0, int $$1) {
         fbn $$2 = this.l.cR();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dV().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends ccz {
      private final cmm b;
      public int a;

      public c(cmm $$0) {
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
         bwb $$0 = this.b.O_();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.E($$0)) {
               dha $$2 = this.b.dV();
               this.a++;
               if (this.a == 10 && !this.b.bb()) {
                  $$2.a(null, 1015, this.b.dv(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  fbs $$4 = this.b.g(1.0F);
                  double $$5 = $$0.dA() - (this.b.dA() + $$4.d * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dG() - (this.b.dG() + $$4.f * 4.0);
                  fbs $$8 = new fbs($$5, $$6, $$7);
                  if (!this.b.bb()) {
                     $$2.a(null, 1016, this.b.dv(), 0);
                  }

                  cqj $$9 = new cqj($$2, this.b, $$8.d(), this.b.p());
                  $$9.a_(this.b.dA() + $$4.d * 4.0, this.b.e(0.5) + 0.5, $$9.dG() + $$4.f * 4.0);
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

   static class d extends ccz {
      private final cmm a;

      public d(cmm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccz.a.a));
      }

      @Override
      public boolean b() {
         ccc $$0 = this.a.I();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.dA();
            double $$2 = $$0.e() - this.a.dC();
            double $$3 = $$0.f() - this.a.dG();
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
         bam $$0 = this.a.dY();
         double $$1 = this.a.dA() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dC() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dG() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.I().a($$1, $$2, $$3, 1.0);
      }
   }
}
