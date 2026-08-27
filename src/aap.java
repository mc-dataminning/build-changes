public record aap(io c, String d, int e) implements aaf {
   public static final yv<vx, aap> a = aaf.a(aap::a, aap::new);
   public static final aaf.b<aap> b = aaf.a("debug/poi_added");

   private aap(vx $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(vx $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.p(this.e);
   }

   @Override
   public aaf.b<aap> a() {
      return b;
   }

   public io b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
