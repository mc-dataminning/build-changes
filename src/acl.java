public class acl implements yn<aay> {
   public static final ye<vg, acl> a = yn.a(acl::a, acl::new);
   private final int b;
   private final ib c;
   private final int d;
   private final boolean e;

   public acl(int $$0, ib $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1.i();
      this.d = $$2;
      this.e = $$3;
   }

   private acl(vg $$0) {
      this.b = $$0.readInt();
      this.c = $$0.e();
      this.d = $$0.readInt();
      this.e = $$0.readBoolean();
   }

   private void a(vg $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.a(this.e);
   }

   @Override
   public yp<acl> a() {
      return afj.L;
   }

   public void a(aay $$0) {
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

   public ib g() {
      return this.c;
   }
}
