public record arc(String b, int c, coo d, boolean e, int f, buy g, boolean h, boolean i, arj j) {
   public static final int a = 16;

   public arc(wi $$0) {
      this(
         $$0.d(16),
         $$0.readByte(),
         $$0.b(coo.class),
         $$0.readBoolean(),
         $$0.readUnsignedByte(),
         $$0.b(buy.class),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(arj.class)
      );
   }

   public void a(wi $$0) {
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.l(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
      $$0.a(this.j);
   }

   public static arc a() {
      return new arc("en_us", 2, coo.a, true, 0, cor.bH, false, false, arj.a);
   }
}
