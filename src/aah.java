public record aah(ale a) implements aag {
   public static <T extends vs> yu<T, aah> a(ale $$0, int $$1) {
      return aag.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.k($$3);
            return new aah($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public aag.b<aah> a() {
      return new aag.b<>(this.a);
   }

   public ale b() {
      return this.a;
   }
}
