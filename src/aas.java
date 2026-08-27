public record aas(in c, float d, float e, float f, float g, float h) implements aac {
   public static final ys<vu, aas> a = aac.a(aas::a, aas::new);
   public static final aac.b<aas> b = aac.a("debug/worldgen_attempt");

   private aas(vu $$0) {
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
   public aac.b<aas> a() {
      return b;
   }

   public in b() {
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
