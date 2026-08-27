public record aew(int a, String b, int c, aev d) implements wu<aex> {
   private static final int e = 255;

   @Deprecated
   public aew(int a, String b, int c, aev d) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public aew(ue $$0) {
      this($$0.n(), $$0.d(255), $$0.readUnsignedShort(), aev.a($$0.n()));
   }

   @Override
   public void a(ue $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.c(this.d.a());
   }

   public void a(aex $$0) {
      $$0.a(this);
   }

   @Override
   public ud c() {
      return this.d.b();
   }

   public String d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public aev f() {
      return this.d;
   }
}
