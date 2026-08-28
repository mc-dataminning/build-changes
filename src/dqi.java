import javax.annotation.Nullable;

public class dqi extends dpg implements bqk, bqx {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bqm e = new bqm() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dqi.this.g.e();
      }

      @Override
      public cuo a(int $$0) {
         return $$0 == 0 ? dqi.this.g : cuo.l;
      }

      @Override
      public cuo a(int $$0, int $$1) {
         if ($$0 == 0) {
            cuo $$2 = dqi.this.g.a($$1);
            if (dqi.this.g.e()) {
               dqi.this.k();
            }

            return $$2;
         } else {
            return cuo.l;
         }
      }

      @Override
      public cuo b(int $$0) {
         if ($$0 == 0) {
            cuo $$1 = dqi.this.g;
            dqi.this.g = cuo.l;
            dqi.this.k();
            return $$1;
         } else {
            return cuo.l;
         }
      }

      @Override
      public void a(int $$0, cuo $$1) {
      }

      @Override
      public int ah_() {
         return 1;
      }

      @Override
      public void e() {
         dqi.this.e();
      }

      @Override
      public boolean a(cmw $$0) {
         return bqm.a(dqi.this, $$0) && dqi.this.c();
      }

      @Override
      public boolean b(int $$0, cuo $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cqd f = new cqd() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dqi.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dqi.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cuo g = cuo.l;
   int h;
   private int i;

   public dqi(iz $$0, dsb $$1) {
      super(dpi.D, $$0, $$1);
   }

   public cuo b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(cur.tZ) || this.g.a(cur.ua);
   }

   public void b(cuo $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      djj.a(null, this.i(), this.ay_(), this.n(), false);
   }

   public void a(cuo $$0, @Nullable cmw $$1) {
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
         djj.a(this.i(), this.ay_(), this.n());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return ayy.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cuo b(cuo $$0, @Nullable cmw $$1) {
      if (this.n instanceof are && $$0.a(cur.ua)) {
         cwm.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private ep a(@Nullable cmw $$0) {
      String $$1;
      xo $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = xo.b("Lectern");
      } else {
         $$1 = $$0.af().getString();
         $$2 = $$0.O_();
      }

      evq $$5 = evq.b(this.o);
      return new ep(eo.a, $$5, evp.a, (are)this.n, 2, $$1, $$2, this.n.o(), $$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cuo.a($$1, (vo)$$0.p("Book")).orElse(cuo.l), null);
      } else {
         this.g = cuo.l;
      }

      this.i = c(this.g);
      this.h = ayy.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b().e()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cuo.l);
   }

   @Override
   public cpt createMenu(int $$0, cmv $$1, cmw $$2) {
      return new cqx($$0, this.e, this.f);
   }

   @Override
   public xo O_() {
      return xo.c("container.lectern");
   }

   private static int c(cuo $$0) {
      cxx $$1 = $$0.a(km.J);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         cxw $$2 = $$0.a(km.I);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
