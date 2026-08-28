public record aao(long c, iu d) implements aag {
   public static final yu<vs, aao> a = aag.a(aao::a, aao::new);
   public static final aag.b<aao> b = aag.a("debug/neighbors_update");

   private aao(vs $$0) {
      this($$0.m(), $$0.e());
   }

   private void a(vs $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public aag.b<aao> a() {
      return b;
   }

   public long b() {
      return this.c;
   }

   public iu c() {
      return this.d;
   }
}
