public record abh(iz c, String d, int e) implements aax {
   public static final zn<wm, abh> a = aax.a(abh::a, abh::new);
   public static final aax.b<abh> b = aax.a("debug/poi_added");

   private abh(wm $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(wm $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.p(this.e);
   }

   @Override
   public aax.b<abh> a() {
      return b;
   }

   public iz b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
