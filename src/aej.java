public record aej(int a, String b, int c, aei d) implements wk<aek> {
   private static final int e = 255;

   @Deprecated
   public aej(int a, String b, int c, aei d) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public aej(tu $$0) {
      this($$0.n(), $$0.d(255), $$0.readUnsignedShort(), aei.a($$0.n()));
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.c(this.d.a());
   }

   public void a(aek $$0) {
      $$0.a(this);
   }

   @Override
   public tt c() {
      return this.d.b();
   }

   public String d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public aei f() {
      return this.d;
   }
}
