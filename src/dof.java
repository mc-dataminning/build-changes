import javax.annotation.Nullable;

public class dof extends dnd implements boh, bou {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final boj e = new boj() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dof.this.g.d();
      }

      @Override
      public csd a(int $$0) {
         return $$0 == 0 ? dof.this.g : csd.i;
      }

      @Override
      public csd a(int $$0, int $$1) {
         if ($$0 == 0) {
            csd $$2 = dof.this.g.a($$1);
            if (dof.this.g.d()) {
               dof.this.k();
            }

            return $$2;
         } else {
            return csd.i;
         }
      }

      @Override
      public csd b(int $$0) {
         if ($$0 == 0) {
            csd $$1 = dof.this.g;
            dof.this.g = csd.i;
            dof.this.k();
            return $$1;
         } else {
            return csd.i;
         }
      }

      @Override
      public void a(int $$0, csd $$1) {
      }

      @Override
      public int ah_() {
         return 1;
      }

      @Override
      public void e() {
         dof.this.e();
      }

      @Override
      public boolean a(ckl $$0) {
         return boj.a(dof.this, $$0) && dof.this.c();
      }

      @Override
      public boolean b(int $$0, csd $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cnr f = new cnr() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dof.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dof.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   csd g = csd.i;
   int h;
   private int i;

   public dof(im $$0, dpy $$1) {
      super(dnf.D, $$0, $$1);
   }

   public csd b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(csg.tZ) || this.g.a(csg.ua);
   }

   public void a(csd $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dhg.a(null, this.i(), this.az_(), this.n(), false);
   }

   public void a(csd $$0, @Nullable ckl $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = b(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = axw.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dhg.a(this.i(), this.az_(), this.n());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return axw.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private csd b(csd $$0, @Nullable ckl $$1) {
      if (this.o instanceof aqe && $$0.a(csg.ua)) {
         ctz.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private ec a(@Nullable ckl $$0) {
      String $$1;
      ws $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = ws.b("Lectern");
      } else {
         $$1 = $$0.ad().getString();
         $$2 = $$0.O_();
      }

      etf $$5 = etf.b(this.p);
      return new ec(eb.a, $$5, ete.a, (aqe)this.o, 2, $$1, $$2, this.o.o(), $$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(csd.a($$1, (uv)$$0.p("Book")).orElse(csd.i), null);
      } else {
         this.g = csd.i;
      }

      this.i = b(this.g);
      this.h = axw.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      if (!this.b().d()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(csd.i);
   }

   @Override
   public cnh createMenu(int $$0, ckk $$1, ckl $$2) {
      return new col($$0, this.e, this.f);
   }

   @Override
   public ws O_() {
      return ws.c("container.lectern");
   }

   private static int b(csd $$0) {
      cvj $$1 = $$0.a(jz.A);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         cvi $$2 = $$0.a(jz.z);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
