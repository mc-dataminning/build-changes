import javax.annotation.Nullable;

public class dif extends dhd implements bjt, bkg {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bjv e = new bjv() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean aj_() {
         return dif.this.g.b();
      }

      @Override
      public cng a(int $$0) {
         return $$0 == 0 ? dif.this.g : cng.f;
      }

      @Override
      public cng a(int $$0, int $$1) {
         if ($$0 == 0) {
            cng $$2 = dif.this.g.a($$1);
            if (dif.this.g.b()) {
               dif.this.l();
            }

            return $$2;
         } else {
            return cng.f;
         }
      }

      @Override
      public cng b(int $$0) {
         if ($$0 == 0) {
            cng $$1 = dif.this.g;
            dif.this.g = cng.f;
            dif.this.l();
            return $$1;
         } else {
            return cng.f;
         }
      }

      @Override
      public void a(int $$0, cng $$1) {
      }

      @Override
      public int al_() {
         return 1;
      }

      @Override
      public void e() {
         dif.this.e();
      }

      @Override
      public boolean a(cfq $$0) {
         return bjv.a(dif.this, $$0) && dif.this.f();
      }

      @Override
      public boolean b(int $$0, cng $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cit f = new cit() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dif.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dif.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cng g = cng.f;
   int h;
   private int i;

   public dif(hx $$0, djp $$1) {
      super(dhf.D, $$0, $$1);
   }

   public cng c() {
      return this.g;
   }

   public boolean f() {
      return this.g.a(cnj.tW) || this.g.a(cnj.tX);
   }

   public void a(cng $$0) {
      this.a($$0, null);
   }

   void l() {
      this.h = 0;
      this.i = 0;
      dbi.a(null, this.i(), this.aE_(), this.r(), false);
   }

   public void a(cng $$0, @Nullable cfq $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = cpd.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = aup.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dbi.a(this.i(), this.aE_(), this.r());
      }
   }

   public int g() {
      return this.h;
   }

   public int k() {
      float $$0 = this.i > 1 ? (float)this.g() / ((float)this.i - 1.0F) : 1.0F;
      return aup.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private cng b(cng $$0, @Nullable cfq $$1) {
      if (this.o instanceof ane && $$0.a(cnj.tX)) {
         cpd.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private ds a(@Nullable cfq $$0) {
      String $$1;
      vg $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = vg.b("Lectern");
      } else {
         $$1 = $$0.ad().getString();
         $$2 = $$0.Q_();
      }

      emc $$5 = emc.b(this.p);
      return new ds(dr.a, $$5, emb.a, (ane)this.o, 2, $$1, $$2, this.o.o(), $$0);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cng.a($$0.p("Book")), null);
      } else {
         this.g = cng.f;
      }

      this.i = cpd.k(this.g);
      this.h = aup.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      if (!this.c().b()) {
         $$0.a("Book", this.c().b(new so()));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(cng.f);
   }

   @Override
   public cij createMenu(int $$0, cfp $$1, cfq $$2) {
      return new cjn($$0, this.e, this.f);
   }

   @Override
   public vg Q_() {
      return vg.c("container.lectern");
   }
}
