public record aar(jj c, int d) implements aaf {
   public static final yt<vr, aar> a = aaf.a(aar::a, aar::new);
   public static final aaf.b<aar> b = aaf.a("debug/poi_ticket_count");

   private aar(vr $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(vr $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
   }

   @Override
   public aaf.b<aar> a() {
      return b;
   }

   public jj b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
