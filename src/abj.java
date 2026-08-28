public record abj(jh c, float d, float e, float f, float g, float h) implements aas {
   public static final zg<wf, abj> a = aas.a(abj::a, abj::new);
   public static final aas.b<abj> b = aas.a("debug/worldgen_attempt");

   private abj(wf $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(wf $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public aas.b<abj> a() {
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
