public class fkz {
   private final flb a;
   private final fla b;

   private fkz(flb $$0, fla $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fkt a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fkz a(flb $$0, int $$1, int $$2) {
      return new fkz($$0, new fla($$1, $$2));
   }
}
