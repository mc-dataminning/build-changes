public class aet implements yz<abk> {
   public static final yq<vs, aet> a = yz.a(aet::a, aet::new);
   private final float b;
   private final int c;
   private final float d;

   public aet(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aet(vs $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zb<aet> a() {
      return afv.aH;
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

   public float f() {
      return this.d;
   }
}
