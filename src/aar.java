public record aar(je c, int d, String e, int f) implements aan {
   public static final zb<wa, aar> a = aan.a(aar::a, aar::new);
   public static final aan.b<aar> b = aan.a("debug/game_test_add_marker");

   private aar(wa $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(wa $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
      $$0.q(this.f);
   }

   @Override
   public aan.b<aar> a() {
      return b;
   }

   public je b() {
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
