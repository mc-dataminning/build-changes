import javax.annotation.Nullable;

public class dhf extends dgd implements bjc, bjo {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bje e = new bje() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean ai_() {
         return dhf.this.g.b();
      }

      @Override
      public cmh a(int $$0) {
         return $$0 == 0 ? dhf.this.g : cmh.f;
      }

      @Override
      public cmh a(int $$0, int $$1) {
         if ($$0 == 0) {
            cmh $$2 = dhf.this.g.a($$1);
            if (dhf.this.g.b()) {
               dhf.this.l();
            }

            return $$2;
         } else {
            return cmh.f;
         }
      }

      @Override
      public cmh b(int $$0) {
         if ($$0 == 0) {
            cmh $$1 = dhf.this.g;
            dhf.this.g = cmh.f;
            dhf.this.l();
            return $$1;
         } else {
            return cmh.f;
         }
      }

      @Override
      public void a(int $$0, cmh $$1) {
      }

      @Override
      public int ak_() {
         return 1;
      }

      @Override
      public void e() {
         dhf.this.e();
      }

      @Override
      public boolean a(cer $$0) {
         return bje.a(dhf.this, $$0) && dhf.this.f();
      }

      @Override
      public boolean b(int $$0, cmh $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final chu f = new chu() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dhf.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dhf.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cmh g = cmh.f;
   int h;
   private int i;

   public dhf(hv $$0, dip $$1) {
      super(dgf.D, $$0, $$1);
   }

   public cmh c() {
      return this.g;
   }

   public boolean f() {
      return this.g.a(cmk.tT) || this.g.a(cmk.tU);
   }

   public void a(cmh $$0) {
      this.a($$0, null);
   }

   void l() {
      this.h = 0;
      this.i = 0;
      daj.a(null, this.i(), this.aB_(), this.r(), false);
   }

   public void a(cmh $$0, @Nullable cer $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = cod.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = aty.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         daj.a(this.i(), this.aB_(), this.r());
      }
   }

   public int g() {
      return this.h;
   }

   public int k() {
      float $$0 = this.i > 1 ? (float)this.g() / ((float)this.i - 1.0F) : 1.0F;
      return aty.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private cmh b(cmh $$0, @Nullable cer $$1) {
      if (this.o instanceof amp && $$0.a(cmk.tU)) {
         cod.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private ds a(@Nullable cer $$0) {
      String $$1;
      vb $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = vb.b("Lectern");
      } else {
         $$1 = $$0.ad().getString();
         $$2 = $$0.Q_();
      }

      elb $$5 = elb.b(this.p);
      return new ds(dr.a, $$5, ela.a, (amp)this.o, 2, $$1, $$2, this.o.n(), $$0);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cmh.a($$0.p("Book")), null);
      } else {
         this.g = cmh.f;
      }

      this.i = cod.k(this.g);
      this.h = aty.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      if (!this.c().b()) {
         $$0.a("Book", this.c().b(new sj()));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(cmh.f);
   }

   @Override
   public chk createMenu(int $$0, ceq $$1, cer $$2) {
      return new cio($$0, this.e, this.f);
   }

   @Override
   public vb Q_() {
      return vb.c("container.lectern");
   }
}
