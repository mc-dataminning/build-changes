public record abg(jh c, int d) implements aau {
   public static final zi<wh, abg> a = aau.a(abg::a, abg::new);
   public static final aau.b<abg> b = aau.a("debug/poi_ticket_count");

   private abg(wh $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(wh $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
   }

   @Override
   public aau.b<abg> a() {
      return b;
   }

   public jh b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
