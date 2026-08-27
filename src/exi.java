public class exi extends exr {
   private static final tf c = tf.b("(").b(tf.c("options.languageWarning")).f(")").a(n.h);
   private exi.a k;
   final fzt l;

   public exi(exz $$0, eqq $$1, fzt $$2) {
      super($$0, $$1, tf.c("options.language"));
      this.l = $$2;
   }

   @Override
   protected void aE_() {
      this.k = new exi.a(this.f);
      this.e(this.k);
      this.d(this.b.L().a(this.b, this.g / 2 - 155, this.h - 38, 150));
      this.d(esh.a(te.d, $$0 -> this.l()).a(this.g / 2 - 155 + 160, this.h - 38, 150, 20).a());
      super.aE_();
   }

   void l() {
      exi.a.a $$0 = this.k.f();
      if ($$0 != null && !$$0.b.equals(this.l.a())) {
         this.l.a($$0.b);
         this.b.ah = $$0.b;
         this.f.k();
         this.b.aq();
      }

      this.f.a(this.a);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (ewc.a($$0)) {
         exi.a.a $$3 = this.k.f();
         if ($$3 != null) {
            $$3.b();
            this.l();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.k.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      $$0.a(this.i, c, this.g / 2, this.h - 56, -8355712);
   }

   @Override
   public void b(erw $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends etd<exi.a.a> {
      public a(eqm $$0) {
         super($$0, exi.this.g, exi.this.h, 32, exi.this.h - 65 + 4, 18);
         String $$1 = exi.this.l.a();
         exi.this.l.b().forEach(($$1x, $$2) -> {
            exi.a.a $$3 = new exi.a.a($$1x, $$2);
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

      public class a extends etd.a<exi.a.a> {
         final String b;
         private final tf c;
         private long d;

         public a(String $$1, fzs $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(exi.this.i, this.c, a.this.e / 2, $$2 + 1, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            if ($$2 == 0) {
               this.b();
               if (ac.b() - this.d < 250L) {
                  exi.this.l();
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
