public record aar(io c, int d) implements aaf {
   public static final yv<vx, aar> a = aaf.a(aar::a, aar::new);
   public static final aaf.b<aar> b = aaf.a("debug/poi_ticket_count");

   private aar(vx $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(vx $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
   }

   @Override
   public aaf.b<aar> a() {
      return b;
   }

   public io b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
