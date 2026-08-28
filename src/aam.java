public record aam(jd c, int d, String e, int f) implements aai {
   public static final yw<vv, aam> a = aai.a(aam::a, aam::new);
   public static final aai.b<aam> b = aai.a("debug/game_test_add_marker");

   private aam(vv $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(vv $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.a(this.e);
      $$0.p(this.f);
   }

   @Override
   public aai.b<aam> a() {
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
