public class boi implements bpt {
   private final hx a;
   private final emc b;

   public boi(hx $$0) {
      this.a = $$0.i();
      this.b = emc.b($$0);
   }

   public boi(emc $$0) {
      this.a = hx.a($$0);
      this.b = $$0;
   }

   @Override
   public emc a() {
      return this.b;
   }

   @Override
   public hx b() {
      return this.a;
   }

   @Override
   public boolean a(bmo $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
