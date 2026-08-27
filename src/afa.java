public record afa(int a, afl b) implements wu<aez> {
   private static final int c = 1048576;

   public afa(ue $$0) {
      this($$0.n(), a($$0.t(), $$0));
   }

   private static afl a(agt $$0, ue $$1) {
      return b($$0, $$1);
   }

   private static afn b(agt $$0, ue $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new afn($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(ue $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
   }

   public void a(aez $$0) {
      $$0.a(this);
   }

   public afl d() {
      return this.b;
   }
}
