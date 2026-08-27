public record aag(in c, int d, String e, int f) implements aac {
   public static final ys<vu, aag> a = aac.a(aag::a, aag::new);
   public static final aac.b<aag> b = aac.a("debug/game_test_add_marker");

   private aag(vu $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(vu $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.a(this.e);
      $$0.p(this.f);
   }

   @Override
   public aac.b<aag> a() {
      return b;
   }

   public in b() {
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
