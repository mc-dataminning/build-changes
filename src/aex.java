public class aex implements zb<abn> {
   public static final ys<vr, aex> a = zb.a(aex::a, aex::new);
   private final float b;
   private final int c;
   private final float d;

   public aex(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aex(vr $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zd<aex> a() {
      return afz.aH;
   }

   public void a(abn $$0) {
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
