public record aqx(String b, int c, cqf d, boolean e, int f, bwk g, boolean h, boolean i, arf j) {
   public static final int a = 16;

   public aqx(vr $$0) {
      this(
         $$0.d(16),
         $$0.readByte(),
         $$0.b(cqf.class),
         $$0.readBoolean(),
         $$0.readUnsignedByte(),
         $$0.b(bwk.class),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(arf.class)
      );
   }

   public void a(vr $$0) {
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

   public static aqx a() {
      return new aqx("en_us", 2, cqf.a, true, 0, cqi.bs, false, false, arf.a);
   }
}
