public record abj(iz c, float d, float e, float f, float g, float h) implements aat {
   public static final zj<wl, abj> a = aat.a(abj::a, abj::new);
   public static final aat.b<abj> b = aat.a("debug/worldgen_attempt");

   private abj(wl $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(wl $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public aat.b<abj> a() {
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
