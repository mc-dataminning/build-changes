import java.util.EnumSet;

public class cjy extends bth implements cjw {
   private static final akk<Boolean> b = ako.a(cjy.class, akm.k);
   private int c = 1;

   public cjy(btb<? extends cjy> $$0, dbz $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new cjy.b(this);
   }

   @Override
   protected void z() {
      this.bS.a(5, new cjy.d(this));
      this.bS.a(7, new cjy.a(this));
      this.bS.a(7, new cjy.c(this));
      this.bT.a(1, new cch<>(this, cmy.class, 10, true, false, $$0 -> Math.abs($$0.dw() - this.dw()) <= 4.0));
   }

   public boolean s() {
      return this.ao.a(b);
   }

   public void w(boolean $$0) {
      this.ao.a(b, $$0);
   }

   public int u() {
      return this.c;
   }

   @Override
   protected boolean X() {
      return true;
   }

   private static boolean h(bro $$0) {
      return $$0.c() instanceof cno && $$0.d() instanceof cmy;
   }

   @Override
   public boolean b(bro $$0) {
      return this.cu() && !$$0.a(awr.e) || !h($$0) && super.b($$0);
   }

   @Override
   public boolean a(bro $$0, float $$1) {
      if (h($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   public static bux.a y() {
      return bts.A().a(buy.q, 10.0).a(buy.k, 100.0);
   }

   @Override
   public awb de() {
      return awb.f;
   }

   @Override
   protected avz v() {
      return awa.kk;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.km;
   }

   @Override
   protected avz o_() {
      return awa.kl;
   }

   @Override
   protected float fe() {
      return 5.0F;
   }

   public static boolean b(btb<cjy> $$0, dca $$1, btu $$2, iz $$3, azh $$4) {
      return $$1.al() != bqs.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int fQ() {
      return 1;
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   static class a extends cao {
      private final cjy a;

      public a(cjy $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cao.a.b));
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
            evs $$0 = this.a.ds();
            this.a.r(-((float)ayz.d($$0.c, $$0.e)) * (180.0F / (float)Math.PI));
            this.a.aY = this.a.dF();
         } else {
            btq $$1 = this.a.p();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.du() - this.a.du();
               double $$4 = $$1.dA() - this.a.dA();
               this.a.r(-((float)ayz.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aY = this.a.dF();
            }
         }
      }
   }

   static class b extends bzr {
      private final cjy l;
      private int m;

      public b(cjy $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bzr.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.el().a(5) + 2;
               evs $$0 = new evs(this.e - this.l.du(), this.f - this.l.dw(), this.g - this.l.dA());
               double $$1 = $$0.f();
               $$0 = $$0.d();
               if (this.a($$0, ayz.c($$1))) {
                  this.l.h(this.l.ds().e($$0.a(0.1)));
               } else {
                  this.k = bzr.a.a;
               }
            }
         }
      }

      private boolean a(evs $$0, int $$1) {
         evn $$2 = this.l.cK();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dP().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends cao {
      private final cjy b;
      public int a;

      public c(cjy $$0) {
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
         btq $$0 = this.b.p();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.E($$0)) {
               dbz $$2 = this.b.dP();
               this.a++;
               if (this.a == 10 && !this.b.aW()) {
                  $$2.a(null, 1015, this.b.dp(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  evs $$4 = this.b.f(1.0F);
                  double $$5 = $$0.du() - (this.b.du() + $$4.c * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dA() - (this.b.dA() + $$4.e * 4.0);
                  if (!this.b.aW()) {
                     $$2.a(null, 1016, this.b.dp(), 0);
                  }

                  cno $$8 = new cno($$2, this.b, $$5, $$6, $$7, this.b.u());
                  $$8.a_(this.b.du() + $$4.c * 4.0, this.b.e(0.5) + 0.5, $$8.dA() + $$4.e * 4.0);
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

   static class d extends cao {
      private final cjy a;

      public d(cjy $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cao.a.a));
      }

      @Override
      public boolean a() {
         bzr $$0 = this.a.H();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.du();
            double $$2 = $$0.e() - this.a.dw();
            double $$3 = $$0.f() - this.a.dA();
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
         azh $$0 = this.a.el();
         double $$1 = this.a.du() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dw() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dA() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.H().a($$1, $$2, $$3, 1.0);
      }
   }
}
