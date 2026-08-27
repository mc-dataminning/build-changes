public class eon extends eom {
   private final epv a;

   public eon(eyk $$0, epv $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   public void c() {
      super.c();
      this.a.c();
   }

   @Override
   protected void e() {
      this.a.b();
      super.e();
   }
}
