public class ahq implements zj<agt> {
   public static final za<vy, ahq> a = zj.a(ahq::a, ahq::new);
   private final iw b;
   private final int c;
   private final boolean d;

   public ahq(iw $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahq(vy $$0) {
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
   public zl<ahq> a() {
      return agr.bG;
   }

   public void a(agt $$0) {
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
