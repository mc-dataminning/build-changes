public record aaw(int c, erd d, float e) implements aan {
   public static final zb<wa, aaw> a = aan.a(aaw::a, aaw::new);
   public static final aan.b<aaw> b = aan.a("debug/path");

   private aaw(wa $$0) {
      this($$0.readInt(), erd.b($$0), $$0.readFloat());
   }

   private void a(wa $$0) {
      $$0.q(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public aan.b<aaw> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public erd c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
