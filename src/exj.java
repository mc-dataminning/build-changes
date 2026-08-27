public class exj extends exs {
   private static final tf c = tf.b("(").b(tf.c("options.languageWarning")).f(")").a(n.h);
   private exj.a k;
   final gac l;

   public exj(eya $$0, eqp $$1, gac $$2) {
      super($$0, $$1, tf.c("options.language"));
      this.l = $$2;
   }

   @Override
   protected void aC_() {
      this.k = new exj.a(this.f);
      this.e(this.k);
      this.d(this.b.M().a(this.b, this.g / 2 - 155, this.h - 38, 150));
      this.d(esg.a(te.d, $$0 -> this.l()).a(this.g / 2 - 155 + 160, this.h - 38, 150, 20).a());
      super.aC_();
   }

   void l() {
      exj.a.a $$0 = this.k.f();
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
      if (ewd.a($$0)) {
         exj.a.a $$3 = this.k.f();
         if ($$3 != null) {
            $$3.b();
            this.l();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.k.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      $$0.a(this.i, c, this.g / 2, this.h - 56, -8355712);
   }

   @Override
   public void b(erv $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends etc<exj.a.a> {
      public a(eql $$0) {
         super($$0, exj.this.g, exj.this.h, 32, exj.this.h - 65 + 4, 18);
         String $$1 = exj.this.l.a();
         exj.this.l.b().forEach(($$1x, $$2) -> {
            exj.a.a $$3 = new exj.a.a($$1x, $$2);
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

      public class a extends etc.a<exj.a.a> {
         final String b;
         private final tf c;
         private long d;

         public a(String $$1, gab $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(exj.this.i, this.c, a.this.e / 2, $$2 + 1, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            if ($$2 == 0) {
               this.b();
               if (ac.b() - this.d < 250L) {
                  exj.this.l();
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
         public tf a() {
            return tf.a("narrator.select", this.c);
         }
      }
   }
}
