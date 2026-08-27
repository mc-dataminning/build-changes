public record akh(String b, int c, cbu d, boolean e, int f, bjc g, boolean h, boolean i) {
   public static final int a = 16;

   public akh(sq $$0) {
      this($$0.d(16), $$0.readByte(), $$0.b(cbu.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(bjc.class), $$0.readBoolean(), $$0.readBoolean());
   }

   public void a(sq $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
   }

   public static akh a() {
      return new akh("en_us", 2, cbu.a, true, 0, cbw.bB, false, false);
   }
}
