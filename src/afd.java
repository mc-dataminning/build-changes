public class afd implements aac<acr> {
   public static final zt<ws, afd> a = aac.a(afd::a, afd::new);
   private final int b;
   private final double c;

   public afd(int $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private afd(ws $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
   }

   private void a(ws $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public aae<afd> a() {
      return ahk.bj;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }
}
