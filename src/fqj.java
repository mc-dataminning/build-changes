public class fqj extends fqn {
   private static final wu a = wu.c("options.languageAccuracyWarning").a(n.h);
   private static final int s = 53;
   private fqj.a u;
   final gqy v;

   public fqj(fnl $$0, fga $$1, gqy $$2) {
      super($$0, $$1, wu.c("options.language.title"));
      this.v = $$2;
      this.r.a(53);
   }

   @Override
   protected void aQ_() {
      this.u = this.r.c(new fqj.a(this.l));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void D() {
      fll $$0 = this.r.b(fll.d()).a(8);
      $$0.c().b();
      $$0.a(new fjb(a, this.o));
      fll $$1 = $$0.a(fll.e().a(8));
      $$1.a(fhu.a(wu.c("options.font"), $$0x -> this.l.a(new fqi(this, this.c))).a());
      $$1.a(fhu.a(wt.d, $$0x -> this.G()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.u.a(this.m, this.r);
   }

   void G() {
      fqj.a.a $$0 = this.u.h();
      if ($$0 != null && !$$0.b.equals(this.v.a())) {
         this.v.a($$0.b);
         this.c.ac = $$0.b;
         this.l.l();
      }

      this.l.a(this.b);
   }

   class a extends fiq<fqj.a.a> {
      public a(final ffw $$0) {
         super($$0, fqj.this.m, fqj.this.n - 33 - 53, 33, 18);
         String $$1 = fqj.this.v.a();
         fqj.this.v.b().forEach(($$1x, $$2) -> {
            fqj.a.a $$3 = new fqj.a.a($$1x, $$2);
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

      public class a extends fiq.a<fqj.a.a> {
         final String b;
         private final wu c;
         private long d;

         public a(final String $$1, final gqx $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fqj.this.o, this.c, a.this.g / 2, $$2 + 1, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (flv.a($$0)) {
               this.b();
               fqj.this.G();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ac.c() - this.d < 250L) {
               fqj.this.G();
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
