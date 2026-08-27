public record afk(int a, String b, int c, afj d) implements xg<afl> {
   private static final int e = 255;

   @Deprecated
   public afk(int a, String b, int c, afj d) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public afk(uj $$0) {
      this($$0.n(), $$0.d(255), $$0.readUnsignedShort(), afj.a($$0.n()));
   }

   @Override
   public void a(uj $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.c(this.d.a());
   }

   public void a(afl $$0) {
      $$0.a(this);
   }

   @Override
   public ui c() {
      return this.d.b();
   }

   public String d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public afj f() {
      return this.d;
   }
}
