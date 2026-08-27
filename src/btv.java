public class btv implements bvg {
   private final in a;
   private final etp b;

   public btv(in $$0) {
      this.a = $$0.i();
      this.b = etp.b($$0);
   }

   public btv(etp $$0) {
      this.a = in.a($$0);
      this.b = $$0;
   }

   @Override
   public etp a() {
      return this.b;
   }

   @Override
   public in b() {
      return this.a;
   }

   @Override
   public boolean a(bsa $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
