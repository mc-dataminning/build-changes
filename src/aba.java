public record aba(int c, ers d, float e) implements aar {
   public static final zf<we, aba> a = aar.a(aba::a, aba::new);
   public static final aar.b<aba> b = aar.a("debug/path");

   private aba(we $$0) {
      this($$0.readInt(), ers.b($$0), $$0.readFloat());
   }

   private void a(we $$0) {
      $$0.q(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public aar.b<aba> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public ers c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
