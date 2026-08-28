public record aas(iu c, String d, int e) implements aai {
   public static final yw<vu, aas> a = aai.a(aas::a, aas::new);
   public static final aai.b<aas> b = aai.a("debug/poi_added");

   private aas(vu $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(vu $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.q(this.e);
   }

   @Override
   public aai.b<aas> a() {
      return b;
   }

   public iu b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
