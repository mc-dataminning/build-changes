public record aas(jf c, int d, String e, int f) implements aao {
   public static final zc<wb, aas> a = aao.a(aas::a, aas::new);
   public static final aao.b<aas> b = aao.a("debug/game_test_add_marker");

   private aas(wb $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(wb $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
      $$0.q(this.f);
   }

   @Override
   public aao.b<aas> a() {
      return b;
   }

   public jf b() {
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
