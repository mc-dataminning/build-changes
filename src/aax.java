public record aax(iw c, int d, String e, int f) implements aat {
   public static final ze<vy, aax> a = aat.a(aax::a, aax::new);
   public static final aat.b<aax> b = aat.a("debug/game_test_add_marker");

   private aax(vy $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(vy $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
      $$0.q(this.f);
   }

   @Override
   public aat.b<aax> a() {
      return b;
   }

   public iw b() {
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
