public class ada implements zb<abn> {
   public static final ys<vr, ada> a = zb.a(ada::a, ada::new);
   private final int b;
   private final ja c;
   private final int d;
   private final boolean e;

   public ada(int $$0, ja $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1.i();
      this.d = $$2;
      this.e = $$3;
   }

   private ada(vr $$0) {
      this.b = $$0.readInt();
      this.c = $$0.e();
      this.d = $$0.readInt();
      this.e = $$0.readBoolean();
   }

   private void a(vr $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.a(this.e);
   }

   @Override
   public zd<ada> a() {
      return afz.L;
   }

   public void a(abn $$0) {
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

   public ja g() {
      return this.c;
   }
}
