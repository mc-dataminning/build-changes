public class bnz implements bpk {
   private final hx a;
   private final elm b;

   public bnz(hx $$0) {
      this.a = $$0.i();
      this.b = elm.b($$0);
   }

   public bnz(elm $$0) {
      this.a = hx.a($$0);
      this.b = $$0;
   }

   @Override
   public elm a() {
      return this.b;
   }

   @Override
   public hx b() {
      return this.a;
   }

   @Override
   public boolean a(bmf $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
