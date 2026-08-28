public record aam(iu c, int d, String e, int f) implements aai {
   public static final yw<vu, aam> a = aai.a(aam::a, aam::new);
   public static final aai.b<aam> b = aai.a("debug/game_test_add_marker");

   private aam(vu $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(vu $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
      $$0.q(this.f);
   }

   @Override
   public aai.b<aam> a() {
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
