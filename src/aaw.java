public record aaw(iv c, int d) implements aak {
   public static final yy<vw, aaw> a = aak.a(aaw::a, aaw::new);
   public static final aak.b<aaw> b = aak.a("debug/poi_ticket_count");

   private aaw(vw $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(vw $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
   }

   @Override
   public aak.b<aaw> a() {
      return b;
   }

   public iv b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
