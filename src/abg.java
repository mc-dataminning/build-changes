public record abg(iz c, String d, int e) implements aaw {
   public static final zm<wl, abg> a = aaw.a(abg::a, abg::new);
   public static final aaw.b<abg> b = aaw.a("debug/poi_added");

   private abg(wl $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(wl $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.p(this.e);
   }

   @Override
   public aaw.b<abg> a() {
      return b;
   }

   public iz b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
