public record aau(long c, iw d) implements aam {
   public static final za<vy, aau> a = aam.a(aau::a, aau::new);
   public static final aam.b<aau> b = aam.a("debug/neighbors_update");

   private aau(vy $$0) {
      this($$0.m(), $$0.e());
   }

   private void a(vy $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public aam.b<aau> a() {
      return b;
   }

   public long b() {
      return this.c;
   }

   public iw c() {
      return this.d;
   }
}
