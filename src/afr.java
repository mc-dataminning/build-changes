public class afr implements zw<aci> {
   public static final zn<wm, afr> a = zw.a(afr::a, afr::new);
   private final float b;
   private final int c;
   private final int d;

   public afr(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afr(wm $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(wm $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public zy<afr> a() {
      return agu.aG;
   }

   public void a(aci $$0) {
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
