public record aaz(jd c, float d, float e, float f, float g, float h) implements aaj {
   public static final yx<vw, aaz> a = aaj.a(aaz::a, aaz::new);
   public static final aaj.b<aaz> b = aaj.a("debug/worldgen_attempt");

   private aaz(vw $$0) {
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
   public aaj.b<aaz> a() {
      return b;
   }

   public jd b() {
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
