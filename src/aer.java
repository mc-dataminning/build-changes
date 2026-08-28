public class aer implements aac<acr> {
   public static final zt<ws, aer> a = aac.a(aer::a, aer::new);
   private final jh b;
   private final boolean c;

   public aer(jh $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aer(ws $$0) {
      this.b = $$0.e();
      this.c = $$0.readBoolean();
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public aae<aer> a() {
      return ahk.Y;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
