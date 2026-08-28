public record aax(je c, String d, int e) implements aan {
   public static final zb<wa, aax> a = aan.a(aax::a, aax::new);
   public static final aan.b<aax> b = aan.a("debug/poi_added");

   private aax(wa $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(wa $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.q(this.e);
   }

   @Override
   public aan.b<aax> a() {
      return b;
   }

   public je b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
