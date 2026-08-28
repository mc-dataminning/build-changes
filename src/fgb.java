public record fgb(int a, int b, boolean c) implements fgc<ffb> {
   public ffb a() {
      return new ffc(this.a, this.b, this.c);
   }

   public void a(ffb $$0) {
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
