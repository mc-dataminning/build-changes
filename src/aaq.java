public record aaq(im c, float d, float e, float f, float g, float h) implements aaa {
   public static final yq<vs, aaq> a = aaa.a(aaq::a, aaq::new);
   public static final aaa.b<aaq> b = aaa.a("debug/worldgen_attempt");

   private aaq(vs $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(vs $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public aaa.b<aaq> a() {
      return b;
   }

   public im b() {
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
