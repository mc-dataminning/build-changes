public class cnc extends cmd {
   private final amq a;

   public cnc(amq $$0) {
      this.a = $$0;
   }

   @Override
   protected void b(cmc $$0, int $$1) {
      super.b($$0, $$1);
      this.a.c.b(new zl($$0, $$1));
   }

   @Override
   protected void c(cmc $$0) {
      super.c($$0);
      this.a.c.b(new zl($$0, 0));
   }
}
