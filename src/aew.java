public class aew implements zb<abn> {
   public static final ys<vr, aew> a = zb.a(aew::a, aew::new);
   private final float b;
   private final int c;
   private final int d;

   public aew(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aew(vr $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public zd<aew> a() {
      return afz.aG;
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

   public int f() {
      return this.d;
   }
}
