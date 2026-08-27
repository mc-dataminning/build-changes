public class bhu implements bje {
   private final gu a;
   private final eei b;

   public bhu(gu $$0) {
      this.a = $$0.i();
      this.b = eei.b($$0);
   }

   public bhu(eei $$0) {
      this.a = gu.a($$0);
      this.b = $$0;
   }

   @Override
   public eei a() {
      return this.b;
   }

   @Override
   public gu b() {
      return this.a;
   }

   @Override
   public boolean a(bfz $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
