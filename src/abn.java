public class abn implements uw<aav> {
   private final int a;
   private final int b;

   public abn(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public abn(sh $$0) {
      this.a = $$0.m();
      this.b = $$0.m();
   }

   @Override
   public void a(sh $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
   }

   public void a(aav $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
