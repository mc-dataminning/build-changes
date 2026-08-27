public class cfv extends cgf {
   private final cft a;
   private final cbw b;
   private int c;
   private final cou h;

   public cfv(cbw $$0, cou $$1, cft $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cjh $$0) {
      return false;
   }

   @Override
   public cjh a(int $$0) {
      if (this.f()) {
         this.c = this.c + Math.min($$0, this.e().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cjh $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cjh $$0) {
      $$0.a(this.b.dL(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(cbw $$0, cjh $$1) {
      this.b_($$1);
      cov $$2 = this.a.g();
      if ($$2 != null) {
         cjh $$3 = this.a.a(0);
         cjh $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(app.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.t() + $$2.o());
      }
   }
}
