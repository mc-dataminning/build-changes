public record aad(akh a) implements aac {
   public static <T extends vu> ys<T, aad> a(akh $$0, int $$1) {
      return aac.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.j($$3);
            return new aad($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public aac.b<aad> a() {
      return new aac.b<>(this.a);
   }

   public akh b() {
      return this.a;
   }
}
