public class fss extends fsw {
   private static final xd a = xd.c("options.languageAccuracyWarning").b(-4539718);
   private static final int u = 53;
   private fss.a v;
   final gxt w;

   public fss(fpt $$0, fif $$1, gxt $$2) {
      super($$0, $$1, xd.c("options.language.title"));
      this.w = $$2;
      this.s.a(53);
   }

   @Override
   protected void E() {
      this.v = this.s.c(new fss.a(this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void D() {
      fns $$0 = this.s.b(fns.d()).a(8);
      $$0.c().b();
      $$0.a(new flh(a, this.p));
      fns $$1 = $$0.a(fns.e().a(8));
      $$1.a(fka.a(xd.c("options.font"), $$0x -> this.m.a(new fsr(this, this.c))).a());
      $$1.a(fka.a(xc.d, $$0x -> this.G()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.v.a(this.n, this.s);
   }

   void G() {
      fss.a.a $$0 = this.v.h();
      if ($$0 != null && !$$0.b.equals(this.w.a())) {
         this.w.a($$0.b);
         this.c.ab = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fkw<fss.a.a> {
      public a(final fib $$0) {
         super($$0, fss.this.n, fss.this.o - 33 - 53, 33, 18);
         String $$1 = fss.this.w.a();
         fss.this.w.b().forEach(($$1x, $$2) -> {
            fss.a.a $$3 = new fss.a.a($$1x, $$2);
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

      public class a extends fkw.a<fss.a.a> {
         final String b;
         private final xd c;
         private long d;

         public a(final String $$1, final gxs $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fjn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fss.this.p, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (foc.a($$0)) {
               this.b();
               fss.this.G();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ad.c() - this.d < 250L) {
               fss.this.G();
            }

            this.d = ad.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public xd a() {
            return xd.a("narrator.select", this.c);
         }
      }
   }
}
