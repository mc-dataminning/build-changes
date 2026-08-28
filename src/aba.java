public record aba(iz c, int d, String e, int f) implements aaw {
   public static final zm<wl, aba> a = aaw.a(aba::a, aba::new);
   public static final aaw.b<aba> b = aaw.a("debug/game_test_add_marker");

   private aba(wl $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(wl $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.a(this.e);
      $$0.p(this.f);
   }

   @Override
   public aaw.b<aba> a() {
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
