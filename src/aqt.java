public record aqt(String b, int c, cns d, boolean e, int f, bue g, boolean h, boolean i, ara j) {
   public static final int a = 16;

   public aqt(wa $$0) {
      this(
         $$0.d(16),
         $$0.readByte(),
         $$0.b(cns.class),
         $$0.readBoolean(),
         $$0.readUnsignedByte(),
         $$0.b(bue.class),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(ara.class)
      );
   }

   public void a(wa $$0) {
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

   public static aqt a() {
      return new aqt("en_us", 2, cns.a, true, 0, cnu.bD, false, false, ara.a);
   }
}
