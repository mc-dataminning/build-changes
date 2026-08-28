import javax.annotation.Nullable;

public class dvu extends dup implements bsv, btg {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bsx e = new bsx() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dvu.this.g.f();
      }

      @Override
      public cxk a(int $$0) {
         return $$0 == 0 ? dvu.this.g : cxk.k;
      }

      @Override
      public cxk a(int $$0, int $$1) {
         if ($$0 == 0) {
            cxk $$2 = dvu.this.g.a($$1);
            if (dvu.this.g.f()) {
               dvu.this.k();
            }

            return $$2;
         } else {
            return cxk.k;
         }
      }

      @Override
      public cxk b(int $$0) {
         if ($$0 == 0) {
            cxk $$1 = dvu.this.g;
            dvu.this.g = cxk.k;
            dvu.this.k();
            return $$1;
         } else {
            return cxk.k;
         }
      }

      @Override
      public void a(int $$0, cxk $$1) {
      }

      @Override
      public int ao_() {
         return 1;
      }

      @Override
      public void e() {
         dvu.this.e();
      }

      @Override
      public boolean a(cps $$0) {
         return bsx.a(dvu.this, $$0) && dvu.this.c();
      }

      @Override
      public boolean b(int $$0, cxk $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final ctj f = new ctj() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dvu.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dvu.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cxk g = cxk.k;
   int h;
   private int i;

   public dvu(jh $$0, dxn $$1) {
      super(dur.E, $$0, $$1);
   }

   public cxk b() {
      return this.g;
   }

   public boolean c() {
      return this.g.b(ku.S) || this.g.b(ku.T);
   }

   public void b(cxk $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dor.a(null, this.i(), this.aB_(), this.m(), false);
   }

   public void a(cxk $$0, @Nullable cps $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = bae.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dor.a(this.i(), this.aB_(), this.m());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return bae.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cxk b(cxk $$0, @Nullable cps $$1) {
      if (this.o instanceof ash $$2) {
         czg.a($$0, this.a($$1, $$2), $$1);
      }

      return $$0;
   }

   private ew a(@Nullable cps $$0, ash $$1) {
      String $$2;
      xv $$3;
      if ($$0 == null) {
         $$2 = "Lectern";
         $$3 = xv.b("Lectern");
      } else {
         $$2 = $$0.al().getString();
         $$3 = $$0.p_();
      }

      fbs $$6 = fbs.b(this.p);
      return new ew(ev.a, $$6, fbr.a, $$1, 2, $$2, $$3, $$1.p(), $$0);
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cxk.a($$1, (vu)$$0.p("Book")).orElse(cxk.k), null);
      } else {
         this.g = cxk.k;
      }

      this.i = c(this.g);
      this.h = bae.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.b().f()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cxk.k);
   }

   @Override
   public csx createMenu(int $$0, cpr $$1, cps $$2) {
      return new cud($$0, this.e, this.f);
   }

   @Override
   public xv p_() {
      return xv.c("container.lectern");
   }

   private static int c(cxk $$0) {
      das $$1 = $$0.a(ku.T);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         dar $$2 = $$0.a(ku.S);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
