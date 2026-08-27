public class bof implements bpq {
   private final hx a;
   private final elt b;

   public bof(hx $$0) {
      this.a = $$0.i();
      this.b = elt.b($$0);
   }

   public bof(elt $$0) {
      this.a = hx.a($$0);
      this.b = $$0;
   }

   @Override
   public elt a() {
      return this.b;
   }

   @Override
   public hx b() {
      return this.a;
   }

   @Override
   public boolean a(bml $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
