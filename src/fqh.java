public class fqh extends fql {
   private static final wu a = wu.c("options.languageAccuracyWarning").a(n.h);
   private static final int s = 53;
   private fqh.a u;
   final gqw v;

   public fqh(fnj $$0, ffx $$1, gqw $$2) {
      super($$0, $$1, wu.c("options.language.title"));
      this.v = $$2;
      this.r.a(53);
   }

   @Override
   protected void aQ_() {
      this.u = this.r.c(new fqh.a(this.l));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      flj $$0 = this.r.b(flj.d()).a(8);
      $$0.c().b();
      $$0.a(new fiz(a, this.o));
      flj $$1 = $$0.a(flj.e().a(8));
      $$1.a(fhs.a(wu.c("options.font"), $$0x -> this.l.a(new fqg(this, this.c))).a());
      $$1.a(fhs.a(wt.d, $$0x -> this.J()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.u.a(this.m, this.r);
   }

   void J() {
      fqh.a.a $$0 = this.u.h();
      if ($$0 != null && !$$0.b.equals(this.v.a())) {
         this.v.a($$0.b);
         this.c.ac = $$0.b;
         this.l.l();
      }

      this.l.a(this.b);
   }

   class a extends fio<fqh.a.a> {
      public a(final fft $$0) {
         super($$0, fqh.this.m, fqh.this.n - 33 - 53, 33, 18);
         String $$1 = fqh.this.v.a();
         fqh.this.v.b().forEach(($$1x, $$2) -> {
            fqh.a.a $$3 = new fqh.a.a($$1x, $$2);
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

      public class a extends fio.a<fqh.a.a> {
         final String b;
         private final wu c;
         private long d;

         public a(final String $$1, final gqv $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fqh.this.o, this.c, a.this.g / 2, $$2 + 1, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (flt.a($$0)) {
               this.b();
               fqh.this.J();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ac.c() - this.d < 250L) {
               fqh.this.J();
            }

            this.d = ac.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public wu a() {
            return wu.a("narrator.select", this.c);
         }
      }
   }
}
