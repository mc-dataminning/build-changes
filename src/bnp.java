public class bnp implements bpa {
   private final hv a;
   private final elb b;

   public bnp(hv $$0) {
      this.a = $$0.i();
      this.b = elb.b($$0);
   }

   public bnp(elb $$0) {
      this.a = hv.a($$0);
      this.b = $$0;
   }

   @Override
   public elb a() {
      return this.b;
   }

   @Override
   public hv b() {
      return this.a;
   }

   @Override
   public boolean a(blv $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
