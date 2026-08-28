public class fqx extends frb {
   private static final wy a = wy.c("options.languageAccuracyWarning").a(n.h);
   private static final int s = 53;
   private fqx.a u;
   final grn v;

   public fqx(fnx $$0, fgm $$1, grn $$2) {
      super($$0, $$1, wy.c("options.language.title"));
      this.v = $$2;
      this.r.a(53);
   }

   @Override
   protected void aQ_() {
      this.u = this.r.c(new fqx.a(this.l));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void D() {
      flx $$0 = this.r.b(flx.d()).a(8);
      $$0.c().b();
      $$0.a(new fjn(a, this.o));
      flx $$1 = $$0.a(flx.e().a(8));
      $$1.a(fig.a(wy.c("options.font"), $$0x -> this.l.a(new fqw(this, this.c))).a());
      $$1.a(fig.a(wx.d, $$0x -> this.G()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.u.a(this.m, this.r);
   }

   void G() {
      fqx.a.a $$0 = this.u.h();
      if ($$0 != null && !$$0.b.equals(this.v.a())) {
         this.v.a($$0.b);
         this.c.ac = $$0.b;
         this.l.l();
      }

      this.l.a(this.b);
   }

   class a extends fjc<fqx.a.a> {
      public a(final fgi $$0) {
         super($$0, fqx.this.m, fqx.this.n - 33 - 53, 33, 18);
         String $$1 = fqx.this.v.a();
         fqx.this.v.b().forEach(($$1x, $$2) -> {
            fqx.a.a $$3 = new fqx.a.a($$1x, $$2);
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

      public class a extends fjc.a<fqx.a.a> {
         final String b;
         private final wy c;
         private long d;

         public a(final String $$1, final grm $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fqx.this.o, this.c, a.this.g / 2, $$2 + 1, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fmh.a($$0)) {
               this.b();
               fqx.this.G();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ad.c() - this.d < 250L) {
               fqx.this.G();
            }

            this.d = ad.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public wy a() {
            return wy.a("narrator.select", this.c);
         }
      }
   }
}
