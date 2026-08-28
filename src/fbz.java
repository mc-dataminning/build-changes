public record fbz(int a, int b, boolean c) implements fca<faz> {
   public faz a() {
      return new fba(this.a, this.b, this.c);
   }

   public void a(faz $$0) {
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
