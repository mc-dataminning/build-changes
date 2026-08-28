public class aeh implements zb<abn> {
   public static final ys<vr, aeh> a = zb.a(aeh::a, aeh::new);
   private final double b;
   private final double c;

   public aeh(duc $$0) {
      this.b = $$0.a();
      this.c = $$0.b();
   }

   private aeh(vr $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zd<aeh> a() {
      return afz.ar;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.c;
   }

   public double e() {
      return this.b;
   }
}
