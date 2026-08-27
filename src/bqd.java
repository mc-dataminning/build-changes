public class bqd implements bro {
   private final hz a;
   private final enz b;

   public bqd(hz $$0) {
      this.a = $$0.i();
      this.b = enz.b($$0);
   }

   public bqd(enz $$0) {
      this.a = hz.a($$0);
      this.b = $$0;
   }

   @Override
   public enz a() {
      return this.b;
   }

   @Override
   public hz b() {
      return this.a;
   }

   @Override
   public boolean a(boi $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
