import java.util.EnumSet;

public class cls extends buy implements clq {
   private static final akm<Boolean> a = akq.a(cls.class, ako.k);
   private int b = 1;

   public cls(bus<? extends cls> $$0, dfm $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new cls.b(this);
   }

   @Override
   protected void B() {
      this.bS.a(5, new cls.d(this));
      this.bS.a(7, new cls.a(this));
      this.bS.a(7, new cls.c(this));
      this.bT.a(1, new cdy<>(this, cou.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dC() - this.dC()) <= 4.0));
   }

   @Override
   public boolean n() {
      return this.al.a(a);
   }

   public void x(boolean $$0) {
      this.al.a(a, $$0);
   }

   public int q() {
      return this.b;
   }

   @Override
   protected boolean X() {
      return true;
   }

   private static boolean h(btb $$0) {
      return $$0.c() instanceof cpl && $$0.d() instanceof cou;
   }

   @Override
   public boolean a(arp $$0, btb $$1) {
      return this.cC() && !$$1.a(axe.d) || !h($$1) && super.a($$0, $$1);
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      if (h($$1)) {
         super.a($$0, $$1, 1000.0F);
         return true;
      } else {
         return this.a($$0, $$1) ? false : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   public static bwo.a v() {
      return bvj.C().a(bwp.s, 10.0).a(bwp.m, 100.0);
   }

   @Override
   public awo dm() {
      return awo.f;
   }

   @Override
   protected awm t() {
      return awn.kl;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.kn;
   }

   @Override
   protected awm n_() {
      return awn.km;
   }

   @Override
   protected float fe() {
      return 5.0F;
   }

   public static boolean b(bus<cls> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      return $$1.ak() != bsh.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int ad() {
      return 1;
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.b);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.b = $$0.f("ExplosionPower");
      }
   }

   static class a extends ccf {
      private final cls a;

      public a(cls $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccf.a.b));
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.aa_() == null) {
            ezy $$0 = this.a.dy();
            this.a.v(-((float)azm.d($$0.d, $$0.f)) * (180.0F / (float)Math.PI));
            this.a.aW = this.a.dL();
         } else {
            bvh $$1 = this.a.aa_();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dA() - this.a.dA();
               double $$4 = $$1.dG() - this.a.dG();
               this.a.v(-((float)azm.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aW = this.a.dL();
            }
         }
      }
   }

   static class b extends cbi {
      private final cls l;
      private int m;

      public b(cls $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cbi.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.dY().a(5) + 2;
               ezy $$0 = new ezy(this.e - this.l.dA(), this.f - this.l.dC(), this.g - this.l.dG());
               double $$1 = $$0.g();
               $$0 = $$0.d();
               if (this.a($$0, azm.c($$1))) {
                  this.l.h(this.l.dy().e($$0.c(0.1)));
               } else {
                  this.k = cbi.a.a;
               }
            }
         }
      }

      private boolean a(ezy $$0, int $$1) {
         ezt $$2 = this.l.cR();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dV().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends ccf {
      private final cls b;
      public int a;

      public c(cls $$0) {
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.aa_() != null;
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
      public boolean T_() {
         return true;
      }

      @Override
      public void a() {
         bvh $$0 = this.b.aa_();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.E($$0)) {
               dfm $$2 = this.b.dV();
               this.a++;
               if (this.a == 10 && !this.b.bb()) {
                  $$2.a(null, 1015, this.b.dv(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  ezy $$4 = this.b.g(1.0F);
                  double $$5 = $$0.dA() - (this.b.dA() + $$4.d * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dG() - (this.b.dG() + $$4.f * 4.0);
                  ezy $$8 = new ezy($$5, $$6, $$7);
                  if (!this.b.bb()) {
                     $$2.a(null, 1016, this.b.dv(), 0);
                  }

                  cpl $$9 = new cpl($$2, this.b, $$8.d(), this.b.q());
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

   static class d extends ccf {
      private final cls a;

      public d(cls $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean b() {
         cbi $$0 = this.a.I();
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
         azu $$0 = this.a.dY();
         double $$1 = this.a.dA() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dC() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dG() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.I().a($$1, $$2, $$3, 1.0);
      }
   }
}
