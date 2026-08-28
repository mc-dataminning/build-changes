public record aao(iv c, int d, String e, int f) implements aak {
   public static final yy<vw, aao> a = aak.a(aao::a, aao::new);
   public static final aak.b<aao> b = aak.a("debug/game_test_add_marker");

   private aao(vw $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(vw $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
      $$0.q(this.f);
   }

   @Override
   public aak.b<aao> a() {
      return b;
   }

   public iv b() {
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
