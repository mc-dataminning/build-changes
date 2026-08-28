public class afp implements zp<ace> {
   public static final zg<wf, afp> a = zp.a(afp::a, afp::new);
   private final float b;
   private final int c;
   private final float d;

   public afp(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afp(wf $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zr<afp> a() {
      return agt.aH;
   }

   public void a(ace $$0) {
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
