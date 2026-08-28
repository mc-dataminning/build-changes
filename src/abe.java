public record abe(long c, iz d) implements aaw {
   public static final zm<wl, abe> a = aaw.a(abe::a, abe::new);
   public static final aaw.b<abe> b = aaw.a("debug/neighbors_update");

   private abe(wl $$0) {
      this($$0.m(), $$0.e());
   }

   private void a(wl $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public aaw.b<abe> a() {
      return b;
   }

   public long b() {
      return this.c;
   }

   public iz c() {
      return this.d;
   }
}
