import javax.annotation.Nullable;

public class dql extends dpj implements bqn, bra {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bqp e = new bqp() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dql.this.g.e();
      }

      @Override
      public cur a(int $$0) {
         return $$0 == 0 ? dql.this.g : cur.l;
      }

      @Override
      public cur a(int $$0, int $$1) {
         if ($$0 == 0) {
            cur $$2 = dql.this.g.a($$1);
            if (dql.this.g.e()) {
               dql.this.k();
            }

            return $$2;
         } else {
            return cur.l;
         }
      }

      @Override
      public cur b(int $$0) {
         if ($$0 == 0) {
            cur $$1 = dql.this.g;
            dql.this.g = cur.l;
            dql.this.k();
            return $$1;
         } else {
            return cur.l;
         }
      }

      @Override
      public void a(int $$0, cur $$1) {
      }

      @Override
      public int ah_() {
         return 1;
      }

      @Override
      public void e() {
         dql.this.e();
      }

      @Override
      public boolean a(cmz $$0) {
         return bqp.a(dql.this, $$0) && dql.this.c();
      }

      @Override
      public boolean b(int $$0, cur $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cqg f = new cqg() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dql.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dql.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cur g = cur.l;
   int h;
   private int i;

   public dql(iz $$0, dse $$1) {
      super(dpl.D, $$0, $$1);
   }

   public cur b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(cuu.tZ) || this.g.a(cuu.ua);
   }

   public void b(cur $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      djm.a(null, this.i(), this.ay_(), this.n(), false);
   }

   public void a(cur $$0, @Nullable cmz $$1) {
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
         djm.a(this.i(), this.ay_(), this.n());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return ayz.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cur b(cur $$0, @Nullable cmz $$1) {
      if (this.n instanceof arf && $$0.a(cuu.ua)) {
         cwp.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private ep a(@Nullable cmz $$0) {
      String $$1;
      xp $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = xp.b("Lectern");
      } else {
         $$1 = $$0.af().getString();
         $$2 = $$0.O_();
      }

      evt $$5 = evt.b(this.o);
      return new ep(eo.a, $$5, evs.a, (arf)this.n, 2, $$1, $$2, this.n.o(), $$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cur.a($$1, (vp)$$0.p("Book")).orElse(cur.l), null);
      } else {
         this.g = cur.l;
      }

      this.i = c(this.g);
      this.h = ayz.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b().e()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cur.l);
   }

   @Override
   public cpw createMenu(int $$0, cmy $$1, cmz $$2) {
      return new cra($$0, this.e, this.f);
   }

   @Override
   public xp O_() {
      return xp.c("container.lectern");
   }

   private static int c(cur $$0) {
      cya $$1 = $$0.a(km.J);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         cxz $$2 = $$0.a(km.I);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
