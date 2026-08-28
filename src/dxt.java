import javax.annotation.Nullable;

public class dxt extends dwn implements btp, bua {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final btr e = new btr() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dxt.this.g.f();
      }

      @Override
      public cys a(int $$0) {
         return $$0 == 0 ? dxt.this.g : cys.k;
      }

      @Override
      public cys a(int $$0, int $$1) {
         if ($$0 == 0) {
            cys $$2 = dxt.this.g.a($$1);
            if (dxt.this.g.f()) {
               dxt.this.s();
            }

            return $$2;
         } else {
            return cys.k;
         }
      }

      @Override
      public cys b(int $$0) {
         if ($$0 == 0) {
            cys $$1 = dxt.this.g;
            dxt.this.g = cys.k;
            dxt.this.s();
            return $$1;
         } else {
            return cys.k;
         }
      }

      @Override
      public void a(int $$0, cys $$1) {
      }

      @Override
      public int aj_() {
         return 1;
      }

      @Override
      public void e() {
         dxt.this.e();
      }

      @Override
      public boolean a(cqs $$0) {
         return btr.a(dxt.this, $$0) && dxt.this.f();
      }

      @Override
      public boolean b(int $$0, cys $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cuw f = new cuw() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dxt.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dxt.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cys g = cys.k;
   int h;
   private int i;

   public dxt(iu $$0, dzo $$1) {
      super(dwp.E, $$0, $$1);
   }

   public cys c() {
      return this.g;
   }

   public boolean f() {
      return this.g.c(kj.U) || this.g.c(kj.V);
   }

   public void b(cys $$0) {
      this.a($$0, null);
   }

   void s() {
      this.h = 0;
      this.i = 0;
      dqj.a(null, this.i(), this.aw_(), this.m(), false);
   }

   public void a(cys $$0, @Nullable cqs $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = azk.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dqj.a(this.i(), this.aw_(), this.m());
      }
   }

   public int j() {
      return this.h;
   }

   public int k() {
      float $$0 = this.i > 1 ? (float)this.j() / ((float)this.i - 1.0F) : 1.0F;
      return azk.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private cys b(cys $$0, @Nullable cqs $$1) {
      if (this.n instanceof aro $$2) {
         dcc.a($$0, this.a($$1, $$2), $$1);
      }

      return $$0;
   }

   private ei a(@Nullable cqs $$0, aro $$1) {
      String $$2;
      ww $$3;
      if ($$0 == null) {
         $$2 = "Lectern";
         $$3 = ww.b("Lectern");
      } else {
         $$2 = $$0.al().getString();
         $$3 = $$0.m_();
      }

      fdw $$6 = fdw.b(this.o);
      return new ei(eh.a, $$6, fdv.a, $$1, 2, $$2, $$3, $$1.p(), $$0);
   }

   @Override
   protected void a(tx $$0, jg.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cys.a($$1, (uu)$$0.p("Book")).orElse(cys.k), null);
      } else {
         this.g = cys.k;
      }

      this.i = c(this.g);
      this.h = azk.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(tx $$0, jg.a $$1) {
      super.b($$0, $$1);
      if (!this.c().f()) {
         $$0.a("Book", this.c().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cys.k);
   }

   @Override
   public void a(iu $$0, dzo $$1) {
      if ($$1.c(dqj.d) && this.n != null) {
         ja $$2 = $$1.c(dqj.b);
         cys $$3 = this.c().v();
         float $$4 = 0.25F * (float)$$2.j();
         float $$5 = 0.25F * (float)$$2.l();
         cmx $$6 = new cmx(this.n, (double)$$0.u() + 0.5 + (double)$$4, (double)($$0.v() + 1), (double)$$0.w() + 0.5 + (double)$$5, $$3);
         $$6.j();
         this.n.b($$6);
      }
   }

   @Override
   public cuk createMenu(int $$0, cqr $$1, cqs $$2) {
      return new cvq($$0, this.e, this.f);
   }

   @Override
   public ww m_() {
      return ww.c("container.lectern");
   }

   private static int c(cys $$0) {
      dcc $$1 = $$0.a(kj.V);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         dcb $$2 = $$0.a(kj.U);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
