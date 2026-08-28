public class afm implements zj<aby> {
   public static final za<vy, afm> a = zj.a(afm::a, afm::new);
   private final float b;
   private final int c;
   private final float d;

   public afm(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afm(vy $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zl<afm> a() {
      return agr.aK;
   }

   public void a(aby $$0) {
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
