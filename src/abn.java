public record abn(iz c, float d, float e, float f, float g, float h) implements aax {
   public static final zn<wm, abn> a = aax.a(abn::a, abn::new);
   public static final aax.b<abn> b = aax.a("debug/worldgen_attempt");

   private abn(wm $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(wm $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public aax.b<abn> a() {
      return b;
   }

   public iz b() {
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
