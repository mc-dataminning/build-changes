public class frd extends frh {
   private static final wz a = wz.c("options.languageAccuracyWarning").b(-4539718);
   private static final int u = 53;
   private frd.a v;
   final grt w;

   public frd(fod $$0, fgs $$1, grt $$2) {
      super($$0, $$1, wz.c("options.language.title"));
      this.w = $$2;
      this.s.a(53);
   }

   @Override
   protected void D() {
      this.v = this.s.c(new frd.a(this.l));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void C() {
      fmd $$0 = this.s.b(fmd.d()).a(8);
      $$0.c().b();
      $$0.a(new fjt(a, this.o));
      fmd $$1 = $$0.a(fmd.e().a(8));
      $$1.a(fim.a(wz.c("options.font"), $$0x -> this.l.a(new frc(this, this.c))).a());
      $$1.a(fim.a(wy.d, $$0x -> this.F()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.v.a(this.m, this.s);
   }

   void F() {
      frd.a.a $$0 = this.v.h();
      if ($$0 != null && !$$0.b.equals(this.w.a())) {
         this.w.a($$0.b);
         this.c.ac = $$0.b;
         this.l.l();
      }

      this.l.a(this.b);
   }

   class a extends fji<frd.a.a> {
      public a(final fgo $$0) {
         super($$0, frd.this.m, frd.this.n - 33 - 53, 33, 18);
         String $$1 = frd.this.w.a();
         frd.this.w.b().forEach(($$1x, $$2) -> {
            frd.a.a $$3 = new frd.a.a($$1x, $$2);
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

      public class a extends fji.a<frd.a.a> {
         final String b;
         private final wz c;
         private long d;

         public a(final String $$1, final grs $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(frd.this.o, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fmn.a($$0)) {
               this.b();
               frd.this.F();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ad.c() - this.d < 250L) {
               frd.this.F();
            }

            this.d = ad.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public wz a() {
            return wz.a("narrator.select", this.c);
         }
      }
   }
}
