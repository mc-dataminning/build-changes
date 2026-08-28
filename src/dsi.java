import javax.annotation.Nullable;

public class dsi extends dre implements brb, brm {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final brd e = new brd() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dsi.this.g.f();
      }

      @Override
      public cvl a(int $$0) {
         return $$0 == 0 ? dsi.this.g : cvl.k;
      }

      @Override
      public cvl a(int $$0, int $$1) {
         if ($$0 == 0) {
            cvl $$2 = dsi.this.g.a($$1);
            if (dsi.this.g.f()) {
               dsi.this.k();
            }

            return $$2;
         } else {
            return cvl.k;
         }
      }

      @Override
      public cvl b(int $$0) {
         if ($$0 == 0) {
            cvl $$1 = dsi.this.g;
            dsi.this.g = cvl.k;
            dsi.this.k();
            return $$1;
         } else {
            return cvl.k;
         }
      }

      @Override
      public void a(int $$0, cvl $$1) {
      }

      @Override
      public int ak_() {
         return 1;
      }

      @Override
      public void e() {
         dsi.this.e();
      }

      @Override
      public boolean a(cnp $$0) {
         return brd.a(dsi.this, $$0) && dsi.this.c();
      }

      @Override
      public boolean b(int $$0, cvl $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final crc f = new crc() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dsi.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dsi.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cvl g = cvl.k;
   int h;
   private int i;

   public dsi(je $$0, dua $$1) {
      super(drg.D, $$0, $$1);
   }

   public cvl b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(cvo.ua) || this.g.a(cvo.ub);
   }

   public void b(cvl $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dlg.a(null, this.i(), this.aD_(), this.m(), false);
   }

   public void a(cvl $$0, @Nullable cnp $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = azc.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dlg.a(this.i(), this.aD_(), this.m());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return azc.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cvl b(cvl $$0, @Nullable cnp $$1) {
      if (this.o instanceof arg && $$0.a(cvo.ub)) {
         cxk.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private et a(@Nullable cnp $$0) {
      String $$1;
      xd $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = xd.b("Lectern");
      } else {
         $$1 = $$0.aj().getString();
         $$2 = $$0.Q_();
      }

      eye $$5 = eye.b(this.p);
      return new et(es.a, $$5, eyd.a, (arg)this.o, 2, $$1, $$2, this.o.o(), $$0);
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cvl.a($$1, (vc)$$0.p("Book")).orElse(cvl.k), null);
      } else {
         this.g = cvl.k;
      }

      this.i = c(this.g);
      this.h = azc.a($$0.h("Page"), 0, this.i - 1);
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
      this.b(cvl.k);
   }

   @Override
   public cqq createMenu(int $$0, cno $$1, cnp $$2) {
      return new crw($$0, this.e, this.f);
   }

   @Override
   public xd Q_() {
      return xd.c("container.lectern");
   }

   private static int c(cvl $$0) {
      cyu $$1 = $$0.a(kr.L);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         cyt $$2 = $$0.a(kr.K);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
