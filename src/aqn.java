public record aqn(String b, int c, cou d, boolean e, int f, bva g, boolean h, boolean i, aqu j) {
   public static final int a = 16;

   public aqn(vl $$0) {
      this(
         $$0.d(16),
         $$0.readByte(),
         $$0.b(cou.class),
         $$0.readBoolean(),
         $$0.readUnsignedByte(),
         $$0.b(bva.class),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(aqu.class)
      );
   }

   public void a(vl $$0) {
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

   public static aqn a() {
      return new aqn("en_us", 2, cou.a, true, 0, cox.bG, false, false, aqu.a);
   }
}
