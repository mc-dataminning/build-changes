import javax.annotation.Nullable;

public class dhw extends dgu implements bjr, bkd {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bjt e = new bjt() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean ai_() {
         return dhw.this.g.b();
      }

      @Override
      public cmx a(int $$0) {
         return $$0 == 0 ? dhw.this.g : cmx.f;
      }

      @Override
      public cmx a(int $$0, int $$1) {
         if ($$0 == 0) {
            cmx $$2 = dhw.this.g.a($$1);
            if (dhw.this.g.b()) {
               dhw.this.l();
            }

            return $$2;
         } else {
            return cmx.f;
         }
      }

      @Override
      public cmx b(int $$0) {
         if ($$0 == 0) {
            cmx $$1 = dhw.this.g;
            dhw.this.g = cmx.f;
            dhw.this.l();
            return $$1;
         } else {
            return cmx.f;
         }
      }

      @Override
      public void a(int $$0, cmx $$1) {
      }

      @Override
      public int ak_() {
         return 1;
      }

      @Override
      public void e() {
         dhw.this.e();
      }

      @Override
      public boolean a(cfh $$0) {
         return bjt.a(dhw.this, $$0) && dhw.this.f();
      }

      @Override
      public boolean b(int $$0, cmx $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cik f = new cik() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dhw.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dhw.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cmx g = cmx.f;
   int h;
   private int i;

   public dhw(hx $$0, djg $$1) {
      super(dgw.D, $$0, $$1);
   }

   public cmx c() {
      return this.g;
   }

   public boolean f() {
      return this.g.a(cna.tT) || this.g.a(cna.tU);
   }

   public void a(cmx $$0) {
      this.a($$0, null);
   }

   void l() {
      this.h = 0;
      this.i = 0;
      daz.a(null, this.i(), this.aB_(), this.r(), false);
   }

   public void a(cmx $$0, @Nullable cfh $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = cou.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = aun.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         daz.a(this.i(), this.aB_(), this.r());
      }
   }

   public int g() {
      return this.h;
   }

   public int k() {
      float $$0 = this.i > 1 ? (float)this.g() / ((float)this.i - 1.0F) : 1.0F;
      return aun.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private cmx b(cmx $$0, @Nullable cfh $$1) {
      if (this.o instanceof and && $$0.a(cna.tU)) {
         cou.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private ds a(@Nullable cfh $$0) {
      String $$1;
      vf $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = vf.b("Lectern");
      } else {
         $$1 = $$0.ad().getString();
         $$2 = $$0.Q_();
      }

      els $$5 = els.b(this.p);
      return new ds(dr.a, $$5, elr.a, (and)this.o, 2, $$1, $$2, this.o.o(), $$0);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cmx.a($$0.p("Book")), null);
      } else {
         this.g = cmx.f;
      }

      this.i = cou.k(this.g);
      this.h = aun.a($$0.h("Page"), 0, this.i - 1);
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
      this.a(cmx.f);
   }

   @Override
   public cia createMenu(int $$0, cfg $$1, cfh $$2) {
      return new cje($$0, this.e, this.f);
   }

   @Override
   public vf Q_() {
      return vf.c("container.lectern");
   }
}
