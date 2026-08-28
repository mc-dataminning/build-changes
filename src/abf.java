public record abf(jf c, float d, float e, float f, float g, float h) implements aao {
   public static final zc<wb, abf> a = aao.a(abf::a, abf::new);
   public static final aao.b<abf> b = aao.a("debug/worldgen_attempt");

   private abf(wb $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(wb $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public aao.b<abf> a() {
      return b;
   }

   public jf b() {
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
