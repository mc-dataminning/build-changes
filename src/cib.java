public class cib extends cim {
   private final chz a;
   private final cdz b;
   private int c;
   private final crc h;

   public cib(cdz $$0, crc $$1, chz $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(clo $$0) {
      return false;
   }

   @Override
   public clo a(int $$0) {
      if (this.g()) {
         this.c = this.c + Math.min($$0, this.f().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(clo $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(clo $$0) {
      $$0.a(this.b.dN(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(cdz $$0, clo $$1) {
      this.b_($$1);
      crd $$2 = this.a.g();
      if ($$2 != null) {
         clo $$3 = this.a.a(0);
         clo $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(arf.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.w() + $$2.o());
      }
   }
}
