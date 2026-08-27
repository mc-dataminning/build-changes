public class aee implements yb<aam> {
   public static final xs<uu, aee> a = yb.a(aee::a, aee::new);
   private final int b;
   private final int c;
   private final int d;

   public aee(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aee(uu $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = $$0.readInt();
   }

   private void a(uu $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
      $$0.p(this.d);
   }

   @Override
   public yd<aee> a() {
      return aex.aQ;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
