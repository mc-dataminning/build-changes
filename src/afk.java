public class afk implements zv<ach> {
   public static final zm<wl, afk> a = zv.a(afk::a, afk::new);
   private final iz b;
   private final float c;

   public afk(iz $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private afk(wl $$0) {
      this.b = $$0.e();
      this.c = $$0.readFloat();
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zx<afk> a() {
      return agt.aA;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public iz b() {
      return this.b;
   }

   public float e() {
      return this.c;
   }
}
