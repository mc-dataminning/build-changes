import javax.annotation.Nullable;

public record aej(int a, @Nullable aen b) implements wb<aei> {
   private static final int c = 1048576;

   public static aej b(tl $$0) {
      int $$1 = $$0.n();
      return new aej($$1, a($$1, $$0));
   }

   private static aen a(int $$0, tl $$1) {
      return c($$1);
   }

   private static aen c(tl $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return aep.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(tl $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(aei $$0) {
      $$0.a(this);
   }

   @Nullable
   public aen d() {
      return this.b;
   }
}
