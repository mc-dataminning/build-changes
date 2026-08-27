public class bkt implements bmd {
   private final gu a;
   private final ehe b;

   public bkt(gu $$0) {
      this.a = $$0.i();
      this.b = ehe.b($$0);
   }

   public bkt(ehe $$0) {
      this.a = gu.a($$0);
      this.b = $$0;
   }

   @Override
   public ehe a() {
      return this.b;
   }

   @Override
   public gu b() {
      return this.a;
   }

   @Override
   public boolean a(biy $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
