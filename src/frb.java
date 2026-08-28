public class frb extends frf {
   private static final wz a = wz.c("options.languageAccuracyWarning").b(-4539718);
   private static final int u = 53;
   private frb.a v;
   final grr w;

   public frb(fob $$0, fgq $$1, grr $$2) {
      super($$0, $$1, wz.c("options.language.title"));
      this.w = $$2;
      this.s.a(53);
   }

   @Override
   protected void D() {
      this.v = this.s.c(new frb.a(this.l));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void C() {
      fmb $$0 = this.s.b(fmb.d()).a(8);
      $$0.c().b();
      $$0.a(new fjr(a, this.o));
      fmb $$1 = $$0.a(fmb.e().a(8));
      $$1.a(fik.a(wz.c("options.font"), $$0x -> this.l.a(new fra(this, this.c))).a());
      $$1.a(fik.a(wy.d, $$0x -> this.F()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.v.a(this.m, this.s);
   }

   void F() {
      frb.a.a $$0 = this.v.h();
      if ($$0 != null && !$$0.b.equals(this.w.a())) {
         this.w.a($$0.b);
         this.c.ac = $$0.b;
         this.l.l();
      }

      this.l.a(this.b);
   }

   class a extends fjg<frb.a.a> {
      public a(final fgm $$0) {
         super($$0, frb.this.m, frb.this.n - 33 - 53, 33, 18);
         String $$1 = frb.this.w.a();
         frb.this.w.b().forEach(($$1x, $$2) -> {
            frb.a.a $$3 = new frb.a.a($$1x, $$2);
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

      public class a extends fjg.a<frb.a.a> {
         final String b;
         private final wz c;
         private long d;

         public a(final String $$1, final grq $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fhx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(frb.this.o, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fml.a($$0)) {
               this.b();
               frb.this.F();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ad.c() - this.d < 250L) {
               frb.this.F();
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
