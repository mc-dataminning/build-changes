public record aay(ir c, int d) implements aam {
   public static final zc<we, aay> a = aam.a(aay::a, aay::new);
   public static final aam.b<aay> b = aam.a("debug/poi_ticket_count");

   private aay(we $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(we $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
   }

   @Override
   public aam.b<aay> a() {
      return b;
   }

   public ir b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
