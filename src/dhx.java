import javax.annotation.Nullable;

public class dhx extends dgv implements bjs, bke {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bju e = new bju() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean ai_() {
         return dhx.this.g.b();
      }

      @Override
      public cmy a(int $$0) {
         return $$0 == 0 ? dhx.this.g : cmy.f;
      }

      @Override
      public cmy a(int $$0, int $$1) {
         if ($$0 == 0) {
            cmy $$2 = dhx.this.g.a($$1);
            if (dhx.this.g.b()) {
               dhx.this.l();
            }

            return $$2;
         } else {
            return cmy.f;
         }
      }

      @Override
      public cmy b(int $$0) {
         if ($$0 == 0) {
            cmy $$1 = dhx.this.g;
            dhx.this.g = cmy.f;
            dhx.this.l();
            return $$1;
         } else {
            return cmy.f;
         }
      }

      @Override
      public void a(int $$0, cmy $$1) {
      }

      @Override
      public int ak_() {
         return 1;
      }

      @Override
      public void e() {
         dhx.this.e();
      }

      @Override
      public boolean a(cfi $$0) {
         return bju.a(dhx.this, $$0) && dhx.this.f();
      }

      @Override
      public boolean b(int $$0, cmy $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cil f = new cil() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dhx.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dhx.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cmy g = cmy.f;
   int h;
   private int i;

   public dhx(hx $$0, djh $$1) {
      super(dgx.D, $$0, $$1);
   }

   public cmy c() {
      return this.g;
   }

   public boolean f() {
      return this.g.a(cnb.tT) || this.g.a(cnb.tU);
   }

   public void a(cmy $$0) {
      this.a($$0, null);
   }

   void l() {
      this.h = 0;
      this.i = 0;
      dba.a(null, this.i(), this.aB_(), this.r(), false);
   }

   public void a(cmy $$0, @Nullable cfi $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = cov.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = auo.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dba.a(this.i(), this.aB_(), this.r());
      }
   }

   public int g() {
      return this.h;
   }

   public int k() {
      float $$0 = this.i > 1 ? (float)this.g() / ((float)this.i - 1.0F) : 1.0F;
      return auo.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private cmy b(cmy $$0, @Nullable cfi $$1) {
      if (this.o instanceof and && $$0.a(cnb.tU)) {
         cov.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private ds a(@Nullable cfi $$0) {
      String $$1;
      vf $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = vf.b("Lectern");
      } else {
         $$1 = $$0.ad().getString();
         $$2 = $$0.Q_();
      }

      elt $$5 = elt.b(this.p);
      return new ds(dr.a, $$5, els.a, (and)this.o, 2, $$1, $$2, this.o.o(), $$0);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cmy.a($$0.p("Book")), null);
      } else {
         this.g = cmy.f;
      }

      this.i = cov.k(this.g);
      this.h = auo.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      if (!this.c().b()) {
         $$0.a("Book", this.c().b(new sn()));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(cmy.f);
   }

   @Override
   public cib createMenu(int $$0, cfh $$1, cfi $$2) {
      return new cjf($$0, this.e, this.f);
   }

   @Override
   public vf Q_() {
      return vf.c("container.lectern");
   }
}
