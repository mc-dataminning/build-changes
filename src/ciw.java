import java.util.EnumSet;

public class ciw extends bsf implements ciu {
   private static final ajr<Boolean> b = ajv.a(ciw.class, ajt.k);
   private int c = 1;

   public ciw(bsa<? extends ciw> $$0, dax $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new ciw.b(this);
   }

   @Override
   protected void z() {
      this.bS.a(5, new ciw.d(this));
      this.bS.a(7, new ciw.a(this));
      this.bS.a(7, new ciw.c(this));
      this.bT.a(1, new cbf<>(this, clw.class, 10, true, false, $$0 -> Math.abs($$0.dw() - this.dw()) <= 4.0));
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
   protected boolean W() {
      return true;
   }

   private static boolean h(bqn $$0) {
      return $$0.c() instanceof cmm && $$0.d() instanceof clw;
   }

   @Override
   public boolean b(bqn $$0) {
      return this.cu() && !$$0.a(avy.e) || !h($$0) && super.b($$0);
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      if (h($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   public static btv.a y() {
      return bsq.A().a(btw.q, 10.0).a(btw.k, 100.0);
   }

   @Override
   public avi de() {
      return avi.f;
   }

   @Override
   protected avg v() {
      return avh.kk;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.km;
   }

   @Override
   protected avg o_() {
      return avh.kl;
   }

   @Override
   protected float fe() {
      return 5.0F;
   }

   public static boolean b(bsa<ciw> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      return $$1.ak() != bpr.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int ae() {
      return 1;
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   static class a extends bzm {
      private final ciw a;

      public a(ciw $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzm.a.b));
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
            euk $$0 = this.a.ds();
            this.a.r(-((float)ayd.d($$0.c, $$0.e)) * (180.0F / (float)Math.PI));
            this.a.aZ = this.a.dF();
         } else {
            bso $$1 = this.a.p();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.du() - this.a.du();
               double $$4 = $$1.dA() - this.a.dA();
               this.a.r(-((float)ayd.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aZ = this.a.dF();
            }
         }
      }
   }

   static class b extends byp {
      private final ciw l;
      private int m;

      public b(ciw $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == byp.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.el().a(5) + 2;
               euk $$0 = new euk(this.e - this.l.du(), this.f - this.l.dw(), this.g - this.l.dA());
               double $$1 = $$0.f();
               $$0 = $$0.d();
               if (this.a($$0, ayd.c($$1))) {
                  this.l.g(this.l.ds().e($$0.a(0.1)));
               } else {
                  this.k = byp.a.a;
               }
            }
         }
      }

      private boolean a(euk $$0, int $$1) {
         euf $$2 = this.l.cK();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dP().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends bzm {
      private final ciw b;
      public int a;

      public c(ciw $$0) {
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
         bso $$0 = this.b.p();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.E($$0)) {
               dax $$2 = this.b.dP();
               this.a++;
               if (this.a == 10 && !this.b.aW()) {
                  $$2.a(null, 1015, this.b.dp(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  euk $$4 = this.b.f(1.0F);
                  double $$5 = $$0.du() - (this.b.du() + $$4.c * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dA() - (this.b.dA() + $$4.e * 4.0);
                  if (!this.b.aW()) {
                     $$2.a(null, 1016, this.b.dp(), 0);
                  }

                  cmm $$8 = new cmm($$2, this.b, $$5, $$6, $$7, this.b.u());
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

   static class d extends bzm {
      private final ciw a;

      public d(ciw $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzm.a.a));
      }

      @Override
      public boolean a() {
         byp $$0 = this.a.H();
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
         ayk $$0 = this.a.el();
         double $$1 = this.a.du() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dw() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dA() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.H().a($$1, $$2, $$3, 1.0);
      }
   }
}
