public class acx implements wk<acl> {
   private final int a;
   private final String b;

   public acx(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public acx(tu $$0) {
      this.a = $$0.n();
      this.b = $$0.d(32500);
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.a);
      $$0.a(this.b, 32500);
   }

   public void a(acl $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public String d() {
      return this.b;
   }
}
