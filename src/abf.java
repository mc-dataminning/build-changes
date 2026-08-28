public record abf(jh c, String d, int e) implements aav {
   public static final zj<wi, abf> a = aav.a(abf::a, abf::new);
   public static final aav.b<abf> b = aav.a("debug/poi_added");

   private abf(wi $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(wi $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.q(this.e);
   }

   @Override
   public aav.b<abf> a() {
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
