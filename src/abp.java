public record abp(jh c, String d, int e) implements abf {
   public static final zt<ws, abp> a = abf.a(abp::a, abp::new);
   public static final abf.b<abp> b = abf.a("debug/poi_added");

   private abp(ws $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(ws $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.q(this.e);
   }

   @Override
   public abf.b<abp> a() {
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
