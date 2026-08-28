public record aaw(all a) implements aav {
   public static <T extends wi> zj<T, aaw> a(all $$0, int $$1) {
      return aav.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.k($$3);
            return new aaw($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public aav.b<aaw> a() {
      return new aav.b<>(this.a);
   }

   public all b() {
      return this.a;
   }
}
