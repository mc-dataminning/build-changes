public class fmh extends fmq {
   private static final xl a = xl.c("options.languageAccuracyWarning").a(n.h);
   private static final int r = 53;
   private fmh.a s;
   final gqc u;

   public fmh(fmy $$0, ffe $$1, gqc $$2) {
      super($$0, $$1, xl.c("options.language.title"));
      this.u = $$2;
   }

   @Override
   protected void aN_() {
      this.s = this.c(new fmh.a(this.m));
      this.d.a(53);
      super.aN_();
   }

   @Override
   protected void c() {
      super.c();
      this.s.a(this.n, this.d);
   }

   @Override
   protected void h() {
      fkq $$0 = this.d.b(fkq.d()).a(8);
      $$0.c().b();
      $$0.a(new fig(a, this.p));
      fkq $$1 = $$0.a(fkq.e().a(8));
      $$1.a(fgz.a(xl.c("options.font"), $$0x -> this.m.a(new fmd(this, this.c))).a());
      $$1.a(fgz.a(xk.d, $$0x -> this.C()).a());
   }

   void C() {
      fmh.a.a $$0 = this.s.h();
      if ($$0 != null && !$$0.b.equals(this.u.a())) {
         this.u.a($$0.b);
         this.c.ac = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fhv<fmh.a.a> {
      public a(final ffa $$0) {
         super($$0, fmh.this.n, fmh.this.o - 33 - 53, 33, 18);
         String $$1 = fmh.this.u.a();
         fmh.this.u.b().forEach(($$1x, $$2) -> {
            fmh.a.a $$3 = new fmh.a.a($$1x, $$2);
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

      public class a extends fhv.a<fmh.a.a> {
         final String b;
         private final xl c;
         private long d;

         public a(final String $$1, final gqb $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fmh.this.p, this.c, a.this.g / 2, $$2 + 1, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fla.a($$0)) {
               this.b();
               fmh.this.C();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ac.c() - this.d < 250L) {
               fmh.this.C();
            }

            this.d = ac.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public xl a() {
            return xl.a("narrator.select", this.c);
         }
      }
   }
}
