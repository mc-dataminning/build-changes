public class fml extends fmu {
   private static final xo a = xo.c("options.languageAccuracyWarning").a(n.h);
   private static final int r = 53;
   private fml.a s;
   final gqg u;

   public fml(fnc $$0, ffi $$1, gqg $$2) {
      super($$0, $$1, xo.c("options.language.title"));
      this.u = $$2;
   }

   @Override
   protected void aM_() {
      this.s = this.c(new fml.a(this.m));
      this.d.a(53);
      super.aM_();
   }

   @Override
   protected void c() {
      super.c();
      this.s.a(this.n, this.d);
   }

   @Override
   protected void h() {
      fku $$0 = this.d.b(fku.d()).a(8);
      $$0.c().b();
      $$0.a(new fik(a, this.p));
      fku $$1 = $$0.a(fku.e().a(8));
      $$1.a(fhd.a(xo.c("options.font"), $$0x -> this.m.a(new fmh(this, this.c))).a());
      $$1.a(fhd.a(xn.d, $$0x -> this.E()).a());
   }

   void E() {
      fml.a.a $$0 = this.s.h();
      if ($$0 != null && !$$0.b.equals(this.u.a())) {
         this.u.a($$0.b);
         this.c.ac = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fhz<fml.a.a> {
      public a(final ffe $$0) {
         super($$0, fml.this.n, fml.this.o - 33 - 53, 33, 18);
         String $$1 = fml.this.u.a();
         fml.this.u.b().forEach(($$1x, $$2) -> {
            fml.a.a $$3 = new fml.a.a($$1x, $$2);
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

      public class a extends fhz.a<fml.a.a> {
         final String b;
         private final xo c;
         private long d;

         public a(final String $$1, final gqf $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fml.this.p, this.c, a.this.g / 2, $$2 + 1, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fle.a($$0)) {
               this.b();
               fml.this.E();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ac.c() - this.d < 250L) {
               fml.this.E();
            }

            this.d = ac.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public xo a() {
            return xo.a("narrator.select", this.c);
         }
      }
   }
}
