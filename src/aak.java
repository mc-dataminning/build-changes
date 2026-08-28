public record aak(akr a) implements aaj {
   public static <T extends vw> yx<T, aak> a(akr $$0, int $$1) {
      return aaj.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.j($$3);
            return new aak($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public aaj.b<aak> a() {
      return new aaj.b<>(this.a);
   }

   public akr b() {
      return this.a;
   }
}
