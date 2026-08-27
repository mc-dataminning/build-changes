import javax.annotation.Nullable;

public class dnq extends dmo implements bnw, boj {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bny e = new bny() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dnq.this.g.d();
      }

      @Override
      public crs a(int $$0) {
         return $$0 == 0 ? dnq.this.g : crs.i;
      }

      @Override
      public crs a(int $$0, int $$1) {
         if ($$0 == 0) {
            crs $$2 = dnq.this.g.a($$1);
            if (dnq.this.g.d()) {
               dnq.this.k();
            }

            return $$2;
         } else {
            return crs.i;
         }
      }

      @Override
      public crs b(int $$0) {
         if ($$0 == 0) {
            crs $$1 = dnq.this.g;
            dnq.this.g = crs.i;
            dnq.this.k();
            return $$1;
         } else {
            return crs.i;
         }
      }

      @Override
      public void a(int $$0, crs $$1) {
      }

      @Override
      public int ah_() {
         return 1;
      }

      @Override
      public void e() {
         dnq.this.e();
      }

      @Override
      public boolean a(cka $$0) {
         return bny.a(dnq.this, $$0) && dnq.this.c();
      }

      @Override
      public boolean b(int $$0, crs $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cng f = new cng() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dnq.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dnq.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   crs g = crs.i;
   int h;
   private int i;

   public dnq(id $$0, dpi $$1) {
      super(dmq.D, $$0, $$1);
   }

   public crs b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(crv.tY) || this.g.a(crv.tZ);
   }

   public void a(crs $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dgr.a(null, this.i(), this.az_(), this.n(), false);
   }

   public void a(crs $$0, @Nullable cka $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = b(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = axm.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dgr.a(this.i(), this.az_(), this.n());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return axm.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private crs b(crs $$0, @Nullable cka $$1) {
      if (this.o instanceof apu && $$0.a(crv.tZ)) {
         ctn.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private dv a(@Nullable cka $$0) {
      String $$1;
      wi $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = wi.b("Lectern");
      } else {
         $$1 = $$0.ad().getString();
         $$2 = $$0.O_();
      }

      esj $$5 = esj.b(this.p);
      return new dv(du.a, $$5, esi.a, (apu)this.o, 2, $$1, $$2, this.o.o(), $$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(crs.a($$1, (ul)$$0.p("Book")).orElse(crs.i), null);
      } else {
         this.g = crs.i;
      }

      this.i = b(this.g);
      this.h = axm.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      if (!this.b().d()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(crs.i);
   }

   @Override
   public cmw createMenu(int $$0, cjz $$1, cka $$2) {
      return new coa($$0, this.e, this.f);
   }

   @Override
   public wi O_() {
      return wi.c("container.lectern");
   }

   private static int b(crs $$0) {
      cuv $$1 = $$0.a(jr.A);
      if ($$1 != null) {
         return $$1.f().size();
      } else {
         cuu $$2 = $$0.a(jr.z);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
