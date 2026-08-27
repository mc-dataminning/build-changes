public record apw(String b, int c, clf d, boolean e, int f, bru g, boolean h, boolean i) {
   public static final int a = 16;

   public apw(vu $$0) {
      this($$0.d(16), $$0.readByte(), $$0.b(clf.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(bru.class), $$0.readBoolean(), $$0.readBoolean());
   }

   public void a(vu $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
   }

   public static apw a() {
      return new apw("en_us", 2, clf.a, true, 0, clh.bG, false, false);
   }
}
