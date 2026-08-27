public record aab(akf a) implements aaa {
   public static <T extends vs> yq<T, aab> a(akf $$0, int $$1) {
      return aaa.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.j($$3);
            return new aab($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public aaa.b<aab> a() {
      return new aaa.b<>(this.a);
   }

   public akf b() {
      return this.a;
   }
}
