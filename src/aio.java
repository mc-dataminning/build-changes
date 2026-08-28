public record aio(int b, int c) implements zo<aha> {
   public static final ze<vy, aio> a = zo.a(aio::a, aio::new);

   private aio(vy $$0) {
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
   public zq<aio> a() {
      return agy.bm;
   }

   public void a(aha $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }
}
