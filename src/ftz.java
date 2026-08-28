public class ftz extends fud {
   private static final xi a = xi.c("options.languageAccuracyWarning").b(-4539718);
   private static final int u = 53;
   private ftz.a v;
   final gzm w;

   public ftz(fra $$0, fjm $$1, gzm $$2) {
      super($$0, $$1, xi.c("options.language.title"));
      this.w = $$2;
      this.s.a(53);
   }

   @Override
   protected void E() {
      this.v = this.s.c(new ftz.a(this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void D() {
      fpa $$0 = this.s.b(fpa.d()).a(8);
      $$0.c().b();
      $$0.a(new fmo(a, this.p));
      fpa $$1 = $$0.a(fpa.e().a(8));
      $$1.a(flh.a(xi.c("options.font"), $$0x -> this.m.a(new fty(this, this.c))).a());
      $$1.a(flh.a(xh.d, $$0x -> this.G()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.v.a(this.n, this.s);
   }

   void G() {
      ftz.a.a $$0 = this.v.h();
      if ($$0 != null && !$$0.b.equals(this.w.a())) {
         this.w.a($$0.b);
         this.c.ab = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fmd<ftz.a.a> {
      public a(final fji $$0) {
         super($$0, ftz.this.n, ftz.this.o - 33 - 53, 33, 18);
         String $$1 = ftz.this.w.a();
         ftz.this.w.b().forEach(($$1x, $$2) -> {
            ftz.a.a $$3 = new ftz.a.a($$1x, $$2);
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

      public class a extends fmd.a<ftz.a.a> {
         final String b;
         private final xi c;
         private long d;

         public a(final String $$1, final gzl $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(ftz.this.p, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fpk.a($$0)) {
               this.b();
               ftz.this.G();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ae.c() - this.d < 250L) {
               ftz.this.G();
            }

            this.d = ae.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public xi a() {
            return xi.a("narrator.select", this.c);
         }
      }
   }
}
