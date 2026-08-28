public record aih(int b, int c) implements zj<agt> {
   public static final za<vy, aih> a = zj.a(aih::a, aih::new);

   private aih(vy $$0) {
      this($$0.l(), $$0.l());
      if (this.c < 0 && this.c != -1) {
         throw new IllegalArgumentException("Invalid selectedItemIndex: " + this.c);
      }
   }

   private void a(vy $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
   }

   @Override
   public zl<aih> a() {
      return agr.bm;
   }

   public void a(agt $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }
}
