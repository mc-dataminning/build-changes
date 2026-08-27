import javax.annotation.Nullable;

public class drg extends dqc implements bpr, bqe {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bpt e = new bpt() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return drg.this.g.d();
      }

      @Override
      public cuh a(int $$0) {
         return $$0 == 0 ? drg.this.g : cuh.i;
      }

      @Override
      public cuh a(int $$0, int $$1) {
         if ($$0 == 0) {
            cuh $$2 = drg.this.g.a($$1);
            if (drg.this.g.d()) {
               drg.this.k();
            }

            return $$2;
         } else {
            return cuh.i;
         }
      }

      @Override
      public cuh b(int $$0) {
         if ($$0 == 0) {
            cuh $$1 = drg.this.g;
            drg.this.g = cuh.i;
            drg.this.k();
            return $$1;
         } else {
            return cuh.i;
         }
      }

      @Override
      public void a(int $$0, cuh $$1) {
      }

      @Override
      public int ai_() {
         return 1;
      }

      @Override
      public void e() {
         drg.this.e();
      }

      @Override
      public boolean a(cly $$0) {
         return bpt.a(drg.this, $$0) && drg.this.c();
      }

      @Override
      public boolean b(int $$0, cuh $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cpq f = new cpq() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? drg.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            drg.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cuh g = cuh.i;
   int h;
   private int i;

   public drg(ir $$0, dtc $$1) {
      super(dqe.E, $$0, $$1);
   }

   public cuh b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(cuk.vB) || this.g.a(cuk.vC);
   }

   public void a(cuh $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      djr.a(null, this.i(), this.az_(), this.n(), false);
   }

   public void a(cuh $$0, @Nullable cly $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = b(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = aym.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         djr.a(this.i(), this.az_(), this.n());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return aym.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cuh b(cuh $$0, @Nullable cly $$1) {
      if (this.n instanceof aqt && $$0.a(cuk.vC)) {
         cwo.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private eh a(@Nullable cly $$0) {
      String $$1;
      xe $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = xe.b("Lectern");
      } else {
         $$1 = $$0.af().getString();
         $$2 = $$0.P_();
      }

      ewu $$5 = ewu.b(this.o);
      return new eh(eg.a, $$5, ewt.a, (aqt)this.n, 2, $$1, $$2, this.n.o(), $$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cuh.a($$1, (vh)$$0.p("Book")).orElse(cuh.i), null);
      } else {
         this.g = cuh.i;
      }

      this.i = b(this.g);
      this.h = aym.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      if (!this.b().d()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(cuh.i);
   }

   @Override
   public cpg createMenu(int $$0, clx $$1, cly $$2) {
      return new cql($$0, this.e, this.f);
   }

   @Override
   public xe P_() {
      return xe.c("container.lectern");
   }

   private static int b(cuh $$0) {
      cya $$1 = $$0.a(ke.H);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         cxz $$2 = $$0.a(ke.G);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
