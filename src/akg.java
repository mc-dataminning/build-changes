public record akg(String b, int c, cbs d, boolean e, int f, bja g, boolean h, boolean i) {
   public static final int a = 16;

   public akg(sp $$0) {
      this($$0.d(16), $$0.readByte(), $$0.b(cbs.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(bja.class), $$0.readBoolean(), $$0.readBoolean());
   }

   public void a(sp $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
   }

   public static akg a() {
      return new akg("en_us", 2, cbs.a, true, 0, cbu.bB, false, false);
   }
}
