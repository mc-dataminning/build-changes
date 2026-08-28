public class afs implements zs<ach> {
   public static final zj<wi, afs> a = zs.a(afs::a, afs::new);
   private final float b;
   private final int c;
   private final float d;

   public afs(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afs(wi $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(wi $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zu<afs> a() {
      return agw.aH;
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
