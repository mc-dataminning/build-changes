public record aaw(jh c, int d, String e, int f) implements aas {
   public static final zg<wf, aaw> a = aas.a(aaw::a, aaw::new);
   public static final aas.b<aaw> b = aas.a("debug/game_test_add_marker");

   private aaw(wf $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(wf $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
      $$0.q(this.f);
   }

   @Override
   public aas.b<aaw> a() {
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
