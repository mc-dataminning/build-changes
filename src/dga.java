public record dga(jf<dfx> a, int b) {
   public int a() {
      return this.b().a().b();
   }

   public jf<dfx> b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }
}
