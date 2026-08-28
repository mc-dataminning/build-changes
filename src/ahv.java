public class ahv implements zs<agy> {
   public static final zj<wi, ahv> a = zs.a(ahv::a, ahv::new);
   private final jh b;
   private final int c;
   private final boolean d;

   public ahv(jh $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahv(wi $$0) {
      this.b = $$0.e();
      this.c = $$0.l();
      this.d = $$0.readBoolean();
   }

   private void a(wi $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zu<ahv> a() {
      return agw.bC;
   }

   public void a(agy $$0) {
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
