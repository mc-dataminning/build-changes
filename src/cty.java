public class cty implements cso {
   private final int[] a;

   public cty(int $$0) {
      this.a = new int[$$0];
   }

   @Override
   public int a(int $$0) {
      return this.a[$$0];
   }

   @Override
   public void a(int $$0, int $$1) {
      this.a[$$0] = $$1;
   }

   @Override
   public int a() {
      return this.a.length;
   }
}
