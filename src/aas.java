public record aas(iu c, int d) implements aag {
   public static final yu<vs, aas> a = aag.a(aas::a, aas::new);
   public static final aag.b<aas> b = aag.a("debug/poi_ticket_count");

   private aas(vs $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(vs $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
   }

   @Override
   public aag.b<aas> a() {
      return b;
   }

   public iu b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
