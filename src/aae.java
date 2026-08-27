public record aae(ib c, float d, float e, float f, float g, float h) implements zo {
   public static final ye<vg, aae> a = zo.a(aae::a, aae::new);
   public static final zo.b<aae> b = zo.a("debug/worldgen_attempt");

   private aae(vg $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(vg $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public zo.b<aae> a() {
      return b;
   }

   public ib b() {
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
