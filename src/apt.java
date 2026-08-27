public record apt(String b, int c, ckj d, boolean e, int f, bqy g, boolean h, boolean i) {
   public static final int a = 16;

   public apt(vs $$0) {
      this($$0.d(16), $$0.readByte(), $$0.b(ckj.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(bqy.class), $$0.readBoolean(), $$0.readBoolean());
   }

   public void a(vs $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
   }

   public static apt a() {
      return new apt("en_us", 2, ckj.a, true, 0, ckl.bG, false, false);
   }
}
