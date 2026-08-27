public class eop extends eoo {
   private final epx a;

   public eop(eym $$0, epx $$1) {
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
