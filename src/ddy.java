import javax.annotation.Nullable;

public class ddy extends dcx implements bgr, bhd {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bgt e = new bgt() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean af_() {
         return ddy.this.g.b();
      }

      @Override
      public cjh a(int $$0) {
         return $$0 == 0 ? ddy.this.g : cjh.b;
      }

      @Override
      public cjh a(int $$0, int $$1) {
         if ($$0 == 0) {
            cjh $$2 = ddy.this.g.a($$1);
            if (ddy.this.g.b()) {
               ddy.this.j();
            }

            return $$2;
         } else {
            return cjh.b;
         }
      }

      @Override
      public cjh b(int $$0) {
         if ($$0 == 0) {
            cjh $$1 = ddy.this.g;
            ddy.this.g = cjh.b;
            ddy.this.j();
            return $$1;
         } else {
            return cjh.b;
         }
      }

      @Override
      public void a(int $$0, cjh $$1) {
      }

      @Override
      public int ag_() {
         return 1;
      }

      @Override
      public void e() {
         ddy.this.e();
      }

      @Override
      public boolean a(cbw $$0) {
         return bgt.a(ddy.this, $$0) && ddy.this.f();
      }

      @Override
      public boolean b(int $$0, cjh $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cex f = new cex() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? ddy.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            ddy.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cjh g = cjh.b;
   int h;
   private int i;

   public ddy(gw $$0, dfl $$1) {
      super(dcz.D, $$0, $$1);
   }

   public cjh c() {
      return this.g;
   }

   public boolean f() {
      return this.g.a(cjk.tg) || this.g.a(cjk.th);
   }

   public void a(cjh $$0) {
      this.a($$0, null);
   }

   void j() {
      this.h = 0;
      this.i = 0;
      cxf.a(null, this.k(), this.p(), this.q(), false);
   }

   public void a(cjh $$0, @Nullable cbw $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = cld.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = ary.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         cxf.a(this.k(), this.p(), this.q());
      }
   }

   public int g() {
      return this.h;
   }

   public int i() {
      float $$0 = this.i > 1 ? (float)this.g() / ((float)this.i - 1.0F) : 1.0F;
      return ary.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private cjh b(cjh $$0, @Nullable cbw $$1) {
      if (this.o instanceof aks && $$0.a(cjk.th)) {
         cld.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private dt a(@Nullable cbw $$0) {
      String $$1;
      tn $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = tn.b("Lectern");
      } else {
         $$1 = $$0.ab().getString();
         $$2 = $$0.N_();
      }

      ehp $$5 = ehp.b(this.p);
      return new dt(ds.a, $$5, eho.a, (aks)this.o, 2, $$1, $$2, this.o.n(), $$0);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cjh.a($$0.p("Book")), null);
      } else {
         this.g = cjh.b;
      }

      this.i = cld.k(this.g);
      this.h = ary.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      if (!this.c().b()) {
         $$0.a("Book", this.c().b(new qy()));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(cjh.b);
   }

   @Override
   public cen createMenu(int $$0, cbv $$1, cbw $$2) {
      return new cfp($$0, this.e, this.f);
   }

   @Override
   public tn N_() {
      return tn.c("container.lectern");
   }
}
