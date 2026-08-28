public record fcs(int a, int b, boolean c) implements fct<fbs> {
   public fbs a() {
      return new fbt(this.a, this.b, this.c);
   }

   public void a(fbs $$0) {
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
