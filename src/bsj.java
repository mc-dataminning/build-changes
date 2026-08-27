public class bsj implements btu {
   private final ib a;
   private final esa b;

   public bsj(ib $$0) {
      this.a = $$0.i();
      this.b = esa.b($$0);
   }

   public bsj(esa $$0) {
      this.a = ib.a($$0);
      this.b = $$0;
   }

   @Override
   public esa a() {
      return this.b;
   }

   @Override
   public ib b() {
      return this.a;
   }

   @Override
   public boolean a(bqo $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
