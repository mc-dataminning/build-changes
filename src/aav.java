public record aav(jg c, int d, String e, int f) implements aar {
   public static final zf<we, aav> a = aar.a(aav::a, aav::new);
   public static final aar.b<aav> b = aar.a("debug/game_test_add_marker");

   private aav(we $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(we $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
      $$0.q(this.f);
   }

   @Override
   public aar.b<aav> a() {
      return b;
   }

   public jg b() {
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
