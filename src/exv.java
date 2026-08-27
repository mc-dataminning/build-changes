public class exv extends eye {
   private static final tn c = tn.c("options.languageAccuracyWarning").a(n.h);
   private exv.a k;
   final gao l;

   public exv(eym $$0, erb $$1, gao $$2) {
      super($$0, $$1, tn.c("options.language.title"));
      this.l = $$2;
   }

   @Override
   protected void aH_() {
      this.k = new exv.a(this.f);
      this.e(this.k);
      this.d(this.b.M().a(this.b, this.g / 2 - 155, this.h - 38, 150));
      this.d(ess.a(tm.d, $$0 -> this.l()).a(this.g / 2 - 155 + 160, this.h - 38, 150, 20).a());
      super.aH_();
   }

   void l() {
      exv.a.a $$0 = this.k.f();
      if ($$0 != null && !$$0.b.equals(this.l.a())) {
         this.l.a($$0.b);
         this.b.ad = $$0.b;
         this.f.k();
         this.b.ar();
      }

      this.f.a(this.a);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (ewp.a($$0)) {
         exv.a.a $$3 = this.k.f();
         if ($$3 != null) {
            $$3.b();
            this.l();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.k.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      $$0.a(this.i, c, this.g / 2, this.h - 56, -8355712);
   }

   @Override
   public void b(esh $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends eto<exv.a.a> {
      public a(eqx $$0) {
         super($$0, exv.this.g, exv.this.h, 32, exv.this.h - 65 + 4, 18);
         String $$1 = exv.this.l.a();
         exv.this.l.b().forEach(($$1x, $$2) -> {
            exv.a.a $$3 = new exv.a.a($$1x, $$2);
            this.b($$3);
            if ($$1.equals($$1x)) {
               this.a($$3);
            }
         });
         if (this.f() != null) {
            this.e(this.f());
         }
      }

      @Override
      protected int c() {
         return super.c() + 20;
      }

      @Override
      public int b() {
         return super.b() + 50;
      }

      public class a extends eto.a<exv.a.a> {
         final String b;
         private final tn c;
         private long d;

         public a(String $$1, gan $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(exv.this.i, this.c, a.this.e / 2, $$2 + 1, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ac.b() - this.d < 250L) {
               exv.this.l();
            }

            this.d = ac.b();
            return true;
         }

         void b() {
            a.this.a(this);
         }

         @Override
         public tn a() {
            return tn.a("narrator.select", this.c);
         }
      }
   }
}
