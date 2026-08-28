public record aad(ji c, int d, String e, int f) implements zz {
   public static final yn<vl, aad> a = zz.a(aad::a, aad::new);
   public static final zz.b<aad> b = zz.a("debug/game_test_add_marker");

   private aad(vl $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(vl $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
      $$0.q(this.f);
   }

   @Override
   public zz.b<aad> a() {
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
