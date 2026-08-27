public record aan(akt a) implements aam {
   public static <T extends we> zc<T, aan> a(akt $$0, int $$1) {
      return aam.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.j($$3);
            return new aan($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public aam.b<aan> a() {
      return new aam.b<>(this.a);
   }

   public akt b() {
      return this.a;
   }
}
