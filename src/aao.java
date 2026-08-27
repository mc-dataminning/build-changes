public record aao(in c, int d) implements aac {
   public static final ys<vu, aao> a = aac.a(aao::a, aao::new);
   public static final aac.b<aao> b = aac.a("debug/poi_ticket_count");

   private aao(vu $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(vu $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
   }

   @Override
   public aac.b<aao> a() {
      return b;
   }

   public in b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
