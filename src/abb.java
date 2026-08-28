public record abb(iv c, float d, float e, float f, float g, float h) implements aak {
   public static final yy<vw, abb> a = aak.a(abb::a, abb::new);
   public static final aak.b<abb> b = aak.a("debug/worldgen_attempt");

   private abb(vw $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(vw $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public aak.b<abb> a() {
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
