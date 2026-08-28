public record aac(ji c, int d, String e, int f) implements zy {
   public static final ym<vl, aac> a = zy.a(aac::a, aac::new);
   public static final zy.b<aac> b = zy.a("debug/game_test_add_marker");

   private aac(vl $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(vl $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
      $$0.q(this.f);
   }

   @Override
   public zy.b<aac> a() {
      return b;
   }

   public ji b() {
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
