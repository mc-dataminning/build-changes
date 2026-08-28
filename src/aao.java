public record aao(ja c, int d) implements aac {
   public static final ys<vr, aao> a = aac.a(aao::a, aao::new);
   public static final aac.b<aao> b = aac.a("debug/poi_ticket_count");

   private aao(vr $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(vr $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
   }

   @Override
   public aac.b<aao> a() {
      return b;
   }

   public ja b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
