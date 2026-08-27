import javax.annotation.Nullable;

public record adj(int a, @Nullable adn b) implements va<adi> {
   private static final int c = 1048576;

   public static adj b(sl $$0) {
      int $$1 = $$0.m();
      return new adj($$1, a($$1, $$0));
   }

   private static adn a(int $$0, sl $$1) {
      return c($$1);
   }

   private static adn c(sl $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return adp.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(sl $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(adi $$0) {
      $$0.a(this);
   }

   @Nullable
   public adn d() {
      return this.b;
   }
}
