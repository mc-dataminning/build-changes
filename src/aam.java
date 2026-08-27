public class aam implements uw<wo> {
   private final int a;
   private final int b;
   private final int c;

   public aam(int $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aam(sh $$0) {
      this.a = $$0.m();
      this.b = $$0.m();
      this.c = $$0.m();
   }

   @Override
   public void a(sh $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
      $$0.c(this.c);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
