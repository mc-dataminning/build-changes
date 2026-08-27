public class fnc {
   private final fne a;
   private final fnd b;

   private fnc(fne $$0, fnd $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fmw a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fnc a(fne $$0, int $$1, int $$2) {
      return new fnc($$0, new fnd($$1, $$2));
   }
}
