public record afg(int a, String b, int c, aff d) implements xd<afh> {
   private static final int e = 255;

   @Deprecated
   public afg(int a, String b, int c, aff d) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public afg(ug $$0) {
      this($$0.n(), $$0.d(255), $$0.readUnsignedShort(), aff.a($$0.n()));
   }

   @Override
   public void a(ug $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.c(this.d.a());
   }

   public void a(afh $$0) {
      $$0.a(this);
   }

   @Override
   public uf c() {
      return this.d.b();
   }

   public String d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public aff f() {
      return this.d;
   }
}
