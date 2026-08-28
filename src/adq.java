public record adq(int b, float c) implements zs<ach> {
   public static final zj<wi, adq> a = zs.a(adq::a, adq::new);

   public adq(bve $$0) {
      this($$0.as(), $$0.eO());
   }

   private adq(wi $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(wi $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zu<adq> a() {
      return agw.I;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
