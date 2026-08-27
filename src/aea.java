public class aea implements wk<acl> {
   private final int a;
   private final clj b;

   public aea(int $$0, clj $$1) {
      this.a = $$0;
      this.b = $$1.p();
   }

   public void a(acl $$0) {
      $$0.a(this);
   }

   public aea(tu $$0) {
      this.a = $$0.readShort();
      this.b = $$0.r();
   }

   @Override
   public void a(tu $$0) {
      $$0.l(this.a);
      $$0.a(this.b);
   }

   public int a() {
      return this.a;
   }

   public clj d() {
      return this.b;
   }
}
