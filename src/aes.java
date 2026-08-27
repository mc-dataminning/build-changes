public class aes implements yz<abk> {
   public static final yq<vs, aes> a = yz.a(aes::a, aes::new);
   private final float b;
   private final int c;
   private final int d;

   public aes(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aes(vs $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public zb<aes> a() {
      return afv.aG;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public float b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
