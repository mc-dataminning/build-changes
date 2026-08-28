public class buy implements bwj {
   private final ja a;
   private final ewh b;

   public buy(ja $$0) {
      this.a = $$0.i();
      this.b = ewh.b($$0);
   }

   public buy(ewh $$0) {
      this.a = ja.a($$0);
      this.b = $$0;
   }

   @Override
   public ewh a() {
      return this.b;
   }

   @Override
   public ja b() {
      return this.a;
   }

   @Override
   public boolean a(btc $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
