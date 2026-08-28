import javax.annotation.Nullable;

public class dtk extends dsg implements brp, bsa {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final brr e = new brr() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dtk.this.g.f();
      }

      @Override
      public cvx a(int $$0) {
         return $$0 == 0 ? dtk.this.g : cvx.k;
      }

      @Override
      public cvx a(int $$0, int $$1) {
         if ($$0 == 0) {
            cvx $$2 = dtk.this.g.a($$1);
            if (dtk.this.g.f()) {
               dtk.this.k();
            }

            return $$2;
         } else {
            return cvx.k;
         }
      }

      @Override
      public cvx b(int $$0) {
         if ($$0 == 0) {
            cvx $$1 = dtk.this.g;
            dtk.this.g = cvx.k;
            dtk.this.k();
            return $$1;
         } else {
            return cvx.k;
         }
      }

      @Override
      public void a(int $$0, cvx $$1) {
      }

      @Override
      public int am_() {
         return 1;
      }

      @Override
      public void e() {
         dtk.this.e();
      }

      @Override
      public boolean a(coh $$0) {
         return brr.a(dtk.this, $$0) && dtk.this.c();
      }

      @Override
      public boolean b(int $$0, cvx $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final crv f = new crv() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dtk.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dtk.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cvx g = cvx.k;
   int h;
   private int i;

   public dtk(jg $$0, dvd $$1) {
      super(dsi.D, $$0, $$1);
   }

   public cvx b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(cwb.ua) || this.g.a(cwb.ub);
   }

   public void b(cvx $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dmi.a(null, this.i(), this.aC_(), this.m(), false);
   }

   public void a(cvx $$0, @Nullable coh $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = azj.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dmi.a(this.i(), this.aC_(), this.m());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return azj.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cvx b(cvx $$0, @Nullable coh $$1) {
      if (this.o instanceof arm && $$0.a(cwb.ub)) {
         cxt.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private ev a(@Nullable coh $$0) {
      String $$1;
      xh $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = xh.b("Lectern");
      } else {
         $$1 = $$0.al().getString();
         $$2 = $$0.S_();
      }

      ezh $$5 = ezh.b(this.p);
      return new ev(eu.a, $$5, ezg.a, (arm)this.o, 2, $$1, $$2, this.o.o(), $$0);
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cvx.a($$1, (vg)$$0.p("Book")).orElse(cvx.k), null);
      } else {
         this.g = cvx.k;
      }

      this.i = c(this.g);
      this.h = azj.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      if (!this.b().f()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cvx.k);
   }

   @Override
   public crj createMenu(int $$0, cog $$1, coh $$2) {
      return new csp($$0, this.e, this.f);
   }

   @Override
   public xh S_() {
      return xh.c("container.lectern");
   }

   private static int c(cvx $$0) {
      czd $$1 = $$0.a(kt.S);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         czc $$2 = $$0.a(kt.R);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
