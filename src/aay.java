public record aay(jf c, String d, int e) implements aao {
   public static final zc<wb, aay> a = aao.a(aay::a, aay::new);
   public static final aao.b<aay> b = aao.a("debug/poi_added");

   private aay(wb $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(wb $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.q(this.e);
   }

   @Override
   public aao.b<aay> a() {
      return b;
   }

   public jf b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
