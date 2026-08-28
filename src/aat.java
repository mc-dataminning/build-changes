public record aat(jd c, String d, int e) implements aaj {
   public static final yx<vw, aat> a = aaj.a(aat::a, aat::new);
   public static final aaj.b<aat> b = aaj.a("debug/poi_added");

   private aat(vw $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(vw $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.p(this.e);
   }

   @Override
   public aaj.b<aat> a() {
      return b;
   }

   public jd b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
