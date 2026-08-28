public record aav(int c, eye d, float e) implements aam {
   public static final za<vy, aav> a = aam.a(aav::a, aav::new);
   public static final aam.b<aav> b = aam.a("debug/path");

   private aav(vy $$0) {
      this($$0.readInt(), eye.b($$0), $$0.readFloat());
   }

   private void a(vy $$0) {
      $$0.q(this.c);
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

   public eye c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
