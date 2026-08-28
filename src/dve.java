import javax.annotation.Nullable;

public class dve extends dtz implements bsa, bsl {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bsc e = new bsc() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dve.this.g.f();
      }

      @Override
      public cwp a(int $$0) {
         return $$0 == 0 ? dve.this.g : cwp.j;
      }

      @Override
      public cwp a(int $$0, int $$1) {
         if ($$0 == 0) {
            cwp $$2 = dve.this.g.a($$1);
            if (dve.this.g.f()) {
               dve.this.k();
            }

            return $$2;
         } else {
            return cwp.j;
         }
      }

      @Override
      public cwp b(int $$0) {
         if ($$0 == 0) {
            cwp $$1 = dve.this.g;
            dve.this.g = cwp.j;
            dve.this.k();
            return $$1;
         } else {
            return cwp.j;
         }
      }

      @Override
      public void a(int $$0, cwp $$1) {
      }

      @Override
      public int an_() {
         return 1;
      }

      @Override
      public void e() {
         dve.this.e();
      }

      @Override
      public boolean a(cox $$0) {
         return bsc.a(dve.this, $$0) && dve.this.c();
      }

      @Override
      public boolean b(int $$0, cwp $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cso f = new cso() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dve.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dve.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cwp g = cwp.j;
   int h;
   private int i;

   public dve(ji $$0, dwx $$1) {
      super(dub.E, $$0, $$1);
   }

   public cwp b() {
      return this.g;
   }

   public boolean c() {
      return this.g.b(kv.S) || this.g.b(kv.T);
   }

   public void b(cwp $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dnz.a(null, this.i(), this.aA_(), this.m(), false);
   }

   public void a(cwp $$0, @Nullable cox $$1) {
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
         dnz.a(this.i(), this.aA_(), this.m());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return ayz.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cwp b(cwp $$0, @Nullable cox $$1) {
      if (this.o instanceof arc $$2) {
         cyl.a($$0, this.a($$1, $$2), $$1);
      }

      return $$0;
   }

   private ex a(@Nullable cox $$0, arc $$1) {
      String $$2;
      wo $$3;
      if ($$0 == null) {
         $$2 = "Lectern";
         $$3 = wo.b("Lectern");
      } else {
         $$2 = $$0.al().getString();
         $$3 = $$0.p_();
      }

      fba $$6 = fba.b(this.p);
      return new ex(ew.a, $$6, faz.a, $$1, 2, $$2, $$3, $$1.p(), $$0);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cwp.a($$1, (un)$$0.p("Book")).orElse(cwp.j), null);
      } else {
         this.g = cwp.j;
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
      this.b(cwp.j);
   }

   @Override
   public csc createMenu(int $$0, cow $$1, cox $$2) {
      return new cti($$0, this.e, this.f);
   }

   @Override
   public wo p_() {
      return wo.c("container.lectern");
   }

   private static int c(cwp $$0) {
      czx $$1 = $$0.a(kv.T);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         czw $$2 = $$0.a(kv.S);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
