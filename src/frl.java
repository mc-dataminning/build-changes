public class frl {
   private final frn a;
   private final frm b;

   private frl(frn $$0, frm $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public frf a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static frl a(frn $$0, int $$1, int $$2) {
      return new frl($$0, new frm($$1, $$2));
   }
}
