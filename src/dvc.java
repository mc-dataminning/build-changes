import javax.annotation.Nullable;

public class dvc extends dtx implements brz, bsk {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bsb e = new bsb() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dvc.this.g.f();
      }

      @Override
      public cwn a(int $$0) {
         return $$0 == 0 ? dvc.this.g : cwn.j;
      }

      @Override
      public cwn a(int $$0, int $$1) {
         if ($$0 == 0) {
            cwn $$2 = dvc.this.g.a($$1);
            if (dvc.this.g.f()) {
               dvc.this.k();
            }

            return $$2;
         } else {
            return cwn.j;
         }
      }

      @Override
      public cwn b(int $$0) {
         if ($$0 == 0) {
            cwn $$1 = dvc.this.g;
            dvc.this.g = cwn.j;
            dvc.this.k();
            return $$1;
         } else {
            return cwn.j;
         }
      }

      @Override
      public void a(int $$0, cwn $$1) {
      }

      @Override
      public int an_() {
         return 1;
      }

      @Override
      public void e() {
         dvc.this.e();
      }

      @Override
      public boolean a(cov $$0) {
         return bsb.a(dvc.this, $$0) && dvc.this.c();
      }

      @Override
      public boolean b(int $$0, cwn $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final csm f = new csm() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dvc.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dvc.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cwn g = cwn.j;
   int h;
   private int i;

   public dvc(ji $$0, dwv $$1) {
      super(dtz.E, $$0, $$1);
   }

   public cwn b() {
      return this.g;
   }

   public boolean c() {
      return this.g.b(kv.S) || this.g.b(kv.T);
   }

   public void b(cwn $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dnx.a(null, this.i(), this.aA_(), this.m(), false);
   }

   public void a(cwn $$0, @Nullable cov $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = ayy.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dnx.a(this.i(), this.aA_(), this.m());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return ayy.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cwn b(cwn $$0, @Nullable cov $$1) {
      if (this.o instanceof arc $$2) {
         cyj.a($$0, this.a($$1, $$2), $$1);
      }

      return $$0;
   }

   private ex a(@Nullable cov $$0, arc $$1) {
      String $$2;
      wo $$3;
      if ($$0 == null) {
         $$2 = "Lectern";
         $$3 = wo.b("Lectern");
      } else {
         $$2 = $$0.al().getString();
         $$3 = $$0.p_();
      }

      fay $$6 = fay.b(this.p);
      return new ex(ew.a, $$6, fax.a, $$1, 2, $$2, $$3, $$1.p(), $$0);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cwn.a($$1, (un)$$0.p("Book")).orElse(cwn.j), null);
      } else {
         this.g = cwn.j;
      }

      this.i = c(this.g);
      this.h = ayy.a($$0.h("Page"), 0, this.i - 1);
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
      this.b(cwn.j);
   }

   @Override
   public csa createMenu(int $$0, cou $$1, cov $$2) {
      return new ctg($$0, this.e, this.f);
   }

   @Override
   public wo p_() {
      return wo.c("container.lectern");
   }

   private static int c(cwn $$0) {
      czv $$1 = $$0.a(kv.T);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         czu $$2 = $$0.a(kv.S);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
