public class acd implements zj<aby> {
   public static final za<vy, acd> a = zj.a(acd::a, acd::new);
   private final int b;
   private final iw c;
   private final int d;

   public acd(int $$0, iw $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private acd(vy $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(vy $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
   }

   @Override
   public zl<acd> a() {
      return agr.g;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public iw e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
