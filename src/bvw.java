import java.util.EnumSet;

public class bvw extends bfq implements bvu {
   private static final aby<Boolean> b = acb.a(bvw.class, aca.k);
   private int c = 1;

   public bvw(bfn<? extends bvw> $$0, cmm $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new bvw.b(this);
   }

   @Override
   protected void x() {
      this.bO.a(5, new bvw.d(this));
      this.bO.a(7, new bvw.a(this));
      this.bO.a(7, new bvw.c(this));
      this.bP.a(1, new boo<>(this, byo.class, 10, true, false, $$0 -> Math.abs($$0.dp() - this.dp()) <= 4.0));
   }

   public boolean q() {
      return this.am.b(b);
   }

   public void w(boolean $$0) {
      this.am.b(b, $$0);
   }

   public int r() {
      return this.c;
   }

   @Override
   protected boolean U() {
      return true;
   }

   private static boolean h(ben $$0) {
      return $$0.c() instanceof bze && $$0.d() instanceof byo;
   }

   @Override
   public boolean b(ben $$0) {
      return !h($$0) && super.b($$0);
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      if (h($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(b, false);
   }

   public static bhf.a w() {
      return bgb.y().a(bhg.a, 10.0).a(bhg.b, 100.0);
   }

   @Override
   public ami cY() {
      return ami.f;
   }

   @Override
   protected amg s() {
      return amh.jd;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.jf;
   }

   @Override
   protected amg g_() {
      return amh.je;
   }

   @Override
   protected float eR() {
      return 5.0F;
   }

   public static boolean b(bfn<bvw> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
      return $$1.ai() != bdu.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int fE() {
      return 1;
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return 2.6F;
   }

   static class a extends bmv {
      private final bvw a;

      public a(bvw $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bmv.a.b));
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.j() == null) {
            eei $$0 = this.a.dl();
            this.a.a_(-((float)apa.d($$0.c, $$0.e)) * (180.0F / (float)Math.PI));
            this.a.aV = this.a.dy();
         } else {
            bfz $$1 = this.a.j();
            double $$2 = 64.0;
            if ($$1.f(this.a) < 4096.0) {
               double $$3 = $$1.dn() - this.a.dn();
               double $$4 = $$1.dt() - this.a.dt();
               this.a.a_(-((float)apa.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aV = this.a.dy();
            }
         }
      }
   }

   static class b extends bly {
      private final bvw l;
      private int m;

      public b(bvw $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bly.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.ec().a(5) + 2;
               eei $$0 = new eei(this.e - this.l.dn(), this.f - this.l.dp(), this.g - this.l.dt());
               double $$1 = $$0.f();
               $$0 = $$0.d();
               if (this.a($$0, apa.c($$1))) {
                  this.l.f(this.l.dl().e($$0.a(0.1)));
               } else {
                  this.k = bly.a.a;
               }
            }
         }
      }

      private boolean a(eei $$0, int $$1) {
         eed $$2 = this.l.cE();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dI().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends bmv {
      private final bvw b;
      public int a;

      public c(bvw $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.j() != null;
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
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         bfz $$0 = this.b.j();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.f(this.b) < 4096.0 && this.b.B($$0)) {
               cmm $$2 = this.b.dI();
               this.a++;
               if (this.a == 10 && !this.b.aQ()) {
                  $$2.a(null, 1015, this.b.di(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  eei $$4 = this.b.f(1.0F);
                  double $$5 = $$0.dn() - (this.b.dn() + $$4.c * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dt() - (this.b.dt() + $$4.e * 4.0);
                  if (!this.b.aQ()) {
                     $$2.a(null, 1016, this.b.di(), 0);
                  }

                  bze $$8 = new bze($$2, this.b, $$5, $$6, $$7, this.b.r());
                  $$8.e(this.b.dn() + $$4.c * 4.0, this.b.e(0.5) + 0.5, $$8.dt() + $$4.e * 4.0);
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

   static class d extends bmv {
      private final bvw a;

      public d(bvw $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bmv.a.a));
      }

      @Override
      public boolean a() {
         bly $$0 = this.a.G();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.dn();
            double $$2 = $$0.e() - this.a.dp();
            double $$3 = $$0.f() - this.a.dt();
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
         apf $$0 = this.a.ec();
         double $$1 = this.a.dn() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dp() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dt() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.G().a($$1, $$2, $$3, 1.0);
      }
   }
}
