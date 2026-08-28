public class aij implements aac<ahm> {
   public static final zt<ws, aij> a = aac.a(aij::a, aij::new);
   private final jh b;
   private final int c;
   private final boolean d;

   public aij(jh $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aij(ws $$0) {
      this.b = $$0.e();
      this.c = $$0.l();
      this.d = $$0.readBoolean();
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public aae<aij> a() {
      return ahk.bG;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
