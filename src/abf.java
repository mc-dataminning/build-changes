public record abf(jh c, int d) implements aat {
   public static final zh<wg, abf> a = aat.a(abf::a, abf::new);
   public static final aat.b<abf> b = aat.a("debug/poi_ticket_count");

   private abf(wg $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(wg $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
   }

   @Override
   public aat.b<abf> a() {
      return b;
   }

   public jh b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
