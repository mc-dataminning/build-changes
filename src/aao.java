public record aao(alc a) implements aan {
   public static <T extends wa> zb<T, aao> a(alc $$0, int $$1) {
      return aan.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.k($$3);
            return new aao($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public aan.b<aao> a() {
      return new aan.b<>(this.a);
   }

   public alc b() {
      return this.a;
   }
}
