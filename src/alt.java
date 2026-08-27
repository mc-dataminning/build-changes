public record alt(String b, int c, cds d, boolean e, int f, bla g, boolean h, boolean i) {
   public static final int a = 16;

   public alt(tu $$0) {
      this($$0.d(16), $$0.readByte(), $$0.b(cds.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(bla.class), $$0.readBoolean(), $$0.readBoolean());
   }

   public void a(tu $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
   }

   public static alt a() {
      return new alt("en_us", 2, cds.a, true, 0, cdu.bB, false, false);
   }
}
