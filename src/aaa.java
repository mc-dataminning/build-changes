public record aaa(ib c, int d) implements zo {
   public static final ye<vg, aaa> a = zo.a(aaa::a, aaa::new);
   public static final zo.b<aaa> b = zo.a("debug/poi_ticket_count");

   private aaa(vg $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(vg $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
   }

   @Override
   public zo.b<aaa> a() {
      return b;
   }

   public ib b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
