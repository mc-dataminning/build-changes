import javax.annotation.Nullable;

public class dao extends czn implements bdo, bea {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bdq e = new bdq() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean ab_() {
         return dao.this.g.b();
      }

      @Override
      public cfz a(int $$0) {
         return $$0 == 0 ? dao.this.g : cfz.b;
      }

      @Override
      public cfz a(int $$0, int $$1) {
         if ($$0 == 0) {
            cfz $$2 = dao.this.g.a($$1);
            if (dao.this.g.b()) {
               dao.this.j();
            }

            return $$2;
         } else {
            return cfz.b;
         }
      }

      @Override
      public cfz b(int $$0) {
         if ($$0 == 0) {
            cfz $$1 = dao.this.g;
            dao.this.g = cfz.b;
            dao.this.j();
            return $$1;
         } else {
            return cfz.b;
         }
      }

      @Override
      public void a(int $$0, cfz $$1) {
      }

      @Override
      public int ac_() {
         return 1;
      }

      @Override
      public void e() {
         dao.this.e();
      }

      @Override
      public boolean a(byo $$0) {
         return bdq.a(dao.this, $$0) && dao.this.f();
      }

      @Override
      public boolean b(int $$0, cfz $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cbp f = new cbp() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dao.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dao.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cfz g = cfz.b;
   int h;
   private int i;

   public dao(gu $$0, dcb $$1) {
      super(czp.D, $$0, $$1);
   }

   public cfz c() {
      return this.g;
   }

   public boolean f() {
      return this.g.a(cgc.tg) || this.g.a(cgc.th);
   }

   public void a(cfz $$0) {
      this.a($$0, null);
   }

   void j() {
      this.h = 0;
      this.i = 0;
      ctv.a(null, this.k(), this.p(), this.q(), false);
   }

   public void a(cfz $$0, @Nullable byo $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = chv.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = apa.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         ctv.a(this.k(), this.p(), this.q());
      }
   }

   public int g() {
      return this.h;
   }

   public int i() {
      float $$0 = this.i > 1 ? (float)this.g() / ((float)this.i - 1.0F) : 1.0F;
      return apa.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private cfz b(cfz $$0, @Nullable byo $$1) {
      if (this.o instanceof aif && $$0.a(cgc.th)) {
         chv.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private ds a(@Nullable byo $$0) {
      String $$1;
      sw $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = sw.b("Lectern");
      } else {
         $$1 = $$0.Z().getString();
         $$2 = $$0.H_();
      }

      eei $$5 = eei.b(this.p);
      return new ds(dr.a, $$5, eeh.a, (aif)this.o, 2, $$1, $$2, this.o.n(), $$0);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cfz.a($$0.p("Book")), null);
      } else {
         this.g = cfz.b;
      }

      this.i = chv.k(this.g);
      this.h = apa.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      if (!this.c().b()) {
         $$0.a("Book", this.c().b(new qr()));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(cfz.b);
   }

   @Override
   public cbf createMenu(int $$0, byn $$1, byo $$2) {
      return new cch($$0, this.e, this.f);
   }

   @Override
   public sw H_() {
      return sw.c("container.lectern");
   }
}
