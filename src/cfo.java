public class cfo extends cfy {
   private final cfm a;
   private final cbp b;
   private int c;
   private final com h;

   public cfo(cbp $$0, com $$1, cfm $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cja $$0) {
      return false;
   }

   @Override
   public cja a(int $$0) {
      if (this.f()) {
         this.c = this.c + Math.min($$0, this.e().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cja $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cja $$0) {
      $$0.a(this.b.dK(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(cbp $$0, cja $$1) {
      this.b_($$1);
      coo $$2 = this.a.g();
      if ($$2 != null) {
         cja $$3 = this.a.a(0);
         cja $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(apj.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.q() + $$2.o());
      }
   }
}
