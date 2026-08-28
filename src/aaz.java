public record aaz(jh c, int d, String e, int f) implements aav {
   public static final zj<wi, aaz> a = aav.a(aaz::a, aaz::new);
   public static final aav.b<aaz> b = aav.a("debug/game_test_add_marker");

   private aaz(wi $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(wi $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
      $$0.q(this.f);
   }

   @Override
   public aav.b<aaz> a() {
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
