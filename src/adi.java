public class adi implements aac<acr> {
   public static final zt<ws, adi> a = aac.a(adi::a, adi::new);
   private final boolean b;

   public adi(boolean $$0) {
      this.b = $$0;
   }

   private adi(ws $$0) {
      this.b = $$0.readBoolean();
   }

   private void a(ws $$0) {
      $$0.a(this.b);
   }

   @Override
   public aae<adi> a() {
      return ahk.q;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.b;
   }
}
