public class exn extends exp {
   private final exd b;

   public exn(exd $$0, long $$1, vs $$2, Runnable $$3) {
      super($$1, $$2, $$3);
      this.b = $$0;
   }

   @Override
   protected void a(ett $$0, long $$1) throws evg {
      $$0.a($$1, this.b);
   }
}
