public class afq implements aac<acr> {
   public static final zt<ws, afq> a = aac.a(afq::a, afq::new);
   private final double b;
   private final double c;

   public afq(dzk $$0) {
      this.b = $$0.a();
      this.c = $$0.b();
   }

   private afq(ws $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public aae<afq> a() {
      return ahk.av;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.c;
   }

   public double e() {
      return this.b;
   }
}
