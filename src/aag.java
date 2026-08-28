public record aag(long c, ji d) implements zy {
   public static final ym<vl, aag> a = zy.a(aag::a, aag::new);
   public static final zy.b<aag> b = zy.a("debug/neighbors_update");

   private aag(vl $$0) {
      this($$0.m(), $$0.e());
   }

   private void a(vl $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zy.b<aag> a() {
      return b;
   }

   public long b() {
      return this.c;
   }

   public ji c() {
      return this.d;
   }
}
