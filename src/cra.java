public class cra extends cre {
   private final cpw a;
   private final cly b;
   private int c;

   public cra(cly $$0, cpw $$1, bpt $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(cuh $$0) {
      return false;
   }

   @Override
   public cuh a(int $$0) {
      if (this.h()) {
         this.c = this.c + Math.min($$0, this.g().G());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cuh $$0, int $$1) {
      this.c += $$1;
      this.d($$0);
   }

   @Override
   protected void b(int $$0) {
      this.c += $$0;
   }

   protected void d(cuh $$0) {
      if (this.c > 0) {
         $$0.a(this.b.dU(), this.b, this.c);
      }

      if (this.d instanceof cqy $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.c = 0;
   }

   @Override
   public void a(cly $$0, cuh $$1) {
      this.d($$1);
      if ($$0.b("wrote_thoughts", 19) && $$1.a(cuk.AB)) {
         $$0.c("crafted_eyes");
      }

      jj<cuh> $$2 = $$0.dU().r().c(czf.a, this.a, $$0.dU());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         cuh $$4 = this.a.a($$3);
         cuh $$5 = $$2.get($$3);
         if (!$$4.d()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.d()) {
            if ($$4.d()) {
               this.a.a($$3, $$5);
            } else if (cuh.c($$4, $$5)) {
               $$5.g($$4.G());
               this.a.a($$3, $$5);
            } else if (!this.b.gl().f($$5)) {
               this.b.a($$5, false);
            }
         }
      }
   }

   @Override
   public boolean f() {
      return true;
   }
}
