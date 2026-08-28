public class ahx implements zo<aha> {
   public static final ze<vy, ahx> a = zo.a(ahx::a, ahx::new);
   private final iw b;
   private final int c;
   private final boolean d;

   public ahx(iw $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahx(vy $$0) {
      this.b = $$0.e();
      this.c = $$0.l();
      this.d = $$0.readBoolean();
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zq<ahx> a() {
      return agy.bG;
   }

   public void a(aha $$0) {
      $$0.a(this);
   }

   public iw b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
