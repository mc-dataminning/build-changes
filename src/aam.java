public record aam(ja c, String d, int e) implements aac {
   public static final ys<vr, aam> a = aac.a(aam::a, aam::new);
   public static final aac.b<aam> b = aac.a("debug/poi_added");

   private aam(vr $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(vr $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.p(this.e);
   }

   @Override
   public aac.b<aam> a() {
      return b;
   }

   public ja b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
