import java.util.EnumSet;

public class cih extends brr implements cif {
   private static final ajm<Boolean> b = ajq.a(cih.class, ajo.k);
   private int c = 1;

   public cih(brn<? extends cih> $$0, dad $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new cih.b(this);
   }

   @Override
   protected void z() {
      this.bS.a(5, new cih.d(this));
      this.bS.a(7, new cih.a(this));
      this.bS.a(7, new cih.c(this));
      this.bT.a(1, new caq<>(this, clh.class, 10, true, false, $$0 -> Math.abs($$0.du() - this.du()) <= 4.0));
   }

   public boolean r() {
      return this.ao.a(b);
   }

   public void w(boolean $$0) {
      this.ao.a(b, $$0);
   }

   public int u() {
      return this.c;
   }

   @Override
   protected boolean W() {
      return true;
   }

   private static boolean h(bqf $$0) {
      return $$0.c() instanceof clx && $$0.d() instanceof clh;
   }

   @Override
   public boolean b(bqf $$0) {
      return this.cs() && !$$0.a(avt.e) || !h($$0) && super.b($$0);
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      if (h($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   public static btg.a y() {
      return bsc.A().a(bth.q, 10.0).a(bth.k, 100.0);
   }

   @Override
   public avd dc() {
      return avd.f;
   }

   @Override
   protected avb v() {
      return avc.kf;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.kh;
   }

   @Override
   protected avb o_() {
      return avc.kg;
   }

   @Override
   protected float fc() {
      return 5.0F;
   }

   public static boolean b(brn<cih> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      return $$1.ak() != bpj.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int fP() {
      return 1;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   static class a extends byx {
      private final cih a;

      public a(cih $$0) {
         this.a = $$0;
         this.a(EnumSet.of(byx.a.b));
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.p() == null) {
            etp $$0 = this.a.dq();
            this.a.r(-((float)axz.d($$0.c, $$0.e)) * (180.0F / (float)Math.PI));
            this.a.aZ = this.a.dD();
         } else {
            bsa $$1 = this.a.p();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.ds() - this.a.ds();
               double $$4 = $$1.dy() - this.a.dy();
               this.a.r(-((float)axz.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aZ = this.a.dD();
            }
         }
      }
   }

   static class b extends bya {
      private final cih l;
      private int m;

      public b(cih $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bya.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.ej().a(5) + 2;
               etp $$0 = new etp(this.e - this.l.ds(), this.f - this.l.du(), this.g - this.l.dy());
               double $$1 = $$0.f();
               $$0 = $$0.d();
               if (this.a($$0, axz.c($$1))) {
                  this.l.g(this.l.dq().e($$0.a(0.1)));
               } else {
                  this.k = bya.a.a;
               }
            }
         }
      }

      private boolean a(etp $$0, int $$1) {
         etk $$2 = this.l.cI();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dN().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends byx {
      private final cih b;
      public int a;

      public c(cih $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.p() != null;
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
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bsa $$0 = this.b.p();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.E($$0)) {
               dad $$2 = this.b.dN();
               this.a++;
               if (this.a == 10 && !this.b.aU()) {
                  $$2.a(null, 1015, this.b.dn(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  etp $$4 = this.b.f(1.0F);
                  double $$5 = $$0.ds() - (this.b.ds() + $$4.c * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dy() - (this.b.dy() + $$4.e * 4.0);
                  if (!this.b.aU()) {
                     $$2.a(null, 1016, this.b.dn(), 0);
                  }

                  clx $$8 = new clx($$2, this.b, $$5, $$6, $$7, this.b.u());
                  $$8.a_(this.b.ds() + $$4.c * 4.0, this.b.e(0.5) + 0.5, $$8.dy() + $$4.e * 4.0);
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

   static class d extends byx {
      private final cih a;

      public d(cih $$0) {
         this.a = $$0;
         this.a(EnumSet.of(byx.a.a));
      }

      @Override
      public boolean a() {
         bya $$0 = this.a.H();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.ds();
            double $$2 = $$0.e() - this.a.du();
            double $$3 = $$0.f() - this.a.dy();
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
         ayg $$0 = this.a.ej();
         double $$1 = this.a.ds() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.du() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dy() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.H().a($$1, $$2, $$3, 1.0);
      }
   }
}
