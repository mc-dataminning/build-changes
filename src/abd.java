public record abd(iw c, float d, float e, float f, float g, float h) implements aam {
   public static final za<vy, abd> a = aam.a(abd::a, abd::new);
   public static final aam.b<abd> b = aam.a("debug/worldgen_attempt");

   private abd(vy $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(vy $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public aam.b<abd> a() {
      return b;
   }

   public iw b() {
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
