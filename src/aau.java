public record aau(alj a) implements aat {
   public static <T extends wg> zh<T, aau> a(alj $$0, int $$1) {
      return aat.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.k($$3);
            return new aau($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public aat.b<aau> a() {
      return new aat.b<>(this.a);
   }

   public alj b() {
      return this.a;
   }
}
