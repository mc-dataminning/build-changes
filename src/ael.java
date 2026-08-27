public record ael(int a, String b, int c, aek d) implements wk<aem> {
   private static final int e = 255;

   @Deprecated
   public ael(int a, String b, int c, aek d) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public ael(tu $$0) {
      this($$0.n(), $$0.d(255), $$0.readUnsignedShort(), aek.a($$0.n()));
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.c(this.d.a());
   }

   public void a(aem $$0) {
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

   public aek f() {
      return this.d;
   }
}
