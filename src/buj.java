public class buj implements bvu {
   private final ir a;
   private final ewu b;

   public buj(ir $$0) {
      this.a = $$0.i();
      this.b = ewu.b($$0);
   }

   public buj(ewu $$0) {
      this.a = ir.a($$0);
      this.b = $$0;
   }

   @Override
   public ewu a() {
      return this.b;
   }

   @Override
   public ir b() {
      return this.a;
   }

   @Override
   public boolean a(bso $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
