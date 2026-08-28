public record ars(String b, int c, cpt d, boolean e, int f, bvz g, boolean h, boolean i, arz j) {
   public static final int a = 16;

   public ars(ws $$0) {
      this(
         $$0.d(16),
         $$0.readByte(),
         $$0.b(cpt.class),
         $$0.readBoolean(),
         $$0.readUnsignedByte(),
         $$0.b(bvz.class),
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
      return new ars("en_us", 2, cpt.a, true, 0, cpw.bH, false, false, arz.a);
   }
}
