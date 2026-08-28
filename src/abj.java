public record abj(jh c, int d, String e, int f) implements abf {
   public static final zt<ws, abj> a = abf.a(abj::a, abj::new);
   public static final abf.b<abj> b = abf.a("debug/game_test_add_marker");

   private abj(ws $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(ws $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
      $$0.q(this.f);
   }

   @Override
   public abf.b<abj> a() {
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
