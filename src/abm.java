public record abm(iz c, float d, float e, float f, float g, float h) implements aaw {
   public static final zm<wl, abm> a = aaw.a(abm::a, abm::new);
   public static final aaw.b<abm> b = aaw.a("debug/worldgen_attempt");

   private abm(wl $$0) {
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
   public aaw.b<abm> a() {
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
