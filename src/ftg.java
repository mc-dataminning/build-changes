public class ftg extends ftk {
   private static final xe a = xe.c("options.languageAccuracyWarning").b(-4539718);
   private static final int u = 53;
   private ftg.a v;
   final gyp w;

   public ftg(fqh $$0, fit $$1, gyp $$2) {
      super($$0, $$1, xe.c("options.language.title"));
      this.w = $$2;
      this.s.a(53);
   }

   @Override
   protected void E() {
      this.v = this.s.c(new ftg.a(this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void D() {
      fog $$0 = this.s.b(fog.d()).a(8);
      $$0.c().b();
      $$0.a(new flv(a, this.p));
      fog $$1 = $$0.a(fog.e().a(8));
      $$1.a(fko.a(xe.c("options.font"), $$0x -> this.m.a(new ftf(this, this.c))).a());
      $$1.a(fko.a(xd.d, $$0x -> this.G()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.v.a(this.n, this.s);
   }

   void G() {
      ftg.a.a $$0 = this.v.h();
      if ($$0 != null && !$$0.b.equals(this.w.a())) {
         this.w.a($$0.b);
         this.c.ab = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends flk<ftg.a.a> {
      public a(final fip $$0) {
         super($$0, ftg.this.n, ftg.this.o - 33 - 53, 33, 18);
         String $$1 = ftg.this.w.a();
         ftg.this.w.b().forEach(($$1x, $$2) -> {
            ftg.a.a $$3 = new ftg.a.a($$1x, $$2);
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

      public class a extends flk.a<ftg.a.a> {
         final String b;
         private final xe c;
         private long d;

         public a(final String $$1, final gyo $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(ftg.this.p, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (foq.a($$0)) {
               this.b();
               ftg.this.G();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ad.c() - this.d < 250L) {
               ftg.this.G();
            }

            this.d = ad.c();
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
