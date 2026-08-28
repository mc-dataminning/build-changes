public class bzz implements cbk {
   private final iw a;
   private final fgc b;

   public bzz(iw $$0) {
      this.a = $$0.j();
      this.b = fgc.b($$0);
   }

   public bzz(fgc $$0) {
      this.a = iw.a((jq)$$0);
      this.b = $$0;
   }

   @Override
   public fgc a() {
      return this.b;
   }

   @Override
   public iw b() {
      return this.a;
   }

   @Override
   public boolean a(byf $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
