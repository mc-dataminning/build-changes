public record aar(int c, exj d, float e) implements aai {
   public static final yw<vu, aar> a = aai.a(aar::a, aar::new);
   public static final aai.b<aar> b = aai.a("debug/path");

   private aar(vu $$0) {
      this($$0.readInt(), exj.b($$0), $$0.readFloat());
   }

   private void a(vu $$0) {
      $$0.q(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public aai.b<aar> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public exj c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
