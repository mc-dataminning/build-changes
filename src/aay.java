public record aay(jh c, int d, String e, int f) implements aau {
   public static final zi<wh, aay> a = aau.a(aay::a, aay::new);
   public static final aau.b<aay> b = aau.a("debug/game_test_add_marker");

   private aay(wh $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(wh $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
      $$0.q(this.f);
   }

   @Override
   public aau.b<aay> a() {
      return b;
   }

   public jh b() {
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
