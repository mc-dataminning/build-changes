import javax.annotation.Nullable;

public class ddl extends dck implements bgf, bgr {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bgh e = new bgh() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean ab_() {
         return ddl.this.g.b();
      }

      @Override
      public ciw a(int $$0) {
         return $$0 == 0 ? ddl.this.g : ciw.b;
      }

      @Override
      public ciw a(int $$0, int $$1) {
         if ($$0 == 0) {
            ciw $$2 = ddl.this.g.a($$1);
            if (ddl.this.g.b()) {
               ddl.this.j();
            }

            return $$2;
         } else {
            return ciw.b;
         }
      }

      @Override
      public ciw b(int $$0) {
         if ($$0 == 0) {
            ciw $$1 = ddl.this.g;
            ddl.this.g = ciw.b;
            ddl.this.j();
            return $$1;
         } else {
            return ciw.b;
         }
      }

      @Override
      public void a(int $$0, ciw $$1) {
      }

      @Override
      public int ac_() {
         return 1;
      }

      @Override
      public void e() {
         ddl.this.e();
      }

      @Override
      public boolean a(cbl $$0) {
         return bgh.a(ddl.this, $$0) && ddl.this.f();
      }

      @Override
      public boolean b(int $$0, ciw $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cem f = new cem() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? ddl.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            ddl.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   ciw g = ciw.b;
   int h;
   private int i;

   public ddl(gv $$0, dey $$1) {
      super(dcm.D, $$0, $$1);
   }

   public ciw c() {
      return this.g;
   }

   public boolean f() {
      return this.g.a(ciz.tg) || this.g.a(ciz.th);
   }

   public void a(ciw $$0) {
      this.a($$0, null);
   }

   void j() {
      this.h = 0;
      this.i = 0;
      cws.a(null, this.k(), this.p(), this.q(), false);
   }

   public void a(ciw $$0, @Nullable cbl $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = cks.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = aro.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         cws.a(this.k(), this.p(), this.q());
      }
   }

   public int g() {
      return this.h;
   }

   public int i() {
      float $$0 = this.i > 1 ? (float)this.g() / ((float)this.i - 1.0F) : 1.0F;
      return aro.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private ciw b(ciw $$0, @Nullable cbl $$1) {
      if (this.o instanceof aki && $$0.a(ciz.th)) {
         cks.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private ds a(@Nullable cbl $$0) {
      String $$1;
      te $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = te.b("Lectern");
      } else {
         $$1 = $$0.ab().getString();
         $$2 = $$0.H_();
      }

      ehf $$5 = ehf.b(this.p);
      return new ds(dr.a, $$5, ehe.a, (aki)this.o, 2, $$1, $$2, this.o.n(), $$0);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.b("Book", 10)) {
         this.g = this.b(ciw.a($$0.p("Book")), null);
      } else {
         this.g = ciw.b;
      }

      this.i = cks.k(this.g);
      this.h = aro.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      if (!this.c().b()) {
         $$0.a("Book", this.c().b(new qs()));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(ciw.b);
   }

   @Override
   public cec createMenu(int $$0, cbk $$1, cbl $$2) {
      return new cfe($$0, this.e, this.f);
   }

   @Override
   public te H_() {
      return te.c("container.lectern");
   }
}
