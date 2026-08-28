import javax.annotation.Nullable;

public class dzu extends dyo implements but, bve {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final buv e = new buv() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dzu.this.g.f();
      }

      @Override
      public dak a(int $$0) {
         return $$0 == 0 ? dzu.this.g : dak.l;
      }

      @Override
      public dak a(int $$0, int $$1) {
         if ($$0 == 0) {
            dak $$2 = dzu.this.g.a($$1);
            if (dzu.this.g.f()) {
               dzu.this.s();
            }

            return $$2;
         } else {
            return dak.l;
         }
      }

      @Override
      public dak b(int $$0) {
         if ($$0 == 0) {
            dak $$1 = dzu.this.g;
            dzu.this.g = dak.l;
            dzu.this.s();
            return $$1;
         } else {
            return dak.l;
         }
      }

      @Override
      public void a(int $$0, dak $$1) {
      }

      @Override
      public int ak_() {
         return 1;
      }

      @Override
      public void e() {
         dzu.this.e();
      }

      @Override
      public boolean a(csi $$0) {
         return buv.a(dzu.this, $$0) && dzu.this.f();
      }

      @Override
      public boolean b(int $$0, dak $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cwn f = new cwn() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dzu.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dzu.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   dak g = dak.l;
   int h;
   private int i;

   public dzu(iw $$0, ebq $$1) {
      super(dyq.E, $$0, $$1);
   }

   public dak c() {
      return this.g;
   }

   public boolean f() {
      return this.g.c(kl.U) || this.g.c(kl.V);
   }

   public void b(dak $$0) {
      this.a($$0, null);
   }

   void s() {
      this.h = 0;
      this.i = 0;
      dsf.a(null, this.i(), this.ax_(), this.m(), false);
   }

   public void a(dak $$0, @Nullable csi $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = azz.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dsf.a(this.i(), this.ax_(), this.m());
      }
   }

   public int j() {
      return this.h;
   }

   public int k() {
      float $$0 = this.i > 1 ? (float)this.j() / ((float)this.i - 1.0F) : 1.0F;
      return azz.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private dak b(dak $$0, @Nullable csi $$1) {
      if (this.n instanceof asb $$2) {
         ddu.a($$0, this.a($$1, $$2), $$1);
      }

      return $$0;
   }

   private ek a(@Nullable csi $$0, asb $$1) {
      String $$2;
      xg $$3;
      if ($$0 == null) {
         $$2 = "Lectern";
         $$3 = xg.b("Lectern");
      } else {
         $$2 = $$0.ah().getString();
         $$3 = $$0.P_();
      }

      fgc $$6 = fgc.b(this.o);
      return new ek(ej.a, $$6, fgb.a, $$1, 2, $$2, $$3, $$1.p(), $$0);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      alp<va> $$2 = $$1.a(uo.a);
      this.g = $$0.<dak>a("Book", dak.b, $$2).map($$0x -> this.b($$0x, null)).orElse(dak.l);
      this.i = c(this.g);
      this.h = azz.a($$0.b("Page", 0), 0, this.i - 1);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      if (!this.c().f()) {
         alp<va> $$2 = $$1.a(uo.a);
         $$0.a("Book", dak.b, $$2, this.c());
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(dak.l);
   }

   @Override
   public void a(iw $$0, ebq $$1) {
      if ($$1.c(dsf.d) && this.n != null) {
         jc $$2 = $$1.c(dsf.b);
         dak $$3 = this.c().v();
         float $$4 = 0.25F * (float)$$2.j();
         float $$5 = 0.25F * (float)$$2.l();
         coo $$6 = new coo(this.n, (double)$$0.u() + 0.5 + (double)$$4, (double)($$0.v() + 1), (double)$$0.w() + 0.5 + (double)$$5, $$3);
         $$6.i();
         this.n.b($$6);
      }
   }

   @Override
   public cwb createMenu(int $$0, csh $$1, csi $$2) {
      return new cxh($$0, this.e, this.f);
   }

   @Override
   public xg P_() {
      return xg.c("container.lectern");
   }

   private static int c(dak $$0) {
      ddu $$1 = $$0.a(kl.V);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         ddt $$2 = $$0.a(kl.U);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
