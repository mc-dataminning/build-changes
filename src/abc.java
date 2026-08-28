public record abc(int c, eyo d, float e) implements aat {
   public static final ze<vy, abc> a = aat.a(abc::a, abc::new);
   public static final aat.b<abc> b = aat.a("debug/path");

   private abc(vy $$0) {
      this($$0.readInt(), eyo.b($$0), $$0.readFloat());
   }

   private void a(vy $$0) {
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

   public eyo c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
