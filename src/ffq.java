public class ffq extends ffz {
   private static final vs c = vs.c("options.languageAccuracyWarning").a(n.h);
   private ffq.a k;
   final gjg l;

   public ffq(fgh $$0, eyo $$1, gjg $$2) {
      super($$0, $$1, vs.c("options.language.title"));
      this.l = $$2;
   }

   @Override
   protected void aP_() {
      this.k = this.c(new ffq.a(this.f));
      this.c(this.b.N().a(this.b, this.g / 2 - 155, this.h - 38, 150));
      this.c(fak.a(vr.d, $$0 -> this.o()).a(this.g / 2 - 155 + 160, this.h - 38, 150, 20).a());
   }

   void o() {
      ffq.a.a $$0 = this.k.i();
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
      if (fek.a($$0)) {
         ffq.a.a $$3 = this.k.i();
         if ($$3 != null) {
            $$3.b();
            this.o();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      $$0.a(this.i, c, this.g / 2, this.h - 56, -8355712);
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends fbg<ffq.a.a> {
      public a(eyk $$0) {
         super($$0, ffq.this.g, ffq.this.h - 93, 32, 18);
         String $$1 = ffq.this.l.a();
         ffq.this.l.b().forEach(($$1x, $$2) -> {
            ffq.a.a $$3 = new ffq.a.a($$1x, $$2);
            this.b($$3);
            if ($$1.equals($$1x)) {
               this.a($$3);
            }
         });
         if (this.i() != null) {
            this.e(this.i());
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

      public class a extends fbg.a<ffq.a.a> {
         final String b;
         private final vs c;
         private long d;

         public a(String $$1, gjf $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(ffq.this.i, this.c, a.this.g / 2, $$2 + 1, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ac.b() - this.d < 250L) {
               ffq.this.o();
            }

            this.d = ac.b();
            return true;
         }

         void b() {
            a.this.a(this);
         }

         @Override
         public vs a() {
            return vs.a("narrator.select", this.c);
         }
      }
   }
}
