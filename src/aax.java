public record aax(ale a) implements aaw {
   public static <T extends wl> zm<T, aax> a(ale $$0, int $$1) {
      return aaw.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.j($$3);
            return new aax($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public aaw.b<aax> a() {
      return new aaw.b<>(this.a);
   }

   public ale b() {
      return this.a;
   }
}
