public record acu(int a, String b, int c, act d) implements uw<acv> {
   private static final int e = 255;

   @Deprecated
   public acu(int a, String b, int c, act d) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public acu(sh $$0) {
      this($$0.m(), $$0.d(255), $$0.readUnsignedShort(), act.a($$0.m()));
   }

   @Override
   public void a(sh $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.c(this.d.a());
   }

   public void a(acv $$0) {
      $$0.a(this);
   }

   @Override
   public sg c() {
      return this.d.b();
   }

   public String d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public act f() {
      return this.d;
   }
}
