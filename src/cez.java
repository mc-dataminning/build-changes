public class cez extends cfw {
   private final cbn a;
   private int b;

   public cez(cbn $$0, bgj $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(ciy $$0) {
      return false;
   }

   @Override
   public ciy a(int $$0) {
      if (this.f()) {
         this.b = this.b + Math.min($$0, this.e().L());
      }

      return super.a($$0);
   }

   @Override
   public void a(cbn $$0, ciy $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(ciy $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(ciy $$0) {
      $$0.a(this.a.dK(), this.a, this.b);
      if (this.a instanceof akl $$1 && this.d instanceof dcb $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
