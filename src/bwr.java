public class bwr implements byc {
   private final jg a;
   private final ezh b;

   public bwr(jg $$0) {
      this.a = $$0.j();
      this.b = ezh.b($$0);
   }

   public bwr(ezh $$0) {
      this.a = jg.a((jz)$$0);
      this.b = $$0;
   }

   @Override
   public ezh a() {
      return this.b;
   }

   @Override
   public jg b() {
      return this.a;
   }

   @Override
   public boolean a(buv $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
