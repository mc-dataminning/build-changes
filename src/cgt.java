import java.util.EnumSet;

public class cgt extends bqf implements cgr {
   private static final aiy<Boolean> b = ajc.a(cgt.class, aja.k);
   private int c = 1;

   public cgt(bqb<? extends cgt> $$0, cyx $$1) {
      super($$0, $$1);
      this.bM = 5;
      this.bO = new cgt.b(this);
   }

   @Override
   protected void z() {
      this.bR.a(5, new cgt.d(this));
      this.bR.a(7, new cgt.a(this));
      this.bR.a(7, new cgt.c(this));
      this.bS.a(1, new bze<>(this, cjt.class, 10, true, false, $$0 -> Math.abs($$0.dt() - this.dt()) <= 4.0));
   }

   public boolean r() {
      return this.an.a(b);
   }

   public void w(boolean $$0) {
      this.an.a(b, $$0);
   }

   public int u() {
      return this.c;
   }

   @Override
   protected boolean W() {
      return true;
   }

   private static boolean h(bot $$0) {
      return $$0.c() instanceof ckj && $$0.d() instanceof cjt;
   }

   @Override
   public boolean b(bot $$0) {
      return this.cr() && !$$0.a(ave.e) || !h($$0) && super.b($$0);
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      if (h($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   public static bru.a y() {
      return bqq.A().a(brv.q, 10.0).a(brv.k, 100.0);
   }

   @Override
   public aun db() {
      return aun.f;
   }

   @Override
   protected aul v() {
      return aum.kf;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.kh;
   }

   @Override
   protected aul o_() {
      return aum.kg;
   }

   @Override
   protected float fb() {
      return 5.0F;
   }

   public static boolean b(bqb<cgt> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      return $$1.ak() != bnx.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int fO() {
      return 1;
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   static class a extends bxl {
      private final cgt a;

      public a(cgt $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bxl.a.b));
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
            esa $$0 = this.a.dp();
            this.a.r(-((float)axk.d($$0.c, $$0.e)) * (180.0F / (float)Math.PI));
            this.a.aX = this.a.dC();
         } else {
            bqo $$1 = this.a.p();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dr() - this.a.dr();
               double $$4 = $$1.dx() - this.a.dx();
               this.a.r(-((float)axk.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aX = this.a.dC();
            }
         }
      }
   }

   static class b extends bwo {
      private final cgt l;
      private int m;

      public b(cgt $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bwo.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.ei().a(5) + 2;
               esa $$0 = new esa(this.e - this.l.dr(), this.f - this.l.dt(), this.g - this.l.dx());
               double $$1 = $$0.f();
               $$0 = $$0.d();
               if (this.a($$0, axk.c($$1))) {
                  this.l.g(this.l.dp().e($$0.a(0.1)));
               } else {
                  this.k = bwo.a.a;
               }
            }
         }
      }

      private boolean a(esa $$0, int $$1) {
         erv $$2 = this.l.cH();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dM().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends bxl {
      private final cgt b;
      public int a;

      public c(cgt $$0) {
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
         bqo $$0 = this.b.p();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.E($$0)) {
               cyx $$2 = this.b.dM();
               this.a++;
               if (this.a == 10 && !this.b.aU()) {
                  $$2.a(null, 1015, this.b.dm(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  esa $$4 = this.b.f(1.0F);
                  double $$5 = $$0.dr() - (this.b.dr() + $$4.c * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dx() - (this.b.dx() + $$4.e * 4.0);
                  if (!this.b.aU()) {
                     $$2.a(null, 1016, this.b.dm(), 0);
                  }

                  ckj $$8 = new ckj($$2, this.b, $$5, $$6, $$7, this.b.u());
                  $$8.a_(this.b.dr() + $$4.c * 4.0, this.b.e(0.5) + 0.5, $$8.dx() + $$4.e * 4.0);
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

   static class d extends bxl {
      private final cgt a;

      public d(cgt $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bxl.a.a));
      }

      @Override
      public boolean a() {
         bwo $$0 = this.a.H();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.dr();
            double $$2 = $$0.e() - this.a.dt();
            double $$3 = $$0.f() - this.a.dx();
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
         axr $$0 = this.a.ei();
         double $$1 = this.a.dr() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dt() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dx() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.H().a($$1, $$2, $$3, 1.0);
      }
   }
}
