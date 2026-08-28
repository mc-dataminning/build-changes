public record dfo(je<dfl> a, int b) {
   public int a() {
      return this.b().a().b();
   }

   public je<dfl> b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }
}
