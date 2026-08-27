public record acw(int a, String b, int c, acv d) implements ux<acx> {
   private static final int e = 255;

   @Deprecated
   public acw(int a, String b, int c, acv d) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public acw(si $$0) {
      this($$0.m(), $$0.d(255), $$0.readUnsignedShort(), acv.a($$0.m()));
   }

   @Override
   public void a(si $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.c(this.d.a());
   }

   public void a(acx $$0) {
      $$0.a(this);
   }

   @Override
   public sh c() {
      return this.d.b();
   }

   public String d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public acv f() {
      return this.d;
   }
}
