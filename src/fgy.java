public record fgy(int a, int b, boolean c, int d) implements fgz<ffy> {
   public ffy a() {
      return new ffz(this.a, this.b, this.c);
   }

   public void a(ffy $$0) {
      $$0.b(axu.j(this.d), axu.k(this.d), axu.l(this.d), axu.i(this.d));
   }

   public void b(ffy $$0) {
      $$0.a();
   }

   @Override
   public boolean a(fgz<?> $$0) {
      return !($$0 instanceof fgy $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
