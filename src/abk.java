public record abk(jh c, float d, float e, float f, float g, float h) implements aat {
   public static final zh<wg, abk> a = aat.a(abk::a, abk::new);
   public static final aat.b<abk> b = aat.a("debug/worldgen_attempt");

   private abk(wg $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(wg $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public aat.b<abk> a() {
      return b;
   }

   public jh b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }

   public float e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public float g() {
      return this.h;
   }
}
