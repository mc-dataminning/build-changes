public record aaa(id c, String d, int e) implements zq {
   public static final yg<vi, aaa> a = zq.a(aaa::a, aaa::new);
   public static final zq.b<aaa> b = zq.a("debug/poi_added");

   private aaa(vi $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(vi $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.p(this.e);
   }

   @Override
   public zq.b<aaa> a() {
      return b;
   }

   public id b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
