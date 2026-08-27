public class fkh {
   private final fkj a;
   private final fki b;

   private fkh(fkj $$0, fki $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fkb a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fkh a(fkj $$0, int $$1, int $$2) {
      return new fkh($$0, new fki($$1, $$2));
   }
}
