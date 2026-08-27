public class exo extends exx {
   private static final ti c = ti.b("(").b(ti.c("options.languageWarning")).f(")").a(n.h);
   private exo.a k;
   final gah l;

   public exo(eyf $$0, equ $$1, gah $$2) {
      super($$0, $$1, ti.c("options.language"));
      this.l = $$2;
   }

   @Override
   protected void aD_() {
      this.k = new exo.a(this.f);
      this.e(this.k);
      this.d(this.b.M().a(this.b, this.g / 2 - 155, this.h - 38, 150));
      this.d(esl.a(th.d, $$0 -> this.l()).a(this.g / 2 - 155 + 160, this.h - 38, 150, 20).a());
      super.aD_();
   }

   void l() {
      exo.a.a $$0 = this.k.f();
      if ($$0 != null && !$$0.b.equals(this.l.a())) {
         this.l.a($$0.b);
         this.b.ad = $$0.b;
         this.f.k();
         this.b.ar();
      }

      this.f.a(this.a);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (ewi.a($$0)) {
         exo.a.a $$3 = this.k.f();
         if ($$3 != null) {
            $$3.b();
            this.l();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.k.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      $$0.a(this.i, c, this.g / 2, this.h - 56, -8355712);
   }

   @Override
   public void b(esa $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends eth<exo.a.a> {
      public a(eqq $$0) {
         super($$0, exo.this.g, exo.this.h, 32, exo.this.h - 65 + 4, 18);
         String $$1 = exo.this.l.a();
         exo.this.l.b().forEach(($$1x, $$2) -> {
            exo.a.a $$3 = new exo.a.a($$1x, $$2);
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

      public class a extends eth.a<exo.a.a> {
         final String b;
         private final ti c;
         private long d;

         public a(String $$1, gag $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(exo.this.i, this.c, a.this.e / 2, $$2 + 1, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ac.b() - this.d < 250L) {
               exo.this.l();
            }

            this.d = ac.b();
            return true;
         }

         void b() {
            a.this.a(this);
         }

         @Override
         public ti a() {
            return ti.a("narrator.select", this.c);
         }
      }
   }
}
