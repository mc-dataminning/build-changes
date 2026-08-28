import javax.annotation.Nullable;

public class dyl extends dxf implements btu, buf {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final btw e = new btw() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dyl.this.g.f();
      }

      @Override
      public czd a(int $$0) {
         return $$0 == 0 ? dyl.this.g : czd.k;
      }

      @Override
      public czd a(int $$0, int $$1) {
         if ($$0 == 0) {
            czd $$2 = dyl.this.g.a($$1);
            if (dyl.this.g.f()) {
               dyl.this.s();
            }

            return $$2;
         } else {
            return czd.k;
         }
      }

      @Override
      public czd b(int $$0) {
         if ($$0 == 0) {
            czd $$1 = dyl.this.g;
            dyl.this.g = czd.k;
            dyl.this.s();
            return $$1;
         } else {
            return czd.k;
         }
      }

      @Override
      public void a(int $$0, czd $$1) {
      }

      @Override
      public int ak_() {
         return 1;
      }

      @Override
      public void e() {
         dyl.this.e();
      }

      @Override
      public boolean a(crc $$0) {
         return btw.a(dyl.this, $$0) && dyl.this.f();
      }

      @Override
      public boolean b(int $$0, czd $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cvh f = new cvh() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dyl.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dyl.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   czd g = czd.k;
   int h;
   private int i;

   public dyl(iu $$0, eah $$1) {
      super(dxh.E, $$0, $$1);
   }

   public czd c() {
      return this.g;
   }

   public boolean f() {
      return this.g.c(kj.U) || this.g.c(kj.V);
   }

   public void b(czd $$0) {
      this.a($$0, null);
   }

   void s() {
      this.h = 0;
      this.i = 0;
      dqw.a(null, this.i(), this.ax_(), this.m(), false);
   }

   public void a(czd $$0, @Nullable crc $$1) {
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
         dqw.a(this.i(), this.ax_(), this.m());
      }
   }

   public int j() {
      return this.h;
   }

   public int k() {
      float $$0 = this.i > 1 ? (float)this.j() / ((float)this.i - 1.0F) : 1.0F;
      return azm.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private czd b(czd $$0, @Nullable crc $$1) {
      if (this.n instanceof arq $$2) {
         dcn.a($$0, this.a($$1, $$2), $$1);
      }

      return $$0;
   }

   private ei a(@Nullable crc $$0, arq $$1) {
      String $$2;
      wy $$3;
      if ($$0 == null) {
         $$2 = "Lectern";
         $$3 = wy.b("Lectern");
      } else {
         $$2 = $$0.al().getString();
         $$3 = $$0.m_();
      }

      feq $$6 = feq.b(this.o);
      return new ei(eh.a, $$6, fep.a, $$1, 2, $$2, $$3, $$1.p(), $$0);
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(czd.a($$1, (uw)$$0.p("Book")).orElse(czd.k), null);
      } else {
         this.g = czd.k;
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
      this.b(czd.k);
   }

   @Override
   public void a(iu $$0, eah $$1) {
      if ($$1.c(dqw.d) && this.n != null) {
         ja $$2 = $$1.c(dqw.b);
         czd $$3 = this.c().v();
         float $$4 = 0.25F * (float)$$2.j();
         float $$5 = 0.25F * (float)$$2.l();
         cnh $$6 = new cnh(this.n, (double)$$0.u() + 0.5 + (double)$$4, (double)($$0.v() + 1), (double)$$0.w() + 0.5 + (double)$$5, $$3);
         $$6.j();
         this.n.b($$6);
      }
   }

   @Override
   public cuv createMenu(int $$0, crb $$1, crc $$2) {
      return new cwb($$0, this.e, this.f);
   }

   @Override
   public wy m_() {
      return wy.c("container.lectern");
   }

   private static int c(czd $$0) {
      dcn $$1 = $$0.a(kj.V);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         dcm $$2 = $$0.a(kj.U);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
