public record aba(jf c, int d) implements aao {
   public static final zc<wb, aba> a = aao.a(aba::a, aba::new);
   public static final aao.b<aba> b = aao.a("debug/poi_ticket_count");

   private aba(wb $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(wb $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
   }

   @Override
   public aao.b<aba> a() {
      return b;
   }

   public jf b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
