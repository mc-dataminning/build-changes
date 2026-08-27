public class cho extends chz {
   private final chm a;
   private final cdm b;
   private int c;
   private final cqp h;

   public cho(cdm $$0, cqp $$1, chm $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(clb $$0) {
      return false;
   }

   @Override
   public clb a(int $$0) {
      if (this.g()) {
         this.c = this.c + Math.min($$0, this.f().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(clb $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(clb $$0) {
      $$0.a(this.b.dL(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(cdm $$0, clb $$1) {
      this.b_($$1);
      cqq $$2 = this.a.g();
      if ($$2 != null) {
         clb $$3 = this.a.a(0);
         clb $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(aqx.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.t() + $$2.o());
      }
   }
}
