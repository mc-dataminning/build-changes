public record fiu(int a, int b, boolean c, int d) implements fiv<fhu> {
   public fhu a() {
      return new fhv(this.a, this.b, this.c);
   }

   public void a(fhu $$0) {
      $$0.b(axw.j(this.d), axw.k(this.d), axw.l(this.d), axw.i(this.d));
   }

   public void b(fhu $$0) {
      $$0.a();
   }

   @Override
   public boolean a(fiv<?> $$0) {
      return !($$0 instanceof fiu $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
