public class aeo implements zb<abn> {
   public static final ys<vr, aeo> a = zb.a(aeo::a, aeo::new);
   private final int b;
   private final int c;

   public aeo(int $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aeo(vr $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
   }

   @Override
   public zd<aeo> a() {
      return afz.ay;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
