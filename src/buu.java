public class buu implements bwf {
   private final ja a;
   private final evz b;

   public buu(ja $$0) {
      this.a = $$0.i();
      this.b = evz.b($$0);
   }

   public buu(evz $$0) {
      this.a = ja.a($$0);
      this.b = $$0;
   }

   @Override
   public evz a() {
      return this.b;
   }

   @Override
   public ja b() {
      return this.a;
   }

   @Override
   public boolean a(bsy $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
