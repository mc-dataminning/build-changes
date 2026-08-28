public record adi(int b, float c) implements zk<abz> {
   public static final zb<wa, adi> a = zk.a(adi::a, adi::new);

   public adi(buk $$0) {
      this($$0.ap(), $$0.eI());
   }

   private adi(wa $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(wa $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zm<adi> a() {
      return ago.I;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
