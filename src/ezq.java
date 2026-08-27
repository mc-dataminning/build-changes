public class ezq extends ezz {
   private static final ur c = ur.c("options.languageAccuracyWarning").a(n.h);
   private ezq.a k;
   final gcp l;

   public ezq(fah $$0, esv $$1, gcp $$2) {
      super($$0, $$1, ur.c("options.language.title"));
      this.l = $$2;
   }

   @Override
   protected void aO_() {
      this.k = new ezq.a(this.f);
      this.e(this.k);
      this.d(this.b.N().a(this.b, this.g / 2 - 155, this.h - 38, 150));
      this.d(eum.a(uq.d, $$0 -> this.l()).a(this.g / 2 - 155 + 160, this.h - 38, 150, 20).a());
      super.aO_();
   }

   void l() {
      ezq.a.a $$0 = this.k.f();
      if ($$0 != null && !$$0.b.equals(this.l.a())) {
         this.l.a($$0.b);
         this.b.ad = $$0.b;
         this.f.k();
         this.b.as();
      }

      this.f.a(this.a);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (eyk.a($$0)) {
         ezq.a.a $$3 = this.k.f();
         if ($$3 != null) {
            $$3.b();
            this.l();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.k.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      $$0.a(this.i, c, this.g / 2, this.h - 56, -8355712);
   }

   @Override
   public void b(eub $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends evi<ezq.a.a> {
      public a(esr $$0) {
         super($$0, ezq.this.g, ezq.this.h, 32, ezq.this.h - 65 + 4, 18);
         String $$1 = ezq.this.l.a();
         ezq.this.l.b().forEach(($$1x, $$2) -> {
            ezq.a.a $$3 = new ezq.a.a($$1x, $$2);
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

      public class a extends evi.a<ezq.a.a> {
         final String b;
         private final ur c;
         private long d;

         public a(String $$1, gco $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(ezq.this.i, this.c, a.this.e / 2, $$2 + 1, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ac.b() - this.d < 250L) {
               ezq.this.l();
            }

            this.d = ac.b();
            return true;
         }

         void b() {
            a.this.a(this);
         }

         @Override
         public ur a() {
            return ur.a("narrator.select", this.c);
         }
      }
   }
}
