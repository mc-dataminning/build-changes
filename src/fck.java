public class fck extends fct {
   private static final vf c = vf.c("options.languageAccuracyWarning").a(n.h);
   private fck.a k;
   final gfu l;

   public fck(fdb $$0, evm $$1, gfu $$2) {
      super($$0, $$1, vf.c("options.language.title"));
      this.l = $$2;
   }

   @Override
   protected void aN_() {
      this.k = this.d(new fck.a(this.f));
      this.d(this.b.N().a(this.b, this.g / 2 - 155, this.h - 38, 150));
      this.d(exg.a(ve.d, $$0 -> this.n()).a(this.g / 2 - 155 + 160, this.h - 38, 150, 20).a());
   }

   void n() {
      fck.a.a $$0 = this.k.i();
      if ($$0 != null && !$$0.b.equals(this.l.a())) {
         this.l.a($$0.b);
         this.b.ad = $$0.b;
         this.f.k();
         this.b.as();
      }

      this.f.a(this.a);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fbe.a($$0)) {
         fck.a.a $$3 = this.k.i();
         if ($$3 != null) {
            $$3.b();
            this.n();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      $$0.a(this.i, c, this.g / 2, this.h - 56, -8355712);
   }

   @Override
   public void b(ewu $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends eyc<fck.a.a> {
      public a(evi $$0) {
         super($$0, fck.this.g, fck.this.h - 93, 32, 18);
         String $$1 = fck.this.l.a();
         fck.this.l.b().forEach(($$1x, $$2) -> {
            fck.a.a $$3 = new fck.a.a($$1x, $$2);
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

      public class a extends eyc.a<fck.a.a> {
         final String b;
         private final vf c;
         private long d;

         public a(String $$1, gft $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fck.this.i, this.c, a.this.g / 2, $$2 + 1, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ac.b() - this.d < 250L) {
               fck.this.n();
            }

            this.d = ac.b();
            return true;
         }

         void b() {
            a.this.a(this);
         }

         @Override
         public vf a() {
            return vf.a("narrator.select", this.c);
         }
      }
   }
}
