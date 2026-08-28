public class fmm extends fmv {
   private static final xp a = xp.c("options.languageAccuracyWarning").a(n.h);
   private static final int r = 53;
   private fmm.a s;
   final gqh u;

   public fmm(fnd $$0, ffj $$1, gqh $$2) {
      super($$0, $$1, xp.c("options.language.title"));
      this.u = $$2;
   }

   @Override
   protected void aM_() {
      this.s = this.c(new fmm.a(this.m));
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
      fkv $$0 = this.d.b(fkv.d()).a(8);
      $$0.c().b();
      $$0.a(new fil(a, this.p));
      fkv $$1 = $$0.a(fkv.e().a(8));
      $$1.a(fhe.a(xp.c("options.font"), $$0x -> this.m.a(new fmi(this, this.c))).a());
      $$1.a(fhe.a(xo.d, $$0x -> this.E()).a());
   }

   void E() {
      fmm.a.a $$0 = this.s.h();
      if ($$0 != null && !$$0.b.equals(this.u.a())) {
         this.u.a($$0.b);
         this.c.ac = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fia<fmm.a.a> {
      public a(final fff $$0) {
         super($$0, fmm.this.n, fmm.this.o - 33 - 53, 33, 18);
         String $$1 = fmm.this.u.a();
         fmm.this.u.b().forEach(($$1x, $$2) -> {
            fmm.a.a $$3 = new fmm.a.a($$1x, $$2);
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

      public class a extends fia.a<fmm.a.a> {
         final String b;
         private final xp c;
         private long d;

         public a(final String $$1, final gqg $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fgr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fmm.this.p, this.c, a.this.g / 2, $$2 + 1, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (flf.a($$0)) {
               this.b();
               fmm.this.E();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ac.c() - this.d < 250L) {
               fmm.this.E();
            }

            this.d = ac.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public xp a() {
            return xp.a("narrator.select", this.c);
         }
      }
   }
}
