public record aau(long c, ir d) implements aam {
   public static final zc<we, aau> a = aam.a(aau::a, aau::new);
   public static final aam.b<aau> b = aam.a("debug/neighbors_update");

   private aau(we $$0) {
      this($$0.m(), $$0.e());
   }

   private void a(we $$0) {
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

   public ir c() {
      return this.d;
   }
}
