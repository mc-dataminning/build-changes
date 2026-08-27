public class feu extends ffd {
   private static final vq c = vq.c("options.languageAccuracyWarning").a(n.h);
   private feu.a k;
   final gii l;

   public feu(ffl $$0, exs $$1, gii $$2) {
      super($$0, $$1, vq.c("options.language.title"));
      this.l = $$2;
   }

   @Override
   protected void aQ_() {
      this.k = this.c(new feu.a(this.f));
      this.c(this.b.N().a(this.b, this.g / 2 - 155, this.h - 38, 150));
      this.c(ezo.a(vp.d, $$0 -> this.o()).a(this.g / 2 - 155 + 160, this.h - 38, 150, 20).a());
   }

   void o() {
      feu.a.a $$0 = this.k.i();
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
      if (fdo.a($$0)) {
         feu.a.a $$3 = this.k.i();
         if ($$3 != null) {
            $$3.b();
            this.o();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      $$0.a(this.i, c, this.g / 2, this.h - 56, -8355712);
   }

   @Override
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends fak<feu.a.a> {
      public a(exo $$0) {
         super($$0, feu.this.g, feu.this.h - 93, 32, 18);
         String $$1 = feu.this.l.a();
         feu.this.l.b().forEach(($$1x, $$2) -> {
            feu.a.a $$3 = new feu.a.a($$1x, $$2);
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

      public class a extends fak.a<feu.a.a> {
         final String b;
         private final vq c;
         private long d;

         public a(String $$1, gih $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(ezb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(feu.this.i, this.c, a.this.g / 2, $$2 + 1, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ac.b() - this.d < 250L) {
               feu.this.o();
            }

            this.d = ac.b();
            return true;
         }

         void b() {
            a.this.a(this);
         }

         @Override
         public vq a() {
            return vq.a("narrator.select", this.c);
         }
      }
   }
}
