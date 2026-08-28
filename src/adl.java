public class adl implements zj<aby> {
   public static final za<vy, adl> a = zj.a(adl::a, adl::new);
   private final int b;
   private final iw c;
   private final int d;
   private final boolean e;

   public adl(int $$0, iw $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1.j();
      this.d = $$2;
      this.e = $$3;
   }

   private adl(vy $$0) {
      this.b = $$0.readInt();
      this.c = $$0.e();
      this.d = $$0.readInt();
      this.e = $$0.readBoolean();
   }

   private void a(vy $$0) {
      $$0.q(this.b);
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
   }

   @Override
   public zl<adl> a() {
      return agr.L;
   }

   public void a(aby $$0) {
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

   public iw g() {
      return this.c;
   }
}
