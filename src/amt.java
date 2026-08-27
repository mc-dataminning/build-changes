public record amt(String b, int c, cfo d, boolean e, int f, bmi g, boolean h, boolean i) {
   public static final int a = 16;

   public amt(uj $$0) {
      this($$0.d(16), $$0.readByte(), $$0.b(cfo.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(bmi.class), $$0.readBoolean(), $$0.readBoolean());
   }

   public void a(uj $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
   }

   public static amt a() {
      return new amt("en_us", 2, cfo.a, true, 0, cfq.bC, false, false);
   }
}
