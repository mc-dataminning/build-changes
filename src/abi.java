public record abi(iz c, int d) implements aaw {
   public static final zm<wl, abi> a = aaw.a(abi::a, abi::new);
   public static final aaw.b<abi> b = aaw.a("debug/poi_ticket_count");

   private abi(wl $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(wl $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
   }

   @Override
   public aaw.b<abi> a() {
      return b;
   }

   public iz b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
