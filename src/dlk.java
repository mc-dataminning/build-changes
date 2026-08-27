import javax.annotation.Nullable;

public class dlk extends dki implements bmu, bnh {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bmw e = new bmw() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean ai_() {
         return dlk.this.g.b();
      }

      @Override
      public cqm a(int $$0) {
         return $$0 == 0 ? dlk.this.g : cqm.h;
      }

      @Override
      public cqm a(int $$0, int $$1) {
         if ($$0 == 0) {
            cqm $$2 = dlk.this.g.a($$1);
            if (dlk.this.g.b()) {
               dlk.this.k();
            }

            return $$2;
         } else {
            return cqm.h;
         }
      }

      @Override
      public cqm b(int $$0) {
         if ($$0 == 0) {
            cqm $$1 = dlk.this.g;
            dlk.this.g = cqm.h;
            dlk.this.k();
            return $$1;
         } else {
            return cqm.h;
         }
      }

      @Override
      public void a(int $$0, cqm $$1) {
      }

      @Override
      public int ak_() {
         return 1;
      }

      @Override
      public void e() {
         dlk.this.e();
      }

      @Override
      public boolean a(ciu $$0) {
         return bmw.a(dlk.this, $$0) && dlk.this.c();
      }

      @Override
      public boolean b(int $$0, cqm $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cma f = new cma() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dlk.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dlk.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cqm g = cqm.h;
   int h;
   private int i;

   public dlk(ib $$0, dnb $$1) {
      super(dkk.D, $$0, $$1);
   }

   public cqm b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(cqp.tY) || this.g.a(cqp.tZ);
   }

   public void a(cqm $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dem.a(null, this.i(), this.aC_(), this.n(), false);
   }

   public void a(cqm $$0, @Nullable ciu $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = csi.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = aww.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dem.a(this.i(), this.aC_(), this.n());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return aww.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cqm b(cqm $$0, @Nullable ciu $$1) {
      if (this.o instanceof apf && $$0.a(cqp.tZ)) {
         csi.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private du a(@Nullable ciu $$0) {
      String $$1;
      vu $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = vu.b("Lectern");
      } else {
         $$1 = $$0.ad().getString();
         $$2 = $$0.O_();
      }

      ept $$5 = ept.b(this.p);
      return new du(dt.a, $$5, eps.a, (apf)this.o, 2, $$1, $$2, this.o.o(), $$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cqm.a($$0.p("Book")), null);
      } else {
         this.g = cqm.h;
      }

      this.i = csi.k(this.g);
      this.h = aww.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b().b()) {
         $$0.a("Book", this.b().b(new ta()));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(cqm.h);
   }

   @Override
   public clq createMenu(int $$0, cit $$1, ciu $$2) {
      return new cmu($$0, this.e, this.f);
   }

   @Override
   public vu O_() {
      return vu.c("container.lectern");
   }
}
