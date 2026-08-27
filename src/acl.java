public class acl implements yb<aam> {
   public static final xs<uu, acl> a = yb.a(acl::a, acl::new);
   private final int b;
   private final ajh c;

   public acl(int $$0, ctp<?> $$1) {
      this.b = $$0;
      this.c = $$1.a();
   }

   private acl(uu $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
   }

   private void a(uu $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
   }

   @Override
   public yd<acl> a() {
      return aex.Y;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public ajh b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
