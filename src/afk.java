public record afk(int a, afv b) implements xd<afj> {
   private static final int c = 1048576;

   public afk(ug $$0) {
      this($$0.n(), a($$0.t(), $$0));
   }

   private static afv a(ahd $$0, ug $$1) {
      return b($$0, $$1);
   }

   private static afx b(ahd $$0, ug $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new afx($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(ug $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
   }

   public void a(afj $$0) {
      $$0.a(this);
   }

   public afv d() {
      return this.b;
   }
}
