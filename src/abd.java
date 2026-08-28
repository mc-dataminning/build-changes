public record abd(iz c, String d, int e) implements aat {
   public static final zj<wl, abd> a = aat.a(abd::a, abd::new);
   public static final aat.b<abd> b = aat.a("debug/poi_added");

   private abd(wl $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(wl $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.p(this.e);
   }

   @Override
   public aat.b<abd> a() {
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
