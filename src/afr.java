public class afr implements zv<ach> {
   public static final zm<wl, afr> a = zv.a(afr::a, afr::new);
   private final float b;
   private final int c;
   private final float d;

   public afr(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afr(wl $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zx<afr> a() {
      return agt.aH;
   }

   public void a(ach $$0) {
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
