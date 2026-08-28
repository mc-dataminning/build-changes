public record aav(jd c, int d) implements aaj {
   public static final yx<vw, aav> a = aaj.a(aav::a, aav::new);
   public static final aaj.b<aav> b = aaj.a("debug/poi_ticket_count");

   private aav(vw $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(vw $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
   }

   @Override
   public aaj.b<aav> a() {
      return b;
   }

   public jd b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
