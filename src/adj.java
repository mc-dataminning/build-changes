public record adj(int b, float c) implements zl<aca> {
   public static final zc<wb, adj> a = zl.a(adj::a, adj::new);

   public adj(bun $$0) {
      this($$0.ap(), $$0.eI());
   }

   private adj(wb $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(wb $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zn<adj> a() {
      return agp.I;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
