public record fdd(int a, int b, boolean c) implements fde<fcd> {
   public fcd a() {
      return new fce(this.a, this.b, this.c);
   }

   public void a(fcd $$0) {
      $$0.a();
   }

   public int b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }
}
