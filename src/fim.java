public record fim(int a, int b, boolean c, int d) implements fin<fhm> {
   public fhm a() {
      return new fhn(this.a, this.b, this.c);
   }

   public void a(fhm $$0) {
      $$0.b(axw.j(this.d), axw.k(this.d), axw.l(this.d), axw.i(this.d));
   }

   public void b(fhm $$0) {
      $$0.a();
   }

   @Override
   public boolean a(fin<?> $$0) {
      return !($$0 instanceof fim $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
