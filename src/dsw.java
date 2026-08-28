import javax.annotation.Nullable;

public class dsw extends drs implements brg, brr {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bri e = new bri() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dsw.this.g.f();
      }

      @Override
      public cvp a(int $$0) {
         return $$0 == 0 ? dsw.this.g : cvp.k;
      }

      @Override
      public cvp a(int $$0, int $$1) {
         if ($$0 == 0) {
            cvp $$2 = dsw.this.g.a($$1);
            if (dsw.this.g.f()) {
               dsw.this.k();
            }

            return $$2;
         } else {
            return cvp.k;
         }
      }

      @Override
      public cvp b(int $$0) {
         if ($$0 == 0) {
            cvp $$1 = dsw.this.g;
            dsw.this.g = cvp.k;
            dsw.this.k();
            return $$1;
         } else {
            return cvp.k;
         }
      }

      @Override
      public void a(int $$0, cvp $$1) {
      }

      @Override
      public int ak_() {
         return 1;
      }

      @Override
      public void e() {
         dsw.this.e();
      }

      @Override
      public boolean a(cnu $$0) {
         return bri.a(dsw.this, $$0) && dsw.this.c();
      }

      @Override
      public boolean b(int $$0, cvp $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cri f = new cri() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dsw.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dsw.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cvp g = cvp.k;
   int h;
   private int i;

   public dsw(je $$0, duo $$1) {
      super(dru.D, $$0, $$1);
   }

   public cvp b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(cvt.ua) || this.g.a(cvt.ub);
   }

   public void b(cvp $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dlu.a(null, this.i(), this.aB_(), this.m(), false);
   }

   public void a(cvp $$0, @Nullable cnu $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = azd.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dlu.a(this.i(), this.aB_(), this.m());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return azd.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cvp b(cvp $$0, @Nullable cnu $$1) {
      if (this.o instanceof arh && $$0.a(cvt.ub)) {
         cxl.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private et a(@Nullable cnu $$0) {
      String $$1;
      xd $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = xd.b("Lectern");
      } else {
         $$1 = $$0.aj().getString();
         $$2 = $$0.Q_();
      }

      eys $$5 = eys.b(this.p);
      return new et(es.a, $$5, eyr.a, (arh)this.o, 2, $$1, $$2, this.o.o(), $$0);
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cvp.a($$1, (vc)$$0.p("Book")).orElse(cvp.k), null);
      } else {
         this.g = cvp.k;
      }

      this.i = c(this.g);
      this.h = azd.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      if (!this.b().f()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cvp.k);
   }

   @Override
   public cqw createMenu(int $$0, cnt $$1, cnu $$2) {
      return new csc($$0, this.e, this.f);
   }

   @Override
   public xd Q_() {
      return xd.c("container.lectern");
   }

   private static int c(cvp $$0) {
      czb $$1 = $$0.a(kr.O);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         cza $$2 = $$0.a(kr.N);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
