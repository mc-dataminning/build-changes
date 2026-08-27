public class aec implements xf<adj> {
   private final int a;
   private final int b;

   public aec(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aec(ui $$0) {
      this.a = $$0.n();
      this.b = $$0.n();
   }

   @Override
   public void a(ui $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
   }

   public void a(adj $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
