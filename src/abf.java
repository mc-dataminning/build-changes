public record abf(long c, iz d) implements aax {
   public static final zn<wm, abf> a = aax.a(abf::a, abf::new);
   public static final aax.b<abf> b = aax.a("debug/neighbors_update");

   private abf(wm $$0) {
      this($$0.m(), $$0.e());
   }

   private void a(wm $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public aax.b<abf> a() {
      return b;
   }

   public long b() {
      return this.c;
   }

   public iz c() {
      return this.d;
   }
}
