public class fgo extends fgx {
   private static final vu c = vu.c("options.languageAccuracyWarning").a(n.h);
   private fgo.a k;
   final gkg l;

   public fgo(fhf $$0, ezk $$1, gkg $$2) {
      super($$0, $$1, vu.c("options.language.title"));
      this.l = $$2;
   }

   @Override
   protected void aO_() {
      this.k = this.c(new fgo.a(this.f));
      this.c(fbg.a(vu.c("options.font"), $$0 -> this.f.a(new fgk(this, this.b))).a(this.g / 2 - 155, this.h - 38, 150, 20).a());
      this.c(fbg.a(vt.d, $$0 -> this.o()).a(this.g / 2 - 155 + 160, this.h - 38, 150, 20).a());
   }

   void o() {
      fgo.a.a $$0 = this.k.i();
      if ($$0 != null && !$$0.b.equals(this.l.a())) {
         this.l.a($$0.b);
         this.b.ad = $$0.b;
         this.f.l();
         this.b.at();
      }

      this.f.a(this.a);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (ffh.a($$0)) {
         fgo.a.a $$3 = this.k.i();
         if ($$3 != null) {
            $$3.b();
            this.o();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      $$0.a(this.i, c, this.g / 2, this.h - 56, -8355712);
   }

   @Override
   public void b(fat $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends fcc<fgo.a.a> {
      public a(ezg $$0) {
         super($$0, fgo.this.g, fgo.this.h - 93, 32, 18);
         String $$1 = fgo.this.l.a();
         fgo.this.l.b().forEach(($$1x, $$2) -> {
            fgo.a.a $$3 = new fgo.a.a($$1x, $$2);
            this.b($$3);
            if ($$1.equals($$1x)) {
               this.a($$3);
            }
         });
         if (this.i() != null) {
            this.e(this.i());
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

      public class a extends fcc.a<fgo.a.a> {
         final String b;
         private final vu c;
         private long d;

         public a(String $$1, gkf $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fat $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fgo.this.i, this.c, a.this.g / 2, $$2 + 1, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ac.b() - this.d < 250L) {
               fgo.this.o();
            }

            this.d = ac.b();
            return true;
         }

         void b() {
            a.this.a(this);
         }

         @Override
         public vu a() {
            return vu.a("narrator.select", this.c);
         }
      }
   }
}
