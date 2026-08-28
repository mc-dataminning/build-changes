public record aaq(iu c, String d, int e) implements aag {
   public static final yu<vs, aaq> a = aag.a(aaq::a, aaq::new);
   public static final aag.b<aaq> b = aag.a("debug/poi_added");

   private aaq(vs $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(vs $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.q(this.e);
   }

   @Override
   public aag.b<aaq> a() {
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
