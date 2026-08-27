public class eoh extends eog {
   private final epp a;

   public eoh(eye $$0, epp $$1) {
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
