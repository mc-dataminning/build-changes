public record aak(long c, in d) implements aac {
   public static final ys<vu, aak> a = aac.a(aak::a, aak::new);
   public static final aac.b<aak> b = aac.a("debug/neighbors_update");

   private aak(vu $$0) {
      this($$0.m(), $$0.e());
   }

   private void a(vu $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public aac.b<aak> a() {
      return b;
   }

   public long b() {
      return this.c;
   }

   public in c() {
      return this.d;
   }
}
