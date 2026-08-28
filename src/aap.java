public record aap(ale a) implements aao {
   public static <T extends wb> zc<T, aap> a(ale $$0, int $$1) {
      return aao.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.k($$3);
            return new aap($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public aao.b<aap> a() {
      return new aao.b<>(this.a);
   }

   public ale b() {
      return this.a;
   }
}
