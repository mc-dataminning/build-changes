public record aqv(String b, int c, cnv d, boolean e, int f, buh g, boolean h, boolean i, arc j) {
   public static final int a = 16;

   public aqv(wb $$0) {
      this(
         $$0.d(16),
         $$0.readByte(),
         $$0.b(cnv.class),
         $$0.readBoolean(),
         $$0.readUnsignedByte(),
         $$0.b(buh.class),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(arc.class)
      );
   }

   public void a(wb $$0) {
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

   public static aqv a() {
      return new aqv("en_us", 2, cnv.a, true, 0, cnx.bD, false, false, arc.a);
   }
}
