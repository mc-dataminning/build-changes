public class ctv extends csv {
   private final aqi a;

   public ctv(aqi $$0) {
      this.a = $$0;
   }

   @Override
   protected void b(csu $$0, int $$1) {
      super.b($$0, $$1);
      this.a.d.b(new ack($$0, $$1));
   }

   @Override
   protected void c(csu $$0) {
      super.c($$0);
      this.a.d.b(new ack($$0, 0));
   }
}
