public record abb(int c, ery d, float e) implements aas {
   public static final zg<wf, abb> a = aas.a(abb::a, abb::new);
   public static final aas.b<abb> b = aas.a("debug/path");

   private abb(wf $$0) {
      this($$0.readInt(), ery.b($$0), $$0.readFloat());
   }

   private void a(wf $$0) {
      $$0.q(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public aas.b<abb> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public ery c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
