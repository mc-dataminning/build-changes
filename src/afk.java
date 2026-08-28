public class afk implements zh<abw> {
   public static final yy<vw, afk> a = zh.a(afk::a, afk::new);
   private final float b;
   private final int c;
   private final float d;

   public afk(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afk(vw $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zj<afk> a() {
      return agp.aK;
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

   public float f() {
      return this.d;
   }
}
