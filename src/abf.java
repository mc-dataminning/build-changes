public record abf(iz c, int d) implements aat {
   public static final zj<wl, abf> a = aat.a(abf::a, abf::new);
   public static final aat.b<abf> b = aat.a("debug/poi_ticket_count");

   private abf(wl $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(wl $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
   }

   @Override
   public aat.b<abf> a() {
      return b;
   }

   public iz b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
