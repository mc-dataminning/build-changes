public record aaj(jj c, int d, String e, int f) implements aaf {
   public static final yt<vr, aaj> a = aaf.a(aaj::a, aaj::new);
   public static final aaf.b<aaj> b = aaf.a("debug/game_test_add_marker");

   private aaj(vr $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(vr $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
      $$0.q(this.f);
   }

   @Override
   public aaf.b<aaj> a() {
      return b;
   }

   public jj b() {
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
