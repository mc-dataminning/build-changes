public record abl(jh c, float d, float e, float f, float g, float h) implements aau {
   public static final zi<wh, abl> a = aau.a(abl::a, abl::new);
   public static final aau.b<abl> b = aau.a("debug/worldgen_attempt");

   private abl(wh $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(wh $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public aau.b<abl> a() {
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
