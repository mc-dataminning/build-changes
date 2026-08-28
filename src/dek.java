public record dek(js<deh> a, int b) {
   public int a() {
      return this.b().a().b();
   }

   public js<deh> b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }
}
