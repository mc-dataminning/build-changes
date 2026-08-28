public record aas(alh a) implements aar {
   public static <T extends we> zf<T, aas> a(alh $$0, int $$1) {
      return aar.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.k($$3);
            return new aas($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public aar.b<aas> a() {
      return new aar.b<>(this.a);
   }

   public alh b() {
      return this.a;
   }
}
