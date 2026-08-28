public record aaq(iw c, int d, String e, int f) implements aam {
   public static final za<vy, aaq> a = aam.a(aaq::a, aaq::new);
   public static final aam.b<aaq> b = aam.a("debug/game_test_add_marker");

   private aaq(vy $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(vy $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
      $$0.q(this.f);
   }

   @Override
   public aam.b<aaq> a() {
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
