public record are(String b, int c, crw d, boolean e, int f, bxn g, boolean h, boolean i, arm j) {
   public static final int a = 16;

   public are(vy $$0) {
      this(
         $$0.d(16),
         $$0.readByte(),
         $$0.b(crw.class),
         $$0.readBoolean(),
         $$0.readUnsignedByte(),
         $$0.b(bxn.class),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(arm.class)
      );
   }

   public void a(vy $$0) {
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

   public static are a() {
      return new are("en_us", 2, crw.a, true, 0, crz.bu, false, false, arm.a);
   }
}
