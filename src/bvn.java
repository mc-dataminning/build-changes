public class bvn implements bwy {
   private final iz a;
   private final evt b;

   public bvn(iz $$0) {
      this.a = $$0.i();
      this.b = evt.b($$0);
   }

   public bvn(evt $$0) {
      this.a = iz.a($$0);
      this.b = $$0;
   }

   @Override
   public evt a() {
      return this.b;
   }

   @Override
   public iz b() {
      return this.a;
   }

   @Override
   public boolean a(btr $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
