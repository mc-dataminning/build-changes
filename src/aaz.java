public record aaz(iv c, float d, float e, float f, float g, float h) implements aai {
   public static final yw<vu, aaz> a = aai.a(aaz::a, aaz::new);
   public static final aai.b<aaz> b = aai.a("debug/worldgen_attempt");

   private aaz(vu $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(vu $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public aai.b<aaz> a() {
      return b;
   }

   public iv b() {
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
