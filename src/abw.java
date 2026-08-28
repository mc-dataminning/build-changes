public record abw(jh c, float d, float e, float f, float g, float h) implements abf {
   public static final zt<ws, abw> a = abf.a(abw::a, abw::new);
   public static final abf.b<abw> b = abf.a("debug/worldgen_attempt");

   private abw(ws $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(ws $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public abf.b<abw> a() {
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
