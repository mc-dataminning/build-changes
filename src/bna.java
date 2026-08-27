public class bna implements bok {
   private final ht a;
   private final eju b;

   public bna(ht $$0) {
      this.a = $$0.i();
      this.b = eju.b($$0);
   }

   public bna(eju $$0) {
      this.a = ht.a($$0);
      this.b = $$0;
   }

   @Override
   public eju a() {
      return this.b;
   }

   @Override
   public ht b() {
      return this.a;
   }

   @Override
   public boolean a(blg $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
