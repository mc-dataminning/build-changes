import javax.annotation.Nullable;

public class dqh extends dpf implements bqj, bqw {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bql e = new bql() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dqh.this.g.e();
      }

      @Override
      public cun a(int $$0) {
         return $$0 == 0 ? dqh.this.g : cun.l;
      }

      @Override
      public cun a(int $$0, int $$1) {
         if ($$0 == 0) {
            cun $$2 = dqh.this.g.a($$1);
            if (dqh.this.g.e()) {
               dqh.this.k();
            }

            return $$2;
         } else {
            return cun.l;
         }
      }

      @Override
      public cun b(int $$0) {
         if ($$0 == 0) {
            cun $$1 = dqh.this.g;
            dqh.this.g = cun.l;
            dqh.this.k();
            return $$1;
         } else {
            return cun.l;
         }
      }

      @Override
      public void a(int $$0, cun $$1) {
      }

      @Override
      public int ai_() {
         return 1;
      }

      @Override
      public void e() {
         dqh.this.e();
      }

      @Override
      public boolean a(cmv $$0) {
         return bql.a(dqh.this, $$0) && dqh.this.c();
      }

      @Override
      public boolean b(int $$0, cun $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cqc f = new cqc() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dqh.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dqh.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cun g = cun.l;
   int h;
   private int i;

   public dqh(iz $$0, dsa $$1) {
      super(dph.D, $$0, $$1);
   }

   public cun b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(cuq.tZ) || this.g.a(cuq.ua);
   }

   public void b(cun $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dji.a(null, this.i(), this.az_(), this.n(), false);
   }

   public void a(cun $$0, @Nullable cmv $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = ayx.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dji.a(this.i(), this.az_(), this.n());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return ayx.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cun b(cun $$0, @Nullable cmv $$1) {
      if (this.n instanceof are && $$0.a(cuq.ua)) {
         cwl.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private ep a(@Nullable cmv $$0) {
      String $$1;
      xo $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = xo.b("Lectern");
      } else {
         $$1 = $$0.af().getString();
         $$2 = $$0.O_();
      }

      evp $$5 = evp.b(this.o);
      return new ep(eo.a, $$5, evo.a, (are)this.n, 2, $$1, $$2, this.n.o(), $$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cun.a($$1, (vo)$$0.p("Book")).orElse(cun.l), null);
      } else {
         this.g = cun.l;
      }

      this.i = c(this.g);
      this.h = ayx.a($$0.h("Page"), 0, this.i - 1);
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
      this.b(cun.l);
   }

   @Override
   public cps createMenu(int $$0, cmu $$1, cmv $$2) {
      return new cqw($$0, this.e, this.f);
   }

   @Override
   public xo O_() {
      return xo.c("container.lectern");
   }

   private static int c(cun $$0) {
      cxw $$1 = $$0.a(km.I);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         cxv $$2 = $$0.a(km.H);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
