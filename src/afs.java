public class afs implements zw<aci> {
   public static final zn<wm, afs> a = zw.a(afs::a, afs::new);
   private final float b;
   private final int c;
   private final float d;

   public afs(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afs(wm $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(wm $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zy<afs> a() {
      return agu.aH;
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

   public float f() {
      return this.d;
   }
}
