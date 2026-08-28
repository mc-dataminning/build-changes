public record aay(iw c, int d) implements aam {
   public static final za<vy, aay> a = aam.a(aay::a, aay::new);
   public static final aam.b<aay> b = aam.a("debug/poi_ticket_count");

   private aay(vy $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(vy $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
   }

   @Override
   public aam.b<aay> a() {
      return b;
   }

   public iw b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
