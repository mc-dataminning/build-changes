public record aan(jd c, int d, String e, int f) implements aaj {
   public static final yx<vw, aan> a = aaj.a(aan::a, aan::new);
   public static final aaj.b<aan> b = aaj.a("debug/game_test_add_marker");

   private aan(vw $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(vw $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.a(this.e);
      $$0.p(this.f);
   }

   @Override
   public aaj.b<aan> a() {
      return b;
   }

   public jd b() {
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
