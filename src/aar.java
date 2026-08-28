public record aar(long c, jd d) implements aaj {
   public static final yx<vw, aar> a = aaj.a(aar::a, aar::new);
   public static final aaj.b<aar> b = aaj.a("debug/neighbors_update");

   private aar(vw $$0) {
      this($$0.m(), $$0.e());
   }

   private void a(vw $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public aaj.b<aar> a() {
      return b;
   }

   public long b() {
      return this.c;
   }

   public jd c() {
      return this.d;
   }
}
