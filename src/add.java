public record add(int a, String b, int c, adc d) implements vf<ade> {
   private static final int e = 255;

   @Deprecated
   public add(int a, String b, int c, adc d) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public add(sq $$0) {
      this($$0.m(), $$0.d(255), $$0.readUnsignedShort(), adc.a($$0.m()));
   }

   @Override
   public void a(sq $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.c(this.d.a());
   }

   public void a(ade $$0) {
      $$0.a(this);
   }

   @Override
   public sp c() {
      return this.d.b();
   }

   public String d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adc f() {
      return this.d;
   }
}
