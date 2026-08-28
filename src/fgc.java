public record fgc(int a, int b, boolean c) implements fgd<ffc> {
   public ffc a() {
      return new ffd(this.a, this.b, this.c);
   }

   public void a(ffc $$0) {
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
