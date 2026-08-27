public class acx implements yz<abk> {
   public static final yq<vs, acx> a = yz.a(acx::a, acx::new);
   private final int b;
   private final im c;
   private final int d;
   private final boolean e;

   public acx(int $$0, im $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1.i();
      this.d = $$2;
      this.e = $$3;
   }

   private acx(vs $$0) {
      this.b = $$0.readInt();
      this.c = $$0.e();
      this.d = $$0.readInt();
      this.e = $$0.readBoolean();
   }

   private void a(vs $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.a(this.e);
   }

   @Override
   public zb<acx> a() {
      return afv.L;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.e;
   }

   public int e() {
      return this.b;
   }

   public int f() {
      return this.d;
   }

   public im g() {
      return this.c;
   }
}
