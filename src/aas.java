public class aas implements yb<aam> {
   public static final xs<uu, aas> a = yb.a(aas::a, aas::new);
   private final int b;
   private final ib c;
   private final int d;

   public aas(int $$0, ib $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aas(uu $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(uu $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.k(this.d);
   }

   @Override
   public yd<aas> a() {
      return aex.h;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public ib e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
