public record abe(je c, float d, float e, float f, float g, float h) implements aan {
   public static final zb<wa, abe> a = aan.a(abe::a, abe::new);
   public static final aan.b<abe> b = aan.a("debug/worldgen_attempt");

   private abe(wa $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(wa $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public aan.b<abe> a() {
      return b;
   }

   public je b() {
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
