public record abf(iw c, int d) implements aat {
   public static final ze<vy, abf> a = aat.a(abf::a, abf::new);
   public static final aat.b<abf> b = aat.a("debug/poi_ticket_count");

   private abf(vy $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(vy $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
   }

   @Override
   public aat.b<abf> a() {
      return b;
   }

   public iw b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
