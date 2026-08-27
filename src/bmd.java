public class bmd implements bnn {
   private final ht a;
   private final eif b;

   public bmd(ht $$0) {
      this.a = $$0.i();
      this.b = eif.b($$0);
   }

   public bmd(eif $$0) {
      this.a = ht.a($$0);
      this.b = $$0;
   }

   @Override
   public eif a() {
      return this.b;
   }

   @Override
   public ht b() {
      return this.a;
   }

   @Override
   public boolean a(bkj $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
