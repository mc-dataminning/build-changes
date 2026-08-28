public record aqy(String b, int c, cqp d, boolean e, int f, bws g, boolean h, boolean i, arg j) {
   public static final int a = 16;

   public aqy(vs $$0) {
      this(
         $$0.d(16),
         $$0.readByte(),
         $$0.b(cqp.class),
         $$0.readBoolean(),
         $$0.readUnsignedByte(),
         $$0.b(bws.class),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(arg.class)
      );
   }

   public void a(vs $$0) {
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

   public static aqy a() {
      return new aqy("en_us", 2, cqp.a, true, 0, cqs.bt, false, false, arg.a);
   }
}
