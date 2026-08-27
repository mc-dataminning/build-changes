public class bpz implements brk {
   private final hz a;
   private final ens b;

   public bpz(hz $$0) {
      this.a = $$0.i();
      this.b = ens.b($$0);
   }

   public bpz(ens $$0) {
      this.a = hz.a($$0);
      this.b = $$0;
   }

   @Override
   public ens a() {
      return this.b;
   }

   @Override
   public hz b() {
      return this.a;
   }

   @Override
   public boolean a(bog $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
