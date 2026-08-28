public record ari(String b, int c, cpl d, boolean e, int f, bvr g, boolean h, boolean i, arp j) {
   public static final int a = 16;

   public ari(wh $$0) {
      this(
         $$0.d(16),
         $$0.readByte(),
         $$0.b(cpl.class),
         $$0.readBoolean(),
         $$0.readUnsignedByte(),
         $$0.b(bvr.class),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(arp.class)
      );
   }

   public void a(wh $$0) {
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

   public static ari a() {
      return new ari("en_us", 2, cpl.a, true, 0, cpo.bH, false, false, arp.a);
   }
}
