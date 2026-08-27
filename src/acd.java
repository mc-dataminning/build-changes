public class acd implements zl<abw> {
   public static final zc<we, acd> a = zl.a(acd::a, acd::new);
   private final int b;
   private final ir c;
   private final int d;

   public acd(int $$0, ir $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private acd(we $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.k(this.d);
   }

   @Override
   public zn<acd> a() {
      return agj.i;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public ir e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
