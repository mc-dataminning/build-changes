public record ars(String b, int c, cpu d, boolean e, int f, bwa g, boolean h, boolean i, arz j) {
   public static final int a = 16;

   public ars(ws $$0) {
      this(
         $$0.d(16),
         $$0.readByte(),
         $$0.b(cpu.class),
         $$0.readBoolean(),
         $$0.readUnsignedByte(),
         $$0.b(bwa.class),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(arz.class)
      );
   }

   public void a(ws $$0) {
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

   public static ars a() {
      return new ars("en_us", 2, cpu.a, true, 0, cpx.bH, false, false, arz.a);
   }
}
