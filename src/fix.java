public class fix extends fjg {
   private static final wg a = wg.c("options.languageAccuracyWarning").a(n.h);
   private static final int o = 53;
   private fix.a p;
   final gmq q;

   public fix(fjo $$0, fbt $$1, gmq $$2) {
      super($$0, $$1, wg.c("options.language.title"));
      this.q = $$2;
   }

   @Override
   protected void aN_() {
      this.p = this.c(new fix.a(this.j));
      this.d.a(53);
      super.aN_();
   }

   @Override
   protected void c() {
      super.c();
      this.p.a(this.k, this.d);
   }

   @Override
   protected void h() {
      fhg $$0 = this.d.b(fhg.d()).a(8);
      $$0.c().b();
      $$0.a(new few(a, this.m));
      fhg $$1 = $$0.a(fhg.e().a(8));
      $$1.a(fdp.a(wg.c("options.font"), $$0x -> this.j.a(new fit(this, this.c))).a());
      $$1.a(fdp.a(wf.d, $$0x -> this.d()).a());
   }

   void C() {
      fix.a.a $$0 = this.p.h();
      if ($$0 != null && !$$0.b.equals(this.q.a())) {
         this.q.a($$0.b);
         this.c.ad = $$0.b;
         this.j.l();
         this.c.av();
      }

      this.j.a(this.b);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fhq.a($$0)) {
         fix.a.a $$3 = this.p.h();
         if ($$3 != null) {
            $$3.b();
            this.C();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   class a extends fel<fix.a.a> {
      public a(fbp $$0) {
         super($$0, fix.this.k, fix.this.l - 33 - 53, 33, 18);
         String $$1 = fix.this.q.a();
         fix.this.q.b().forEach(($$1x, $$2) -> {
            fix.a.a $$3 = new fix.a.a($$1x, $$2);
            this.b($$3);
            if ($$1.equals($$1x)) {
               this.a($$3);
            }
         });
         if (this.h() != null) {
            this.e(this.h());
         }
      }

      @Override
      public int b() {
         return super.b() + 50;
      }

      public class a extends fel.a<fix.a.a> {
         final String b;
         private final wg c;
         private long d;

         public a(String $$1, gmp $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fix.this.m, this.c, a.this.g / 2, $$2 + 1, -1);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ac.b() - this.d < 250L) {
               fix.this.C();
            }

            this.d = ac.b();
            return super.a($$0, $$1, $$2);
         }

         void b() {
            a.this.a(this);
         }

         @Override
         public wg a() {
            return wg.a("narrator.select", this.c);
         }
      }
   }
}
