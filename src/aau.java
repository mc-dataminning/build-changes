public record aau(jd c, int d) implements aai {
   public static final yw<vv, aau> a = aai.a(aau::a, aau::new);
   public static final aai.b<aau> b = aai.a("debug/poi_ticket_count");

   private aau(vv $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(vv $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
   }

   @Override
   public aai.b<aau> a() {
      return b;
   }

   public jd b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
