import java.util.EnumSet;

public class cel extends bnz implements cej {
   private static final aie<Boolean> b = aih.a(cel.class, aig.k);
   private int c = 1;

   public cel(bnw<? extends cel> $$0, cvr $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new cel.b(this);
   }

   @Override
   protected void B() {
      this.bO.a(5, new cel.d(this));
      this.bO.a(7, new cel.a(this));
      this.bO.a(7, new cel.c(this));
      this.bP.a(1, new bwy<>(this, chl.class, 10, true, false, $$0 -> Math.abs($$0.dt() - this.dt()) <= 4.0));
   }

   @Override
   public boolean u() {
      return this.am.b(b);
   }

   public void w(boolean $$0) {
      this.am.b(b, $$0);
   }

   public int w() {
      return this.c;
   }

   @Override
   protected boolean Y() {
      return true;
   }

   private static boolean h(bmp $$0) {
      return $$0.c() instanceof cib && $$0.d() instanceof chl;
   }

   @Override
   public boolean b(bmp $$0) {
      return !h($$0) && super.b($$0);
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
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
      this.am.a(b, false);
   }

   public static bpo.a A() {
      return bok.C().a(bpp.n, 10.0).a(bpp.i, 100.0);
   }

   @Override
   public atm db() {
      return atm.f;
   }

   @Override
   protected atk y() {
      return atl.jW;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.jY;
   }

   @Override
   protected atk n_() {
      return atl.jX;
   }

   @Override
   protected float eW() {
      return 5.0F;
   }

   public static boolean b(bnw<cel> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      return $$1.aj() != blt.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int fK() {
      return 1;
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   static class a extends bvf {
      private final cel a;

      public a(cel $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvf.a.b));
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
            enz $$0 = this.a.dp();
            this.a.r(-((float)awi.d($$0.c, $$0.e)) * (180.0F / (float)Math.PI));
            this.a.aU = this.a.dC();
         } else {
            boi $$1 = this.a.q();
            double $$2 = 64.0;
            if ($$1.f(this.a) < 4096.0) {
               double $$3 = $$1.dr() - this.a.dr();
               double $$4 = $$1.dx() - this.a.dx();
               this.a.r(-((float)awi.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aU = this.a.dC();
            }
         }
      }
   }

   static class b extends bui {
      private final cel l;
      private int m;

      public b(cel $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bui.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.eh().a(5) + 2;
               enz $$0 = new enz(this.e - this.l.dr(), this.f - this.l.dt(), this.g - this.l.dx());
               double $$1 = $$0.f();
               $$0 = $$0.d();
               if (this.a($$0, awi.c($$1))) {
                  this.l.g(this.l.dp().e($$0.a(0.1)));
               } else {
                  this.k = bui.a.a;
               }
            }
         }
      }

      private boolean a(enz $$0, int $$1) {
         enu $$2 = this.l.cH();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dM().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends bvf {
      private final cel b;
      public int a;

      public c(cel $$0) {
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
         boi $$0 = this.b.q();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.f(this.b) < 4096.0 && this.b.D($$0)) {
               cvr $$2 = this.b.dM();
               this.a++;
               if (this.a == 10 && !this.b.aU()) {
                  $$2.a(null, 1015, this.b.dm(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  enz $$4 = this.b.f(1.0F);
                  double $$5 = $$0.dr() - (this.b.dr() + $$4.c * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dx() - (this.b.dx() + $$4.e * 4.0);
                  if (!this.b.aU()) {
                     $$2.a(null, 1016, this.b.dm(), 0);
                  }

                  cib $$8 = new cib($$2, this.b, $$5, $$6, $$7, this.b.w());
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

   static class d extends bvf {
      private final cel a;

      public d(cel $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvf.a.a));
      }

      @Override
      public boolean a() {
         bui $$0 = this.a.K();
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
         awp $$0 = this.a.eh();
         double $$1 = this.a.dr() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dt() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dx() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.K().a($$1, $$2, $$3, 1.0);
      }
   }
}
