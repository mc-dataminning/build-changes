public record abr(jh c, int d) implements abf {
   public static final zt<ws, abr> a = abf.a(abr::a, abr::new);
   public static final abf.b<abr> b = abf.a("debug/poi_ticket_count");

   private abr(ws $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(ws $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
   }

   @Override
   public abf.b<abr> a() {
      return b;
   }

   public jh b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
