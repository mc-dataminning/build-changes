import javax.annotation.Nullable;

public class dyd extends dwx implements bts, bud {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final btu e = new btu() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dyd.this.g.f();
      }

      @Override
      public cyy a(int $$0) {
         return $$0 == 0 ? dyd.this.g : cyy.k;
      }

      @Override
      public cyy a(int $$0, int $$1) {
         if ($$0 == 0) {
            cyy $$2 = dyd.this.g.a($$1);
            if (dyd.this.g.f()) {
               dyd.this.s();
            }

            return $$2;
         } else {
            return cyy.k;
         }
      }

      @Override
      public cyy b(int $$0) {
         if ($$0 == 0) {
            cyy $$1 = dyd.this.g;
            dyd.this.g = cyy.k;
            dyd.this.s();
            return $$1;
         } else {
            return cyy.k;
         }
      }

      @Override
      public void a(int $$0, cyy $$1) {
      }

      @Override
      public int aj_() {
         return 1;
      }

      @Override
      public void e() {
         dyd.this.e();
      }

      @Override
      public boolean a(cqy $$0) {
         return btu.a(dyd.this, $$0) && dyd.this.f();
      }

      @Override
      public boolean b(int $$0, cyy $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cvc f = new cvc() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dyd.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dyd.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cyy g = cyy.k;
   int h;
   private int i;

   public dyd(iu $$0, dzz $$1) {
      super(dwz.E, $$0, $$1);
   }

   public cyy c() {
      return this.g;
   }

   public boolean f() {
      return this.g.c(kj.U) || this.g.c(kj.V);
   }

   public void b(cyy $$0) {
      this.a($$0, null);
   }

   void s() {
      this.h = 0;
      this.i = 0;
      dqq.a(null, this.i(), this.aw_(), this.m(), false);
   }

   public void a(cyy $$0, @Nullable cqy $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = azm.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dqq.a(this.i(), this.aw_(), this.m());
      }
   }

   public int j() {
      return this.h;
   }

   public int k() {
      float $$0 = this.i > 1 ? (float)this.j() / ((float)this.i - 1.0F) : 1.0F;
      return azm.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private cyy b(cyy $$0, @Nullable cqy $$1) {
      if (this.n instanceof arq $$2) {
         dci.a($$0, this.a($$1, $$2), $$1);
      }

      return $$0;
   }

   private ei a(@Nullable cqy $$0, arq $$1) {
      String $$2;
      wy $$3;
      if ($$0 == null) {
         $$2 = "Lectern";
         $$3 = wy.b("Lectern");
      } else {
         $$2 = $$0.al().getString();
         $$3 = $$0.m_();
      }

      fei $$6 = fei.b(this.o);
      return new ei(eh.a, $$6, feh.a, $$1, 2, $$2, $$3, $$1.p(), $$0);
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cyy.a($$1, (uw)$$0.p("Book")).orElse(cyy.k), null);
      } else {
         this.g = cyy.k;
      }

      this.i = c(this.g);
      this.h = azm.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      if (!this.c().f()) {
         $$0.a("Book", this.c().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cyy.k);
   }

   @Override
   public void a(iu $$0, dzz $$1) {
      if ($$1.c(dqq.d) && this.n != null) {
         ja $$2 = $$1.c(dqq.b);
         cyy $$3 = this.c().v();
         float $$4 = 0.25F * (float)$$2.j();
         float $$5 = 0.25F * (float)$$2.l();
         cnd $$6 = new cnd(this.n, (double)$$0.u() + 0.5 + (double)$$4, (double)($$0.v() + 1), (double)$$0.w() + 0.5 + (double)$$5, $$3);
         $$6.j();
         this.n.b($$6);
      }
   }

   @Override
   public cuq createMenu(int $$0, cqx $$1, cqy $$2) {
      return new cvw($$0, this.e, this.f);
   }

   @Override
   public wy m_() {
      return wy.c("container.lectern");
   }

   private static int c(cyy $$0) {
      dci $$1 = $$0.a(kj.V);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         dch $$2 = $$0.a(kj.U);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
