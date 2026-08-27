import javax.annotation.Nullable;

public class dnh extends dmf implements bnr, boe {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bnt e = new bnt() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean ah_() {
         return dnh.this.g.d();
      }

      @Override
      public crj a(int $$0) {
         return $$0 == 0 ? dnh.this.g : crj.i;
      }

      @Override
      public crj a(int $$0, int $$1) {
         if ($$0 == 0) {
            crj $$2 = dnh.this.g.a($$1);
            if (dnh.this.g.d()) {
               dnh.this.k();
            }

            return $$2;
         } else {
            return crj.i;
         }
      }

      @Override
      public crj b(int $$0) {
         if ($$0 == 0) {
            crj $$1 = dnh.this.g;
            dnh.this.g = crj.i;
            dnh.this.k();
            return $$1;
         } else {
            return crj.i;
         }
      }

      @Override
      public void a(int $$0, crj $$1) {
      }

      @Override
      public int aj_() {
         return 1;
      }

      @Override
      public void e() {
         dnh.this.e();
      }

      @Override
      public boolean a(cjt $$0) {
         return bnt.a(dnh.this, $$0) && dnh.this.c();
      }

      @Override
      public boolean b(int $$0, crj $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cmz f = new cmz() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dnh.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dnh.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   crj g = crj.i;
   int h;
   private int i;

   public dnh(ib $$0, doz $$1) {
      super(dmh.D, $$0, $$1);
   }

   public crj b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(crm.tY) || this.g.a(crm.tZ);
   }

   public void a(crj $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dgi.a(null, this.i(), this.aA_(), this.n(), false);
   }

   public void a(crj $$0, @Nullable cjt $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = b(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = axk.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dgi.a(this.i(), this.aA_(), this.n());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return axk.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private crj b(crj $$0, @Nullable cjt $$1) {
      if (this.o instanceof aps && $$0.a(crm.tZ)) {
         cte.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private du a(@Nullable cjt $$0) {
      String $$1;
      wg $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = wg.b("Lectern");
      } else {
         $$1 = $$0.ad().getString();
         $$2 = $$0.O_();
      }

      esa $$5 = esa.b(this.p);
      return new du(dt.a, $$5, erz.a, (aps)this.o, 2, $$1, $$2, this.o.o(), $$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(crj.a($$1, (uj)$$0.p("Book")).orElse(crj.i), null);
      } else {
         this.g = crj.i;
      }

      this.i = b(this.g);
      this.h = axk.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b().d()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(crj.i);
   }

   @Override
   public cmp createMenu(int $$0, cjs $$1, cjt $$2) {
      return new cnt($$0, this.e, this.f);
   }

   @Override
   public wg O_() {
      return wg.c("container.lectern");
   }

   private static int b(crj $$0) {
      cum $$1 = $$0.a(jp.A);
      if ($$1 != null) {
         return $$1.f().size();
      } else {
         cul $$2 = $$0.a(jp.z);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
