public class cqe extends cre {
   private final cly a;
   private int b;

   public cqe(cly $$0, bpt $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cuh $$0) {
      return false;
   }

   @Override
   public cuh a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().G());
      }

      return super.a($$0);
   }

   @Override
   public void a(cly $$0, cuh $$1) {
      this.c($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cuh $$0, int $$1) {
      this.b += $$1;
      this.c($$0);
   }

   protected void c(cuh $$0) {
      $$0.a(this.a.dU(), this.a, this.b);
      if (this.a instanceof aqu $$1 && this.d instanceof dpp $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
