public record dgo(jf<dgl> a, int b) {
   public int a() {
      return this.b().a().b();
   }

   public jf<dgl> b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }
}
