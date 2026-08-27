public record aag(akm a) implements aaf {
   public static <T extends vx> yv<T, aag> a(akm $$0, int $$1) {
      return aaf.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.j($$3);
            return new aag($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public aaf.b<aag> a() {
      return new aaf.b<>(this.a);
   }

   public akm b() {
      return this.a;
   }
}
