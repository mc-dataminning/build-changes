public record acy(int a, adj b) implements uw<acx> {
   private static final int c = 1048576;

   public acy(sh $$0) {
      this($$0.m(), a($$0.s(), $$0));
   }

   private static adl a(aep $$0, sh $$1) {
      return b($$0, $$1);
   }

   private static adl b(aep $$0, sh $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new adl($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(sh $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
   }

   public void a(acx $$0) {
      $$0.a(this);
   }

   public adj d() {
      return this.b;
   }
}
