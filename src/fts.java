public class fts {
   private final ftu a;
   private final ftt b;

   private fts(ftu $$0, ftt $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ftm a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fts a(ftu $$0, int $$1, int $$2) {
      return new fts($$0, new ftt($$1, $$2));
   }
}
