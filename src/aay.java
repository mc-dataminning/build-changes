public record aay(alf a) implements aax {
   public static <T extends wm> zn<T, aay> a(alf $$0, int $$1) {
      return aax.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.j($$3);
            return new aay($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public aax.b<aay> a() {
      return new aax.b<>(this.a);
   }

   public alf b() {
      return this.a;
   }
}
