public record aaj(akq a) implements aai {
   public static <T extends vv> yw<T, aaj> a(akq $$0, int $$1) {
      return aai.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.j($$3);
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

   public akq b() {
      return this.a;
   }
}
