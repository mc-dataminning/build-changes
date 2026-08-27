import javax.annotation.Nullable;

public class dhq extends dgo implements bjm, bjy {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bjo e = new bjo() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean ai_() {
         return dhq.this.g.b();
      }

      @Override
      public cmr a(int $$0) {
         return $$0 == 0 ? dhq.this.g : cmr.f;
      }

      @Override
      public cmr a(int $$0, int $$1) {
         if ($$0 == 0) {
            cmr $$2 = dhq.this.g.a($$1);
            if (dhq.this.g.b()) {
               dhq.this.l();
            }

            return $$2;
         } else {
            return cmr.f;
         }
      }

      @Override
      public cmr b(int $$0) {
         if ($$0 == 0) {
            cmr $$1 = dhq.this.g;
            dhq.this.g = cmr.f;
            dhq.this.l();
            return $$1;
         } else {
            return cmr.f;
         }
      }

      @Override
      public void a(int $$0, cmr $$1) {
      }

      @Override
      public int ak_() {
         return 1;
      }

      @Override
      public void e() {
         dhq.this.e();
      }

      @Override
      public boolean a(cfb $$0) {
         return bjo.a(dhq.this, $$0) && dhq.this.f();
      }

      @Override
      public boolean b(int $$0, cmr $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cie f = new cie() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dhq.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dhq.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cmr g = cmr.f;
   int h;
   private int i;

   public dhq(hx $$0, dja $$1) {
      super(dgq.D, $$0, $$1);
   }

   public cmr c() {
      return this.g;
   }

   public boolean f() {
      return this.g.a(cmu.tT) || this.g.a(cmu.tU);
   }

   public void a(cmr $$0) {
      this.a($$0, null);
   }

   void l() {
      this.h = 0;
      this.i = 0;
      dat.a(null, this.i(), this.aB_(), this.r(), false);
   }

   public void a(cmr $$0, @Nullable cfb $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = coo.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = aui.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dat.a(this.i(), this.aB_(), this.r());
      }
   }

   public int g() {
      return this.h;
   }

   public int k() {
      float $$0 = this.i > 1 ? (float)this.g() / ((float)this.i - 1.0F) : 1.0F;
      return aui.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private cmr b(cmr $$0, @Nullable cfb $$1) {
      if (this.o instanceof amz && $$0.a(cmu.tU)) {
         coo.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private ds a(@Nullable cfb $$0) {
      String $$1;
      vd $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = vd.b("Lectern");
      } else {
         $$1 = $$0.ad().getString();
         $$2 = $$0.Q_();
      }

      elm $$5 = elm.b(this.p);
      return new ds(dr.a, $$5, ell.a, (amz)this.o, 2, $$1, $$2, this.o.o(), $$0);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cmr.a($$0.p("Book")), null);
      } else {
         this.g = cmr.f;
      }

      this.i = coo.k(this.g);
      this.h = aui.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      if (!this.c().b()) {
         $$0.a("Book", this.c().b(new sl()));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(cmr.f);
   }

   @Override
   public chu createMenu(int $$0, cfa $$1, cfb $$2) {
      return new ciy($$0, this.e, this.f);
   }

   @Override
   public vd Q_() {
      return vd.c("container.lectern");
   }
}
