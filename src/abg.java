public record abg(alz a) implements abf {
   public static <T extends ws> zt<T, abg> a(alz $$0, int $$1) {
      return abf.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.k($$3);
            return new abg($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public abf.b<abg> a() {
      return new abf.b<>(this.a);
   }

   public alz b() {
      return this.a;
   }
}
