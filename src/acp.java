public class acp implements wk<acl> {
   private final int a;
   private final ht b;

   public acp(int $$0, ht $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public acp(tu $$0) {
      this.a = $$0.n();
      this.b = $$0.e();
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(acl $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public ht d() {
      return this.b;
   }
}
