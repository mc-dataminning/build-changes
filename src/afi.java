public class afi implements zw<aci> {
   public static final zn<wm, afi> a = zw.a(afi::a, afi::new);
   private final int b;

   public afi(int $$0) {
      this.b = $$0;
   }

   private afi(wm $$0) {
      this.b = $$0.readByte();
   }

   private void a(wm $$0) {
      $$0.k(this.b);
   }

   @Override
   public zy<afi> a() {
      return agu.ax;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }
}
