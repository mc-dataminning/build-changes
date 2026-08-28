public class aen implements zb<abn> {
   public static final ys<vr, aen> a = zb.a(aen::a, aen::new);
   private final int b;

   public aen(int $$0) {
      this.b = $$0;
   }

   private aen(vr $$0) {
      this.b = $$0.readByte();
   }

   private void a(vr $$0) {
      $$0.k(this.b);
   }

   @Override
   public zd<aen> a() {
      return afz.ax;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }
}
