public record aau(iu c, int d) implements aai {
   public static final yw<vu, aau> a = aai.a(aau::a, aau::new);
   public static final aai.b<aau> b = aai.a("debug/poi_ticket_count");

   private aau(vu $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(vu $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
   }

   @Override
   public aai.b<aau> a() {
      return b;
   }

   public iu b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
