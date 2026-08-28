public record fgb(int a, int b, boolean c, int d) implements fgc<ffb> {
   public ffb a() {
      return new ffc(this.a, this.b, this.c);
   }

   public void a(ffb $$0) {
      $$0.b(axk.j(this.d), axk.k(this.d), axk.l(this.d), axk.i(this.d));
   }

   public void b(ffb $$0) {
      $$0.a();
   }

   @Override
   public boolean a(fgc<?> $$0) {
      return !($$0 instanceof fgb $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
