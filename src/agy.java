public class agy implements zb<agb> {
   public static final ys<vr, agy> a = zb.a(agy::a, agy::new);
   private final boolean b;

   public agy(boolean $$0) {
      this.b = $$0;
   }

   private agy(vr $$0) {
      this.b = $$0.readBoolean();
   }

   private void a(vr $$0) {
      $$0.a(this.b);
   }

   @Override
   public zd<agy> a() {
      return afz.bA;
   }

   public void a(agb $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.b;
   }
}
