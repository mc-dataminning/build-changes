public record aaw(jj c, float d, float e, float f, float g, float h) implements aaf {
   public static final yt<vr, aaw> a = aaf.a(aaw::a, aaw::new);
   public static final aaf.b<aaw> b = aaf.a("debug/worldgen_attempt");

   private aaw(vr $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(vr $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public aaf.b<aaw> a() {
      return b;
   }

   public jj b() {
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
