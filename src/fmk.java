public class fmk extends fmt {
   private static final xo a = xo.c("options.languageAccuracyWarning").a(n.h);
   private static final int r = 53;
   private fmk.a s;
   final gqf u;

   public fmk(fnb $$0, ffh $$1, gqf $$2) {
      super($$0, $$1, xo.c("options.language.title"));
      this.u = $$2;
   }

   @Override
   protected void aM_() {
      this.s = this.c(new fmk.a(this.m));
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
      fkt $$0 = this.d.b(fkt.d()).a(8);
      $$0.c().b();
      $$0.a(new fij(a, this.p));
      fkt $$1 = $$0.a(fkt.e().a(8));
      $$1.a(fhc.a(xo.c("options.font"), $$0x -> this.m.a(new fmg(this, this.c))).a());
      $$1.a(fhc.a(xn.d, $$0x -> this.D()).a());
   }

   void D() {
      fmk.a.a $$0 = this.s.h();
      if ($$0 != null && !$$0.b.equals(this.u.a())) {
         this.u.a($$0.b);
         this.c.ac = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fhy<fmk.a.a> {
      public a(final ffd $$0) {
         super($$0, fmk.this.n, fmk.this.o - 33 - 53, 33, 18);
         String $$1 = fmk.this.u.a();
         fmk.this.u.b().forEach(($$1x, $$2) -> {
            fmk.a.a $$3 = new fmk.a.a($$1x, $$2);
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

      public class a extends fhy.a<fmk.a.a> {
         final String b;
         private final xo c;
         private long d;

         public a(final String $$1, final gqe $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fmk.this.p, this.c, a.this.g / 2, $$2 + 1, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fld.a($$0)) {
               this.b();
               fmk.this.D();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ac.c() - this.d < 250L) {
               fmk.this.D();
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
