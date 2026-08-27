public class aae implements uw<wo> {
   private final int a;
   private final int b;
   private final int c;

   public aae(int $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aae(sh $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   @Override
   public void a(sh $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
      $$0.p(this.c);
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
