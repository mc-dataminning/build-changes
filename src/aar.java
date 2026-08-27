public class aar implements uo<zb> {
   private final int a;
   private final cfz b;

   public aar(int $$0, cfz $$1) {
      this.a = $$0;
      this.b = $$1.p();
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public aar(sf $$0) {
      this.a = $$0.readShort();
      this.b = $$0.r();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeShort(this.a);
      $$0.a(this.b);
   }

   public int a() {
      return this.a;
   }

   public cfz c() {
      return this.b;
   }
}
