public record ara(String b, int c, crj d, boolean e, int f, bxa g, boolean h, boolean i, ari j) {
   public static final int a = 16;

   public ara(vu $$0) {
      this(
         $$0.d(16),
         $$0.readByte(),
         $$0.b(crj.class),
         $$0.readBoolean(),
         $$0.readUnsignedByte(),
         $$0.b(bxa.class),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(ari.class)
      );
   }

   public void a(vu $$0) {
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

   public static ara a() {
      return new ara("en_us", 2, crj.a, true, 0, crm.bu, false, false, ari.a);
   }
}
