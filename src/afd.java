public class afd implements zf<abt> {
   public static final yw<vv, afd> a = zf.a(afd::a, afd::new);
   private final float b;
   private final int c;
   private final float d;

   public afd(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afd(vv $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(vv $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zh<afd> a() {
      return agf.aH;
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

   public float f() {
      return this.d;
   }
}
