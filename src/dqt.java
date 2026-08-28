import javax.annotation.Nullable;

public class dqt extends dpq implements bpy, bql {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bqa e = new bqa() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dqt.this.g.e();
      }

      @Override
      public cud a(int $$0) {
         return $$0 == 0 ? dqt.this.g : cud.l;
      }

      @Override
      public cud a(int $$0, int $$1) {
         if ($$0 == 0) {
            cud $$2 = dqt.this.g.a($$1);
            if (dqt.this.g.e()) {
               dqt.this.k();
            }

            return $$2;
         } else {
            return cud.l;
         }
      }

      @Override
      public cud b(int $$0) {
         if ($$0 == 0) {
            cud $$1 = dqt.this.g;
            dqt.this.g = cud.l;
            dqt.this.k();
            return $$1;
         } else {
            return cud.l;
         }
      }

      @Override
      public void a(int $$0, cud $$1) {
      }

      @Override
      public int ah_() {
         return 1;
      }

      @Override
      public void e() {
         dqt.this.e();
      }

      @Override
      public boolean a(cml $$0) {
         return bqa.a(dqt.this, $$0) && dqt.this.c();
      }

      @Override
      public boolean b(int $$0, cud $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cpt f = new cpt() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dqt.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dqt.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cud g = cud.l;
   int h;
   private int i;

   public dqt(ja $$0, dsl $$1) {
      super(dps.D, $$0, $$1);
   }

   public cud b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(cug.tZ) || this.g.a(cug.ua);
   }

   public void b(cud $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      djt.a(null, this.i(), this.az_(), this.n(), false);
   }

   public void a(cud $$0, @Nullable cml $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = ayg.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         djt.a(this.i(), this.az_(), this.n());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return ayg.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cud b(cud $$0, @Nullable cml $$1) {
      if (this.n instanceof aqm && $$0.a(cug.ua)) {
         cwb.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private eq a(@Nullable cml $$0) {
      String $$1;
      wu $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = wu.b("Lectern");
      } else {
         $$1 = $$0.ah().getString();
         $$2 = $$0.O_();
      }

      ewh $$5 = ewh.b(this.o);
      return new eq(ep.a, $$5, ewg.a, (aqm)this.n, 2, $$1, $$2, this.n.o(), $$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cud.a($$1, (uu)$$0.p("Book")).orElse(cud.l), null);
      } else {
         this.g = cud.l;
      }

      this.i = c(this.g);
      this.h = ayg.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      if (!this.b().e()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cud.l);
   }

   @Override
   public cpi createMenu(int $$0, cmk $$1, cml $$2) {
      return new cqn($$0, this.e, this.f);
   }

   @Override
   public wu O_() {
      return wu.c("container.lectern");
   }

   private static int c(cud $$0) {
      cxl $$1 = $$0.a(kn.J);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         cxk $$2 = $$0.a(kn.I);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
