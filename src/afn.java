public record afn(int a, afy b) implements xf<afm> {
   private static final int c = 1048576;

   public afn(ui $$0) {
      this($$0.n(), a($$0.t(), $$0));
   }

   private static afy a(ahg $$0, ui $$1) {
      return b($$0, $$1);
   }

   private static aga b(ahg $$0, ui $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new aga($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(ui $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
   }

   public void a(afm $$0) {
      $$0.a(this);
   }

   public afy d() {
      return this.b;
   }
}
