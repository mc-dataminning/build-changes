public record abe(jh c, String d, int e) implements aau {
   public static final zi<wh, abe> a = aau.a(abe::a, abe::new);
   public static final aau.b<abe> b = aau.a("debug/poi_added");

   private abe(wh $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(wh $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.q(this.e);
   }

   @Override
   public aau.b<abe> a() {
      return b;
   }

   public jh b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
