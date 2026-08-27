import javax.annotation.Nullable;

public class dea extends dcz implements bgv, bhh {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bgx e = new bgx() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean af_() {
         return dea.this.g.b();
      }

      @Override
      public cjl a(int $$0) {
         return $$0 == 0 ? dea.this.g : cjl.b;
      }

      @Override
      public cjl a(int $$0, int $$1) {
         if ($$0 == 0) {
            cjl $$2 = dea.this.g.a($$1);
            if (dea.this.g.b()) {
               dea.this.j();
            }

            return $$2;
         } else {
            return cjl.b;
         }
      }

      @Override
      public cjl b(int $$0) {
         if ($$0 == 0) {
            cjl $$1 = dea.this.g;
            dea.this.g = cjl.b;
            dea.this.j();
            return $$1;
         } else {
            return cjl.b;
         }
      }

      @Override
      public void a(int $$0, cjl $$1) {
      }

      @Override
      public int ag_() {
         return 1;
      }

      @Override
      public void e() {
         dea.this.e();
      }

      @Override
      public boolean a(cca $$0) {
         return bgx.a(dea.this, $$0) && dea.this.f();
      }

      @Override
      public boolean b(int $$0, cjl $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cfb f = new cfb() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dea.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dea.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cjl g = cjl.b;
   int h;
   private int i;

   public dea(gw $$0, dfd $$1) {
      super(ddb.D, $$0, $$1);
   }

   public cjl c() {
      return this.g;
   }

   public boolean f() {
      return this.g.a(cjo.tg) || this.g.a(cjo.th);
   }

   public void a(cjl $$0) {
      this.a($$0, null);
   }

   void j() {
      this.h = 0;
      this.i = 0;
      cxl.a(null, this.k(), this.p(), this.q(), false);
   }

   public void a(cjl $$0, @Nullable cca $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = clh.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = asb.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         cxl.a(this.k(), this.p(), this.q());
      }
   }

   public int g() {
      return this.h;
   }

   public int i() {
      float $$0 = this.i > 1 ? (float)this.g() / ((float)this.i - 1.0F) : 1.0F;
      return asb.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private cjl b(cjl $$0, @Nullable cca $$1) {
      if (this.o instanceof akt && $$0.a(cjo.th)) {
         clh.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private dt a(@Nullable cca $$0) {
      String $$1;
      tl $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = tl.b("Lectern");
      } else {
         $$1 = $$0.ab().getString();
         $$2 = $$0.N_();
      }

      ehh $$5 = ehh.b(this.p);
      return new dt(ds.a, $$5, ehg.a, (akt)this.o, 2, $$1, $$2, this.o.n(), $$0);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cjl.a($$0.p("Book")), null);
      } else {
         this.g = cjl.b;
      }

      this.i = clh.k(this.g);
      this.h = asb.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      if (!this.c().b()) {
         $$0.a("Book", this.c().b(new qw()));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(cjl.b);
   }

   @Override
   public cer createMenu(int $$0, cbz $$1, cca $$2) {
      return new cft($$0, this.e, this.f);
   }

   @Override
   public tl N_() {
      return tl.c("container.lectern");
   }
}
