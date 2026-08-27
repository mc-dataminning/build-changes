public record aaw(ir c, String d, int e) implements aam {
   public static final zc<we, aaw> a = aam.a(aaw::a, aaw::new);
   public static final aam.b<aaw> b = aam.a("debug/poi_added");

   private aaw(we $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(we $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.p(this.e);
   }

   @Override
   public aam.b<aaw> a() {
      return b;
   }

   public ir b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
