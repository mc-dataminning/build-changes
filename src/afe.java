public class afe implements zw<aci> {
   public static final zn<wm, afe> a = zw.a(afe::a, afe::new);
   private final double b;

   public afe(dtt $$0) {
      this.b = $$0.k();
   }

   private afe(wm $$0) {
      this.b = $$0.readDouble();
   }

   private void a(wm $$0) {
      $$0.a(this.b);
   }

   @Override
   public zy<afe> a() {
      return agu.at;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.b;
   }
}
