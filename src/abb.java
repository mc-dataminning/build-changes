public record abb(iz c, int d, String e, int f) implements aax {
   public static final zn<wm, abb> a = aax.a(abb::a, abb::new);
   public static final aax.b<abb> b = aax.a("debug/game_test_add_marker");

   private abb(wm $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(wm $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.a(this.e);
      $$0.p(this.f);
   }

   @Override
   public aax.b<abb> a() {
      return b;
   }

   public iz b() {
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
