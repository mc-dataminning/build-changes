import javax.annotation.Nullable;

public class dvd extends dty implements bsa, bsl {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bsc e = new bsc() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dvd.this.g.f();
      }

      @Override
      public cwo a(int $$0) {
         return $$0 == 0 ? dvd.this.g : cwo.j;
      }

      @Override
      public cwo a(int $$0, int $$1) {
         if ($$0 == 0) {
            cwo $$2 = dvd.this.g.a($$1);
            if (dvd.this.g.f()) {
               dvd.this.k();
            }

            return $$2;
         } else {
            return cwo.j;
         }
      }

      @Override
      public cwo b(int $$0) {
         if ($$0 == 0) {
            cwo $$1 = dvd.this.g;
            dvd.this.g = cwo.j;
            dvd.this.k();
            return $$1;
         } else {
            return cwo.j;
         }
      }

      @Override
      public void a(int $$0, cwo $$1) {
      }

      @Override
      public int an_() {
         return 1;
      }

      @Override
      public void e() {
         dvd.this.e();
      }

      @Override
      public boolean a(cow $$0) {
         return bsc.a(dvd.this, $$0) && dvd.this.c();
      }

      @Override
      public boolean b(int $$0, cwo $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final csn f = new csn() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dvd.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dvd.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cwo g = cwo.j;
   int h;
   private int i;

   public dvd(ji $$0, dww $$1) {
      super(dua.E, $$0, $$1);
   }

   public cwo b() {
      return this.g;
   }

   public boolean c() {
      return this.g.b(kv.S) || this.g.b(kv.T);
   }

   public void b(cwo $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dny.a(null, this.i(), this.aA_(), this.m(), false);
   }

   public void a(cwo $$0, @Nullable cow $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = ayz.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dny.a(this.i(), this.aA_(), this.m());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return ayz.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cwo b(cwo $$0, @Nullable cow $$1) {
      if (this.o instanceof ard $$2) {
         cyk.a($$0, this.a($$1, $$2), $$1);
      }

      return $$0;
   }

   private ex a(@Nullable cow $$0, ard $$1) {
      String $$2;
      wp $$3;
      if ($$0 == null) {
         $$2 = "Lectern";
         $$3 = wp.b("Lectern");
      } else {
         $$2 = $$0.al().getString();
         $$3 = $$0.p_();
      }

      faz $$6 = faz.b(this.p);
      return new ex(ew.a, $$6, fay.a, $$1, 2, $$2, $$3, $$1.p(), $$0);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cwo.a($$1, (un)$$0.p("Book")).orElse(cwo.j), null);
      } else {
         this.g = cwo.j;
      }

      this.i = c(this.g);
      this.h = ayz.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.b().f()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cwo.j);
   }

   @Override
   public csb createMenu(int $$0, cov $$1, cow $$2) {
      return new cth($$0, this.e, this.f);
   }

   @Override
   public wp p_() {
      return wp.c("container.lectern");
   }

   private static int c(cwo $$0) {
      czw $$1 = $$0.a(kv.T);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         czv $$2 = $$0.a(kv.S);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
