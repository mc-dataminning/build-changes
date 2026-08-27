public record afo(int a, afz b) implements xg<afn> {
   private static final int c = 1048576;

   public afo(uj $$0) {
      this($$0.n(), a($$0.t(), $$0));
   }

   private static afz a(ahh $$0, uj $$1) {
      return b($$0, $$1);
   }

   private static agb b(ahh $$0, uj $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new agb($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(uj $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   public afz d() {
      return this.b;
   }
}
