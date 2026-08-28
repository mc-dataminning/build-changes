public class afc implements zf<abt> {
   public static final yw<vv, afc> a = zf.a(afc::a, afc::new);
   private final float b;
   private final int c;
   private final int d;

   public afc(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afc(vv $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(vv $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public zh<afc> a() {
      return agf.aG;
   }

   public void a(abt $$0) {
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
