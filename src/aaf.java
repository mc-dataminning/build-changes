public class aaf implements ux<wp> {
   private final int a;
   private final int b;
   private final int c;

   public aaf(int $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aaf(si $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   @Override
   public void a(si $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
      $$0.p(this.c);
   }

   public void a(wp $$0) {
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
