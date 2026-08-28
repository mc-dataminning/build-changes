public record aak(iu c, int d, String e, int f) implements aag {
   public static final yu<vs, aak> a = aag.a(aak::a, aak::new);
   public static final aag.b<aak> b = aag.a("debug/game_test_add_marker");

   private aak(vs $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(vs $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
      $$0.q(this.f);
   }

   @Override
   public aag.b<aak> a() {
      return b;
   }

   public iu b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public String d() {
      return this.e;
   }

   public int e() {
      return this.f;
   }
}
