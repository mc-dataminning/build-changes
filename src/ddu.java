public record ddu(jr<ddr> a, int b) {
   public int a() {
      return this.b().a().b();
   }

   public jr<ddr> b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }
}
