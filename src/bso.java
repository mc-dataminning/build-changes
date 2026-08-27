public class bso implements btz {
   private final id a;
   private final esj b;

   public bso(id $$0) {
      this.a = $$0.i();
      this.b = esj.b($$0);
   }

   public bso(esj $$0) {
      this.a = id.a($$0);
      this.b = $$0;
   }

   @Override
   public esj a() {
      return this.b;
   }

   @Override
   public id b() {
      return this.a;
   }

   @Override
   public boolean a(bqt $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
