public class ahp implements aac<ahm> {
   public static final zt<ws, ahp> a = aac.a(ahp::a, ahp::new);
   private final int b;
   private final jh c;

   public ahp(int $$0, jh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ahp(ws $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
   }

   private void a(ws $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public aae<ahp> a() {
      return ahk.bl;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public jh e() {
      return this.c;
   }
}
