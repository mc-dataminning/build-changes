public class cqr extends cre {
   private final cqp a;
   private final cly b;
   private int c;
   private final dax h;

   public cqr(cly $$0, dax $$1, cqp $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
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
      this.c($$0);
   }

   protected void c(cuh $$0) {
      $$0.a(this.b.dU(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(cly $$0, cuh $$1) {
      this.c($$1);
      day $$2 = this.a.g();
      if ($$2 != null) {
         cuh $$3 = this.a.a(0);
         cuh $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(avz.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.v(this.h.t() + $$2.q());
      }
   }
}
