public record abc(int c, esj d, float e) implements aat {
   public static final zh<wg, abc> a = aat.a(abc::a, abc::new);
   public static final aat.b<abc> b = aat.a("debug/path");

   private abc(wg $$0) {
      this($$0.readInt(), esj.b($$0), $$0.readFloat());
   }

   private void a(wg $$0) {
      $$0.q(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public aat.b<abc> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public esj c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
