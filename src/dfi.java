public record dfi(je<dff> a, int b) {
   public int a() {
      return this.b().a().b();
   }

   public je<dff> b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }
}
