public record aag(id c, float d, float e, float f, float g, float h) implements zq {
   public static final yg<vi, aag> a = zq.a(aag::a, aag::new);
   public static final zq.b<aag> b = zq.a("debug/worldgen_attempt");

   private aag(vi $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(vi $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public zq.b<aag> a() {
      return b;
   }

   public id b() {
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
