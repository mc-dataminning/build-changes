public record aak(ji c, int d) implements zy {
   public static final ym<vl, aak> a = zy.a(aak::a, aak::new);
   public static final zy.b<aak> b = zy.a("debug/poi_ticket_count");

   private aak(vl $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(vl $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
   }

   @Override
   public zy.b<aak> a() {
      return b;
   }

   public ji b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
