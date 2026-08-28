import javax.annotation.Nullable;

public class dvf extends dua implements bsc, bsn {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bse e = new bse() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dvf.this.g.f();
      }

      @Override
      public cwq a(int $$0) {
         return $$0 == 0 ? dvf.this.g : cwq.j;
      }

      @Override
      public cwq a(int $$0, int $$1) {
         if ($$0 == 0) {
            cwq $$2 = dvf.this.g.a($$1);
            if (dvf.this.g.f()) {
               dvf.this.k();
            }

            return $$2;
         } else {
            return cwq.j;
         }
      }

      @Override
      public cwq b(int $$0) {
         if ($$0 == 0) {
            cwq $$1 = dvf.this.g;
            dvf.this.g = cwq.j;
            dvf.this.k();
            return $$1;
         } else {
            return cwq.j;
         }
      }

      @Override
      public void a(int $$0, cwq $$1) {
      }

      @Override
      public int an_() {
         return 1;
      }

      @Override
      public void e() {
         dvf.this.e();
      }

      @Override
      public boolean a(coy $$0) {
         return bse.a(dvf.this, $$0) && dvf.this.c();
      }

      @Override
      public boolean b(int $$0, cwq $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final csp f = new csp() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dvf.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dvf.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cwq g = cwq.j;
   int h;
   private int i;

   public dvf(ji $$0, dwy $$1) {
      super(duc.E, $$0, $$1);
   }

   public cwq b() {
      return this.g;
   }

   public boolean c() {
      return this.g.b(kv.S) || this.g.b(kv.T);
   }

   public void b(cwq $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      doa.a(null, this.i(), this.aA_(), this.m(), false);
   }

   public void a(cwq $$0, @Nullable coy $$1) {
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
         doa.a(this.i(), this.aA_(), this.m());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return ayz.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cwq b(cwq $$0, @Nullable coy $$1) {
      if (this.n instanceof ard $$2) {
         cym.a($$0, this.a($$1, $$2), $$1);
      }

      return $$0;
   }

   private ex a(@Nullable coy $$0, ard $$1) {
      String $$2;
      wp $$3;
      if ($$0 == null) {
         $$2 = "Lectern";
         $$3 = wp.b("Lectern");
      } else {
         $$2 = $$0.al().getString();
         $$3 = $$0.p_();
      }

      fbb $$6 = fbb.b(this.o);
      return new ex(ew.a, $$6, fba.a, $$1, 2, $$2, $$3, $$1.p(), $$0);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cwq.a($$1, (un)$$0.p("Book")).orElse(cwq.j), null);
      } else {
         this.g = cwq.j;
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
      this.b(cwq.j);
   }

   @Override
   public csd createMenu(int $$0, cox $$1, coy $$2) {
      return new ctj($$0, this.e, this.f);
   }

   @Override
   public wp p_() {
      return wp.c("container.lectern");
   }

   private static int c(cwq $$0) {
      czy $$1 = $$0.a(kv.T);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         czx $$2 = $$0.a(kv.S);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
