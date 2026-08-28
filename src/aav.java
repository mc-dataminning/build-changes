public record aav(alp a) implements aau {
   public static <T extends wh> zi<T, aav> a(alp $$0, int $$1) {
      return aau.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.k($$3);
            return new aav($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public aau.b<aav> a() {
      return new aau.b<>(this.a);
   }

   public alp b() {
      return this.a;
   }
}
