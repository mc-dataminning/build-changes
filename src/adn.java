import javax.annotation.Nullable;

public record adn(int a, @Nullable adr b) implements vf<adm> {
   private static final int c = 1048576;

   public static adn b(sq $$0) {
      int $$1 = $$0.m();
      return new adn($$1, a($$1, $$0));
   }

   private static adr a(int $$0, sq $$1) {
      return c($$1);
   }

   private static adr c(sq $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return adt.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(sq $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(adm $$0) {
      $$0.a(this);
   }

   @Nullable
   public adr d() {
      return this.b;
   }
}
