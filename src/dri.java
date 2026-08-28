import javax.annotation.Nullable;

public class dri extends dqf implements bqh, bqu {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bqj e = new bqj() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dri.this.g.e();
      }

      @Override
      public cuo a(int $$0) {
         return $$0 == 0 ? dri.this.g : cuo.l;
      }

      @Override
      public cuo a(int $$0, int $$1) {
         if ($$0 == 0) {
            cuo $$2 = dri.this.g.a($$1);
            if (dri.this.g.e()) {
               dri.this.k();
            }

            return $$2;
         } else {
            return cuo.l;
         }
      }

      @Override
      public cuo b(int $$0) {
         if ($$0 == 0) {
            cuo $$1 = dri.this.g;
            dri.this.g = cuo.l;
            dri.this.k();
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
         dri.this.e();
      }

      @Override
      public boolean a(cmv $$0) {
         return bqj.a(dri.this, $$0) && dri.this.c();
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
         return $$0 == 0 ? dri.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dri.this.a($$1);
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

   public dri(jd $$0, dta $$1) {
      super(dqh.D, $$0, $$1);
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
      dkh.a(null, this.i(), this.az_(), this.n(), false);
   }

   public void a(cuo $$0, @Nullable cmv $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = ayn.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dkh.a(this.i(), this.az_(), this.n());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return ayn.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cuo b(cuo $$0, @Nullable cmv $$1) {
      if (this.n instanceof aqt && $$0.a(cur.ua)) {
         cwp.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private et a(@Nullable cmv $$0) {
      String $$1;
      wy $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = wy.b("Lectern");
      } else {
         $$1 = $$0.ah().getString();
         $$2 = $$0.O_();
      }

      eww $$5 = eww.b(this.o);
      return new et(es.a, $$5, ewv.a, (aqt)this.n, 2, $$1, $$2, this.n.o(), $$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cuo.a($$1, (ux)$$0.p("Book")).orElse(cuo.l), null);
      } else {
         this.g = cuo.l;
      }

      this.i = c(this.g);
      this.h = ayn.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
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
   public cps createMenu(int $$0, cmu $$1, cmv $$2) {
      return new cqx($$0, this.e, this.f);
   }

   @Override
   public wy O_() {
      return wy.c("container.lectern");
   }

   private static int c(cuo $$0) {
      cxz $$1 = $$0.a(kq.J);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         cxy $$2 = $$0.a(kq.I);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
