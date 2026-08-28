public record adi(long[] b, bnc c) implements zs<ach> {
   public static final zj<wi, adi> a = zs.a(adi::a, adi::new);

   private adi(wi $$0) {
      this($$0.d(), $$0.b(bnc.class));
   }

   private void a(wi $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zu<adi> a() {
      return agw.A;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public bnc e() {
      return this.c;
   }
}
