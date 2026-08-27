public class eua extends eui {
   private static final sw c = sw.b("(").b(sw.c("options.languageWarning")).f(")").a(n.h);
   private eua.a k;
   final fwb l;

   public eua(euq $$0, enr $$1, fwb $$2) {
      super($$0, $$1, sw.c("options.language"));
      this.l = $$2;
   }

   @Override
   protected void b() {
      this.k = new eua.a(this.f);
      this.e(this.k);
      this.d(this.b.L().a(this.b, this.g / 2 - 155, this.h - 38, 150));
      this.d(epi.a(sv.d, $$0 -> this.l()).a(this.g / 2 - 155 + 160, this.h - 38, 150, 20).a());
      super.b();
   }

   void l() {
      eua.a.a $$0 = this.k.f();
      if ($$0 != null && !$$0.b.equals(this.l.a())) {
         this.l.a($$0.b);
         this.b.ag = $$0.b;
         this.f.j();
         this.b.aq();
      }

      this.f.a(this.a);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (esu.a($$0)) {
         eua.a.a $$3 = this.k.f();
         if ($$3 != null) {
            $$3.b();
            this.l();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.k.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      $$0.a(this.i, c, this.g / 2, this.h - 56, 8421504);
      super.a($$0, $$1, $$2, $$3);
   }

   class a extends eqc<eua.a.a> {
      public a(enn $$0) {
         super($$0, eua.this.g, eua.this.h, 32, eua.this.h - 65 + 4, 18);
         String $$1 = eua.this.l.a();
         eua.this.l.b().forEach(($$1x, $$2) -> {
            eua.a.a $$3 = new eua.a.a($$1x, $$2);
            this.b($$3);
            if ($$1.equals($$1x)) {
               this.a($$3);
            }
         });
         if (this.f() != null) {
            this.e(this.f());
         }
      }

      @Override
      protected int c() {
         return super.c() + 20;
      }

      @Override
      public int b() {
         return super.b() + 50;
      }

      @Override
      protected void a(eox $$0) {
         eua.this.a($$0);
      }

      public class a extends eqc.a<eua.a.a> {
         final String b;
         private final sw c;
         private long d;

         public a(String $$1, fwa $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(eua.this.i, this.c, a.this.d / 2, $$2 + 1, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            if ($$2 == 0) {
               this.b();
               if (ac.b() - this.d < 250L) {
                  eua.this.l();
               }

               this.d = ac.b();
               return true;
            } else {
               this.d = ac.b();
               return false;
            }
         }

         void b() {
            a.this.a(this);
         }

         @Override
         public sw a() {
            return sw.a("narrator.select", this.c);
         }
      }
   }
}
