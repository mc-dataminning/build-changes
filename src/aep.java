public record aep(int a, String b, int c, aeo d) implements wo<aeq> {
   private static final int e = 255;

   @Deprecated
   public aep(int a, String b, int c, aeo d) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public aep(ty $$0) {
      this($$0.n(), $$0.d(255), $$0.readUnsignedShort(), aeo.a($$0.n()));
   }

   @Override
   public void a(ty $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.c(this.d.a());
   }

   public void a(aeq $$0) {
      $$0.a(this);
   }

   @Override
   public tx c() {
      return this.d.b();
   }

   public String d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public aeo f() {
      return this.d;
   }
}
