import java.util.EnumSet;

public class cfs extends bpf implements cfq {
   private static final aim<Boolean> b = aiq.a(cfs.class, aio.k);
   private int c = 1;

   public cfs(bpc<? extends cfs> $$0, cwz $$1) {
      super($$0, $$1);
      this.bM = 5;
      this.bO = new cfs.b(this);
   }

   @Override
   protected void z() {
      this.bR.a(5, new cfs.d(this));
      this.bR.a(7, new cfs.a(this));
      this.bR.a(7, new cfs.c(this));
      this.bS.a(1, new bye<>(this, cis.class, 10, true, false, $$0 -> Math.abs($$0.dt() - this.dt()) <= 4.0));
   }

   public boolean r() {
      return this.an.a(b);
   }

   public void w(boolean $$0) {
      this.an.a(b, $$0);
   }

   public int s() {
      return this.c;
   }

   @Override
   protected boolean W() {
      return true;
   }

   private static boolean h(bnv $$0) {
      return $$0.c() instanceof cji && $$0.d() instanceof cis;
   }

   @Override
   public boolean b(bnv $$0) {
      return this.cr() && !$$0.a(aup.e) || !h($$0) && super.b($$0);
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
      if (h($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   public static bqu.a y() {
      return bpq.A().a(bqv.q, 10.0).a(bqv.k, 100.0);
   }

   @Override
   public atz db() {
      return atz.f;
   }

   @Override
   protected atx v() {
      return aty.jZ;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.kb;
   }

   @Override
   protected atx n_() {
      return aty.ka;
   }

   @Override
   protected float fb() {
      return 5.0F;
   }

   public static boolean b(bpc<cfs> $$0, cxa $$1, bps $$2, ib $$3, axd $$4) {
      return $$1.aj() != bmz.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int fO() {
      return 1;
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   static class a extends bwl {
      private final cfs a;

      public a(cfs $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bwl.a.b));
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
            epr $$0 = this.a.dp();
            this.a.r(-((float)aww.d($$0.c, $$0.e)) * (180.0F / (float)Math.PI));
            this.a.aX = this.a.dC();
         } else {
            bpo $$1 = this.a.p();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dr() - this.a.dr();
               double $$4 = $$1.dx() - this.a.dx();
               this.a.r(-((float)aww.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aX = this.a.dC();
            }
         }
      }
   }

   static class b extends bvo {
      private final cfs l;
      private int m;

      public b(cfs $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bvo.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.ei().a(5) + 2;
               epr $$0 = new epr(this.e - this.l.dr(), this.f - this.l.dt(), this.g - this.l.dx());
               double $$1 = $$0.f();
               $$0 = $$0.d();
               if (this.a($$0, aww.c($$1))) {
                  this.l.g(this.l.dp().e($$0.a(0.1)));
               } else {
                  this.k = bvo.a.a;
               }
            }
         }
      }

      private boolean a(epr $$0, int $$1) {
         epm $$2 = this.l.cH();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dM().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends bwl {
      private final cfs b;
      public int a;

      public c(cfs $$0) {
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
         bpo $$0 = this.b.p();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.E($$0)) {
               cwz $$2 = this.b.dM();
               this.a++;
               if (this.a == 10 && !this.b.aU()) {
                  $$2.a(null, 1015, this.b.dm(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  epr $$4 = this.b.f(1.0F);
                  double $$5 = $$0.dr() - (this.b.dr() + $$4.c * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dx() - (this.b.dx() + $$4.e * 4.0);
                  if (!this.b.aU()) {
                     $$2.a(null, 1016, this.b.dm(), 0);
                  }

                  cji $$8 = new cji($$2, this.b, $$5, $$6, $$7, this.b.s());
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

   static class d extends bwl {
      private final cfs a;

      public d(cfs $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bwl.a.a));
      }

      @Override
      public boolean a() {
         bvo $$0 = this.a.H();
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
         axd $$0 = this.a.ei();
         double $$1 = this.a.dr() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dt() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dx() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.H().a($$1, $$2, $$3, 1.0);
      }
   }
}
