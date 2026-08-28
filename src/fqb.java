public class fqb extends fqf {
   private static final wu a = wu.c("options.languageAccuracyWarning").a(n.h);
   private static final int s = 53;
   private fqb.a u;
   final gqq v;

   public fqb(fnd $$0, ffr $$1, gqq $$2) {
      super($$0, $$1, wu.c("options.language.title"));
      this.v = $$2;
      this.r.a(53);
   }

   @Override
   protected void aP_() {
      this.u = this.r.c(new fqb.a(this.l));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      fld $$0 = this.r.b(fld.d()).a(8);
      $$0.c().b();
      $$0.a(new fit(a, this.o));
      fld $$1 = $$0.a(fld.e().a(8));
      $$1.a(fhm.a(wu.c("options.font"), $$0x -> this.l.a(new fqa(this, this.c))).a());
      $$1.a(fhm.a(wt.d, $$0x -> this.J()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.u.a(this.m, this.r);
   }

   void J() {
      fqb.a.a $$0 = this.u.h();
      if ($$0 != null && !$$0.b.equals(this.v.a())) {
         this.v.a($$0.b);
         this.c.ac = $$0.b;
         this.l.l();
      }

      this.l.a(this.b);
   }

   class a extends fii<fqb.a.a> {
      public a(final ffn $$0) {
         super($$0, fqb.this.m, fqb.this.n - 33 - 53, 33, 18);
         String $$1 = fqb.this.v.a();
         fqb.this.v.b().forEach(($$1x, $$2) -> {
            fqb.a.a $$3 = new fqb.a.a($$1x, $$2);
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

      public class a extends fii.a<fqb.a.a> {
         final String b;
         private final wu c;
         private long d;

         public a(final String $$1, final gqp $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fqb.this.o, this.c, a.this.g / 2, $$2 + 1, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fln.a($$0)) {
               this.b();
               fqb.this.J();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ac.c() - this.d < 250L) {
               fqb.this.J();
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
