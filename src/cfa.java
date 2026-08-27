import java.util.EnumSet;

public class cfa extends boo implements cey {
   private static final aii<Boolean> b = ail.a(cfa.class, aik.k);
   private int c = 1;

   public cfa(bol<? extends cfa> $$0, cwe $$1) {
      super($$0, $$1);
      this.bK = 5;
      this.bM = new cfa.b(this);
   }

   @Override
   protected void B() {
      this.bP.a(5, new cfa.d(this));
      this.bP.a(7, new cfa.a(this));
      this.bP.a(7, new cfa.c(this));
      this.bQ.a(1, new bxn<>(this, cia.class, 10, true, false, $$0 -> Math.abs($$0.dq() - this.dq()) <= 4.0));
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

   private static boolean h(bne $$0) {
      return $$0.c() instanceof ciq && $$0.d() instanceof cia;
   }

   @Override
   public boolean b(bne $$0) {
      return !h($$0) && super.b($$0);
   }

   @Override
   public boolean a(bne $$0, float $$1) {
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

   public static bqd.a A() {
      return boz.C().a(bqe.n, 10.0).a(bqe.i, 100.0);
   }

   @Override
   public atq cY() {
      return atq.f;
   }

   @Override
   protected ato y() {
      return atp.jW;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.jY;
   }

   @Override
   protected ato n_() {
      return atp.jX;
   }

   @Override
   protected float eY() {
      return 5.0F;
   }

   public static boolean b(bol<cfa> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      return $$1.aj() != bmi.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int fM() {
      return 1;
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   static class a extends bvu {
      private final cfa a;

      public a(cfa $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvu.a.b));
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
            eov $$0 = this.a.dm();
            this.a.r(-((float)awm.d($$0.c, $$0.e)) * (180.0F / (float)Math.PI));
            this.a.aV = this.a.dz();
         } else {
            box $$1 = this.a.q();
            double $$2 = 64.0;
            if ($$1.f(this.a) < 4096.0) {
               double $$3 = $$1.do() - this.a.do();
               double $$4 = $$1.du() - this.a.du();
               this.a.r(-((float)awm.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aV = this.a.dz();
            }
         }
      }
   }

   static class b extends bux {
      private final cfa l;
      private int m;

      public b(cfa $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bux.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.ef().a(5) + 2;
               eov $$0 = new eov(this.e - this.l.do(), this.f - this.l.dq(), this.g - this.l.du());
               double $$1 = $$0.f();
               $$0 = $$0.d();
               if (this.a($$0, awm.c($$1))) {
                  this.l.g(this.l.dm().e($$0.a(0.1)));
               } else {
                  this.k = bux.a.a;
               }
            }
         }
      }

      private boolean a(eov $$0, int $$1) {
         eoq $$2 = this.l.cE();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dJ().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends bvu {
      private final cfa b;
      public int a;

      public c(cfa $$0) {
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
         box $$0 = this.b.q();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.f(this.b) < 4096.0 && this.b.D($$0)) {
               cwe $$2 = this.b.dJ();
               this.a++;
               if (this.a == 10 && !this.b.aU()) {
                  $$2.a(null, 1015, this.b.dj(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  eov $$4 = this.b.f(1.0F);
                  double $$5 = $$0.do() - (this.b.do() + $$4.c * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.du() - (this.b.du() + $$4.e * 4.0);
                  if (!this.b.aU()) {
                     $$2.a(null, 1016, this.b.dj(), 0);
                  }

                  ciq $$8 = new ciq($$2, this.b, $$5, $$6, $$7, this.b.w());
                  $$8.a_(this.b.do() + $$4.c * 4.0, this.b.e(0.5) + 0.5, $$8.du() + $$4.e * 4.0);
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

   static class d extends bvu {
      private final cfa a;

      public d(cfa $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvu.a.a));
      }

      @Override
      public boolean a() {
         bux $$0 = this.a.K();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.do();
            double $$2 = $$0.e() - this.a.dq();
            double $$3 = $$0.f() - this.a.du();
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
         awt $$0 = this.a.ef();
         double $$1 = this.a.do() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dq() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.du() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.K().a($$1, $$2, $$3, 1.0);
      }
   }
}
