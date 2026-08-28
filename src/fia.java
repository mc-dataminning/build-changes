public record fia(int a, int b, boolean c, int d) implements fib<fha> {
   public fha a() {
      return new fhb(this.a, this.b, this.c);
   }

   public void a(fha $$0) {
      $$0.b(axu.j(this.d), axu.k(this.d), axu.l(this.d), axu.i(this.d));
   }

   public void b(fha $$0) {
      $$0.a();
   }

   @Override
   public boolean a(fib<?> $$0) {
      return !($$0 instanceof fia $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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

   public int e() {
      return this.d;
   }
}
