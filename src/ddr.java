import javax.annotation.Nullable;

public class ddr extends dcq implements bgk, bgw {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bgm e = new bgm() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean aa_() {
         return ddr.this.g.b();
      }

      @Override
      public cja a(int $$0) {
         return $$0 == 0 ? ddr.this.g : cja.b;
      }

      @Override
      public cja a(int $$0, int $$1) {
         if ($$0 == 0) {
            cja $$2 = ddr.this.g.a($$1);
            if (ddr.this.g.b()) {
               ddr.this.j();
            }

            return $$2;
         } else {
            return cja.b;
         }
      }

      @Override
      public cja b(int $$0) {
         if ($$0 == 0) {
            cja $$1 = ddr.this.g;
            ddr.this.g = cja.b;
            ddr.this.j();
            return $$1;
         } else {
            return cja.b;
         }
      }

      @Override
      public void a(int $$0, cja $$1) {
      }

      @Override
      public int ab_() {
         return 1;
      }

      @Override
      public void e() {
         ddr.this.e();
      }

      @Override
      public boolean a(cbp $$0) {
         return bgm.a(ddr.this, $$0) && ddr.this.f();
      }

      @Override
      public boolean b(int $$0, cja $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final ceq f = new ceq() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? ddr.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            ddr.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cja g = cja.b;
   int h;
   private int i;

   public ddr(gw $$0, dfe $$1) {
      super(dcs.D, $$0, $$1);
   }

   public cja c() {
      return this.g;
   }

   public boolean f() {
      return this.g.a(cjd.tg) || this.g.a(cjd.th);
   }

   public void a(cja $$0) {
      this.a($$0, null);
   }

   void j() {
      this.h = 0;
      this.i = 0;
      cwy.a(null, this.k(), this.p(), this.q(), false);
   }

   public void a(cja $$0, @Nullable cbp $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = ckw.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = ars.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         cwy.a(this.k(), this.p(), this.q());
      }
   }

   public int g() {
      return this.h;
   }

   public int i() {
      float $$0 = this.i > 1 ? (float)this.g() / ((float)this.i - 1.0F) : 1.0F;
      return ars.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private cja b(cja $$0, @Nullable cbp $$1) {
      if (this.o instanceof akn && $$0.a(cjd.th)) {
         ckw.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private dt a(@Nullable cbp $$0) {
      String $$1;
      ti $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = ti.b("Lectern");
      } else {
         $$1 = $$0.ab().getString();
         $$2 = $$0.H_();
      }

      ehi $$5 = ehi.b(this.p);
      return new dt(ds.a, $$5, ehh.a, (akn)this.o, 2, $$1, $$2, this.o.n(), $$0);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cja.a($$0.p("Book")), null);
      } else {
         this.g = cja.b;
      }

      this.i = ckw.k(this.g);
      this.h = ars.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
      if (!this.c().b()) {
         $$0.a("Book", this.c().b(new qu()));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(cja.b);
   }

   @Override
   public ceg createMenu(int $$0, cbo $$1, cbp $$2) {
      return new cfi($$0, this.e, this.f);
   }

   @Override
   public ti H_() {
      return ti.c("container.lectern");
   }
}
