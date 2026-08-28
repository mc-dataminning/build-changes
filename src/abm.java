public record abm(jh c, float d, float e, float f, float g, float h) implements aav {
   public static final zj<wi, abm> a = aav.a(abm::a, abm::new);
   public static final aav.b<abm> b = aav.a("debug/worldgen_attempt");

   private abm(wi $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(wi $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public aav.b<abm> a() {
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
