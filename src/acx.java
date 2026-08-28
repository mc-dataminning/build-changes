public class acx implements aac<acr> {
   public static final zt<ws, acx> a = aac.a(acx::a, acx::new);
   private final int b;
   private final jh c;
   private final int d;

   public acx(int $$0, jh $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private acx(ws $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(ws $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
   }

   @Override
   public aae<acx> a() {
      return ahk.h;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public jh e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
