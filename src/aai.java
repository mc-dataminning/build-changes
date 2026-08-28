public record aai(ji c, String d, int e) implements zy {
   public static final ym<vl, aai> a = zy.a(aai::a, aai::new);
   public static final zy.b<aai> b = zy.a("debug/poi_added");

   private aai(vl $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(vl $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.q(this.e);
   }

   @Override
   public zy.b<aai> a() {
      return b;
   }

   public ji b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
