public class fnb {
   private final fnd a;
   private final fnc b;

   private fnb(fnd $$0, fnc $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fmv a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fnb a(fnd $$0, int $$1, int $$2) {
      return new fnb($$0, new fnc($$1, $$2));
   }
}
