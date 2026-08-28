public record fjj(int a, int b, boolean c, int d) implements fjk<fij> {
   public fij a() {
      return new fik(null, this.a, this.b, this.c);
   }

   public void a(fij $$0) {
      $$0.b(axw.j(this.d), axw.k(this.d), axw.l(this.d), axw.i(this.d));
   }

   public void b(fij $$0) {
      $$0.a();
   }

   @Override
   public boolean a(fjk<?> $$0) {
      return !($$0 instanceof fjj $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
