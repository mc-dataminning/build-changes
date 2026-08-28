public record fga(int a, int b, boolean c) implements fgb<ffa> {
   public ffa a() {
      return new ffb(this.a, this.b, this.c);
   }

   public void a(ffa $$0) {
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
