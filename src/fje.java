public record fje(int a, int b, boolean c, int d) implements fjf<fie> {
   public fie a() {
      return new fif(null, this.a, this.b, this.c);
   }

   public void a(fie $$0) {
      $$0.b(axw.j(this.d), axw.k(this.d), axw.l(this.d), axw.i(this.d));
   }

   public void b(fie $$0) {
      $$0.a();
   }

   @Override
   public boolean a(fjf<?> $$0) {
      return !($$0 instanceof fje $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
