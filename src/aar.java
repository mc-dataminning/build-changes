public record aar(int c, epm d, float e) implements aai {
   public static final yw<vv, aar> a = aai.a(aar::a, aar::new);
   public static final aai.b<aar> b = aai.a("debug/path");

   private aar(vv $$0) {
      this($$0.readInt(), epm.b($$0), $$0.readFloat());
   }

   private void a(vv $$0) {
      $$0.p(this.c);
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

   public epm c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
