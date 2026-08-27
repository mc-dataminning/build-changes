public class aff implements zl<abw> {
   public static final zc<we, aff> a = zl.a(aff::a, aff::new);
   private final float b;
   private final int c;
   private final int d;

   public aff(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aff(we $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public zn<aff> a() {
      return agj.aH;
   }

   public void a(abw $$0) {
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
