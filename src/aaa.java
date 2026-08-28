public record aaa(akv a) implements zz {
   public static <T extends vl> yn<T, aaa> a(akv $$0, int $$1) {
      return zz.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.k($$3);
            return new aaa($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public zz.b<aaa> a() {
      return new zz.b<>(this.a);
   }

   public akv b() {
      return this.a;
   }
}
