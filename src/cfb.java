public class cfb extends cfy {
   private final cbp a;
   private int b;

   public cfb(cbp $$0, bgm $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cja $$0) {
      return false;
   }

   @Override
   public cja a(int $$0) {
      if (this.f()) {
         this.b = this.b + Math.min($$0, this.e().L());
      }

      return super.a($$0);
   }

   @Override
   public void a(cbp $$0, cja $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cja $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cja $$0) {
      $$0.a(this.a.dK(), this.a, this.b);
      if (this.a instanceof ako $$1 && this.d instanceof dcf $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
