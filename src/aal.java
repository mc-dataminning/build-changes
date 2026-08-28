public record aal(ali a) implements aak {
   public static <T extends vw> yy<T, aal> a(ali $$0, int $$1) {
      return aak.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.k($$3);
            return new aal($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public aak.b<aal> a() {
      return new aak.b<>(this.a);
   }

   public ali b() {
      return this.a;
   }
}
