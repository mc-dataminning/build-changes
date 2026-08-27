public record adc(int a, String b, int c, adb d) implements vd<add> {
   private static final int e = 255;

   @Deprecated
   public adc(int a, String b, int c, adb d) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public adc(so $$0) {
      this($$0.m(), $$0.d(255), $$0.readUnsignedShort(), adb.a($$0.m()));
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.c(this.d.a());
   }

   public void a(add $$0) {
      $$0.a(this);
   }

   @Override
   public sn c() {
      return this.d.b();
   }

   public String d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adb f() {
      return this.d;
   }
}
