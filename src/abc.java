public record abc(int c, eoe d, float e) implements aat {
   public static final zj<wl, abc> a = aat.a(abc::a, abc::new);
   public static final aat.b<abc> b = aat.a("debug/path");

   private abc(wl $$0) {
      this($$0.readInt(), eoe.b($$0), $$0.readFloat());
   }

   private void a(wl $$0) {
      $$0.p(this.c);
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

   public eoe c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
