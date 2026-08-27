public class acl implements ux<aaw> {
   private final int a;
   private final ciy b;

   public acl(int $$0, ciy $$1) {
      this.a = $$0;
      this.b = $$1.p();
   }

   public void a(aaw $$0) {
      $$0.a(this);
   }

   public acl(si $$0) {
      this.a = $$0.readShort();
      this.b = $$0.q();
   }

   @Override
   public void a(si $$0) {
      $$0.l(this.a);
      $$0.a(this.b);
   }

   public int a() {
      return this.a;
   }

   public ciy d() {
      return this.b;
   }
}
