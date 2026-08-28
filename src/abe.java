public record abe(jh c, int d) implements aas {
   public static final zg<wf, abe> a = aas.a(abe::a, abe::new);
   public static final aas.b<abe> b = aas.a("debug/poi_ticket_count");

   private abe(wf $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(wf $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
   }

   @Override
   public aas.b<abe> a() {
      return b;
   }

   public jh b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
