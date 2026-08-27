public class fql {
   private final fqn a;
   private final fqm b;

   private fql(fqn $$0, fqm $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fqf a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fql a(fqn $$0, int $$1, int $$2) {
      return new fql($$0, new fqm($$1, $$2));
   }
}
