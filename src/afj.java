public record afj(int a, String b, int c, afi d) implements xf<afk> {
   private static final int e = 255;

   @Deprecated
   public afj(int a, String b, int c, afi d) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public afj(ui $$0) {
      this($$0.n(), $$0.d(255), $$0.readUnsignedShort(), afi.a($$0.n()));
   }

   @Override
   public void a(ui $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.c(this.d.a());
   }

   public void a(afk $$0) {
      $$0.a(this);
   }

   @Override
   public uh c() {
      return this.d.b();
   }

   public String d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public afi f() {
      return this.d;
   }
}
