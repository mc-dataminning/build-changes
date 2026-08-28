import javax.annotation.Nullable;

public class dyx extends dxr implements btx, bui {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final btz e = new btz() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dyx.this.g.f();
      }

      @Override
      public czn a(int $$0) {
         return $$0 == 0 ? dyx.this.g : czn.k;
      }

      @Override
      public czn a(int $$0, int $$1) {
         if ($$0 == 0) {
            czn $$2 = dyx.this.g.a($$1);
            if (dyx.this.g.f()) {
               dyx.this.s();
            }

            return $$2;
         } else {
            return czn.k;
         }
      }

      @Override
      public czn b(int $$0) {
         if ($$0 == 0) {
            czn $$1 = dyx.this.g;
            dyx.this.g = czn.k;
            dyx.this.s();
            return $$1;
         } else {
            return czn.k;
         }
      }

      @Override
      public void a(int $$0, czn $$1) {
      }

      @Override
      public int ak_() {
         return 1;
      }

      @Override
      public void e() {
         dyx.this.e();
      }

      @Override
      public boolean a(crm $$0) {
         return btz.a(dyx.this, $$0) && dyx.this.f();
      }

      @Override
      public boolean b(int $$0, czn $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cvr f = new cvr() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dyx.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dyx.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   czn g = czn.k;
   int h;
   private int i;

   public dyx(iv $$0, eat $$1) {
      super(dxt.E, $$0, $$1);
   }

   public czn c() {
      return this.g;
   }

   public boolean f() {
      return this.g.c(kk.U) || this.g.c(kk.V);
   }

   public void b(czn $$0) {
      this.a($$0, null);
   }

   void s() {
      this.h = 0;
      this.i = 0;
      dri.a(null, this.i(), this.ax_(), this.m(), false);
   }

   public void a(czn $$0, @Nullable crm $$1) {
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
         dri.a(this.i(), this.ax_(), this.m());
      }
   }

   public int j() {
      return this.h;
   }

   public int k() {
      float $$0 = this.i > 1 ? (float)this.j() / ((float)this.i - 1.0F) : 1.0F;
      return azm.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private czn b(czn $$0, @Nullable crm $$1) {
      if (this.n instanceof arq $$2) {
         dcx.a($$0, this.a($$1, $$2), $$1);
      }

      return $$0;
   }

   private ej a(@Nullable crm $$0, arq $$1) {
      String $$2;
      wy $$3;
      if ($$0 == null) {
         $$2 = "Lectern";
         $$3 = wy.b("Lectern");
      } else {
         $$2 = $$0.ai().getString();
         $$3 = $$0.m_();
      }

      ffc $$6 = ffc.b(this.o);
      return new ej(ei.a, $$6, ffb.a, $$1, 2, $$2, $$3, $$1.p(), $$0);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      ale<uw> $$2 = $$1.a(un.a);
      this.g = $$0.<czn>a("Book", czn.b, $$2).map($$0x -> this.b($$0x, null)).orElse(czn.k);
      this.i = c(this.g);
      this.h = azm.a($$0.f("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      if (!this.c().f()) {
         ale<uw> $$2 = $$1.a(un.a);
         $$0.a("Book", czn.b, $$2, this.c());
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(czn.k);
   }

   @Override
   public void a(iv $$0, eat $$1) {
      if ($$1.c(dri.d) && this.n != null) {
         jb $$2 = $$1.c(dri.b);
         czn $$3 = this.c().v();
         float $$4 = 0.25F * (float)$$2.j();
         float $$5 = 0.25F * (float)$$2.l();
         cnr $$6 = new cnr(this.n, (double)$$0.u() + 0.5 + (double)$$4, (double)($$0.v() + 1), (double)$$0.w() + 0.5 + (double)$$5, $$3);
         $$6.j();
         this.n.b($$6);
      }
   }

   @Override
   public cvf createMenu(int $$0, crl $$1, crm $$2) {
      return new cwl($$0, this.e, this.f);
   }

   @Override
   public wy m_() {
      return wy.c("container.lectern");
   }

   private static int c(czn $$0) {
      dcx $$1 = $$0.a(kk.V);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         dcw $$2 = $$0.a(kk.U);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
