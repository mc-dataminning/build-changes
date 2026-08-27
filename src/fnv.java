public class fnv extends foe {
   private static final xe a = xe.c("options.languageAccuracyWarning").a(n.h);
   private static final int r = 53;
   private fnv.a s;
   final gsg u;

   public fnv(fon $$0, fgn $$1, gsg $$2) {
      super($$0, $$1, xe.c("options.language.title"));
      this.u = $$2;
   }

   @Override
   protected void aN_() {
      this.s = this.c(new fnv.a(this.m));
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
      fme $$0 = this.d.b(fme.d()).a(8);
      $$0.c().b();
      $$0.a(new fju(a, this.p));
      fme $$1 = $$0.a(fme.e().a(8));
      $$1.a(fin.a(xe.c("options.font"), $$0x -> this.m.a(new fnr(this, this.c))).a());
      $$1.a(fin.a(xd.d, $$0x -> this.B()).a());
   }

   void B() {
      fnv.a.a $$0 = this.s.h();
      if ($$0 != null && !$$0.b.equals(this.u.a())) {
         this.u.a($$0.b);
         this.c.ae = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fjj<fnv.a.a> {
      public a(fgj $$0) {
         super($$0, fnv.this.n, fnv.this.o - 33 - 53, 33, 18);
         String $$1 = fnv.this.u.a();
         fnv.this.u.b().forEach(($$1x, $$2) -> {
            fnv.a.a $$3 = new fnv.a.a($$1x, $$2);
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

      public class a extends fjj.a<fnv.a.a> {
         final String b;
         private final xe c;
         private long d;

         public a(String $$1, gsf $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fnv.this.p, this.c, a.this.g / 2, $$2 + 1, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fmo.a($$0)) {
               this.b();
               fnv.this.B();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ad.b() - this.d < 250L) {
               fnv.this.B();
            }

            this.d = ad.b();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public xe a() {
            return xe.a("narrator.select", this.c);
         }
      }
   }
}
