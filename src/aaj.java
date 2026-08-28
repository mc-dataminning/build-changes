public record aaj(alg a) implements aai {
   public static <T extends vu> yw<T, aaj> a(alg $$0, int $$1) {
      return aai.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.k($$3);
            return new aaj($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public aai.b<aaj> a() {
      return new aai.b<>(this.a);
   }

   public alg b() {
      return this.a;
   }
}
