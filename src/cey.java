public class cey extends cfv {
   private final cbm a;
   private int b;

   public cey(cbm $$0, bgj $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cix $$0) {
      return false;
   }

   @Override
   public cix a(int $$0) {
      if (this.f()) {
         this.b = this.b + Math.min($$0, this.e().L());
      }

      return super.a($$0);
   }

   @Override
   public void a(cbm $$0, cix $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cix $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cix $$0) {
      $$0.a(this.a.dK(), this.a, this.b);
      if (this.a instanceof akl $$1 && this.d instanceof dca $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
