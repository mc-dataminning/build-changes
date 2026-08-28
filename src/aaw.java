public record aaw(iw c, String d, int e) implements aam {
   public static final za<vy, aaw> a = aam.a(aaw::a, aaw::new);
   public static final aam.b<aaw> b = aam.a("debug/poi_added");

   private aaw(vy $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(vy $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.q(this.e);
   }

   @Override
   public aam.b<aaw> a() {
      return b;
   }

   public iw b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
