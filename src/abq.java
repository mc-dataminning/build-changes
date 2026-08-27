public class abq implements yz<abk> {
   public static final yq<vs, abq> a = yz.a(abq::a, abq::new);
   private final int b;
   private final im c;
   private final int d;

   public abq(int $$0, im $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private abq(vs $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.k(this.d);
   }

   @Override
   public zb<abq> a() {
      return afv.h;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public im e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
