public record aat(ali a) implements aas {
   public static <T extends wf> zg<T, aat> a(ali $$0, int $$1) {
      return aas.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.k($$3);
            return new aat($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public aas.b<aat> a() {
      return new aas.b<>(this.a);
   }

   public ali b() {
      return this.a;
   }
}
