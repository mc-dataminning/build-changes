public record aae(im c, int d, String e, int f) implements aaa {
   public static final yq<vs, aae> a = aaa.a(aae::a, aae::new);
   public static final aaa.b<aae> b = aaa.a("debug/game_test_add_marker");

   private aae(vs $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(vs $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.a(this.e);
      $$0.p(this.f);
   }

   @Override
   public aaa.b<aae> a() {
      return b;
   }

   public im b() {
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
