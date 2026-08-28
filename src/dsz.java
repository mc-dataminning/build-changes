import javax.annotation.Nullable;

public class dsz extends drv implements brj, bru {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final brl e = new brl() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dsz.this.g.f();
      }

      @Override
      public cvs a(int $$0) {
         return $$0 == 0 ? dsz.this.g : cvs.k;
      }

      @Override
      public cvs a(int $$0, int $$1) {
         if ($$0 == 0) {
            cvs $$2 = dsz.this.g.a($$1);
            if (dsz.this.g.f()) {
               dsz.this.k();
            }

            return $$2;
         } else {
            return cvs.k;
         }
      }

      @Override
      public cvs b(int $$0) {
         if ($$0 == 0) {
            cvs $$1 = dsz.this.g;
            dsz.this.g = cvs.k;
            dsz.this.k();
            return $$1;
         } else {
            return cvs.k;
         }
      }

      @Override
      public void a(int $$0, cvs $$1) {
      }

      @Override
      public int al_() {
         return 1;
      }

      @Override
      public void e() {
         dsz.this.e();
      }

      @Override
      public boolean a(cnx $$0) {
         return brl.a(dsz.this, $$0) && dsz.this.c();
      }

      @Override
      public boolean b(int $$0, cvs $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final crl f = new crl() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dsz.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dsz.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cvs g = cvs.k;
   int h;
   private int i;

   public dsz(jf $$0, dus $$1) {
      super(drx.D, $$0, $$1);
   }

   public cvs b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(cvw.ua) || this.g.a(cvw.ub);
   }

   public void b(cvs $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dlx.a(null, this.i(), this.aC_(), this.m(), false);
   }

   public void a(cvs $$0, @Nullable cnx $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = azf.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dlx.a(this.i(), this.aC_(), this.m());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return azf.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cvs b(cvs $$0, @Nullable cnx $$1) {
      if (this.o instanceof arj && $$0.a(cvw.ub)) {
         cxo.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private eu a(@Nullable cnx $$0) {
      String $$1;
      xe $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = xe.b("Lectern");
      } else {
         $$1 = $$0.aj().getString();
         $$2 = $$0.R_();
      }

      eyw $$5 = eyw.b(this.p);
      return new eu(et.a, $$5, eyv.a, (arj)this.o, 2, $$1, $$2, this.o.o(), $$0);
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cvs.a($$1, (vd)$$0.p("Book")).orElse(cvs.k), null);
      } else {
         this.g = cvs.k;
      }

      this.i = c(this.g);
      this.h = azf.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      if (!this.b().f()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cvs.k);
   }

   @Override
   public cqz createMenu(int $$0, cnw $$1, cnx $$2) {
      return new csf($$0, this.e, this.f);
   }

   @Override
   public xe R_() {
      return xe.c("container.lectern");
   }

   private static int c(cvs $$0) {
      cze $$1 = $$0.a(ks.O);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         czd $$2 = $$0.a(ks.N);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
