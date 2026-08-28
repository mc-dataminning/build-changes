import java.util.EnumSet;

public class ckp extends btw implements ckn {
   private static final akg<Boolean> b = akk.a(ckp.class, aki.k);
   private int c = 1;

   public ckp(btq<? extends ckp> $$0, dds $$1) {
      super($$0, $$1);
      this.bO = 5;
      this.bQ = new ckp.b(this);
   }

   @Override
   protected void D() {
      this.bT.a(5, new ckp.d(this));
      this.bT.a(7, new ckp.a(this));
      this.bT.a(7, new ckp.c(this));
      this.bU.a(1, new ccv<>(this, cnp.class, 10, true, false, $$0 -> Math.abs($$0.dz() - this.dz()) <= 4.0));
   }

   @Override
   public boolean q() {
      return this.am.a(b);
   }

   public void x(boolean $$0) {
      this.am.a(b, $$0);
   }

   public int t() {
      return this.c;
   }

   @Override
   protected boolean ab() {
      return true;
   }

   private static boolean g(bsb $$0) {
      return $$0.c() instanceof cog && $$0.d() instanceof cnp;
   }

   @Override
   public boolean b(bsb $$0) {
      return this.cz() && !$$0.a(awu.d) || !g($$0) && super.b($$0);
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if (g($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   public static bvl.a y() {
      return buh.E().a(bvm.s, 10.0).a(bvm.m, 100.0);
   }

   @Override
   public awe di() {
      return awe.f;
   }

   @Override
   protected awc w() {
      return awd.kl;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.kn;
   }

   @Override
   protected awc n_() {
      return awd.km;
   }

   @Override
   protected float fd() {
      return 5.0F;
   }

   public static boolean b(btq<ckp> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      return $$1.am() != brh.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int fR() {
      return 1;
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   static class a extends cbc {
      private final ckp a;

      public a(ckp $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbc.a.b));
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
         if (this.a.m() == null) {
            eye $$0 = this.a.dv();
            this.a.v(-((float)azc.d($$0.d, $$0.f)) * (180.0F / (float)Math.PI));
            this.a.aU = this.a.dI();
         } else {
            buf $$1 = this.a.m();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dx() - this.a.dx();
               double $$4 = $$1.dD() - this.a.dD();
               this.a.v(-((float)azc.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aU = this.a.dI();
            }
         }
      }
   }

   static class b extends caf {
      private final ckp l;
      private int m;

      public b(ckp $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == caf.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.dV().a(5) + 2;
               eye $$0 = new eye(this.e - this.l.dx(), this.f - this.l.dz(), this.g - this.l.dD());
               double $$1 = $$0.g();
               $$0 = $$0.d();
               if (this.a($$0, azc.c($$1))) {
                  this.l.h(this.l.dv().e($$0.c(0.1)));
               } else {
                  this.k = caf.a.a;
               }
            }
         }
      }

      private boolean a(eye $$0, int $$1) {
         exz $$2 = this.l.cO();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dS().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends cbc {
      private final ckp b;
      public int a;

      public c(ckp $$0) {
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.m() != null;
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
         buf $$0 = this.b.m();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.G($$0)) {
               dds $$2 = this.b.dS();
               this.a++;
               if (this.a == 10 && !this.b.ba()) {
                  $$2.a(null, 1015, this.b.ds(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  eye $$4 = this.b.g(1.0F);
                  double $$5 = $$0.dx() - (this.b.dx() + $$4.d * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dD() - (this.b.dD() + $$4.f * 4.0);
                  eye $$8 = new eye($$5, $$6, $$7);
                  if (!this.b.ba()) {
                     $$2.a(null, 1016, this.b.ds(), 0);
                  }

                  cog $$9 = new cog($$2, this.b, $$8.d(), this.b.t());
                  $$9.a_(this.b.dx() + $$4.d * 4.0, this.b.e(0.5) + 0.5, $$9.dD() + $$4.f * 4.0);
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

   static class d extends cbc {
      private final ckp a;

      public d(ckp $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbc.a.a));
      }

      @Override
      public boolean b() {
         caf $$0 = this.a.M();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.dx();
            double $$2 = $$0.e() - this.a.dz();
            double $$3 = $$0.f() - this.a.dD();
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
         azk $$0 = this.a.dV();
         double $$1 = this.a.dx() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dz() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dD() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.M().a($$1, $$2, $$3, 1.0);
      }
   }
}
