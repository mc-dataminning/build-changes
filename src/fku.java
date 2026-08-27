public class fku {
   private final fkw a;
   private final fkv b;

   private fku(fkw $$0, fkv $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fko a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fku a(fkw $$0, int $$1, int $$2) {
      return new fku($$0, new fkv($$1, $$2));
   }
}
