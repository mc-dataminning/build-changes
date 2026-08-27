public class abp implements ux<aaw> {
   private final int a;
   private final int b;

   public abp(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public abp(si $$0) {
      this.a = $$0.m();
      this.b = $$0.m();
   }

   @Override
   public void a(si $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
   }

   public void a(aaw $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
