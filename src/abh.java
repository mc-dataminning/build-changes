public record abh(jh c, int d) implements aav {
   public static final zj<wi, abh> a = aav.a(abh::a, abh::new);
   public static final aav.b<abh> b = aav.a("debug/poi_ticket_count");

   private abh(wi $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(wi $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
   }

   @Override
   public aav.b<abh> a() {
      return b;
   }

   public jh b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
