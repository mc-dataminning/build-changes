import javax.annotation.Nullable;

public class doo extends dnm implements bpd, bpq {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bpf e = new bpf() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return doo.this.g.d();
      }

      @Override
      public csz a(int $$0) {
         return $$0 == 0 ? doo.this.g : csz.i;
      }

      @Override
      public csz a(int $$0, int $$1) {
         if ($$0 == 0) {
            csz $$2 = doo.this.g.a($$1);
            if (doo.this.g.d()) {
               doo.this.k();
            }

            return $$2;
         } else {
            return csz.i;
         }
      }

      @Override
      public csz b(int $$0) {
         if ($$0 == 0) {
            csz $$1 = doo.this.g;
            doo.this.g = csz.i;
            doo.this.k();
            return $$1;
         } else {
            return csz.i;
         }
      }

      @Override
      public void a(int $$0, csz $$1) {
      }

      @Override
      public int ah_() {
         return 1;
      }

      @Override
      public void e() {
         doo.this.e();
      }

      @Override
      public boolean a(clh $$0) {
         return bpf.a(doo.this, $$0) && doo.this.c();
      }

      @Override
      public boolean b(int $$0, csz $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final coo f = new coo() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? doo.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            doo.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   csz g = csz.i;
   int h;
   private int i;

   public doo(in $$0, dqh $$1) {
      super(dno.D, $$0, $$1);
   }

   public csz b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(ctc.tZ) || this.g.a(ctc.ua);
   }

   public void a(csz $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dhp.a(null, this.i(), this.az_(), this.n(), false);
   }

   public void a(csz $$0, @Nullable clh $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = b(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = axz.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dhp.a(this.i(), this.az_(), this.n());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return axz.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private csz b(csz $$0, @Nullable clh $$1) {
      if (this.n instanceof aqh && $$0.a(ctc.ua)) {
         cuv.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private ed a(@Nullable clh $$0) {
      String $$1;
      wu $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = wu.b("Lectern");
      } else {
         $$1 = $$0.ad().getString();
         $$2 = $$0.O_();
      }

      etp $$5 = etp.b(this.o);
      return new ed(ec.a, $$5, eto.a, (aqh)this.n, 2, $$1, $$2, this.n.o(), $$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(csz.a($$1, (ux)$$0.p("Book")).orElse(csz.i), null);
      } else {
         this.g = csz.i;
      }

      this.i = b(this.g);
      this.h = axz.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      if (!this.b().d()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(csz.i);
   }

   @Override
   public cod createMenu(int $$0, clg $$1, clh $$2) {
      return new cpi($$0, this.e, this.f);
   }

   @Override
   public wu O_() {
      return wu.c("container.lectern");
   }

   private static int b(csz $$0) {
      cwg $$1 = $$0.a(ka.H);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         cwf $$2 = $$0.a(ka.G);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
