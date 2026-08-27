public class fkm extends fkv {
   private static final wu a = wu.c("options.languageAccuracyWarning").a(n.h);
   private static final int r = 53;
   private fkm.a s;
   final gog u;

   public fkm(fld $$0, fdi $$1, gog $$2) {
      super($$0, $$1, wu.c("options.language.title"));
      this.u = $$2;
   }

   @Override
   protected void aM_() {
      this.s = this.c(new fkm.a(this.m));
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
      fiv $$0 = this.d.b(fiv.d()).a(8);
      $$0.c().b();
      $$0.a(new fgl(a, this.p));
      fiv $$1 = $$0.a(fiv.e().a(8));
      $$1.a(ffe.a(wu.c("options.font"), $$0x -> this.m.a(new fki(this, this.c))).a());
      $$1.a(ffe.a(wt.d, $$0x -> this.C()).a());
   }

   void C() {
      fkm.a.a $$0 = this.s.h();
      if ($$0 != null && !$$0.b.equals(this.u.a())) {
         this.u.a($$0.b);
         this.c.ad = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fga<fkm.a.a> {
      public a(fde $$0) {
         super($$0, fkm.this.n, fkm.this.o - 33 - 53, 33, 18);
         String $$1 = fkm.this.u.a();
         fkm.this.u.b().forEach(($$1x, $$2) -> {
            fkm.a.a $$3 = new fkm.a.a($$1x, $$2);
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

      public class a extends fga.a<fkm.a.a> {
         final String b;
         private final wu c;
         private long d;

         public a(String $$1, gof $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fkm.this.p, this.c, a.this.g / 2, $$2 + 1, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fjf.a($$0)) {
               this.b();
               fkm.this.C();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ac.b() - this.d < 250L) {
               fkm.this.C();
            }

            this.d = ac.b();
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
