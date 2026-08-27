public record aak(im c, String d, int e) implements aaa {
   public static final yq<vs, aak> a = aaa.a(aak::a, aak::new);
   public static final aaa.b<aak> b = aaa.a("debug/poi_added");

   private aak(vs $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(vs $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.p(this.e);
   }

   @Override
   public aaa.b<aak> a() {
      return b;
   }

   public im b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
