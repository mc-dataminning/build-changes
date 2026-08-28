public record abi(jg c, float d, float e, float f, float g, float h) implements aar {
   public static final zf<we, abi> a = aar.a(abi::a, abi::new);
   public static final aar.b<abi> b = aar.a("debug/worldgen_attempt");

   private abi(we $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(we $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public aar.b<abi> a() {
      return b;
   }

   public jg b() {
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
