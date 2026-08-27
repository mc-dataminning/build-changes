public class exe extends exn {
   private static final te c = te.b("(").b(te.c("options.languageWarning")).f(")").a(n.h);
   private exe.a k;
   final fzo l;

   public exe(exv $$0, eqr $$1, fzo $$2) {
      super($$0, $$1, te.c("options.language"));
      this.l = $$2;
   }

   @Override
   protected void aE_() {
      this.k = new exe.a(this.f);
      this.e(this.k);
      this.d(this.b.L().a(this.b, this.g / 2 - 155, this.h - 38, 150));
      this.d(esi.a(td.d, $$0 -> this.l()).a(this.g / 2 - 155 + 160, this.h - 38, 150, 20).a());
      super.aE_();
   }

   void l() {
      exe.a.a $$0 = this.k.f();
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
      if (evy.a($$0)) {
         exe.a.a $$3 = this.k.f();
         if ($$3 != null) {
            $$3.b();
            this.l();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.k.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      $$0.a(this.i, c, this.g / 2, this.h - 56, -8355712);
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends ete<exe.a.a> {
      public a(eqn $$0) {
         super($$0, exe.this.g, exe.this.h, 32, exe.this.h - 65 + 4, 18);
         String $$1 = exe.this.l.a();
         exe.this.l.b().forEach(($$1x, $$2) -> {
            exe.a.a $$3 = new exe.a.a($$1x, $$2);
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

      public class a extends ete.a<exe.a.a> {
         final String b;
         private final te c;
         private long d;

         public a(String $$1, fzn $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(exe.this.i, this.c, a.this.d / 2, $$2 + 1, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            if ($$2 == 0) {
               this.b();
               if (ac.b() - this.d < 250L) {
                  exe.this.l();
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
         public te a() {
            return te.a("narrator.select", this.c);
         }
      }
   }
}
