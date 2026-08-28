import javax.annotation.Nullable;

public class dwr extends dvl implements bth, bts {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final btj e = new btj() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dwr.this.g.f();
      }

      @Override
      public cxy a(int $$0) {
         return $$0 == 0 ? dwr.this.g : cxy.k;
      }

      @Override
      public cxy a(int $$0, int $$1) {
         if ($$0 == 0) {
            cxy $$2 = dwr.this.g.a($$1);
            if (dwr.this.g.f()) {
               dwr.this.s();
            }

            return $$2;
         } else {
            return cxy.k;
         }
      }

      @Override
      public cxy b(int $$0) {
         if ($$0 == 0) {
            cxy $$1 = dwr.this.g;
            dwr.this.g = cxy.k;
            dwr.this.s();
            return $$1;
         } else {
            return cxy.k;
         }
      }

      @Override
      public void a(int $$0, cxy $$1) {
      }

      @Override
      public int aj_() {
         return 1;
      }

      @Override
      public void e() {
         dwr.this.e();
      }

      @Override
      public boolean a(cqi $$0) {
         return btj.a(dwr.this, $$0) && dwr.this.f();
      }

      @Override
      public boolean b(int $$0, cxy $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final ctz f = new ctz() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dwr.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dwr.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cxy g = cxy.k;
   int h;
   private int i;

   public dwr(jj $$0, dym $$1) {
      super(dvn.E, $$0, $$1);
   }

   public cxy c() {
      return this.g;
   }

   public boolean f() {
      return this.g.c(kx.U) || this.g.c(kx.V);
   }

   public void b(cxy $$0) {
      this.a($$0, null);
   }

   void s() {
      this.h = 0;
      this.i = 0;
      dpj.a(null, this.i(), this.aw_(), this.m(), false);
   }

   public void a(cxy $$0, @Nullable cqi $$1) {
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
         dpj.a(this.i(), this.aw_(), this.m());
      }
   }

   public int j() {
      return this.h;
   }

   public int k() {
      float $$0 = this.i > 1 ? (float)this.j() / ((float)this.i - 1.0F) : 1.0F;
      return azk.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private cxy b(cxy $$0, @Nullable cqi $$1) {
      if (this.n instanceof arn $$2) {
         dbe.a($$0, this.a($$1, $$2), $$1);
      }

      return $$0;
   }

   private ex a(@Nullable cqi $$0, arn $$1) {
      String $$2;
      wv $$3;
      if ($$0 == null) {
         $$2 = "Lectern";
         $$3 = wv.b("Lectern");
      } else {
         $$2 = $$0.al().getString();
         $$3 = $$0.m_();
      }

      fcu $$6 = fcu.b(this.o);
      return new ex(ew.a, $$6, fct.a, $$1, 2, $$2, $$3, $$1.p(), $$0);
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cxy.a($$1, (ut)$$0.p("Book")).orElse(cxy.k), null);
      } else {
         this.g = cxy.k;
      }

      this.i = c(this.g);
      this.h = azk.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      if (!this.c().f()) {
         $$0.a("Book", this.c().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cxy.k);
   }

   @Override
   public void a(jj $$0, dym $$1) {
      if ($$1.c(dpj.d) && this.n != null) {
         jo $$2 = $$1.c(dpj.b);
         cxy $$3 = this.c().v();
         float $$4 = 0.25F * (float)$$2.j();
         float $$5 = 0.25F * (float)$$2.l();
         cmn $$6 = new cmn(this.n, (double)$$0.u() + 0.5 + (double)$$4, (double)($$0.v() + 1), (double)$$0.w() + 0.5 + (double)$$5, $$3);
         $$6.j();
         this.n.b($$6);
      }
   }

   @Override
   public ctn createMenu(int $$0, cqh $$1, cqi $$2) {
      return new cut($$0, this.e, this.f);
   }

   @Override
   public wv m_() {
      return wv.c("container.lectern");
   }

   private static int c(cxy $$0) {
      dbe $$1 = $$0.a(kx.V);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         dbd $$2 = $$0.a(kx.U);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
