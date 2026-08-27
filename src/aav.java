public record aav(int c, eps d, float e) implements aam {
   public static final zc<we, aav> a = aam.a(aav::a, aav::new);
   public static final aam.b<aav> b = aam.a("debug/path");

   private aav(we $$0) {
      this($$0.readInt(), eps.b($$0), $$0.readFloat());
   }

   private void a(we $$0) {
      $$0.p(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public aam.b<aav> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public eps c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
